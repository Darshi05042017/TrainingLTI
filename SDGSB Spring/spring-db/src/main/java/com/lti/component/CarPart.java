package com.lti.component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="TBL_CARPARTS")
public class CarPart {
	
	@Id
	private int parNo;
	
	private String partName;
	private String carModel;
	private int quantity;
	public int getParNo() {
		return parNo;
	}
	public void setParNo(int parNo) {
		this.parNo = parNo;
	}
	public String getPartName() {
		return partName;
	}
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
