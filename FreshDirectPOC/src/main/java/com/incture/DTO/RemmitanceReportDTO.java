package com.incture.DTO;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

//@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class RemmitanceReportDTO {

	
	private String paymentVoucher;
	
	private Date paymentDate;
	
	private String invoice;
	private List<String> invoiceList;
	
	private String po;
	private List<String> poList;
	
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

	public String getInvoice() {
		return invoice;
	}

	public void setInvoice(String invoice) {
		this.invoice = invoice;
	}

	public List<String> getInvoiceList() {
		return invoiceList;
	}

	public void setInvoiceList(List<String> invoiceList) {
		this.invoiceList = invoiceList;
	}

	public String getPo() {
		return po;
	}

	public void setPo(String po) {
		this.po = po;
	}

	public List<String> getPoList() {
		return poList;
	}

	public void setPoList(List<String> poList) {
		this.poList = poList;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	
	

	
}
