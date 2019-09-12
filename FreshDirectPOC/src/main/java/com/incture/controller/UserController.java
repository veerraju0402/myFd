package com.incture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.incture.DTO.UserDTO;
import com.incture.response.ResponseMessage;
import com.incture.response.UserResponse;
import com.incture.service.UserService;

@RestController
@RequestMapping(value="/user")
@Configuration
public class UserController {
	//https://freshdirectp2000982490trial.hanatrial.ondemand.com/FreshDirect/
	@Autowired
	UserService userService;


	@RequestMapping(value="/msg",method=RequestMethod.GET)
	public String message(){
		return "welcome message from usercontroller";
	}

	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public ResponseMessage addUserDO(@RequestBody UserDTO userDTO){
		return userService.addUserDO(userDTO);}


	@RequestMapping(value="/getAllUser",method=RequestMethod.GET)
	public ResponseMessage getAllUserDO(){
		return userService.getAllUserDO();}


	@RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)
	public UserResponse deleteUserDO(@RequestParam String userId){
		return userService.deleteUserDO(userId);}

	@RequestMapping(value="/getUserById",method=RequestMethod.GET)
	public UserResponse getUserById(@RequestParam String userId){
		return userService.getUserById(userId);}

	@RequestMapping(value="/getUserByVendor",method=RequestMethod.GET)
	public UserResponse getUserByVendor(@RequestParam String userId){
		return userService.getUserByVendor(userId);}


	@RequestMapping(value="/getVendor",method=RequestMethod.GET)
	public UserResponse getUserColumn(@RequestParam String vendorName){
		return userService.getUserColumn(vendorName);}


	@RequestMapping(value="/updateUser",method=RequestMethod.POST)
	public UserResponse updateUserDO(@RequestBody UserDTO userDTO){
		return userService.updateUserDO(userDTO);}


}
