package com.incture.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.DAO.InvoiceReportServiceDAO;
import com.incture.DTO.InvoiceReportDTO;
import com.incture.response.InvoiceReportResponse;
import com.incture.service.InvoiceReportService;

@Service
public class InvoiceReportServiceImpl implements InvoiceReportService {
	
	@Autowired
	InvoiceReportServiceDAO invoiceReportServiceDAO;

	@Override
	public InvoiceReportResponse addInvoiceReportDetails(InvoiceReportDTO invoiceReportDTO) {
		
		return invoiceReportServiceDAO.addInvoiceReportDetails(invoiceReportDTO);
	}

}
