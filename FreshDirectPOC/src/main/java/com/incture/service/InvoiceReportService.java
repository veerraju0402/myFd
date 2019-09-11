package com.incture.service;

import com.incture.DTO.InvoiceReportDTO;
import com.incture.response.InvoiceReportResponse;

public interface InvoiceReportService {

	InvoiceReportResponse addInvoiceReportDetails(InvoiceReportDTO invoiceReportDTO);

}
