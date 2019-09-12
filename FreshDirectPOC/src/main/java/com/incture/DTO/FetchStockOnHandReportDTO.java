package com.incture.DTO;

public class FetchStockOnHandReportDTO {

	
	private String plant;
	private String material;
	private String vendorMaterial;
	private String UPC;
	
	
	public String getPlant() {
		return plant;
	}
	public void setPlant(String plant) {
		this.plant = plant;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getVendorMaterial() {
		return vendorMaterial;
	}
	public void setVendorMaterial(String vendorMaterial) {
		this.vendorMaterial = vendorMaterial;
	}
	public String getUPC() {
		return UPC;
	}
	public void setUPC(String uPC) {
		UPC = uPC;
	}
	
	
}
