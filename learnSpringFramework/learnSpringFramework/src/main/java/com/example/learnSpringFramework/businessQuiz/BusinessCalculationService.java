package com.example.learnSpringFramework.businessQuiz;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.Context;


@Configuration
@ComponentScan
public class BusinessCalculationService {


	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(BusinessCalculationService.class)){
//			int[] DBdata = context.getBean(DataService.class).retrieveData();
//			System.out.println(DBdata);
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessCalculationServiceFunc.class).findMax());
			
		}
	}
}