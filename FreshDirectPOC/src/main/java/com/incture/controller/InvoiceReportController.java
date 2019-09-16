package com.incture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.incture.DTO.FetchInvoiceReport;
import com.incture.DTO.FetchRemmitanceReportDTO;
import com.incture.DTO.InvoiceReportDTO;
import com.incture.entity.InvoiceReportDO;
import com.incture.response.ResponseMessage;
import com.incture.service.InvoiceReportService;

@RestController
@RequestMapping(value="/invoiceReport")
@Configuration
public class InvoiceReportController {

	@Autowired
InvoiceReportService InvoiceReportService;
	
	
	@GetMapping("/msg")
	public String message(){
		return "welcome message from InvoiceReportController";
	}

	@PostMapping("/addInvoiceReport")
	public ResponseMessage addInvoiceReportDetails(@RequestBody InvoiceReportDTO invoiceReportDTO){
		return InvoiceReportService.addInvoiceReportDetails(invoiceReportDTO);}
	
	@GetMapping("/getAllInvoiceReport")
	public ResponseMessage getAllInvoiceReportReportDetails(){
		return InvoiceReportService.getAllInvoiceReportReportDetails();
	}
	
	@PostMapping("/fetchInvoiceReport")
	public ResponseMessage fetchInvoiceReportReport(@RequestBody FetchInvoiceReport fetchInvoiceReport){
		return InvoiceReportService.fetchInvoiceReportReport(fetchInvoiceReport);
	}
	
	
	
}
