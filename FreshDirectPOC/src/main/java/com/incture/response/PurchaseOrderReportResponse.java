package com.incture.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.incture.DTO.PurchaseOrderReportDTO;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class PurchaseOrderReportResponse {

	private String status;
	private int statusCode;
	private String message;
	private PurchaseOrderReportDTO purchaseOrderReportDTO;
	private List<PurchaseOrderReportDTO> purchaseOrderReportDTOList;
	
	
	
	public PurchaseOrderReportDTO getPurchaseOrderReportDTO() {
		return purchaseOrderReportDTO;
	}
	public void setPurchaseOrderReportDTO(PurchaseOrderReportDTO purchaseOrderReportDTO) {
		this.purchaseOrderReportDTO = purchaseOrderReportDTO;
	}
	public List<PurchaseOrderReportDTO> getPurchaseOrderReportDTOList() {
		return purchaseOrderReportDTOList;
	}
	public void setPurchaseOrderReportDTOList(List<PurchaseOrderReportDTO> purchaseOrderReportDTOList) {
		this.purchaseOrderReportDTOList = purchaseOrderReportDTOList;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
