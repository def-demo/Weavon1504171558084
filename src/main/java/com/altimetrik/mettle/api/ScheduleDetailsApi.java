package com.altimetrik.mettle.api;

import com.altimetrik.mettle.models.*;

import com.altimetrik.mettle.api.service.ScheduleDetailsApiService;

import com.altimetrik.mettle.exception.NotFoundException;

import com.altimetrik.mettle.models.ScheduleDetails;


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

public class ScheduleDetailsApi {

   @Autowired
   private ScheduleDetailsApiService service;
  

  @RequestMapping(value = "/schedule_details", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<ScheduleDetails>> findAllScheduleDetails()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<ScheduleDetails>>(service.findAllScheduleDetails(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/schedule_details", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< ScheduleDetails> updateScheduleDetails(@RequestBody ScheduleDetails scheduleDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<ScheduleDetails>(service.updateScheduleDetails(scheduleDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/schedule_details", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< ScheduleDetails> addScheduleDetails(@RequestBody ScheduleDetails scheduleDetails
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<ScheduleDetails>(service.addScheduleDetails(scheduleDetails), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/schedule_details/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< ScheduleDetails> findByIdScheduleDetails(@PathVariable("id") Long id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<ScheduleDetails>(service.findByIdScheduleDetails(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/schedule_details/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteScheduleDetails(@PathVariable("id") Long id
)
      throws NotFoundException {
        
       	  service.deleteScheduleDetails(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

