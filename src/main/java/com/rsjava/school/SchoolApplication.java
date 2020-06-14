package com.rsjava.school;

import com.rsjava.school.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchoolApplication.class, args);

		Student student = new Student("aaa","xsfdsfd","fsfsfds");
	}



}
