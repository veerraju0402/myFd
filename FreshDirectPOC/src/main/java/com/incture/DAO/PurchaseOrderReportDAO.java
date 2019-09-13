package com.incture.DAO;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.hibernate.SQLQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.incture.DTO.FetchPurchaseOrderDTO;
import com.incture.DTO.PurchaseOrderReportDTO;
import com.incture.entity.PurchaseOrderReportDO;
import com.incture.response.ResponseMessage;
import com.incture.utility.StringUtils;

@Repository
public class PurchaseOrderReportDAO extends BaseDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(PurchaseOrderReportDAO.class);

	// import
	public PurchaseOrderReportDO importToDB(PurchaseOrderReportDTO purchaseOrderReportDTO) {
		PurchaseOrderReportDO purchaseOrderReportDO = new PurchaseOrderReportDO();
		BeanUtils.copyProperties(purchaseOrderReportDTO, purchaseOrderReportDO);
		return purchaseOrderReportDO;
	}

	// export
	public PurchaseOrderReportDTO exportFromDB(PurchaseOrderReportDO purchaseOrderReportDO) {
		PurchaseOrderReportDTO purchaseOrderReportDTO = new PurchaseOrderReportDTO();
		BeanUtils.copyProperties(purchaseOrderReportDO, purchaseOrderReportDTO);
		return purchaseOrderReportDTO;
	}
	public   Date getInTime() {
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
       	timestamp.setMonth(6);  //-1 for a month since starts from 0
       	timestamp.setDate(2);
		Date currentDate = timestamp;
		return currentDate;
	}
	public   Date getOutTime() {
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		
       	timestamp.setMonth(6);  //-1 for a month since starts from 0
       	timestamp.setDate(2);
		Date currentDate = timestamp;
		return currentDate;
	}
	public ResponseMessage addPurchaseOrderReportDetails(PurchaseOrderReportDTO purchaseOrderReportDTO) {
		ResponseMessage purchaseOrderReportResponse = new ResponseMessage();
		PurchaseOrderReportDO purchaseOrderReportDO = null;
		try {
			session = getSession();
			if (StringUtils.isEmptyObject(purchaseOrderReportDTO)
					&& StringUtils.isEmptyDate(purchaseOrderReportDTO.getDeliverDate())) { 
				
				purchaseOrderReportResponse.setStatusCode(200);
				purchaseOrderReportResponse.setMessage("feilds cannot be null");
				return purchaseOrderReportResponse;
			}

			else {

				purchaseOrderReportDO = importToDB(purchaseOrderReportDTO);
			//	purchaseOrderReportDO.setDateCreated(getInTime()); 
				//purchaseOrderReportDO.setDeliverDate(getOutTime());
				session.save(purchaseOrderReportDO);
				purchaseOrderReportResponse.setStatusCode(200);
				purchaseOrderReportResponse.setMessage("success");
				return purchaseOrderReportResponse;
			}
		} catch (Exception e) {
			LOGGER.error("Exception:-" + e.getMessage());
			purchaseOrderReportResponse.setStatusCode(500);
			purchaseOrderReportResponse.setMessage("Exception:-" + e.getMessage());
			return purchaseOrderReportResponse;
		}
	}

	public ResponseMessage addPurchaseOrderReportFDeliveryDetails(PurchaseOrderReportDTO purchaseOrderReportDTO) {
			ResponseMessage purchaseOrderReportResponse = new ResponseMessage();
		PurchaseOrderReportDO purchaseOrderReportDO = null;
		try {
			session = getSession();
			purchaseOrderReportDO = session.get(PurchaseOrderReportDO.class, purchaseOrderReportDTO.getpONumber());
			System.err.println("do is:p-" + purchaseOrderReportDO.getpONumber());
			//purchaseOrderReportDO.setDeliverDate(StringUtils.getTime());
			purchaseOrderReportDO.setDeliverDate(purchaseOrderReportDTO.getDeliverDate());
			session.update(purchaseOrderReportDO);
			purchaseOrderReportResponse.setStatusCode(200);
			purchaseOrderReportResponse.setMessage("success_date updated");
			return purchaseOrderReportResponse;
		} catch (Exception e) {
			LOGGER.error("Exception:-" + e.getMessage());
			purchaseOrderReportResponse.setStatusCode(500);
			purchaseOrderReportResponse.setMessage("Exception:-" + e.getMessage());
			return purchaseOrderReportResponse;
		}
	}
	
	public ResponseMessage getAllPurchaseOrderReportDetails() {
		// PurchaseOrderReportResponse purchaseOrderReportResponse=new
		// PurchaseOrderReportResponse();
		ResponseMessage purchaseOrderReportResponse = new ResponseMessage();
		PurchaseOrderReportDTO purchaseOrderReportDTO = null;
		// List<PurchaseOrderReportDTO> purchaseOrderReportDTOList=null;
		List<Object> purchaseOrderReportDTOList = null;
		try {
			session = getSession();
			List<PurchaseOrderReportDO> purchaseOrderReportDOList = session.createQuery("from PurchaseOrderReportDO")
					.list();
			if (purchaseOrderReportDOList.size() > 0) {
				purchaseOrderReportDTOList = new ArrayList<Object>();
				for (PurchaseOrderReportDO purchaseOrderReportDO : purchaseOrderReportDOList) {
					purchaseOrderReportDTO = exportFromDB(purchaseOrderReportDO);
					purchaseOrderReportDTOList.add(purchaseOrderReportDTO);
				}
				purchaseOrderReportResponse.setStatusCode(200);
				purchaseOrderReportResponse.setMessage("success");
				// purchaseOrderReportResponse.setPurchaseOrderReportDTOList(purchaseOrderReportDTOList);
				purchaseOrderReportResponse.setObjList(purchaseOrderReportDTOList);
				return purchaseOrderReportResponse;
			} else {
				purchaseOrderReportResponse.setStatusCode(200);
				purchaseOrderReportResponse.setMessage("NO RECORDS EXISTS");
				return purchaseOrderReportResponse;
			}
		} catch (Exception e) {
			LOGGER.error("Exception:-" + e.getMessage());
			purchaseOrderReportResponse.setStatusCode(500);
			purchaseOrderReportResponse.setMessage("Exception:-" + e.getMessage());
			return purchaseOrderReportResponse;
		}
	}

	public ResponseMessage fetchPurchaseOrderReportDetails(FetchPurchaseOrderDTO fetchPurchaseOrder) {

		
		ResponseMessage purchaseOrderReportResponse = new ResponseMessage();
		try {
			
			if (StringUtils.isEmptyObject(fetchPurchaseOrder)) {
				return getAllPurchaseOrderReportDetails();
			} else {

				//System.err.println("inside try block  po dao");
				List<Object> PurchaseOrderReportDTOList = new ArrayList<Object>();
				String queryString = "SELECT " + " DISTINCT P.PO_NUMBER," + "P.PO_QUANTITY," + "P.TOTAL_PRICE,"
						+ "p.PLANT," + "P.DATE_CREATED," + "P.DELIVERY_DATE," + "P.PO_STATUS FROM "
						+ "\"SYSTEM\".\"PURCHASE_ORDER_REPORT_TABLE\" AS P " + "INNER JOIN  "
						+ "\"SYSTEM\".\"STOCK_ON_HAND_REPORT\" AS S " + " ON P.PLANT=S.PLANT WHERE (1=1) ";
				

				if (!StringUtils.isEmpty(fetchPurchaseOrder.getPlant()))
					queryString += " AND P.PLANT='" + fetchPurchaseOrder.getPlant() + "' ";
				if (!StringUtils.isEmpty(fetchPurchaseOrder.getPoNumber()))
					queryString += " AND P.PO_NUMBER='" + fetchPurchaseOrder.getPoNumber() + "' ";
				if (!StringUtils.isEmpty(fetchPurchaseOrder.getVendorMaterialNumber()))
					queryString += " AND  S.MATERIAL_ID='" + fetchPurchaseOrder.getVendorMaterialNumber() + "' ";
				if (!StringUtils.isEmpty(fetchPurchaseOrder.getMaterialDescription()))
					queryString += " AND S.MATERIAL_DESCRIPTION='" + fetchPurchaseOrder.getMaterialDescription() + "' ";
				if (!StringUtils.isEmptyDate(fetchPurchaseOrder.getFromDate())&& !StringUtils.isEmptyDate(fetchPurchaseOrder.getToDate()))
					queryString += " AND P.DATE_CREATED BETWEEN '" + StringUtils.convertDateToString(fetchPurchaseOrder.getFromDate()) + "' "+ " AND'" + StringUtils.convertDateToString(fetchPurchaseOrder.getToDate())+"'";
				if (!StringUtils.isEmpty(fetchPurchaseOrder.getStatus()))
					queryString += " AND P.PO_STATUS='" + fetchPurchaseOrder.getStatus() + "' ";
				//select * from "SYSTEM"."PURCHASE_ORDER_REPORT_TABLE" where DATE_CREATED between '2019-01-03' and '2019-09-22';
				System.err.println(queryString);
				SQLQuery query = this.getSession().createSQLQuery(queryString);
				@SuppressWarnings("unchecked")
				List<Object[]> queryList = query.list();
				if (queryList.size() > 0) {
					for (Object[] obj : queryList) {
						PurchaseOrderReportDTO dto = new PurchaseOrderReportDTO();
						dto.setpONumber(obj[0] == null ? "" : obj[0].toString());
						dto.setpOQuantity(obj[1] == null ? "" : obj[1].toString());
						dto.setTotalPrice(obj[2] == null ? "" : obj[2].toString());
						dto.setPlant(obj[3] == null ? "" : obj[3].toString());
						dto.setDateCreated((Date) obj[4]);
						dto.setDeliverDate((Date) obj[5]);
						dto.setpOStatus(obj[6] == null ? "" : obj[6].toString());
						PurchaseOrderReportDTOList.add((Object) dto);
					}
					purchaseOrderReportResponse.setMessage("success");
					purchaseOrderReportResponse.setStatusCode(200);
					// purchaseOrderReportResponse.setPurchaseOrderReportDTOList(PurchaseOrderReportDTOList);
					purchaseOrderReportResponse.setObjList(PurchaseOrderReportDTOList);
					return purchaseOrderReportResponse;
				} else {
					purchaseOrderReportResponse.setMessage("success");
					purchaseOrderReportResponse.setStatusCode(200);
					purchaseOrderReportResponse.setStatusMesaage("records does not exixts");
					return purchaseOrderReportResponse;
				}
			}
		} catch (Exception e) {
			LOGGER.error("Exception:-" + e.getMessage());
			purchaseOrderReportResponse.setStatusCode(500);
			purchaseOrderReportResponse.setMessage("Exception:-" + e.getMessage());
			return purchaseOrderReportResponse;
		}
	}

}
