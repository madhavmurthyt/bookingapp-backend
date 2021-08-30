package com.rudra.BookingApp.service.dao;

import org.springframework.stereotype.Repository;
import com.rudra.BookingApp.service.entity.ProjectTypeEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProjectTypeDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<ProjectTypeEntity> getProjectTypes() {
        return entityManager.createNamedQuery("getAllProjectTypes", ProjectTypeEntity.class).getResultList();
    }
}
