package com.incture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.incture.DTO.InvoiceReportDTO;
import com.incture.DTO.PurchaseOrderReportDTO;
import com.incture.entity.PurchaseOrderReportDO;
import com.incture.response.InvoiceReportResponse;
import com.incture.response.PurchaseOrderReportResponse;
import com.incture.service.PurchaseOrderReportService;

@RestController
@RequestMapping(value="/PurchaseOrderReport")
@Configuration
public class PurchaseOrderReportController {

	@Autowired
	PurchaseOrderReportService purchaseOrderReportService;
	
	@GetMapping("/msg")
	public String message(){
		return "welcome message from PurchaseOrderReportController";
	}
	
	@PostMapping("/addPurchaseOrderReport")
	public PurchaseOrderReportResponse addPurchaseOrderReportDetails(@RequestBody PurchaseOrderReportDTO purchaseOrderReportDTO){
		return purchaseOrderReportService.addPurchaseOrderReportDetails(purchaseOrderReportDTO);}
	
	@PostMapping("/poDeliveryDate")
	public PurchaseOrderReportResponse addPurchaseOrderReportFDeliveryDetails(@RequestParam String poNumber){
		return purchaseOrderReportService.addPurchaseOrderReportFDeliveryDetails(poNumber);}
	
	@GetMapping("/getAllPurchaseOrderReport")
	public PurchaseOrderReportResponse getAllPurchaseOrderReportDetails(){
		return purchaseOrderReportService.getAllPurchaseOrderReportDetails();
	}
	
	@PostMapping("/fetchPurchaseOrderReport")
	public PurchaseOrderReportResponse fetchPurchaseOrderReportDetails(@RequestBody PurchaseOrderReportDTO purchaseOrderReportDTO){
		return purchaseOrderReportService.fetchPurchaseOrderReportDetails(purchaseOrderReportDTO);}
	
}
