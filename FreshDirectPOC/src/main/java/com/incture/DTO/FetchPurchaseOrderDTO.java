package com.incture.DTO;

import java.util.Date;

public class FetchPurchaseOrderDTO {
	
	private String poNumber;
	private String vendorMaterialNumber;
	private String materialDescription;
	private String UPC;
	private String plant;
	private Date fromDate;
	private Date toDate;
	private String status;
	public String getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(String poNumber) {
		this.poNumber = poNumber;
	}
	public String getVendorMaterialNumber() {
		return vendorMaterialNumber;
	}
	public void setVendorMaterialNumber(String vendorMaterialNumber) {
		this.vendorMaterialNumber = vendorMaterialNumber;
	}
	public String getMaterialDescription() {
		return materialDescription;
	}
	public void setMaterialDescription(String materialDescription) {
		this.materialDescription = materialDescription;
	}
	public String getUPC() {
		return UPC;
	}
	public void setUPC(String uPC) {
		UPC = uPC;
	}
	public String getPlant() {
		return plant;
	}
	public void setPlant(String plant) {
		this.plant = plant;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	

}
