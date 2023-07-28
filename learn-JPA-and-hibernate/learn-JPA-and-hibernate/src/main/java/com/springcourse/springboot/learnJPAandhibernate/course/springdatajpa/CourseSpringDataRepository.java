package com.springcourse.springboot.learnJPAandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springcourse.springboot.learnJPAandhibernate.course.Course;

public interface CourseSpringDataRepository extends JpaRepository<Course, Long>{
	
	List<Course> findByAuthor(String author);

	
	List<Course> findByName(String name);

}
