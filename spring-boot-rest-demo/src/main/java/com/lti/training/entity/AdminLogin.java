package com.lti.training.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AR_TBL_ADMINLOGIN")
public class AdminLogin {

	      
		    @GeneratedValue
			public int Id;
	      	
			public int getId() {
				return Id;
			}
			public void setId(int id) {
				Id = id;
			}
			@Id
			public String email;
			public String password;
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
	
			

	

	
}
