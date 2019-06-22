package com.lti.rest;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

import com.lti.rest.PNR.Status;

@Path("/pnr"	)
public class PNRService {
	
	//the url will look like this:http://localhost:port/proj/rest/pnr/status?pnrNo=12345
	@GET
	@Path("/status")
	public PNR getStatus(@QueryParam("pnrNo")int pnrNo,
			@Context HttpServletResponse response){
		
		//setting CORS header
		response.setHeader("Access-Control-Allow-Origin", "http://localhost:4200");
		
		
		//logic of executing the required method of 
		//a DAO/or any other class will be here 
		//missing right now
		PNR pnr=new PNR();
		pnr.setPnrNo(pnrNo);
		pnr.setTrainNo(111);
		pnr.setDate("25-June-2019");
		pnr.setStatus(Status.RAC);
		return pnr;
		
	}

}
