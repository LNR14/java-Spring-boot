package com.example.learnSpringFramework.game.g1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;


//@Component
@Named
class BusinessService{
	DataService dataService;
	
	
	public DataService getDataService() {
		System.out.println("Setter Injection");
		return dataService;
	}
//	@Autowired
	@Inject
	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}
}


@Component
class DataService{
	
}

@Configuration
@ComponentScan
public class CdiContextLauncherApp {


	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				(CdiContextLauncherApp.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			System.out.println(context.getBean(BusinessService.class).getDataService());
		}
	}
}