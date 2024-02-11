package com.example;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

	public static List<Student> FetchStudent() throws Exception {
		List<Student> allStudent = StudentDao.FetchStudent();
		List<Student> allStudent2 = new ArrayList<Student>();
		for (Student student : allStudent) {

			if (student.getName().startsWith("R")) {

				allStudent2.add(student);
			}

		}

		return allStudent;
	}

}
