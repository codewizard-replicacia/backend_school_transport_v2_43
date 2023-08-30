package com.apps.transport.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

import com.apps.transport.model.Bus;
import com.apps.transport.model.Route;
import com.apps.transport.model.Driver;
import com.apps.transport.model.Trip;

@Entity(name = "BusTrips")
@Table(schema = "\"school_transport_v2\"", name = "\"BusTrips\"")
@Data
public class BusTrips{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"BusId\"")
	private Integer busId;

    
    @Column(name = "\"TripId\"")
    private Long tripId;
 
}