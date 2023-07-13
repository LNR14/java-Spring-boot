package com.example.learnSpringFramework.businessQuiz;

import java.util.Arrays;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component

@Service
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
