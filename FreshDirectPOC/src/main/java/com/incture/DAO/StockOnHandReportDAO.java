package com.incture.DAO;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import com.incture.DTO.PurchaseOrderReportDTO;
import com.incture.DTO.StockOnHandReportDTO;
import com.incture.entity.PurchaseOrderReportDO;
import com.incture.entity.StockOnHandReportDO;
import com.incture.response.PurchaseOrderReportResponse;
import com.incture.response.StockOnHandReportResponse;
import com.incture.utility.StringUtils;

public class StockOnHandReportDAO extends BaseDAO{

	private static final Logger LOGGER = LoggerFactory.getLogger(StockOnHandReportDAO.class);

	// import
	public StockOnHandReportDO importToDB(StockOnHandReportDTO stockOnHandReportDTO) {
		StockOnHandReportDO stockOnHandReportDO = new StockOnHandReportDO();
		BeanUtils.copyProperties(stockOnHandReportDTO, stockOnHandReportDO);
		return stockOnHandReportDO;}

	// export
	public StockOnHandReportDTO exportFromDB(StockOnHandReportDO stockOnHandReportDO) {
		StockOnHandReportDTO stockOnHandReportDTO = new StockOnHandReportDTO();
		BeanUtils.copyProperties(stockOnHandReportDO, stockOnHandReportDTO);
		return stockOnHandReportDTO;}


	public StockOnHandReportResponse addstockOnHandReportDetails(StockOnHandReportDTO stockOnHandReportDTO) {
		StockOnHandReportResponse stockOnHandReportResponse=new StockOnHandReportResponse();
		StockOnHandReportDO purchaseOrderReportDO=null;
		try{
			session=getSession();
		if(StringUtils.isEmptyObject(stockOnHandReportDTO) ){  
			stockOnHandReportResponse.setStatusCode(200);
			stockOnHandReportResponse.setMessage("feilds cannot be null");
			return stockOnHandReportResponse;
		}

		else{  

			purchaseOrderReportDO=importToDB(stockOnHandReportDTO);
			session.save(purchaseOrderReportDO);
			stockOnHandReportResponse.setStatusCode(200);
			stockOnHandReportResponse.setMessage("success");
			return stockOnHandReportResponse;
		}
		}catch(Exception e){
			LOGGER.error("Exception:-"+e.getMessage());
			stockOnHandReportResponse.setStatusCode(500);
			stockOnHandReportResponse.setMessage("Exception:-"+e.getMessage());
			return stockOnHandReportResponse;
		}
		
		
	}

	public PurchaseOrderReportResponse getAllPurchaseOrderReportDetails() {
		StockOnHandReportResponse stockOnHandReportResponse=new StockOnHandReportResponse();
		StockOnHandReportDTO purchaseOrderReportDO=null;
			PurchaseOrderReportDTO purchaseOrderReportDTO=null;
		List<PurchaseOrderReportDTO> purchaseOrderReportDTOList=null;
		try{
			session=getSession();
			List<PurchaseOrderReportDO> purchaseOrderReportDOList=session.createQuery("from PurchaseOrderReportDO").list();
			if(purchaseOrderReportDOList.size()>0){
				purchaseOrderReportDTOList=new ArrayList<PurchaseOrderReportDTO>();
				for(PurchaseOrderReportDO purchaseOrderReportDO:purchaseOrderReportDOList){
					purchaseOrderReportDTO=	exportFromDB(purchaseOrderReportDO);
					purchaseOrderReportDTOList.add(purchaseOrderReportDTO);
				}
				purchaseOrderReportResponse.setStatusCode(200);
				purchaseOrderReportResponse.setMessage("success");
				purchaseOrderReportResponse.setPurchaseOrderReportDTOList(purchaseOrderReportDTOList);
				return purchaseOrderReportResponse;
			}
			else{
				purchaseOrderReportResponse.setStatusCode(200);
				purchaseOrderReportResponse.setMessage("NO RECORDS EXISTS");
				return purchaseOrderReportResponse;
			}
		}catch(Exception e ){
			LOGGER.error("Exception:-"+e.getMessage());
			purchaseOrderReportResponse.setStatusCode(500);
			purchaseOrderReportResponse.setMessage("Exception:-"+e.getMessage());
			return purchaseOrderReportResponse;
		}
	}



}
