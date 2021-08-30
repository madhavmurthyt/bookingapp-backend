package com.rudra.BookingApp.service.dao;


import com.rudra.BookingApp.service.entity.OrganizationEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class OrgDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<OrganizationEntity> getAllOrgs() {
    	try {
        return entityManager.createNamedQuery("fetchAllOrganizations", OrganizationEntity.class).getResultList();
    	}catch (Exception ec) {
    		ec.printStackTrace();
    		return null;
    	}

    }

    public OrganizationEntity getOrgById(final Integer id) {
        return entityManager.createNamedQuery("fetchOrganizationById", OrganizationEntity.class).setParameter("id", id).getSingleResult();
    }
}
