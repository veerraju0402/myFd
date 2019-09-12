package com.incture.DTO;


public class UserDTO {
	private String userId;

	private String userRole;

	private String serviceType;

	private  String firstName;

	private String lastName;

	private String email;

	private String phoneNumber;

	private String panNumber;

	private String vendorName;

	private String vendorAddress;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getVendorAddress() {
		return vendorAddress;
	}

	public void setVendorAddress(String vendorAddress) {
		this.vendorAddress = vendorAddress;
	}

	@Override
	public String toString() {
		return "UserDTO [userId=" + userId + ", userRole=" + userRole + ", serviceType=" + serviceType + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", panNumber=" + panNumber + ", vendorName=" + vendorName + ", vendorAddress=" + vendorAddress + "]";
	}




}
