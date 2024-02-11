package com.example;

import java.util.List;

public class Clientstd {
public static void main(String[] args) throws Exception {
	
	List<Student> allStudent=StudentController.FetchStudent();
	
	for (Student student : allStudent) {
		
		System.out.print(student.getId()+" ");
		System.out.print(student.getName()+" ");

		System.out.print(student.getAge()+" ");
		
		System.out.print(student.getAddress()+" ");
		System.out.println();
	}
	}
}
