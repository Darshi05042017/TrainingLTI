package com.lti.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lti.service.People;

public class Dao {
		
		public List<People> register(int id1, String fname1, String lname1, String dob1, String city1) {
			Connection conn=null; 
			PreparedStatement stmt=null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
			String sql="insert into people_club values(?,?,?,?,?)";
			stmt=conn.prepareStatement(sql);
			
			stmt.setInt(1, id1);
			stmt.setString(2, fname1);
			stmt.setString(3, lname1);
			stmt.setString(4, dob1);
			stmt.setString(5, city1);
			
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
		return null;
		
}

		public List<People> delete(int id) {
			Connection conn=null; 
			PreparedStatement stmt=null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
			String sql="DELETE FROM people_club WHERE id=?";
			stmt.setInt(1,id);
			stmt=conn.prepareStatement(sql);
			stmt.executeUpdate();
			System.out.println("data deleted");
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

		public List<People> display(int id) {
			Connection conn=null; 
			PreparedStatement stmt=null;
			ResultSet rs =null;
			List<People> p=new ArrayList<People>();
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
			String sql="select * from people_club WHERE id=?";
			stmt.setInt(1,id);
			stmt=conn.prepareStatement(sql);
			
			rs=stmt.executeQuery();
			while (rs.next()) {
			People p1=new People();
			p1.setId(rs.getInt(1));
			p1.setFname(	rs.getString(2));
			p1.setLname(rs.getString(3));
			p1.setDob(rs.getString(4));
			p1.setCity(rs.getString(5));
			p.add(p1);
			
			}
			return p;
			
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

		public List<People> displayAll() {
			
			Connection conn=null; 
			PreparedStatement stmt=null;
			ResultSet rs =null;
			List<People> p=new ArrayList<People>();
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			
			String sql="select * from people_club ";
			stmt=conn.prepareStatement(sql);
			rs=stmt.executeQuery();
			while (rs.next()) {
				People p1=new People();
				p1.setId(rs.getInt(1));
				p1.setFname(	rs.getString(2));
				p1.setLname(rs.getString(3));
				p1.setDob(rs.getString(4));
				p1.setCity(rs.getString(5));
				p.add(p1);
			
			}
			return p;
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
		
			
	}
	

