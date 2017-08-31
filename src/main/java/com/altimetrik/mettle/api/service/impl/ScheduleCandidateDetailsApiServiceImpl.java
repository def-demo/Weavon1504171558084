package com.altimetrik.mettle.api.service.impl;

import com.altimetrik.mettle.api.service.*;
import com.altimetrik.mettle.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.mettle.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.mettle.models.ScheduleCandidateDetails;


import java.util.List;
import com.altimetrik.mettle.exception.NotFoundException;


@Service
@Transactional
public class ScheduleCandidateDetailsApiServiceImpl implements ScheduleCandidateDetailsApiService {
		  	  
	  @Autowired
	
  	  private ScheduleCandidateDetailsRepository  scheduleCandidateDetailsRepository ;
	   
  
  
				
			
      @Override
      public List<ScheduleCandidateDetails> findAllScheduleCandidateDetails()
      throws NotFoundException {
      
        
  		
  		
  			return scheduleCandidateDetailsRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public ScheduleCandidateDetails updateScheduleCandidateDetails(ScheduleCandidateDetails scheduleCandidateDetails)
      throws NotFoundException {
      
         
        	return scheduleCandidateDetailsRepository.save(scheduleCandidateDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public ScheduleCandidateDetails addScheduleCandidateDetails(ScheduleCandidateDetails scheduleCandidateDetails)
      throws NotFoundException {
      
         
        	return scheduleCandidateDetailsRepository.save(scheduleCandidateDetails);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public ScheduleCandidateDetails findByIdScheduleCandidateDetails(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return scheduleCandidateDetailsRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteScheduleCandidateDetails(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

