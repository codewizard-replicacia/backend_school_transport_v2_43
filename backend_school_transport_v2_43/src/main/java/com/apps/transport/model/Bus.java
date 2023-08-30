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

@Entity(name = "Bus")
@Table(name = "\"Bus\"", schema =  "\"school_transport_v2\"")
@Data
                        
public class Bus {
	public Bus () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"BusId\"", nullable = true )
  private Integer busId;
	  
  @Column(name = "\"BusNumber\"", nullable = true )
  private String busNumber;
  
	  
  @Column(name = "\"MfgDate\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date mfgDate;  
  
	  
  @Column(name = "\"Capacity\"", nullable = true )
  private Integer capacity;
  
	  
  @Column(name = "\"RegistrationNumber\"", nullable = true )
  private String registrationNumber;
  
	  
  @Column(name = "\"Model\"", nullable = true )
  private String model;
  
	  
  @Column(name = "\"IsCameraFitted\"", nullable = true )
  private Boolean isCameraFitted;
  
  
  
  
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"BusDriver\"", referencedColumnName = "\"DriverId\"", insertable = false, updatable = false)
	private Driver driver;
	
	@Column(name = "\"BusDriver\"")
	private Integer busDriver;
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"BusTrips\"",
            joinColumns = @JoinColumn( name="\"BusId\""),
            inverseJoinColumns = @JoinColumn( name="\"TripId\""), schema = "\"school_transport_v2\"")
private List<Trip> trips = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Bus [" 
  + "BusId= " + busId  + ", " 
  + "BusNumber= " + busNumber  + ", " 
  + "MfgDate= " + mfgDate  + ", " 
  + "Capacity= " + capacity  + ", " 
  + "RegistrationNumber= " + registrationNumber  + ", " 
  + "Model= " + model  + ", " 
  + "IsCameraFitted= " + isCameraFitted 
 + "]";
	}
	
}