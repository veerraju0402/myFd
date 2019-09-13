package com.incture.service;

import com.incture.DTO.UserDTO;
import com.incture.response.ResponseMessage;

public interface UserService {

	ResponseMessage addUserDO(UserDTO userDTO);

	ResponseMessage getAllUserDO();

	ResponseMessage getUserById(String userId);

	ResponseMessage deleteUserDO(String userId);

	ResponseMessage updateUserDO(UserDTO userDTO);


	ResponseMessage getUserColumn(String userId);

	ResponseMessage getUserByVendor(String vendorName);



}
