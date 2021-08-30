package com.rudra.BookingApp.service.dao;

import com.rudra.BookingApp.service.entity.PlotEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PlotDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<PlotEntity> getPlotsByLayout(Integer layoutId) {
        return entityManager.createNamedQuery("getPlotsByLayout", PlotEntity.class).setParameter("layoutid", layoutId).getResultList();
    }
}
