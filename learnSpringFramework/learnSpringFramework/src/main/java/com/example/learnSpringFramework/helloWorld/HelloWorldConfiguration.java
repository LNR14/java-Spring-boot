package com.example.learnSpringFramework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address) {}; 
record Address(String street,String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name () {
		
		return "LNR";
	}
	
	@Bean
	public int age () {
		return 26;
	}
	
	@Bean
	@Primary
	public Person person() {
		return new Person("Shyam" , 20, address());
	}
	
	@Bean
	public Person person2MethodCall() {
		return new Person(name() , age(), new Address("Baker Street", "London"));
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address yourCustomAddress) {
		return new Person(name, age, yourCustomAddress);
	}
	
	@Bean
	public Person person4Parameters(String name, int age,Address address) {
		return new Person(name,age,address);
	}
	
	@Bean
	@Qualifier("Person5Qualifier")
	public Person person5Qualifier(String name, int age, Address yourCustomAddress) {
		return new Person(name, age, yourCustomAddress);
	}
	
	
	
	@Bean(name="yourCustomAddress")
	public Address address() {
		return new Address("longford","Austin");
	}
	
}