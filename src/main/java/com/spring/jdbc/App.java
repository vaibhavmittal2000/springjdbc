package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App {
    public static void main( String[] args ){
        System.out.println( "Program started..." );
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
//        Student student = new Student();
//        student.setId(302);
//        student.setName("Vivek");
//        student.setCity("Rohtak");
//        
//        int result = studentDao.insert(student);
//        System.out.println("Student added: "+result);
        
        Student student = new Student();
        student.setId(123);
        student.setName("Karan");
        student.setCity("Dadri");
        
        int result = studentDao.change(student);
        System.out.println("Data changed: "+result);
    }
}