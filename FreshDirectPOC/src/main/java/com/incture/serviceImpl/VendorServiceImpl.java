package com.incture.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.DAO.VendorDAO;
import com.incture.DTO.UserVendorDTO;
import com.incture.DTO.VendorDTO;
import com.incture.response.VendorResponse;
import com.incture.service.VendorService;

@Service
public class VendorServiceImpl implements VendorService {

	@Autowired
	VendorDAO vendorDAO;

	@Override
	public VendorResponse addVendorDO(VendorDTO vendorDTO) {
		// TODO Auto-generated method stub
		return vendorDAO.addVendorDO(vendorDTO);
	}

	@Override
	public VendorResponse getUserVendor(String userId) {
		// TODO Auto-generated method stub
		return vendorDAO.getUserVendor(userId);
	}

	@Override
	public VendorResponse deleteVendorDO(String userId) {
		// TODO Auto-generated method stub
		return vendorDAO.deleteVendorDO(userId);
	}

	@Override
	public VendorResponse deleteUserVendors(String userId) {
		// TODO Auto-generated method stub
		return vendorDAO.deleteUserVendors(userId);
	}

	@Override
	public VendorResponse getAllUserVendors() {
		// TODO Auto-generated method stub
		return vendorDAO.getAllUserVendors();
	}

	@Override
	public VendorResponse updateVendorDO(VendorDTO vendorDTO) {
		// TODO Auto-generated method stub
		return vendorDAO.updateVendorDO(vendorDTO);
	}

	@Override
	public VendorResponse consumingOdataService(UserVendorDTO userVendorDTO)  {
		// TODO Auto-generated method stub
		return vendorDAO.consumingOdataService(userVendorDTO);

	}

}
