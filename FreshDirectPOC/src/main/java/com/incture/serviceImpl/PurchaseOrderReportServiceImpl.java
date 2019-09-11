package com.incture.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.DAO.PurchaseOrderReportDAO;
import com.incture.DTO.PurchaseOrderReportDTO;
import com.incture.entity.PurchaseOrderReportDO;
import com.incture.response.PurchaseOrderReportResponse;
import com.incture.service.PurchaseOrderReportService;

@Service
public class PurchaseOrderReportServiceImpl implements PurchaseOrderReportService {

	@Autowired
	PurchaseOrderReportDAO purchaseOrderReportDAO;
	
	@Override
	public PurchaseOrderReportResponse addPurchaseOrderReportDetails(PurchaseOrderReportDTO purchaseOrderReportDTO) {
		// TODO Auto-generated method stub
		return purchaseOrderReportDAO.addPurchaseOrderReportDetails(purchaseOrderReportDTO);
	}

	@Override
	public PurchaseOrderReportResponse getAllPurchaseOrderReportDetails() {
		// TODO Auto-generated method stub
		return purchaseOrderReportDAO.getAllPurchaseOrderReportDetails();
	}

	@Override
	public PurchaseOrderReportResponse fetchPurchaseOrderReportDetails(PurchaseOrderReportDTO purchaseOrderReportDTO) {
		// TODO Auto-generated method stub
		return purchaseOrderReportDAO.fetchPurchaseOrderReportDetails(purchaseOrderReportDTO);
	}

	@Override
	public PurchaseOrderReportResponse addPurchaseOrderReportFDeliveryDetails(String poNumber) {
		// TODO Auto-generated method stub
		return purchaseOrderReportDAO.addPurchaseOrderReportFDeliveryDetails(poNumber);
	}

}
