package com.lti.training.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.lti.training.employee.exception.DataAccessException;
import com.lti.training.employee.model.Employee;

public class EmployeeDao {
	public Employee fetchEmployee(int empno) throws DataAccessException{
		Connection conn = null; //manages the connection between the app and database
		PreparedStatement stmt = null;//helps us to execute SQL statements
		ResultSet rs =  null;//helps us to fetch the result of a select query
		Employee emp = new Employee();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");	//Load the Driver(Strp-I)
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr");//Creating Connection
																																								
			
			String sql = "select * from emp where empno=?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, empno);
			
			rs = stmt.executeQuery();
			rs.next();
			/*List<Employee> product = new ArrayList<Employee>();
			
			while(rs.next()) {//for each row
*/				
				emp.setEmpno(rs.getInt(1));
				emp.setEname(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setMgr(rs.getInt(4));
				emp.setHiredate(rs.getDate(5).toString());
				emp.setSalary(rs.getDouble(6));
				emp.setComm(rs.getDouble(7));
				emp.setDeptno(rs.getInt(8));
				
				/*product.add(e);
			}*/
			return emp;
	}
	catch(ClassNotFoundException e) {
		throw new DataAccessException("Unable to load the JDBC Driver");
	}
	catch(SQLException e) {
		throw new DataAccessException("Problem while fetching product from db");
	}
		
	finally{
			try { 
				conn.close(); 
				} 
			catch(Exception e) { 
				e.printStackTrace(); }
		}
	}

}
