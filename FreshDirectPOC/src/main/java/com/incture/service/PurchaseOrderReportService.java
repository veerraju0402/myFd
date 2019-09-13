package com.incture.service;

import com.incture.DTO.FetchPurchaseOrderDTO;
import com.incture.DTO.FetchRemmitanceReportDTO;
import com.incture.DTO.PurchaseOrderReportDTO;
import com.incture.DTO.StockOnHandReportDTO;
import com.incture.response.ResponseMessage;

public interface PurchaseOrderReportService {

	ResponseMessage addPurchaseOrderReportDetails(PurchaseOrderReportDTO purchaseOrderReportDTO);

	ResponseMessage getAllPurchaseOrderReportDetails();


	ResponseMessage addPurchaseOrderReportFDeliveryDetails(PurchaseOrderReportDTO purchaseOrderReportDTO);

	ResponseMessage fetchPurchaseOrderReportDetails(FetchPurchaseOrderDTO fetchPurchaseOrder);

	
}
