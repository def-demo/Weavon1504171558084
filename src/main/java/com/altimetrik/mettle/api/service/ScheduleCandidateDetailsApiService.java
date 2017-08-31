package com.altimetrik.mettle.api.service;

import com.altimetrik.mettle.models.ScheduleCandidateDetails;


import com.altimetrik.mettle.exception.NotFoundException;
import java.util.List;

public interface ScheduleCandidateDetailsApiService {
  
      List<ScheduleCandidateDetails> findAllScheduleCandidateDetails()
      throws NotFoundException;
  
      ScheduleCandidateDetails updateScheduleCandidateDetails(ScheduleCandidateDetails scheduleCandidateDetails)
      throws NotFoundException;
  
      ScheduleCandidateDetails addScheduleCandidateDetails(ScheduleCandidateDetails scheduleCandidateDetails)
      throws NotFoundException;
  
      ScheduleCandidateDetails findByIdScheduleCandidateDetails(Long id)
      throws NotFoundException;
  
      void deleteScheduleCandidateDetails(Long id)
      throws NotFoundException;
  
}

