package com.incture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.incture.DTO.FetchPurchaseOrderDTO;
import com.incture.DTO.PurchaseOrderReportDTO;
import com.incture.response.ResponseMessage;
import com.incture.service.PurchaseOrderReportService;

@RestController
@RequestMapping(value = "/purchaseOrderReport")
@Configuration
public class PurchaseOrderReportController {

	@Autowired
	PurchaseOrderReportService purchaseOrderReportService;

	@GetMapping("/msg")
	public String message() {
		return "welcome message from PurchaseOrderReportController";
	}

	@PostMapping("/addPurchaseOrderReport")
	public ResponseMessage addPurchaseOrderReportDetails(@RequestBody PurchaseOrderReportDTO purchaseOrderReportDTO) {
		return purchaseOrderReportService.addPurchaseOrderReportDetails(purchaseOrderReportDTO);
	}

	@PostMapping("/poDeliveryDate")
	public ResponseMessage addPurchaseOrderReportFDeliveryDetails(@RequestBody PurchaseOrderReportDTO purchaseOrderReportDTO) {
		return purchaseOrderReportService.addPurchaseOrderReportFDeliveryDetails(purchaseOrderReportDTO);
	}

	@GetMapping("/getAllPurchaseOrderReport")
	public ResponseMessage getAllPurchaseOrderReportDetails() {
		return purchaseOrderReportService.getAllPurchaseOrderReportDetails();
	}

	@GetMapping("/fetchPurchaseOrderReport")
	public ResponseMessage fetchPurchaseOrderReportDetails(@RequestBody FetchPurchaseOrderDTO fetchPurchaseOrder) {
		//System.err.println("fetchPurchaseOrderReport controller");
		return purchaseOrderReportService.fetchPurchaseOrderReportDetails(fetchPurchaseOrder);
	}

}
