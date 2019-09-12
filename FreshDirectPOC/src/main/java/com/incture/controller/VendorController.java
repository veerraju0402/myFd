package com.incture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.incture.DTO.UserVendorDTO;
import com.incture.DTO.VendorDTO;
import com.incture.response.VendorResponse;
import com.incture.service.VendorService;

@RestController
@RequestMapping(value="/vendor")
@Configuration
public class VendorController {

	
	@Autowired
	VendorService vendorService;
	
	@RequestMapping(value="/msg",method=RequestMethod.GET)
	public String message(){
		return "welcome message from vendorcontroller";
	}
	
	@RequestMapping(value="/addVendor",method=RequestMethod.POST)
	public VendorResponse addVendorDO(@RequestBody VendorDTO vendorDTO){
		return vendorService.addVendorDO(vendorDTO);
	}
	
	@RequestMapping(value="/deleteVendor",method=RequestMethod.DELETE)
	public VendorResponse deleteVendorDO(@RequestParam String userId){
		return vendorService.deleteVendorDO(userId);
	}
	
	@RequestMapping(value="/updateVendor",method=RequestMethod.POST)
	public VendorResponse updateVendorDO(@RequestBody VendorDTO vendorDTO){
		return vendorService.updateVendorDO(vendorDTO);
	}
	
	
	
	@RequestMapping(value="/getUserVendor",method=RequestMethod.GET)
	public VendorResponse getUserVendor(@RequestParam String userId){
	return vendorService.getUserVendor(userId);}
	
	@RequestMapping(value="/deleteUserVendor",method=RequestMethod.DELETE)
	public VendorResponse deleteUserVendors(@RequestParam String userId){
	return vendorService.deleteUserVendors(userId);}
	
	@RequestMapping(value="/getAllUserVendors",method=RequestMethod.GET)
	public VendorResponse getAllUserVendors(){
	return vendorService.getAllUserVendors();}
	
	@RequestMapping(value="/oData",method=RequestMethod.POST)
	VendorResponse consumingOdataService(@RequestBody UserVendorDTO userVendorDTO){
		return vendorService.consumingOdataService(userVendorDTO);
	}
	
	
}
