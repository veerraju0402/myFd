package com.incture.DTO;

import java.util.Date;

public class FetchRemmitanceReportDTO {

	private String invoice;
	private String poNumber;
	private String paymentVoucher;
	private Date fromDate;
	private Date toDate;
	public String getInvoice() {
		return invoice;
	}
	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}
	public String getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}
	public String getPaymentVoucher() {
		return paymentVoucher;
	}
	public void setPaymentVoucher(String paymentVoucher) {
		this.paymentVoucher = paymentVoucher;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	
}
