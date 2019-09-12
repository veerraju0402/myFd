package com.incture.service;

import com.incture.DTO.FetchInvoiceReport;
import com.incture.DTO.FetchRemmitanceReportDTO;
import com.incture.DTO.InvoiceReportDTO;
import com.incture.response.ResponseMessage;

public interface InvoiceReportService {

	ResponseMessage addInvoiceReportDetails(InvoiceReportDTO invoiceReportDTO);

	ResponseMessage fetchInvoiceReportReport(FetchInvoiceReport fetchInvoiceReport);

	ResponseMessage getAllInvoiceReportReportDetails();
	
	ResponseMessage fetchRemmitanceReportDetails(FetchRemmitanceReportDTO fetchRemmitanceReportDTO);


}
