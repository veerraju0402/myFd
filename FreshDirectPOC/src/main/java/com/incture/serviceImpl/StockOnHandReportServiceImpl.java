package com.incture.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.incture.DAO.StockOnHandReportDAO;
import com.incture.DTO.StockOnHandReportDTO;
import com.incture.response.StockOnHandReportResponse;
import com.incture.service.StockOnHandReportService;

public class StockOnHandReportServiceImpl  implements StockOnHandReportService{

	@Autowired
	StockOnHandReportDAO stockOnHandReportDAO;
	
	@Override
	public StockOnHandReportResponse addstockOnHandReportDetails(StockOnHandReportDTO stockOnHandReportDTO) {
		// TODO Auto-generated method stub
		return stockOnHandReportDAO.addstockOnHandReportDetails(stockOnHandReportDTO);
	}

}
