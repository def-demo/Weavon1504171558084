package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.ScheduleCandidateDetailsApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.ScheduleCandidateDetails;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )

public class ScheduleCandidateDetailsApi {

   @Autowired
   private ScheduleCandidateDetailsApiService service;
  

  @RequestMapping(value = "/schedule_candidate_details", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<ScheduleCandidateDetails>> findAllScheduleCandidateDetails()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<ScheduleCandidateDetails>>(service.findAllScheduleCandidateDetails(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/schedule_candidate_details", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< ScheduleCandidateDetails> updateScheduleCandidateDetails(@RequestBody ScheduleCandidateDetails scheduleCandidateDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<ScheduleCandidateDetails>(service.updateScheduleCandidateDetails(scheduleCandidateDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/schedule_candidate_details", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< ScheduleCandidateDetails> addScheduleCandidateDetails(@RequestBody ScheduleCandidateDetails scheduleCandidateDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<ScheduleCandidateDetails>(service.addScheduleCandidateDetails(scheduleCandidateDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/schedule_candidate_details/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< ScheduleCandidateDetails> findByIdScheduleCandidateDetails(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<ScheduleCandidateDetails>(service.findByIdScheduleCandidateDetails(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/schedule_candidate_details/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteScheduleCandidateDetails(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteScheduleCandidateDetails(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

