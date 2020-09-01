package com.springworkshop.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.sleuth.SpanName;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class MarketSummary {

	private static final Logger logger = LoggerFactory.getLogger(MarketSummary.class);

	@GetMapping("/market")
	@SpanName("New ID")
	public ResponseEntity<String> getMarketSummary() {

		RestTemplate rest = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-RapidAPI-Host", "apidojo-yahoo-finance-v1.p.rapidapi.com");
		headers.set("X-RapidAPI-Key", "1957fd9432msh440a60652c64899p145607jsn31a499df81a4");

		HttpEntity entity = new HttpEntity(headers);

		logger.info("Test");

		ResponseEntity<String> response = rest.exchange(
				"https://apidojo-yahoo-finance-v1.p.rapidapi.com/market/get-summary?region=US&lang=en", HttpMethod.GET,
				entity, String.class);

		return response;

	}

}
