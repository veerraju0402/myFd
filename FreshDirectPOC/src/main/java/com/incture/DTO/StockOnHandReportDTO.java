package com.incture.DTO;


public class StockOnHandReportDTO {

	
	private String vendorMaterialId;
	
	private String plant;
	
	private String MaterialId;
	
	private String materialdescription;
	
	private double totalUnits;
	
	private String uom;

	public String getVendorMaterialId() {
		return vendorMaterialId;
	}

	public void setVendorMaterialId(String vendorMaterialId) {
		this.vendorMaterialId = vendorMaterialId;
	}

	public String getPlant() {
		return plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

	public String getMaterialId() {
		return MaterialId;
	}

	public void setMaterialId(String materialId) {
		MaterialId = materialId;
	}

	public String getMaterialdescription() {
		return materialdescription;
	}

	public void setMaterialdescription(String materialdescription) {
		this.materialdescription = materialdescription;
	}

	public double getTotalUnits() {
		return totalUnits;
	}

	public void setTotalUnits(double totalUnits) {
		this.totalUnits = totalUnits;
	}

	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}
	
	
}
