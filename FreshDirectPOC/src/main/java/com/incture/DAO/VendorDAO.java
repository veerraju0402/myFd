package com.incture.DAO;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.gson.Gson;
import com.incture.DTO.UserVendorDTO;
import com.incture.DTO.VendorDTO;
import com.incture.entity.UserDO;
import com.incture.entity.VendorDO;
import com.incture.response.VendorResponse;
import com.incture.utility.ODataServices;
import com.incture.utility.SCPWorkflowTrigger;
import com.incture.utility.StringUtils;

@Repository
public class VendorDAO extends BaseDAO {

	@Autowired
	SCPWorkflowTrigger sCPWorkflowTrigger;

	@Autowired
	ODataServices oDataServices;

	public VendorDO importToDB(VendorDTO vendorDTO){
		VendorDO vendorDO=new VendorDO();
		vendorDO.setVendorId(vendorDTO.getVendorId());
		vendorDO.setAuthorisation(vendorDTO.getAuthorisation());
		vendorDO.setCorporateGroup(vendorDTO.getCorporateGroup());
		vendorDO.setNatureOfBussiness(vendorDTO.getNatureOfBussiness());
		vendorDO.setTaxJurr(vendorDTO.getTaxJurr());
		vendorDO.setTaxNo3(vendorDTO.getTaxNo3());
		vendorDO.setTaxNo4(vendorDTO.getTaxNo4());
		vendorDO.setTaxNoType(vendorDTO.getTaxNoType());
		vendorDO.setTaxOffice(vendorDTO.getTaxOffice());
		vendorDO.setTaxType(vendorDTO.getTaxType());
		vendorDO.setTypeOfIndustry(vendorDTO.getTypeOfIndustry());
		vendorDO.setVendorName(vendorDTO.getVendorName());
		vendorDO.setNatureOfBussinessDetails(vendorDTO.getNatureOfBussinessDetails());
		vendorDO.setCity(vendorDTO.getCity());
		vendorDO.setCompanyCode(vendorDTO.getCompanyCode());
		vendorDO.setPostalCode(vendorDTO.getPostalCode());
		vendorDO.setCountry(vendorDTO.getCountry());
		return vendorDO;
	}
	
	public VendorDTO exportFromDB(VendorDO vendorDO){
		VendorDTO vendorDTO=new VendorDTO();
		vendorDTO.setVendorId(vendorDO.getVendorId());
		vendorDTO.setAuthorisation(vendorDO.getAuthorisation());
		vendorDTO.setCorporateGroup(vendorDO.getCorporateGroup());
		vendorDTO.setNatureOfBussiness(vendorDO.getNatureOfBussiness());
		vendorDTO.setTaxJurr(vendorDO.getTaxJurr());
		vendorDTO.setTaxNo3(vendorDO.getTaxNo3());
		vendorDTO.setTaxNo4(vendorDO.getTaxNo4());
		vendorDTO.setTaxNoType(vendorDO.getTaxNoType());
		vendorDTO.setTaxOffice(vendorDO.getTaxOffice());
		vendorDTO.setTaxType(vendorDO.getTaxType());
		vendorDTO.setTypeOfIndustry(vendorDO.getTypeOfIndustry());
		vendorDTO.setVendorName(vendorDO.getVendorName());
		vendorDTO.setNatureOfBussinessDetails(vendorDO.getNatureOfBussinessDetails());
		vendorDTO.setCity(vendorDO.getCity());
		vendorDTO.setCompanyCode(vendorDO.getCompanyCode());
		vendorDTO.setPostalCode(vendorDO.getPostalCode());
		vendorDTO.setCountry(vendorDO.getCountry());
		return vendorDTO;
	}
	//----------------------------------------------------
	UserVendorDTO userVendorDTO=null;
	public void userDoToUserVenderDTO(UserDO userDO){
		userVendorDTO.setEmail(userDO.getEmail());
		userVendorDTO.setFirstName(userDO.getFirstName());
		userVendorDTO.setLastName(userDO.getLastName());
		userVendorDTO.setPanNumber(userDO.getPanNumber());
		userVendorDTO.setPhoneNumber(userDO.getPhoneNumber());
		userVendorDTO.setServiceType(userDO.getServiceType());
		userVendorDTO.setUserRole(userDO.getUserRole());
		userVendorDTO.setVendorAddress(userDO.getVendorAddress());
		userVendorDTO.setVendorName(userDO.getVendorName());
		
	}
	
	public void venderDODoToUserVenderDTO(VendorDO vendorDO){
		userVendorDTO.setAuthorisation(vendorDO.getAuthorisation());
		userVendorDTO.setCorporateGroup(vendorDO.getCorporateGroup());
		userVendorDTO.setNatureOfBussiness(vendorDO.getNatureOfBussiness());
		userVendorDTO.setNatureOfBussinessDetails(vendorDO.getNatureOfBussinessDetails());
		userVendorDTO.setTaxJurr(vendorDO.getTaxJurr());
		userVendorDTO.setTaxNo3(vendorDO.getTaxNo3());
		userVendorDTO.setTaxNo4(vendorDO.getTaxNo4());
		userVendorDTO.setTaxNoType(vendorDO.getTaxNoType());
		userVendorDTO.setTaxOffice(vendorDO.getTaxOffice());
		userVendorDTO.setTaxType(vendorDO.getTaxType());
		userVendorDTO.setTypeOfIndustry(vendorDO.getTypeOfIndustry());
		userVendorDTO.setVendorName(vendorDO.getVendorName());
		userVendorDTO.setVendorId(vendorDO.getVendorId());
		userVendorDTO.setCity(vendorDO.getCity());
		userVendorDTO.setCompanyCode(vendorDO.getCompanyCode());
		userVendorDTO.setPostalCode(vendorDO.getPostalCode());
		userVendorDTO.setCountry(vendorDO.getCountry());
	}

	//-------------------------------------------------------------

	 
	  public VendorResponse addVendorDO(VendorDTO vendorDTO) {
		VendorResponse response=new VendorResponse();
		try{
			session=getSession();
			VendorDO vendorDO=importToDB(vendorDTO);
			session.save(vendorDO);
			response.setStatusCode(200);
			response.setMessage("success");
			return response;
		}catch(Exception e ){
			System.err.println("error is:-"+e.getMessage());
			response.setStatusCode(500);
			response.setMessage("failed");
			return response;
		}
	} 

	/*public VendorResponse addVendorDO(VendorDTO vendorDTO) {
		VendorResponse response=new VendorResponse();
		String oDataResponseString="";
		String xmlToJsonString="";
		try{
			session=getSession(); 
			UserDO userDO=session.get(UserDO.class,vendorDTO.getVendorId());
			VendorDO vendorDO=importToDB(vendorDTO);
			userVendorDTO=new UserVendorDTO();
			userDoToUserVenderDTO(userDO);
			venderDODoToUserVenderDTO(vendorDO);
			String jsonObject=objectToStringConvertion(userVendorDTO);
			String workFlowStatus= sCPWorkflowTrigger.triggerWorkflow(jsonObject);
			//if(workFlowStatus.equalsIgnoreCase("Workflow triggered successfully")){
			if(workFlowStatus.equalsIgnoreCase("Trigger FAILURE")){
			String count= (String) session.save(vendorDO);
			System.err.println("-1.count is:--  "+count);
			if(StringUtils.isEmpty(count)){
			System.err.println("-2.count is:--  "+count);
			response.setMessage("record exists ");
			response.setStatusCode(200);
			return response;}
				//oDataResponseString=oDataServices.c onsumingOdataService(jsonObject);
				//xmlToJsonString=xmlToJsonStringConvertion(oDataResponseString);
				
				response.setMessage(workFlowStatus+" , Vendor failed to save, ");
				response.setoDataResponse(oDataResponseString);
				response.setStatusCode(200);
				return response;
			}else{
				response.setStatusCode(200);
				response.setMessage(workFlowStatus +", Vendor failed to save");
				return response;
			}
		}catch(Exception e ){
			System.err.println("Exception:-"+e.getMessage());
			response.setStatusCode(500);
			response.setMessage("Exception:-"+e.getMessage());
			return response;
		}
	}*/


	public VendorResponse getUserVendor(String vendorId) {
		VendorResponse response=new VendorResponse();
		try{
			session=getSession();
			UserDO userDO = session.get(UserDO.class,vendorId);
			VendorDO vendorDO = session.get(VendorDO.class,vendorId);
			if(StringUtils.isEmptyObject(userDO) && StringUtils.isEmptyObject(vendorDO)){
				response.setStatusCode(200);
				response.setMessage("No Record Exists");
				return response;
			}
			else if(StringUtils.isEmptyObject(userDO) || StringUtils.isEmptyObject(vendorDO)){
				response.setMessage("UserDO or VendorDO is null");
			}else {
				response.setMessage("success");}
			userVendorDTO=new UserVendorDTO();
			if(!StringUtils.isEmptyObject(userDO))
				userDoToUserVenderDTO(userDO);
			if(!StringUtils.isEmptyObject(vendorDO))
				venderDODoToUserVenderDTO(vendorDO);
			response.setStatusCode(200);
			response.setUserVendorDTO(userVendorDTO);
			return response;

		}catch(Exception e ){
			System.err.println("Exception:-"+e.getMessage());
			response.setStatusCode(500);
			response.setMessage("Exception:-"+e.getMessage());
			return response;
		}
	}

	public VendorResponse deleteVendorDO(String userId) {
		VendorResponse response=new VendorResponse();
		try {
			session = getSession();
			VendorDO vendorDO = (VendorDO) session.createQuery("from VendorDO where vendorId=" +"'"+ userId+"'").uniqueResult();
			if(!StringUtils.isEmptyObject(vendorDO)){
				session.delete(vendorDO);
				response.setStatusCode(200);
				response.setMessage("Record Deleted");
				return response;
			}else{
				response.setStatusCode(200);
				response.setMessage("Record does not exists");
				return response;
			}
		} catch (Exception e) {
			System.err.println("Exception:-"+e.getMessage());
			response.setStatusCode(500);
			response.setMessage("Exception:-"+e.getMessage());
			return response;
		}
	}

	public VendorResponse updateVendorDO(VendorDTO vendorDTO) {
		VendorResponse response=new VendorResponse();
		if(StringUtils.isEmpty(vendorDTO.getVendorId())){
			System.err.println("Vendor Id cannot be null");
			response.setStatusCode(200);
			response.setMessage("Vendor Id cannot be null");
			return response;
		}
		try{
			session =getSession();
			VendorDO oldVendor = session.get(VendorDO.class,vendorDTO.getVendorId());
			VendorDO newUser=importToDB(vendorDTO);

			if(!StringUtils.isEmpty(newUser.getAuthorisation()) ){
				oldVendor.setAuthorisation(newUser.getAuthorisation());
			}
			if(!StringUtils.isEmpty(newUser.getCorporateGroup())){
				oldVendor.setCorporateGroup(newUser.getCorporateGroup());
			}
			if(!StringUtils.isEmpty(newUser.getNatureOfBussiness()) ){
				oldVendor.setNatureOfBussiness(newUser.getNatureOfBussiness());
			}
			if(!StringUtils.isEmpty(newUser.getNatureOfBussinessDetails()) ){
				oldVendor.setNatureOfBussinessDetails(newUser.getNatureOfBussinessDetails());
			}
			if(!StringUtils.isEmpty(newUser.getTaxJurr())){
				oldVendor.setTaxJurr(newUser.getTaxJurr());
			}
			if(!StringUtils.isEmpty(newUser.getTaxNo3())){
				oldVendor.setTaxNo3(newUser.getTaxNo3());
			}
			if(!StringUtils.isEmpty(newUser.getTaxNo4()) ){
				oldVendor.setTaxNo4(newUser.getTaxNo4());
			}
			if(!StringUtils.isEmpty(newUser.getTaxNoType())){
				oldVendor.setTaxNoType(newUser.getTaxNoType());
			}
			if(!StringUtils.isEmpty(newUser.getTaxOffice()) ){
				oldVendor.setTaxOffice(newUser.getTaxOffice());
			}
			if(!StringUtils.isEmpty(newUser.getTaxType())){
				oldVendor.setTaxType(newUser.getTaxType());
			}

			if(!StringUtils.isEmpty(newUser.getTypeOfIndustry()) ){
				oldVendor.setTypeOfIndustry(newUser.getTypeOfIndustry());
			}

			if(!StringUtils.isEmpty(newUser.getVendorName()) ){
				oldVendor.setVendorName(newUser.getVendorName());
			}
			session.update(oldVendor);
			response.setStatusCode(200);
			response.setMessage("Record Updated");
			return response;
		}catch(Exception e){
			System.err.println("Exception:-"+e.getMessage());
			response.setStatusCode(500);
			response.setMessage("Exception:-"+e.getMessage());
			return response;
		}
	}



	public VendorResponse deleteUserVendors(String userId) {
		VendorResponse response=new VendorResponse();
		try {
			session = getSession();
			int count1=session.createQuery("delete UserDO where userId=" +"'"+ userId+"'").executeUpdate();
			int count2=session.createQuery("delete VendorDO where vendorId=" +"'"+ userId+"'").executeUpdate();
			//int i=session.createQuery("delete UserDO , VendorDO  FROM UserDO  INNER JOIN VendorDO  WHERE UserDO.userId= VendorDO.vendorId and UserDO.userId ="+"'"+ userId+"'").executeUpdate();
			if(count1==0 && count2==0){
				response.setStatusCode(200);
				response.setMessage("Record does not exists");
				return response;
			}
			else if(count1!=0 && count2!=0){
				response.setStatusCode(200);
				response.setMessage("Record Deleted");
				return response;}
			else{
				response.setStatusCode(200);
				response.setMessage("Record Deleted,Data in table 1 or table 2 does not exists");
				return response;
			}
		} catch (Exception e) {
			System.err.println("Exception:-"+e.getMessage());
			response.setStatusCode(500);
			response.setMessage("Exception:-"+e.getMessage());
			return response;
		}
	}

	public VendorResponse getAllUserVendors() {
		VendorResponse response=new VendorResponse();
		List<UserVendorDTO> userVendorDTOList=new ArrayList<UserVendorDTO>();

		try{
			session=getSession();
			List<UserDO> userDOList = session.createCriteria(UserDO.class).list();
			List<VendorDO> vendorDOList = session.createCriteria(VendorDO.class).list();
			System.err.println(vendorDOList.size());
			int i=0;
			while(i<vendorDOList.size()){
				if(i<userDOList.size())
					userDoToUserVenderDTO(userDOList.get(i));
				venderDODoToUserVenderDTO(vendorDOList.get(i));
				userVendorDTOList.add(userVendorDTO);
				userVendorDTO=new UserVendorDTO();
				System.err.println(" @ "+i);
				i++;
			}
			response.setStatusCode(200);
			response.setMessage("success");
			response.setUserVendorDTOList(userVendorDTOList);
			return response;
		}catch(Exception e){
			System.err.println("Exception:-"+e.getMessage());
			response.setStatusCode(500);
			response.setMessage("Exception:-"+e.getMessage());
			return response;
		}
	}

	public String xmlToJsonStringConvertion(String xmlString)  {
		try {
			//	String xmlString= ODataServices.consumingOdataService(entity);
			System.err.println("1.input:-"+xmlString);
			JSONObject xmlJSONObj = XML.toJSONObject(xmlString);
			System.err.println("2:-"+xmlJSONObj);
			String jsonPrettyPrintString = xmlJSONObj.toString();
			System.err.println("3:-"+jsonPrettyPrintString);
			return jsonPrettyPrintString;
		} catch (Exception e) {
			return "Exception while parsing XML to JSON:- "+e.getMessage();
		}
	}

	public VendorResponse consumingOdataService(UserVendorDTO userVendorDTO) {
		VendorResponse response=new VendorResponse();
		try {
			String entity=objectToStringConvertion(userVendorDTO);
			String xmlString= ODataServices.consumingOdataService(entity);
			String jsonString=xmlToJsonStringConvertion(xmlString);
			response.setStatusCode(200);
			response.setMessage(jsonString);
			return response;
		} catch (Exception e) {
			response.setStatusCode(500);
			response.setMessage("Exception:-"+e.getMessage());
			return response;
		}
	}

	public String objectToStringConvertion(Object obj){
		Gson gson= new Gson();
		String jsonObject = gson.toJson(obj);
		return jsonObject;
	}
}
