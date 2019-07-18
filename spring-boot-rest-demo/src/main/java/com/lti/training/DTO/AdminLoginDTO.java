package com.lti.training.DTO;

import com.lti.training.entity.AdminLogin;

public class AdminLoginDTO {
	

		private int id;
		private String email;
		private String password;
		
		
		
		
		public AdminLoginDTO() {
			super();
		}
		public AdminLoginDTO(AdminLogin customer) {
			this.id = customer. customerId;
			this.email = customer.email;
			this.password = customer.password;
		}
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
		public int getCustomerId() {
			return id;
		}
		public void setCustomerId(int customerId) {
			this.id = customerId;
		}
}
		
	