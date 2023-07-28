package com.springcourse.springboot.learnJPAandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springcourse.springboot.learnJPAandhibernate.course.Course;


@Repository
public class CourseJdbcRepository {
	
	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String Insert_Query = 
			"""
			insert into course(id,name,author)
			 values(?,?,?)
			""";
	
	private static String Delete_query= 
			"""
			delete from course
			where id=?
			""";
	private static String Select_Query=
			"""
			Select * from course 
			where id=?
			""";

	public void insert(Course course) {

		springJdbcTemplate.update(Insert_Query,
				course.getId(),course.getName(),course.getAuthor());
		
	}
	
	public void deleteById(int id) {
		springJdbcTemplate.update(Delete_query,id);
	}
	
	
	public Course selectById(int id) {
		
		//ResultSet->Bean =>RowMapper =>
		//id
		return springJdbcTemplate.queryForObject(Select_Query,
				new BeanPropertyRowMapper<>(Course.class),id);
		
		
	}
	
	
	
	
}