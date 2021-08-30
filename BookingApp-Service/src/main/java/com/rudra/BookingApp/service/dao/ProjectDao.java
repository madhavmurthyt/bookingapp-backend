package com.rudra.BookingApp.service.dao;


import com.rudra.BookingApp.service.entity.ProjectEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProjectDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<ProjectEntity> getAllProjectsByOrg(Integer orgId) {
        return entityManager.createNamedQuery("getAllProjectsByOrg", ProjectEntity.class).setParameter("orgid", orgId).getResultList();
    }

    public ProjectEntity getProjectById(final Integer id) {
        return entityManager.createNamedQuery("getProjectById", ProjectEntity.class).setParameter("id", id).getSingleResult();
    }
}
