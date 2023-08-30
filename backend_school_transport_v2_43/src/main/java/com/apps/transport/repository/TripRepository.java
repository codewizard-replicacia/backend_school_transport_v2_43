package com.apps.transport.repository;


import com.apps.transport.model.Trip;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class TripRepository extends SimpleJpaRepository<Trip, String> {
    private final EntityManager em;
    public TripRepository(EntityManager em) {
        super(Trip.class, em);
        this.em = em;
    }
    @Override
    public List<Trip> findAll() {
        return em.createNativeQuery("Select * from \"school_transport_v2\".\"Trip\"", Trip.class).getResultList();
    }
}