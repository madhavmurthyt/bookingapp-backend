package com.rudra.BookingApp.service.business;

import com.rudra.BookingApp.service.dao.*;
import com.rudra.BookingApp.service.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookingService {
    @Autowired
     private OrgDao orgDao;

    @Autowired
    private ProjectDao projectDao;
    
    @Autowired
    private ProjectTypeDao projectTypeDao;

    @Autowired
    private BlockDao blockDao;

    @Autowired
    private ApartmentDao apartmentDao;

    @Autowired
    private LayoutDao layoutDao;

    @Autowired
    private PlotDao plotDao;

    @Transactional(propagation = Propagation.REQUIRED)
    
	   public List<OrganizationEntity> getAllOrganizations() {
	        return orgDao.getAllOrgs();
	    }
	
	   public List<ProjectEntity> getProjectsByOrg(Integer orgId) {
	        return projectDao.getAllProjectsByOrg(orgId);
	   }
	
	   public List<ProjectTypeEntity> getProjectTypes() {
	        return projectTypeDao.getProjectTypes();
	   }
	    
	   public List<BlockEntity> getBlocksByProject(Integer projectId) {
	        return blockDao.getBlocksByProject(projectId);
	   }
	
	   public List<ApartmentEntity> getApartmentsByBlock(Integer blockId) {
	        return apartmentDao.getApartmentsByBlock(blockId);
	   }
	
	   public List<LayoutEntity> getLayoutsByProject(Integer projectId) {
	        return layoutDao.getLayoutsByProject(projectId);
	   }
	
	   public List<PlotEntity> getPlotsByLayout(Integer layoutId) {
	        return plotDao.getPlotsByLayout(layoutId);
	   }
   
	   
}
