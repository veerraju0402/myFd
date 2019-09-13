package com.incture.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.incture.DTO.FetchStockOnHandReportDTO;
import com.incture.DTO.StockOnHandReportDTO;
import com.incture.response.ResponseMessage;
import com.incture.service.StockOnHandReportService;

@RestController
@RequestMapping(value = "/StockOnHandReport")
@Configuration
public class StockOnHandReportController {

	@Autowired
	StockOnHandReportService stockOnHandReportService;

	@GetMapping("/msg")
	public String message() {
		return "welcome message from StockOnHandReportController";
	}

	@PostMapping("/addstockOnHandReport")
	public ResponseMessage addstockOnHandReportDetails(@RequestBody StockOnHandReportDTO stockOnHandReportDTO) {
		return stockOnHandReportService.addstockOnHandReportDetails(stockOnHandReportDTO);
	}

	@GetMapping("/getAllStockOnHandReportDetails")
	public ResponseMessage getAllStockOnHandReportDetails() {
		return stockOnHandReportService.getAllStockOnHandReportDetails();
	}

	@GetMapping("/fetchStockOnHandReport")
	public ResponseMessage fetchStockOnHandReportDetails(
			@RequestBody FetchStockOnHandReportDTO fetchStockOnHandReportDTO) {
		return stockOnHandReportService.fetchStockOnHandReportDetails(fetchStockOnHandReportDTO);
	}

}
