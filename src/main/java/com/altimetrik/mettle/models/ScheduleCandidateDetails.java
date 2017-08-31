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

public class ScheduleCandidateDetails  {
  
  
   
  
  @Id
   
  
  private Long scheduleCandidateId = null;
  
   
   
  
  private Long scheduleId = null;
  
   
   
  
  private String firstName = null;
  
   
   
  
  private String lastName = null;
  
   
   
  
  private String dob = null;
  
   
   
  
  private String emailId = null;
  
   
   
  
  private String country = null;
  
   
   
  
  private String testLink = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Long getScheduleCandidateId() {
    return scheduleCandidateId;
  }
  public void setScheduleCandidateId(Long scheduleCandidateId) {
    this.scheduleCandidateId = scheduleCandidateId;
  }

  
  /**
   * {}
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
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  
  /**
   * {}
   **/
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  
  /**
   * {}
   **/
  public String getDob() {
    return dob;
  }
  public void setDob(String dob) {
    this.dob = dob;
  }

  
  /**
   * {}
   **/
  public String getEmailId() {
    return emailId;
  }
  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  
  /**
   * {}
   **/
  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }

  
  /**
   * {}
   **/
  public String getTestLink() {
    return testLink;
  }
  public void setTestLink(String testLink) {
    this.testLink = testLink;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScheduleCandidateDetails scheduleCandidateDetails = (ScheduleCandidateDetails) o;
    return Objects.equals(scheduleCandidateId, scheduleCandidateDetails.scheduleCandidateId) &&
        Objects.equals(scheduleId, scheduleCandidateDetails.scheduleId) &&
        Objects.equals(firstName, scheduleCandidateDetails.firstName) &&
        Objects.equals(lastName, scheduleCandidateDetails.lastName) &&
        Objects.equals(dob, scheduleCandidateDetails.dob) &&
        Objects.equals(emailId, scheduleCandidateDetails.emailId) &&
        Objects.equals(country, scheduleCandidateDetails.country) &&
        Objects.equals(testLink, scheduleCandidateDetails.testLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleCandidateId, scheduleId, firstName, lastName, dob, emailId, country, testLink);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleCandidateDetails {\n");
    
    sb.append("  scheduleCandidateId: ").append(scheduleCandidateId).append("\n");
    sb.append("  scheduleId: ").append(scheduleId).append("\n");
    sb.append("  firstName: ").append(firstName).append("\n");
    sb.append("  lastName: ").append(lastName).append("\n");
    sb.append("  dob: ").append(dob).append("\n");
    sb.append("  emailId: ").append(emailId).append("\n");
    sb.append("  country: ").append(country).append("\n");
    sb.append("  testLink: ").append(testLink).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

