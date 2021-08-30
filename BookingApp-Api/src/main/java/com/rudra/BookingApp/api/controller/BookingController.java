package com.rudra.BookingApp.api.controller;

import com.rudra.BookingApp.service.entity.*;
import com.rudra.BookingApp.service.business.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;
    


    @RequestMapping(method = RequestMethod.GET, path = "/organization")
    public List<OrganizationEntity> getAllOrganizations() {
        List<OrganizationEntity> orgList = bookingService.getAllOrganizations();
        return orgList;
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/projects/{orgId}")
    public List<ProjectEntity> getProjectsbyOrg(@PathVariable(value = "orgId") final Integer orgId) {
    	List<ProjectEntity> prjList = bookingService.getProjectsByOrg(orgId);
    	return prjList;
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/projecttype")
    public List<ProjectTypeEntity> getProjectTypes() {
    	List<ProjectTypeEntity> typeList = bookingService.getProjectTypes();
    	return typeList;
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/layouts/{projectId}")
    public List<LayoutEntity> getLayoutsByProject(@PathVariable(value = "projectId") final Integer projectId) {
    	List<LayoutEntity> layoutList = bookingService.getLayoutsByProject(projectId);
    	return layoutList;
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/plots/{layoutId}")
    public List<PlotEntity> getPlotsByLayout(@PathVariable(value = "layoutId") final Integer layoutId) {
    	List<PlotEntity> plotList = bookingService.getPlotsByLayout(layoutId);
    	return plotList;
    }
  //  getBlocksByProject getApartmentsByBlock
    
    @RequestMapping(method = RequestMethod.GET, path = "/blocks/{projectId}") 
    public List<BlockEntity> getBlocksByProject(@PathVariable(value = "projectId") final Integer projectId) {
    	List<BlockEntity> blockList = bookingService.getBlocksByProject(projectId);
    	return blockList;
    }
    
    @RequestMapping(method = RequestMethod.GET, path = "/apartments/{blockId}") 
    public List<ApartmentEntity> getApartmentsByBlock(@PathVariable(value = "blockId") final Integer blockId) {
    	List<ApartmentEntity> apartmentList = bookingService.getApartmentsByBlock(blockId);
    	return apartmentList;
    }
}
