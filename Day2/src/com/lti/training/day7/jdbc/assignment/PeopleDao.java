package com.lti.training.day7.jdbc.assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Data Access Object 

/**
 * TODO 
 * create table TBL_PRODUCT(
 * id number(5) primary key,
 * name Varchar2(50),
 * price number(12,2),
 * quantity number(5));
 *
 */
public class PeopleDao {

    // public void add(int id,String name,double price,int quantity) {
	public void add(People people) {
		Connection conn=null;  //manages the connection between the app and jdbc
		PreparedStatement stmt=null;  //help us to execute sql statements
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
			String sql="insert into people values(?,?,?,?,?)";
			stmt=conn.prepareStatement(sql);
			
			stmt.setInt(1, people.getId());
			stmt.setString(2, people.getFname());
			stmt.setString(3, people.getLname());
			stmt.setString(4, people.getDob());
			stmt.setString(5, people.getCity());
			
			stmt.executeUpdate();
			System.out.println("data Updated");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Jdbc driver not found");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
			e.getMessage();	
			}
		
	}
		
	}

	public List<People> fetchAll() {
		Connection conn=null;  //manages the connection between the app and jdbc
		PreparedStatement stmt=null;  //help us to execute sql statements
		ResultSet rs =null; //helps us to ftech the result of a selected query
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
			String sql="select * from people ";
			stmt=conn.prepareStatement(sql);
			
			stmt.setInt(1, 10);// 
			rs=stmt.executeQuery();
			
			List<People> peoples = new ArrayList<People>();
			
			while (rs.next()) {
				People p=new People( );
				p.setId(rs.getInt(1));
				p.setFname(rs.getString(2));
				p.setLname(rs.getString(3));
				p.setDob(rs.getString(5));
				p.setCity(rs.getString(6));
				peoples.add(p);
			}
			return peoples;
		}
		catch(ClassNotFoundException e) {
			System.out.println("Jdbc driver not found");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
			e.getMessage();	
			}
	}
		return null;
		
	}
	

public List<People> fetchNumber() {
		Connection conn=null;  //manages the connection between the app and jdbc
		PreparedStatement stmt=null;  //help us to execute sql statements
		ResultSet rs =null; //helps us to ftech the result of a selected query
		int count=0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
			String sql="select id, fname,lname,city,count(id) as Count from people group by city ";
			stmt=conn.prepareStatement(sql);
			
			stmt.setInt(1,10);
			rs=stmt.executeQuery();
			
			List<People> peoples = new ArrayList<People>();
			while (rs.next()) {
				People p=new People();
				p.setId(rs.getInt(1));
				p.setFname(rs.getString(2));
				p.setLname(rs.getString(3));
				p.setDob(rs.getString(4));
				p.setCity(rs.getString(5));
		
				peoples.add(p);
			}
			return peoples;
		}
		catch(ClassNotFoundException e) {
			System.out.println("Jdbc driver not found");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
			e.getMessage();	
			}
	}
		return null;
	}
public void update (int id,String city) {
	Connection conn=null;  //manages the connection between the app and jdbc
	PreparedStatement stmt=null;  //help us to execute sql statements
	ResultSet rs =null; //helps us to ftech the result of a selected query

	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
		
		
		stmt=conn.prepareStatement( "update people set city=city where id=id");
		
		rs=stmt.executeQuery();
		
	System.out.println("City Updated");
		}
	catch(ClassNotFoundException e) {
		System.out.println("Jdbc driver not found");
	}
	catch(SQLException e) {
		e.printStackTrace();
	}
	finally {
		try {
			conn.close();
		}
		catch(Exception e) {
		e.getMessage();	
		}
}

	
}

}


