package com.lti.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import com.lti.entity.Register;


public class RegisterDao {

	public void save(Register register) {
		
		 Connection conn=null;
			PreparedStatement stmt=null;
			
			try {
				InputStream is=this.getClass().getClassLoader().getResourceAsStream("dev-db.properties");
				Properties dbprops=new Properties();
				dbprops.load(is);
				
				Class.forName(dbprops.getProperty("driver"));
				conn = DriverManager.getConnection(dbprops.getProperty("url"),
																				dbprops.getProperty("user"),
																				dbprops.getProperty("pass"));
				
				String sql = "insert into Table_register values(cust_seq.nextval,?,?,?,?)";

				stmt = conn.prepareStatement(sql);
				
				
					stmt.setString(1,register.getName());
					stmt.setString(2,register.getEmail());
					stmt.setString(3,register.getUsername());
					stmt.setString(4, register.getPassword());
					stmt.executeUpdate();
			System.out.println("Success");
			
			}
			catch(ClassNotFoundException e) {
				System.out.println("JDBC Driver not found");
			}
			catch(SQLException e) {
				System.out.println("Issue with sql query");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
				
			finally {
				try {
					conn.close();
					} 
				catch(Exception e) {
					e.printStackTrace();
			} 

		
	}

	
}
}
