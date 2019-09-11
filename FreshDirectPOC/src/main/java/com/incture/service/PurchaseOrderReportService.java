package com.incture.service;

import com.incture.DTO.PurchaseOrderReportDTO;
import com.incture.response.PurchaseOrderReportResponse;

public interface PurchaseOrderReportService {

	PurchaseOrderReportResponse addPurchaseOrderReportDetails(PurchaseOrderReportDTO purchaseOrderReportDTO);

	PurchaseOrderReportResponse getAllPurchaseOrderReportDetails();

	PurchaseOrderReportResponse fetchPurchaseOrderReportDetails(PurchaseOrderReportDTO purchaseOrderReportDTO);

	PurchaseOrderReportResponse addPurchaseOrderReportFDeliveryDetails(String poNumber);

}
