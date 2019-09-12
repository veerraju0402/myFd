package com.incture.service;

import com.incture.DTO.UserVendorDTO;
import com.incture.DTO.VendorDTO;
import com.incture.response.VendorResponse;

public interface VendorService {

	VendorResponse addVendorDO(VendorDTO vendorDTO);

	VendorResponse getUserVendor(String userId);

	VendorResponse deleteVendorDO(String userId);

	VendorResponse deleteUserVendors(String userId);

	VendorResponse getAllUserVendors();

	VendorResponse updateVendorDO(VendorDTO vendorDTO);

	VendorResponse consumingOdataService(UserVendorDTO userVendorDTO);

}
