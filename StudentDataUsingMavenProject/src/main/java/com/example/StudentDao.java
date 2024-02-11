package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	public static List<Student> FetchStudent() throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "manager");
		
//		PreparedStatement pst = con.prepareStatement("INSERT INTO studendata (id,name,age, address) VALUES (3,'Dinesh',25, 'Mumbai')");
		PreparedStatement pst = con.prepareStatement("update studendata set age=?,address=? where id=?");

		pst.setInt(1, 25);
		pst.setString(2, "Mumbai");
		pst.setInt(3, 10);

		pst.setInt(1, 22);
		pst.setString(2, "Pune");
		pst.setInt(3, 20);

		int est = pst.executeUpdate();

//		System.out.println(est);

		Statement st = con.createStatement();
		ResultSet rst = st.executeQuery("select * from studendata");

		ArrayList<Student> alist = new ArrayList<Student>();

		while (rst.next()) {

			int id = rst.getInt(1);
			String name = rst.getString(2);
			int age = rst.getInt(3);
			String address = rst.getString(4);
			Student s1 = new Student(id, name, age, address);
			alist.add(s1);

		}

		return alist;
	}

}
