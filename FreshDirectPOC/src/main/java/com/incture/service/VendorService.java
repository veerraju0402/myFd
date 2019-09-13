package com.incture.service;

import com.incture.DTO.UserVendorDTO;
import com.incture.DTO.VendorDTO;
import com.incture.response.ResponseMessage;

public interface VendorService {

	ResponseMessage addVendorDO(VendorDTO vendorDTO);

	ResponseMessage getUserVendor(String userId);

	ResponseMessage deleteVendorDO(String userId);

	ResponseMessage deleteUserVendors(String userId);

	ResponseMessage getAllUserVendors();

	ResponseMessage updateVendorDO(VendorDTO vendorDTO);

	ResponseMessage consumingOdataService(UserVendorDTO userVendorDTO);

}
