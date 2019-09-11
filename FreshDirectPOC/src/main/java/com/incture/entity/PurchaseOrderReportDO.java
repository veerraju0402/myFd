package com.incture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="PURCHASE_ORDER_REPORT_TABLE")
public class PurchaseOrderReportDO {
	
	@Id
	@Column(name="PO_NUMBER",length=10)
	private String pONumber;
	
	@Column(name="PO_QUANTITY",length=5)
	private String pOQuantity;
	
	@Column(name="TOTAL_PRICE",length=5)
	private String totalPrice;
	
	@Column(name="PLANT",length=4)
	private String plant;
	
	@Column(name="DATE_CREATED")
	private Date dateCreated;
	
	@Column(name="DELIVERY_DATE")
	private Date deliverDate;
	
	@Column(name="PO_STATUS",length=5)
	private String pOStatus;

	public String getpONumber() {
		return pONumber;
	}

	public void setpONumber(String pONumber) {
		this.pONumber = pONumber;
	}

	public String getpOQuantity() {
		return pOQuantity;
	}

	public void setpOQuantity(String pOQuantity) {
		this.pOQuantity = pOQuantity;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPlant() {
		return plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getDeliverDate() {
		return deliverDate;
	}

	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
	}

	public String getpOStatus() {
		return pOStatus;
	}

	public void setpOStatus(String pOStatus) {
		this.pOStatus = pOStatus;
	}

	@Override
	public String toString() {
		return "PurchaseOrderReportDO [pONumber=" + pONumber + ", pOQuantity=" + pOQuantity + ", totalPrice="
				+ totalPrice + ", plant=" + plant + ", dateCreated=" + dateCreated + ", deliverDate=" + deliverDate
				+ ", pOStatus=" + pOStatus + "]";
	}

	
	

}
