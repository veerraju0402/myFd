package com.incture.DAO;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.incture.DTO.InvoiceReportDTO;
import com.incture.DTO.PurchaseOrderReportDTO;
import com.incture.entity.InvoiceReportDO;
import com.incture.entity.PurchaseOrderReportDO;
import com.incture.response.PurchaseOrderReportResponse;
import com.incture.utility.StringUtils;

@Repository
public class PurchaseOrderReportDAO extends BaseDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(PurchaseOrderReportDAO.class);

	// import
	public PurchaseOrderReportDO importToDB(PurchaseOrderReportDTO purchaseOrderReportDTO) {
		PurchaseOrderReportDO purchaseOrderReportDO = new PurchaseOrderReportDO();
		BeanUtils.copyProperties(purchaseOrderReportDTO, purchaseOrderReportDO);
		return purchaseOrderReportDO;}

	// export
	public PurchaseOrderReportDTO exportFromDB(PurchaseOrderReportDO purchaseOrderReportDO) {
		PurchaseOrderReportDTO purchaseOrderReportDTO = new PurchaseOrderReportDTO();
		BeanUtils.copyProperties(purchaseOrderReportDO, purchaseOrderReportDTO);
		return purchaseOrderReportDTO;}


	public PurchaseOrderReportResponse addPurchaseOrderReportDetails(PurchaseOrderReportDTO purchaseOrderReportDTO) {
		PurchaseOrderReportResponse purchaseOrderReportResponse=new PurchaseOrderReportResponse();
		PurchaseOrderReportDO purchaseOrderReportDO=null;
		try{session=getSession();
			if(StringUtils.isEmptyObject(purchaseOrderReportDTO) && StringUtils.isEmptyDate(purchaseOrderReportDTO.getDeliverDate())){  //if object is empty
				purchaseOrderReportResponse.setStatusCode(200);
				purchaseOrderReportResponse.setMessage("feilds cannot be null");
				return purchaseOrderReportResponse;
			}
			
			else{  
				
				 purchaseOrderReportDO=importToDB(purchaseOrderReportDTO);
				purchaseOrderReportDO.setDateCreated(StringUtils.getTime());   //PO created date
				session.save(purchaseOrderReportDO);
				purchaseOrderReportResponse.setStatusCode(200);
				purchaseOrderReportResponse.setMessage("success");
				return purchaseOrderReportResponse;
			}
		}catch(Exception e){
			LOGGER.error("Exception:-"+e.getMessage());
			purchaseOrderReportResponse.setStatusCode(500);
			purchaseOrderReportResponse.setMessage("Exception:-"+e.getMessage());
			return purchaseOrderReportResponse;
		}
	}

	public PurchaseOrderReportResponse getAllPurchaseOrderReportDetails() {
		PurchaseOrderReportResponse purchaseOrderReportResponse=new PurchaseOrderReportResponse();
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

	public PurchaseOrderReportResponse fetchPurchaseOrderReportDetails(PurchaseOrderReportDTO purchaseOrderReportDTO) {
		PurchaseOrderReportResponse purchaseOrderReportResponse=new PurchaseOrderReportResponse();
		try{
			/*   String queryString = "SELECT " + "B.BOOK_NAME," + "BR.BOOK_CODE," + "U.USER_NAME," + "BR.USER_ID,"
					+ "BR.ORDER_REQUEST_CODE," + "BR.REQUESTED_DATE,U.USER_EMAIL FROM \"" + TableConfig.SCHEMA + "\".\""
					+ TableConfig.PACKAGE + "\\:\\:LMS_ORDER_REQUEST\" AS BR " + "INNER JOIN \"" + TableConfig.SCHEMA
					+ "\".\"" + TableConfig.PACKAGE + "\\:\\:LMS_BOOK\" AS B " + "ON BR.BOOK_CODE = B.BOOK_CODE "
					+ "INNER JOIN \"" + TableConfig.SCHEMA + "\".\"" + TableConfig.PACKAGE + "\\:\\:LMS_USER\" AS U "
					+ "ON BR.USER_ID = U.USER_ID WHERE BR.IS_APPROVED is null";
			SQLQuery query = this.getSession().createSQLQuery(queryString); */
			
			String queryString="SELECT"+"p.PO_NUMBER,"+"p.PO_QUANTITY,"+"p.TOTAL_PRICE,"+"p.PLANT,"+"p.DATE_CREATED,"+"p.DELIVERY_DATE,"+"p.PO_STATUS FROM "
			+"\" PURCHASE_ORDER_REPORT_TABLE \" as p "+"INNER JOIN  "+"\"STOCK_ON_HAND_REPORT \" as s"+" ON p.PLANT=s.PLANT where";
				
			
			return null;
		}catch(Exception e ){
			LOGGER.error("Exception:-"+e.getMessage());
			purchaseOrderReportResponse.setStatusCode(500);
			purchaseOrderReportResponse.setMessage("Exception:-"+e.getMessage());
			return purchaseOrderReportResponse;
		}
	}

	public PurchaseOrderReportResponse addPurchaseOrderReportFDeliveryDetails(String poNumber) {
		PurchaseOrderReportResponse purchaseOrderReportResponse=new PurchaseOrderReportResponse();
		PurchaseOrderReportDO purchaseOrderReportDO=null;
		try{
			session=getSession();
			purchaseOrderReportDO=session.get(PurchaseOrderReportDO.class,poNumber);
			System.err.println("do is:p-"+purchaseOrderReportDO.getpONumber());
			purchaseOrderReportDO.setDeliverDate(StringUtils.getTime());
			session.update(purchaseOrderReportDO);
			purchaseOrderReportResponse.setStatusCode(200);
			purchaseOrderReportResponse.setMessage("success_date updated");
			return purchaseOrderReportResponse;
		}catch(Exception e ){
			LOGGER.error("Exception:-"+e.getMessage());
			purchaseOrderReportResponse.setStatusCode(500);
			purchaseOrderReportResponse.setMessage("Exception:-"+e.getMessage());
			return purchaseOrderReportResponse;
		}
	}



}
