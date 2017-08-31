package com.altimetrik.mettle.api.service;

import com.altimetrik.mettle.models.ScheduleDetails;


import com.altimetrik.mettle.exception.NotFoundException;
import java.util.List;

public interface ScheduleDetailsApiService {
  
      List<ScheduleDetails> findAllScheduleDetails()
      throws NotFoundException;
  
      ScheduleDetails updateScheduleDetails(ScheduleDetails scheduleDetails)
      throws NotFoundException;
  
      ScheduleDetails addScheduleDetails(ScheduleDetails scheduleDetails)
      throws NotFoundException;
  
      ScheduleDetails findByIdScheduleDetails(Long id)
      throws NotFoundException;
  
      void deleteScheduleDetails(Long id)
      throws NotFoundException;
  
}

