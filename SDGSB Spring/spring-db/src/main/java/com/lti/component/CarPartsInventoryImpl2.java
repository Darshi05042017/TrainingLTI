package com.lti.component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//introducing support for CONNECTION POOLING[apache dbcp]
@Component("carPartsImpl2")
public class CarPartsInventoryImpl2 implements CarPartsInventory {
	
	@Autowired
	@Qualifier("ds1")
	private DataSource dataSource;
	
	
	public void addNewPart(CarPart carPart) {
		Connection connection = null;
		PreparedStatement statement = null;
		
		try {
			
			connection = dataSource.getConnection();
			String query = "insert into TBL_CARPARTS values(?,?,?,?)";
			statement = connection.prepareStatement(query);
			
			statement.setInt(1, carPart.getParNo());
			statement.setString(2, carPart.getPartName());
			statement.setString(3, carPart.getCarModel());
			statement.setInt(4, carPart.getQuantity());
			//statement.setString(5, re);
			statement.executeUpdate();
			//System.out.println("Record inserted successfully!");
		}
		
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			}
			catch (Exception e) {
				
			}
		}
	}
		
	

	public List<CarPart> getAvailableParts() {
		
		return null;
	}

}
