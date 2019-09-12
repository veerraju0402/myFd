package com.incture.DTO;

import java.util.Date;

public class FetchInvoiceReport {

	
	private String vendorInvoice;
	private String status;
	private Date invoiceFromDate;
	private Date invoiceToDate;
	
	public String getVendorInvoice() {
		return vendorInvoice;
	}
	public void setVendorInvoice(String vendorInvoice) {
		this.vendorInvoice = vendorInvoice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getInvoiceFromDate() {
		return invoiceFromDate;
	}
	public void setInvoiceFromDate(Date invoiceFromDate) {
		this.invoiceFromDate = invoiceFromDate;
	}
	public Date getInvoiceToDate() {
		return invoiceToDate;
	}
	public void setInvoiceToDate(Date invoiceToDate) {
		this.invoiceToDate = invoiceToDate;
	}
	
	
	
}
