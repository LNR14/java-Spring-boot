package com.springcourse.springboot.learnJPAandhibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springcourse.springboot.learnJPAandhibernate.course.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	
	public Course findById(int id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(int id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
	// TODO Auto-generated method stub
//			repository.insert(new Course(1,"Learn AWS ","in28minutes"));
//			repository.insert(new Course(2,"Learn GCP ","in28minutes"));
//			repository.insert(new Course(3,"Learn Azure ","in28minutes"));
//			repository.insert(new Course(4,"Learn Spring","in28minutes"));
//			repository.insert(new Course(5,"Learn React","in28minutes"));
//			
//			repository.deleteById(5);
//			
//			System.out.println(repository.selectById(3));
//			System.out.println(repository.selectById(1));
}
