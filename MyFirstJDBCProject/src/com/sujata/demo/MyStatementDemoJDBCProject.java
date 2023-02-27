package com.sujata.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyStatementDemoJDBCProject {

	public static void main(String args[]) {

		Connection connection=null;
		Statement statement;
		Scanner scanner=new Scanner(System.in);
		try {
//			1. Connect
//			1.1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			1.2 Connect to the Database
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wileydi001", "root", "sujata");
			
			System.out.println("Enter Employee ID : ");
			int id= scanner.nextInt();
			
			System.out.println("Enter Employee Name : ");
			String na=scanner.next();
			
			System.out.println("Enter Employee Designation : ");
			String desig=scanner.next();
			
			System.out.println("Enter Employee Department : ");
			String deptt=scanner.next();
			
			System.out.println("Enter Employee Salary : ");
			double sal=scanner.nextDouble();
//			2. Query
			statement=connection.createStatement();
			
			
			
			//DML : executeUpdate() , which will int (count of no of rows manipulated by the query)
			int rows=statement.executeUpdate("INSERT INTO EMPLOYEE VALUES("+id+",'"+na+"','"+desig+"','"+deptt+"',"+sal);
			
//			3. Process The result
			if(rows>0)
				System.out.println("Employee added");
			else
				System.out.println("Employee Not added");
			
		} catch (ClassNotFoundException e) {
			//displaying the complete stack for exceptions
			e.printStackTrace();
		}
		catch(SQLException e) {
			System.out.println("Employee Not added");
		}
		finally {
			try {
//				4.Close
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
