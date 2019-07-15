package com.lti.flightreservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.lti.flightreservation.dao.AddFlightDao;
import com.lti.flightreservation.dto.AddFlightDTO;
import com.lti.flightreservation.entity.AddFlightEntity;
import com.lti.flightreservation.status.StatusFlightAdd;

public class AddFlightService {
	@Autowired 
	private AddFlightDao addFlightDao;
	@Transactional
	public StatusFlightAdd save(AddFlightDTO addFlightDTO) {
		
		
		
		    //Copying the data from the dto to entity 
			AddFlightEntity afe= new AddFlightEntity();
			
			afe.setFlightId(addFlightDTO.getFlightId());
			afe.setCompanyName(addFlightDTO.getCompanyName());
			afe.setCapacity(addFlightDTO.getCapacity());
			afe.setSource(addFlightDTO.getFrom());
			afe.setDestination(addFlightDTO.getTo());
			afe.setDuration(addFlightDTO.getDuration());
			afe.setDepartureDate(addFlightDTO.getDepartureDate());
			afe.setArrivalTime(addFlightDTO.getArrivalTime());
			afe.setEconomyClassSeats(addFlightDTO.getEconomyClassSeats());
			afe.setEconomyPrice(addFlightDTO.getEconomyPrice());
			afe.setBussinessClassSeats(addFlightDTO.getBussinessClassSeats());
			afe.setBusinessPrice(addFlightDTO.getBusinessPrice());
			afe.setCurrStatus(addFlightDTO.getStatus());
			
			
			String status1= addFlightDao.save(afe);
			
			StatusFlightAdd status = new StatusFlightAdd();
			status.setStatus(status1);
			return status;
		
		}
	} 


