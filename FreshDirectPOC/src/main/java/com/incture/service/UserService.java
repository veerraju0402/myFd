package com.incture.service;

import com.incture.DTO.UserDTO;
import com.incture.response.ResponseMessage;
import com.incture.response.UserResponse;

public interface UserService {

	ResponseMessage addUserDO(UserDTO userDTO);

	ResponseMessage getAllUserDO();

	UserResponse getUserById(String userId);

	UserResponse deleteUserDO(String userId);

	UserResponse updateUserDO(UserDTO userDTO);


	UserResponse getUserColumn(String userId);

	UserResponse getUserByVendor(String vendorName);



}
