package com.incture.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.incture.DTO.UserDTO;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UserResponse {
	private String id;
	private String message;
	private int statusCode;
	private UserDTO userDTO;
	private List<UserDTO> userDTOList;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public UserDTO getUserDTO() {
		return userDTO;
	}
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}
	public List<UserDTO> getUserDTOList() {
		return userDTOList;
	}
	public void setUserDTOList(List<UserDTO> userDTOList) {
		this.userDTOList = userDTOList;
	}
	@Override
	public String toString() {
		return "UserResponse [id=" + id + ", message=" + message + ", statusCode=" + statusCode + ", userDTO=" + userDTO
				+ ", userDTOList=" + userDTOList + "]";
	}



}
