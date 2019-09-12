package com.incture.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.DAO.InvoiceReportServiceDAO;
import com.incture.DTO.FetchInvoiceReport;
import com.incture.DTO.FetchRemmitanceReportDTO;
import com.incture.DTO.InvoiceReportDTO;
import com.incture.response.ResponseMessage;
import com.incture.service.InvoiceReportService;

@Service
public class InvoiceReportServiceImpl implements InvoiceReportService {
	
	@Autowired
	InvoiceReportServiceDAO invoiceReportServiceDAO;

	@Override
	public ResponseMessage addInvoiceReportDetails(InvoiceReportDTO invoiceReportDTO) {
		
		return invoiceReportServiceDAO.addInvoiceReportDetails(invoiceReportDTO);
	}

	@Override
	public ResponseMessage fetchInvoiceReportReport(FetchInvoiceReport fetchInvoiceReport) {
		// TODO Auto-generated method stub
		return invoiceReportServiceDAO.fetchInvoiceReportReport(fetchInvoiceReport);
	}

	@Override
	public ResponseMessage getAllInvoiceReportReportDetails() {
		// TODO Auto-generated method stub
		return invoiceReportServiceDAO.getAllInvoiceReportReportDetails();
	}
	
	@Override
	public ResponseMessage fetchRemmitanceReportDetails(FetchRemmitanceReportDTO fetchRemmitanceReportDTO) {
		// TODO Auto-generated method stub
		return invoiceReportServiceDAO.fetchRemmitanceReportDetails(fetchRemmitanceReportDTO);
	}
	
	/*public InvoiceReportResponse addInvoiceReportDeliverDetails(InvoiceReportDTO invoiceReportDTO) {
		return invoiceReportServiceDAO.fetchInvoiceReportReport(invoiceReportDTO);
	}*/
}
