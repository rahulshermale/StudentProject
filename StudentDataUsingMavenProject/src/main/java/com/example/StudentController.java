package com.example;

import java.util.List;

public class StudentController {

	public static List<Student> FetchStudent() throws Exception {
	
		
		List<Student> allStudent=StudentService.FetchStudent();
		
		
		
		return allStudent;
	}

}
