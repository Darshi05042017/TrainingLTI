package com.lti.flightreservation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AR_ADDFLIGHT")
public class AddFlightEntity {
	@Id
    @GeneratedValue
	private int id;
	
	private String flightId;
	private String companyName;
	private int capacity;
	private String source;
	private String destination;
	private String duration;
	
	private String departureDate;
	private String arrivalTime;
	private int economyClassSeats;
	private double economyPrice;
	private int bussinessClassSeats;
	private double businessPrice;
	private String currStatus;
	
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getCurrStatus() {
		return currStatus;
	}
	public void setCurrStatus(String currStatus) {
		this.currStatus = currStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getEconomyClassSeats() {
		return economyClassSeats;
	}
	public void setEconomyClassSeats(int economyClassSeats) {
		this.economyClassSeats = economyClassSeats;
	}
	public double getEconomyPrice() {
		return economyPrice;
	}
	public void setEconomyPrice(double economyPrice) {
		this.economyPrice = economyPrice;
	}
	public int getBussinessClassSeats() {
		return bussinessClassSeats;
	}
	public void setBussinessClassSeats(int bussinessClassSeats) {
		this.bussinessClassSeats = bussinessClassSeats;
	}
	public double getBusinessPrice() {
		return businessPrice;
	}
	public void setBusinessPrice(double businessPrice) {
		this.businessPrice = businessPrice;
	}
	
	
	
}
