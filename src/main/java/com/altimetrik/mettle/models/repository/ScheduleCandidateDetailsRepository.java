package com.altimetrik.mettle.models.repository;

import com.altimetrik.mettle.models.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ScheduleCandidateDetailsRepository extends JpaRepository<ScheduleCandidateDetails, Long>{

}



