package com.incture.DTO;


public class StockOnHandReportDTO {

	private int  id;
	
	private String vendorMaterialId;
	
	private String plant;
	
	private String materialId;
	
	private String materialdescription;
	
	private double totalUnits;
	
	private String uom;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
		return materialId;
	}

	public void setMaterialId(String materialId) {
		this.materialId = materialId;
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
