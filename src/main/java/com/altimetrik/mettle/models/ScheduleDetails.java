package com.altimetrik.mettle.models;


import java.util.Objects;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;






@Entity

public class ScheduleDetails  {
  
  
   
  
  @Id
   
  
  private Long scheduleId = null;
  
   
   
  
  private Long assessmentId = null;
  
   
   
  
  private String accessKey = null;
  
   
   
  
  private String accessUrl = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getScheduleId() {
    return scheduleId;
  }
  public void setScheduleId(Long scheduleId) {
    this.scheduleId = scheduleId;
  }

  
  /**
   * {}
   **/
  public Long getAssessmentId() {
    return assessmentId;
  }
  public void setAssessmentId(Long assessmentId) {
    this.assessmentId = assessmentId;
  }

  
  /**
   * {}
   **/
  public String getAccessKey() {
    return accessKey;
  }
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  
  /**
   * {}
   **/
  public String getAccessUrl() {
    return accessUrl;
  }
  public void setAccessUrl(String accessUrl) {
    this.accessUrl = accessUrl;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleDetails scheduleDetails = (ScheduleDetails) o;
    return Objects.equals(scheduleId, scheduleDetails.scheduleId) &&
        Objects.equals(assessmentId, scheduleDetails.assessmentId) &&
        Objects.equals(accessKey, scheduleDetails.accessKey) &&
        Objects.equals(accessUrl, scheduleDetails.accessUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleId, assessmentId, accessKey, accessUrl);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleDetails {\n");
    
    sb.append("  scheduleId: ").append(scheduleId).append("\n");
    sb.append("  assessmentId: ").append(assessmentId).append("\n");
    sb.append("  accessKey: ").append(accessKey).append("\n");
    sb.append("  accessUrl: ").append(accessUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

