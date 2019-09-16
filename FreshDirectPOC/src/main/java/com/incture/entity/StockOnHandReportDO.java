package com.incture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="STOCK_ON_HAND_REPORT")
public class StockOnHandReportDO {
	
	@Id
	@GenericGenerator(name="inc",strategy="increment")
	@GeneratedValue(generator="inc")  
	@Column(name="ID")
	private int  id;
	
	@Column(name="VENDOR_MATERIAL_ID",length=20)
	private String vendorMaterialId;
	
	@Column(name="PLANT",length=20)
	private String plant;
	
	@Column(name="MATERIAL_ID",length=20)
	private String MaterialId;
	
	@Column(name="MATERIAL_DESCRIPTION",length=50)
	private String materialdescription;
	
	@Column(name="TOTAL_UNITS")
	private double totalUnits;
	
	@Column(name="UOM")
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
