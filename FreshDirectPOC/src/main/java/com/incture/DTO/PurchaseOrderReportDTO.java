package com.incture.DTO;

import java.util.Date;


public class PurchaseOrderReportDTO {

	
private String pONumber;
	
	private String pOQuantity;
	
	private String totalPrice;
	
	private String plant;
	
	private Date dateCreated;
	
	private Date deliverDate;
	
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
		return "PurchaseOrderReportDTO [pONumber=" + pONumber + ", pOQuantity=" + pOQuantity + ", totalPrice="
				+ totalPrice + ", plant=" + plant + ", dateCreated=" + dateCreated + ", deliverDate=" + deliverDate
				+ ", pOStatus=" + pOStatus + "]";
	}

	
}
