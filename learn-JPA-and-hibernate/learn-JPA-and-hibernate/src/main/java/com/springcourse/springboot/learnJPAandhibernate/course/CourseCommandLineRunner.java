package com.springcourse.springboot.learnJPAandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springcourse.springboot.learnJPAandhibernate.course.jpa.CourseJpaRepository;
import com.springcourse.springboot.learnJPAandhibernate.course.springdatajpa.CourseSpringDataRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner{
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataRepository repository;
	
	public void run(String... args) throws Exception{
		repository.save(new Course(1l,"Learn AWS JPA","Udemy"));
		repository.save(new Course(2l,"Learn AWS JPA","Udemy"));
		repository.save(new Course(3l,"Learn Devops JPA ","Udemy"));
		repository.save(new Course(4l,"Learn Spring","Udemy"));
		repository.save(new Course(5l,"Learn React","Khan Academy"));
		
		repository.deleteById(4l);
		
		System.out.println(repository.findById(3l));
		System.out.println(repository.findById(5l));
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("Udemy"));
		System.out.print(repository.findByName("Learn Devops"));
		
	}
}