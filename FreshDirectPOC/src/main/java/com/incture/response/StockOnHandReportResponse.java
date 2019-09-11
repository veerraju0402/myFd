package com.incture.response;

import java.util.List;

import com.incture.entity.StockOnHandReportDO;

public class StockOnHandReportResponse {

	
	private String status;
	private int statusCode;
	private String message;
	private StockOnHandReportDO stockOnHandReportDO;
	private List<StockOnHandReportDO> stockOnHandReportDOList;
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
	public StockOnHandReportDO getStockOnHandReportDO() {
		return stockOnHandReportDO;
	}
	public void setStockOnHandReportDO(StockOnHandReportDO stockOnHandReportDO) {
		this.stockOnHandReportDO = stockOnHandReportDO;
	}
	public List<StockOnHandReportDO> getStockOnHandReportDOList() {
		return stockOnHandReportDOList;
	}
	public void setStockOnHandReportDOList(List<StockOnHandReportDO> stockOnHandReportDOList) {
		this.stockOnHandReportDOList = stockOnHandReportDOList;
	}
	
	
	
}
