package com.incture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="INVOICE_REPORT_TABLE")
public class InvoiceReportDO {

	@Id
	@Column(name="VENDOR_INVOICE",length=10)
	private String vendorInvoice;
	
	@Column(name="PURCHASE_ORDER",length=10)
	private String purchaseOrder;
	
	@Column(name="INVOICE_DATE")
	private Date invoiceDate;
	
	@Column(name="INVOICE_VALUE",length=10)
	private String invoiceValue;
	
	@Column(name="STATUS",length=20)
	private String status;
	
	@Column(name="CLEARING_DATE")
	private Date clearingDate;
	
	@Column(name="PAYMENT_REFERENCE",length=20)
	private String paymentReference;

	public String getVendorInvoice() {
		return vendorInvoice;
	}

	public void setVendorInvoice(String vendorInvoice) {
		this.vendorInvoice = vendorInvoice;
	}

	public String getPurchaseOrder() {
		return purchaseOrder;
	}

	public void setPurchaseOrder(String purchaseOrder) {
		this.purchaseOrder = purchaseOrder;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getInvoiceValue() {
		return invoiceValue;
	}

	public void setInvoiceValue(String invoiceValue) {
		this.invoiceValue = invoiceValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getClearingDate() {
		return clearingDate;
	}

	public void setClearingDate(Date clearingDate) {
		this.clearingDate = clearingDate;
	}

	public String getPaymentReference() {
		return paymentReference;
	}

	public void setPaymentReference(String paymentReference) {
		this.paymentReference = paymentReference;
	}

	@Override
	public String toString() {
		return "InvoiceReportDO [vendorInvoice=" + vendorInvoice + ", purchaseOrder=" + purchaseOrder + ", invoiceDate="
				+ invoiceDate + ", invoiceValue=" + invoiceValue + ", status=" + status + ", clearingDate="
				+ clearingDate + ", paymentReference=" + paymentReference + "]";
	}
	
	
	
	
}
