package com.example;

import java.util.List;

public class StudentService {

	public static List<Student> FetchStudent() throws Exception {
		List<Student> allStudent=StudentDao.FetchStudent();
		

		
		
		return allStudent;
	}


}
