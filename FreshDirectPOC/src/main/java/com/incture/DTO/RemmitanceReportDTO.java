package com.incture.DTO;

import java.util.Date;
import java.util.List;

public class RemmitanceReportDTO {

	
	private String paymentVoucher;
	
	private Date paymentDate;
	
	private List<String> invoice;
	
	private List<String> po;
	
	private String paymentAmount;

	public String getPaymentVoucher() {
		return paymentVoucher;
	}

	public void setPaymentVoucher(String paymentVoucher) {
		this.paymentVoucher = paymentVoucher;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public List<String> getInvoice() {
		return invoice;
	}

	public void setInvoice(List<String> invoice) {
		this.invoice = invoice;
	}

	public List<String> getPo() {
		return po;
	}

	public void setPo(List<String> po) {
		this.po = po;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
	
}
