package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.flightreservation.dto.AddFlightDTO;
import com.lti.flightreservation.service.AddFlightService;
import com.lti.flightreservation.status.StatusFlightAdd;


@RestController
@Component
public class addFlightController {
	@Autowired
	private AddFlightService addFlightService;
	private StatusFlightAdd status;

	@RequestMapping(path="/addFlight", method=RequestMethod.POST)
		public StatusFlightAdd register(@RequestBody AddFlightDTO addFlightDTO) {
		
		addFlightService.save(addFlightDTO);
		    return status;
	   }

}
 