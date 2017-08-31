package com.altimetrik.mettle.api.service.impl;

import com.altimetrik.mettle.api.service.*;
import com.altimetrik.mettle.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.mettle.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.mettle.models.ScheduleDetails;


import java.util.List;
import com.altimetrik.mettle.exception.NotFoundException;


@Service
@Transactional
public class ScheduleDetailsApiServiceImpl implements ScheduleDetailsApiService {
		  	  
	  @Autowired
	
  	  private ScheduleDetailsRepository  scheduleDetailsRepository ;
	   
  
  
				
			
      @Override
      public List<ScheduleDetails> findAllScheduleDetails()
      throws NotFoundException {
      
        
  		
  		
  			return scheduleDetailsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public ScheduleDetails updateScheduleDetails(ScheduleDetails scheduleDetails)
      throws NotFoundException {
      
         
        	return scheduleDetailsRepository.save(scheduleDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public ScheduleDetails addScheduleDetails(ScheduleDetails scheduleDetails)
      throws NotFoundException {
      
         
        	return scheduleDetailsRepository.save(scheduleDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public ScheduleDetails findByIdScheduleDetails(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return scheduleDetailsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteScheduleDetails(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

