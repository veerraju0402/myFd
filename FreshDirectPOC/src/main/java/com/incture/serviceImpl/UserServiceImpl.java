package com.incture.serviceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.incture.DAO.UserDAO;
import com.incture.DTO.UserDTO;
import com.incture.response.ResponseMessage;
import com.incture.response.UserResponse;
import com.incture.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired 
	UserDAO userDAO;

	@Override
	public ResponseMessage addUserDO(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return userDAO.addUserDO(userDTO);
	}

	@Override
	public ResponseMessage getAllUserDO() {
		// TODO Auto-generated method stub
		return userDAO.getAllUserDO();
	}

	@Override
	public UserResponse getUserById(String userId) {
		// TODO Auto-generated method stub
		return userDAO.getUserById(userId);
	}


	@Override
	public UserResponse getUserColumn(String userId) {
		// TODO Auto-generated method stub
		return userDAO.getUserColumn(userId);
	}

	@Override
	public UserResponse deleteUserDO(String userId) {
		// TODO Auto-generated method stub
		return userDAO.deleteUserDO(userId);
	}

	@Override
	public UserResponse updateUserDO(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return userDAO.updateUserDO(userDTO);
	}




	@Override
	public UserResponse getUserByVendor(String vendorName) {
		// TODO Auto-generated method stub
		return userDAO.getUserByVendor(vendorName);
	}




}
