package com.incture.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.incture.DTO.UserVendorDTO;
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class VendorResponse {

	private String message;
	private String oDataResponse;
	private int statusCode;

	private UserVendorDTO userVendorDTO;
	private List<UserVendorDTO> userVendorDTOList;
	
	
	public String getoDataResponse() {
		return oDataResponse;
	}
	public void setoDataResponse(String oDataResponse) {
		this.oDataResponse = oDataResponse;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public UserVendorDTO getUserVendorDTO() {
		return userVendorDTO;
	}
	public void setUserVendorDTO(UserVendorDTO userVendorDTO) {
		this.userVendorDTO = userVendorDTO;
	}
	public List<UserVendorDTO> getUserVendorDTOList() {
		return userVendorDTOList;
	}
	public void setUserVendorDTOList(List<UserVendorDTO> userVendorDTOList) {
		this.userVendorDTOList = userVendorDTOList;
	}


}
