package com.incture.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.incture.DAO.StockOnHandReportDAO;
import com.incture.DTO.FetchStockOnHandReportDTO;
import com.incture.DTO.StockOnHandReportDTO;
import com.incture.response.ResponseMessage;
import com.incture.service.StockOnHandReportService;

@Service
public class StockOnHandReportServiceImpl  implements StockOnHandReportService{

	@Autowired
	StockOnHandReportDAO stockOnHandReportDAO;
	
	@Override
	public ResponseMessage addstockOnHandReportDetails(StockOnHandReportDTO stockOnHandReportDTO) {
		// TODO Auto-generated method stub
		return stockOnHandReportDAO.addstockOnHandReportDetails(stockOnHandReportDTO);
	}

	@Override
	public ResponseMessage fetchStockOnHandReportDetails(FetchStockOnHandReportDTO fetchStockOnHandReportDTO) {
		// TODO Auto-generated method stub
		return stockOnHandReportDAO.fetchStockOnHandReportDetails(fetchStockOnHandReportDTO);
	}

	@Override
	public ResponseMessage getAllStockOnHandReportDetails() {
		// TODO Auto-generated method stub
		return stockOnHandReportDAO.getAllStockOnHandReportDetails();
	}

}
