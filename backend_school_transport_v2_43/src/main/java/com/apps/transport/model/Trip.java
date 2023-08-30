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

@Entity(name = "Trip")
@Table(name = "\"Trip\"", schema =  "\"school_transport_v2\"")
@Data
                        
public class Trip {
	public Trip () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"TripId\"", nullable = true )
  private Long tripId;
	  
  @Column(name = "\"StartTime\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date startTime;  
  
	  
  @Column(name = "\"EndTime\"", nullable = true )
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date endTime;  
  
  
  
  
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "\"TripRoute\"", referencedColumnName = "\"RouteId\"", insertable = false, updatable = false)
	private Route route;
	
	@Column(name = "\"TripRoute\"")
	private Integer tripRoute;
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Trip [" 
  + "TripId= " + tripId  + ", " 
  + "StartTime= " + startTime  + ", " 
  + "EndTime= " + endTime 
 + "]";
	}
	
}