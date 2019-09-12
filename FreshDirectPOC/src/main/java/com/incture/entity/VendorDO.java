package com.incture.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VENDORTABLE")
public class VendorDO {

	@Id
	@Column(name="VENDOR_ID")
	private String  vendorId;

	@Column(name="VENDOR_NAME")
	private String vendorName;

	@Column(name="AUTHORISATION")
	private String authorisation;

	@Column(name="TYPE_OF_INDUSTRY")
	private String typeOfIndustry;

	@Column(name="CORPORATE_GROUP")
	private String corporateGroup;

	@Column(name="TAX_NO_TYPE")
	private String taxNoType;

	@Column(name="TAX_TYPE")
	private String taxType;

	@Column(name="TAX_NO3")
	private String taxNo3;

	@Column(name="TAX_NO4")
	private String taxNo4;

	@Column(name="TAX_JURR")
	private String taxJurr;

	@Column(name="TAX_OFFICE")
	private String taxOffice;

	@Column(name="NATURE_OF_BUSSINESS")
	private String natureOfBussiness;

	@Column(name="NATURE_OF_BUSSINESSDETAILS")
	private String natureOfBussinessDetails;
	//--
	@Column(name="COMPANY_CODE")
	private String companyCode;

	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="CITY")
	private String city;

	@Column(name="POSTAL_CODE")
	private String postalCode;
	
	

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getAuthorisation() {
		return authorisation;
	}

	public void setAuthorisation(String authorisation) {
		this.authorisation = authorisation;
	}

	public String getTypeOfIndustry() {
		return typeOfIndustry;
	}

	public void setTypeOfIndustry(String typeOfIndustry) {
		this.typeOfIndustry = typeOfIndustry;
	}

	public String getCorporateGroup() {
		return corporateGroup;
	}

	public void setCorporateGroup(String corporateGroup) {
		this.corporateGroup = corporateGroup;
	}

	public String getTaxNoType() {
		return taxNoType;
	}

	public void setTaxNoType(String taxNoType) {
		this.taxNoType = taxNoType;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public String getTaxNo3() {
		return taxNo3;
	}

	public void setTaxNo3(String taxNo3) {
		this.taxNo3 = taxNo3;
	}

	public String getTaxNo4() {
		return taxNo4;
	}

	public void setTaxNo4(String taxNo4) {
		this.taxNo4 = taxNo4;
	}

	public String getTaxJurr() {
		return taxJurr;
	}

	public void setTaxJurr(String taxJurr) {
		this.taxJurr = taxJurr;
	}

	public String getTaxOffice() {
		return taxOffice;
	}

	public void setTaxOffice(String taxOffice) {
		this.taxOffice = taxOffice;
	}

	public String getNatureOfBussiness() {
		return natureOfBussiness;
	}

	public void setNatureOfBussiness(String natureOfBussiness) {
		this.natureOfBussiness = natureOfBussiness;
	}

	public String getNatureOfBussinessDetails() {
		return natureOfBussinessDetails;
	}

	public void setNatureOfBussinessDetails(String natureOfBussinessDetails) {
		this.natureOfBussinessDetails = natureOfBussinessDetails;
	}





}
