package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao{
	private JdbcTemplate jdbcTemplate;
	
	//Insertion
	public int insert(Student student) {
		//Insert Query
        String query = "insert into student(id,name,city) values(?,?,?)";
        int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	//Updation
	public int change(Student student) {
		// Update Query
		String query = "update student set name=? , city=? where id=?";
        int r = this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}