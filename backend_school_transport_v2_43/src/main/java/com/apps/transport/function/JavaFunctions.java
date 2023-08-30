package com.apps.transport.function;

import com.apps.transport.model.Bus;
import com.apps.transport.model.Route;
import com.apps.transport.model.Driver;
import com.apps.transport.model.Trip;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.apps.transport.repository.BusRepository;
import com.apps.transport.repository.TripRepository;
import com.apps.transport.repository.DriverRepository;
import com.apps.transport.repository.RouteRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
