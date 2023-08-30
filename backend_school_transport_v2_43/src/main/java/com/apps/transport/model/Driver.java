package com.apps.transport.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.apps.transport.model.Bus;
import com.apps.transport.model.Route;
import com.apps.transport.model.Driver;
import com.apps.transport.model.Trip;
import com.apps.transport.converter.DurationConverter;
import com.apps.transport.converter.UUIDToByteConverter;
import com.apps.transport.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Driver")
@Table(name = "\"Driver\"", schema =  "\"school_transport_v2\"")
@Data
                        
public class Driver {
	public Driver () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"DriverId\"", nullable = true )
  private Integer driverId;
	  
  @Column(name = "\"Name\"", nullable = true )
  private String name;
  
	  
  @Column(name = "\"LicenseNumber\"", nullable = true )
  private String licenseNumber;
  
	  
  @Column(name = "\"Age\"", nullable = true )
  private Integer age;
  
	  
  @Column(name = "\"MobileNumber\"", nullable = true )
  private String mobileNumber;
  
	  
  @Column(name = "\"Gender\"", nullable = true )
  private String gender;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Driver [" 
  + "DriverId= " + driverId  + ", " 
  + "Name= " + name  + ", " 
  + "LicenseNumber= " + licenseNumber  + ", " 
  + "Age= " + age  + ", " 
  + "MobileNumber= " + mobileNumber  + ", " 
  + "Gender= " + gender 
 + "]";
	}
	
}