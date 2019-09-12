package com.incture.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.DAO.PurchaseOrderReportDAO;
import com.incture.DTO.FetchPurchaseOrderDTO;
import com.incture.DTO.FetchRemmitanceReportDTO;
import com.incture.DTO.PurchaseOrderReportDTO;
import com.incture.DTO.StockOnHandReportDTO;
import com.incture.entity.PurchaseOrderReportDO;
import com.incture.response.ResponseMessage;
import com.incture.service.PurchaseOrderReportService;

@Service
public class PurchaseOrderReportServiceImpl implements PurchaseOrderReportService {

	@Autowired
	PurchaseOrderReportDAO purchaseOrderReportDAO;
	
	@Override
	public ResponseMessage addPurchaseOrderReportDetails(PurchaseOrderReportDTO purchaseOrderReportDTO) {
		// TODO Auto-generated method stub
		return purchaseOrderReportDAO.addPurchaseOrderReportDetails(purchaseOrderReportDTO);
	}

	@Override
	public ResponseMessage getAllPurchaseOrderReportDetails() {
		// TODO Auto-generated method stub
		return purchaseOrderReportDAO.getAllPurchaseOrderReportDetails();
	}

	@Override
	public ResponseMessage addPurchaseOrderReportFDeliveryDetails(String poNumber) {
		// TODO Auto-generated method stub
		return purchaseOrderReportDAO.addPurchaseOrderReportFDeliveryDetails(poNumber);
	}

	@Override
	public ResponseMessage fetchPurchaseOrderReportDetails(FetchPurchaseOrderDTO fetchPurchaseOrder) {
		return purchaseOrderReportDAO.fetchPurchaseOrderReportDetails(fetchPurchaseOrder);
		
	}

	

}
