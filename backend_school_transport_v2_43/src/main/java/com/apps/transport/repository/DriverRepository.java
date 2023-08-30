package com.apps.transport.repository;


import com.apps.transport.model.Driver;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class DriverRepository extends SimpleJpaRepository<Driver, String> {
    private final EntityManager em;
    public DriverRepository(EntityManager em) {
        super(Driver.class, em);
        this.em = em;
    }
    @Override
    public List<Driver> findAll() {
        return em.createNativeQuery("Select * from \"school_transport_v2\".\"Driver\"", Driver.class).getResultList();
    }
}