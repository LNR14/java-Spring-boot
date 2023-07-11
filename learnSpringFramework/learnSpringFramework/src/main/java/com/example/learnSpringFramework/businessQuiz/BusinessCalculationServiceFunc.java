package com.example.learnSpringFramework.businessQuiz;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component
public class BusinessCalculationServiceFunc {
	
	private DataService dataService;
	
	public BusinessCalculationServiceFunc(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	public int findMax() {
		return Arrays.stream(dataService.retrieveData()).max().orElse(0);
	}

}
