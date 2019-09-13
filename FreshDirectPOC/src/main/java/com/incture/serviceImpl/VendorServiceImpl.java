package com.incture.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.DAO.VendorDAO;
import com.incture.DTO.UserVendorDTO;
import com.incture.DTO.VendorDTO;
import com.incture.response.ResponseMessage;
import com.incture.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	VendorDAO vendorDAO;

	@Override
	public ResponseMessage addVendorDO(VendorDTO vendorDTO) {
		// TODO Auto-generated method stub
		return vendorDAO.addVendorDO(vendorDTO);
	}

	@Override
	public ResponseMessage getUserVendor(String userId) {
		// TODO Auto-generated method stub
		return vendorDAO.getUserVendor(userId);
	}

	@Override
	public ResponseMessage deleteVendorDO(String userId) {
		// TODO Auto-generated method stub
		return vendorDAO.deleteVendorDO(userId);
	}

	@Override
	public ResponseMessage deleteUserVendors(String userId) {
		// TODO Auto-generated method stub
		return vendorDAO.deleteUserVendors(userId);
	}

	@Override
	public ResponseMessage getAllUserVendors() {
		// TODO Auto-generated method stub
		return vendorDAO.getAllUserVendors();
	}

	@Override
	public ResponseMessage updateVendorDO(VendorDTO vendorDTO) {
		// TODO Auto-generated method stub
		return vendorDAO.updateVendorDO(vendorDTO);
	}

	@Override
	public ResponseMessage consumingOdataService(UserVendorDTO userVendorDTO)  {
		// TODO Auto-generated method stub
		return vendorDAO.consumingOdataService(userVendorDTO);

	}

}
