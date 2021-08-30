package com.rudra.BookingApp.service.dao;

import org.springframework.stereotype.Repository;
import com.rudra.BookingApp.service.entity.LayoutEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class LayoutDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<LayoutEntity> getLayoutsByProject(Integer projectId) {
        return entityManager.createNamedQuery("getLayoutsByProject", LayoutEntity.class).setParameter("projectid", projectId).getResultList();
    }

}
