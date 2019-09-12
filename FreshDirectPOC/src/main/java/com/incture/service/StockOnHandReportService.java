package com.incture.service;

import com.incture.DTO.FetchStockOnHandReportDTO;
import com.incture.DTO.StockOnHandReportDTO;
import com.incture.response.ResponseMessage;

public interface StockOnHandReportService {

	ResponseMessage addstockOnHandReportDetails(StockOnHandReportDTO stockOnHandReportDTO);
	
	 ResponseMessage getAllStockOnHandReportDetails();

	ResponseMessage fetchStockOnHandReportDetails(FetchStockOnHandReportDTO fetchStockOnHandReportDTO);

}
