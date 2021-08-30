package com.rudra.BookingApp.service.dao;

import com.rudra.BookingApp.service.entity.ApartmentEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ApartmentDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<ApartmentEntity> getApartmentsByBlock(Integer blockId) {
        return entityManager.createNamedQuery("getAptByBlock", ApartmentEntity.class).setParameter("blockid", blockId).getResultList();
    }

}
