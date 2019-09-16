package com.incture.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SQLQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.incture.DTO.FetchStockOnHandReportDTO;
import com.incture.DTO.InvoiceReportDTO;
import com.incture.DTO.PurchaseOrderReportDTO;
import com.incture.DTO.StockOnHandReportDTO;
import com.incture.entity.PurchaseOrderReportDO;
import com.incture.entity.StockOnHandReportDO;
import com.incture.response.ResponseMessage;
import com.incture.utility.StringUtils;

@Repository
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


	public ResponseMessage addstockOnHandReportDetails(StockOnHandReportDTO stockOnHandReportDTO) {
		ResponseMessage stockOnHandReportResponse=new ResponseMessage();
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

	public ResponseMessage getAllStockOnHandReportDetails() {
		ResponseMessage stockOnHandReportResponse=new ResponseMessage();
		StockOnHandReportDTO stockOnHandReportDTO=null;
		List<Object> stockOnHandReportDTOList=null;
		try{
			session=getSession();
			List<StockOnHandReportDO> stockOnHandReportDOList=session.createQuery("from StockOnHandReportDO").list();
			if(stockOnHandReportDOList.size()>0){
				stockOnHandReportDTOList=new ArrayList<Object>();
				for(StockOnHandReportDO stockOnHandReportDO:stockOnHandReportDOList){
					stockOnHandReportDTO=	exportFromDB(stockOnHandReportDO);
					stockOnHandReportDTOList.add(stockOnHandReportDTO);
				}
				stockOnHandReportResponse.setStatusCode(200);
				stockOnHandReportResponse.setMessage("success");
				stockOnHandReportResponse.setStatusMesaage(" null payload( for reference)");
				//stockOnHandReportResponse.setStockOnHandReportDTOList(stockOnHandReportDTOList);
				stockOnHandReportResponse.setObjList(stockOnHandReportDTOList);
				return stockOnHandReportResponse;
			}
			else{
				stockOnHandReportResponse.setStatusCode(200);
				stockOnHandReportResponse.setMessage("NO RECORDS EXISTS");
				return stockOnHandReportResponse;
			}
		}catch(Exception e ){
			LOGGER.error("Exception:-"+e.getMessage());
			stockOnHandReportResponse.setStatusCode(500);
			stockOnHandReportResponse.setMessage("Exception:-"+e.getMessage());
			return stockOnHandReportResponse;
		}
	}

	@SuppressWarnings("null")
	public ResponseMessage fetchStockOnHandReportDetails(FetchStockOnHandReportDTO fetchStockOnHandReportDTO) {
		
		if(StringUtils.isEmptyObject(fetchStockOnHandReportDTO)){
			return getAllStockOnHandReportDetails();
		}
		else{
		ResponseMessage stockOnHandReportResponse=new ResponseMessage();
		List<Object> stockOnHandReport=null;
		StockOnHandReportDTO stockOnHandReportDTO=null;
		if(StringUtils.isEmptyObject(fetchStockOnHandReportDTO)){
			return getAllStockOnHandReportDetails();
		}else{
		try{
			session=getSession();
			
			String queryString="SELECT "+"S.VENDOR_MATERIAL_ID, "+"S.MATERIAL_ID,"+"S.MATERIAL_DESCRIPTION,"+"S.PLANT,"+"S.TOTAL_UNITS,"+"S.UOM FROM "+"\"SYSTEM\".\"STOCK_ON_HAND_REPORT\" AS S "+" WHERE (1=1)";
			if(!StringUtils.isEmpty(fetchStockOnHandReportDTO.getPlant()))
				queryString+=" AND S.PLANT='"+fetchStockOnHandReportDTO.getPlant()+"'";
			if(!StringUtils.isEmpty(fetchStockOnHandReportDTO.getMaterial()))
				queryString+=" AND S.MATERIAL_ID='"+fetchStockOnHandReportDTO.getMaterial()+"'";
			
			if(!StringUtils.isEmpty(fetchStockOnHandReportDTO.getVendorMaterial()))
				queryString+=" AND S.VENDOR_MATERIAL_ID='"+fetchStockOnHandReportDTO.getVendorMaterial()+"'";
			
			if(!StringUtils.isEmpty(fetchStockOnHandReportDTO.getUPC()))
				queryString+=" AND S.UOM='"+fetchStockOnHandReportDTO.getUPC()+"'";
			
			System.err.println("error is:-"+queryString);
			SQLQuery query = session.createSQLQuery(queryString);
			List<Object[]> stockOnHandReportDOList = query.list();
			if(stockOnHandReportDOList.size()>0){
				stockOnHandReport=new ArrayList<Object>();
				for(Object[] obj:stockOnHandReportDOList){
					stockOnHandReportDTO=new StockOnHandReportDTO();
					stockOnHandReportDTO.setVendorMaterialId(obj[0] == null ? "" : obj[0].toString());
					stockOnHandReportDTO.setMaterialId(obj[1] == null ? "" : obj[1].toString());
					stockOnHandReportDTO.setMaterialdescription(obj[2] == null ? "" : obj[2].toString());
					stockOnHandReportDTO.setPlant(obj[3] == null ? "" : obj[3].toString());
					stockOnHandReportDTO.setTotalUnits((double) obj[4]);
					stockOnHandReportDTO.setUom(obj[5] == null ? "" : obj[4].toString());
					stockOnHandReport.add((Object)stockOnHandReportDTO);
				}
				stockOnHandReportResponse.setMessage("success");
				stockOnHandReportResponse.setStatusCode(200);
				stockOnHandReportResponse.setObjList(stockOnHandReport);
				return stockOnHandReportResponse;
			}else{
				stockOnHandReportResponse.setMessage("success");
				stockOnHandReportResponse.setStatusCode(200);
				stockOnHandReportResponse.setStatusMesaage("No records Exists");
				return stockOnHandReportResponse;}
		}
		catch(Exception e){
			System.err.println("exception:-"+e.getMessage());
			LOGGER.error("Exception:-"+e.getMessage());
			stockOnHandReportResponse.setMessage("failed:-"+e.getMessage());
			stockOnHandReportResponse.setStatusCode(500);
			return stockOnHandReportResponse;}}
		
	}

	}

}
