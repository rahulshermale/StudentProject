package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	public static List<Student> FetchStudent() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "manager");

		Statement st = con.createStatement();
		ResultSet rst = st.executeQuery("select * from studendata");

		ArrayList<Student> alist = new ArrayList<Student>();

		while (rst.next()) {

			int id = rst.getInt(1);
			String name = rst.getString(2);
			Student s1 = new Student(id, name);
			alist.add(s1);

		}

		return alist;
	}

}
