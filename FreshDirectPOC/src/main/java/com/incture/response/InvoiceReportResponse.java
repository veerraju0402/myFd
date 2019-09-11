package com.incture.response;

import java.util.List;

import com.incture.DTO.InvoiceReportDTO;
import com.incture.entity.InvoiceReportDO;

public class InvoiceReportResponse {

	
	private String status;
	private int statusCode;
	private String message;
	private InvoiceReportDTO invoiceReportDTO;
	private List<InvoiceReportDTO> invoiceReportDTOList;
	
	
	
	
	public InvoiceReportDTO getInvoiceReportDTO() {
		return invoiceReportDTO;
	}
	public void setInvoiceReportDTO(InvoiceReportDTO invoiceReportDTO) {
		this.invoiceReportDTO = invoiceReportDTO;
	}
	public List<InvoiceReportDTO> getInvoiceReportDTOList() {
		return invoiceReportDTOList;
	}
	public void setInvoiceReportDTOList(List<InvoiceReportDTO> invoiceReportDTOList) {
		this.invoiceReportDTOList = invoiceReportDTOList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
