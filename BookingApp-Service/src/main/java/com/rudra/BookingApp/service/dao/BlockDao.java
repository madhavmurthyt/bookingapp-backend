package com.rudra.BookingApp.service.dao;

import org.springframework.stereotype.Repository;
import com.rudra.BookingApp.service.entity.BlockEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class BlockDao {


    @PersistenceContext
    private EntityManager entityManager;

    public List<BlockEntity> getBlocksByProject(Integer projectId) {
        return entityManager.createNamedQuery("getBlocksByProject", BlockEntity.class).setParameter("projectid", projectId).getResultList();
    }


}
