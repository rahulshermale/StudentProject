package com.example;

import java.util.List;

public class Clientstd {
public static void main(String[] args) throws Exception {
	
	List<Student> allStudent=StudentController.FetchStudent();
	
	for (Student student : allStudent) {
		
		System.out.println(student.getId());
		System.out.println(student.getName());
	}
	}
}
