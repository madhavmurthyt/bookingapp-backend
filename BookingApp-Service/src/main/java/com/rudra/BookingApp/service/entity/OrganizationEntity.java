package com.rudra.BookingApp.service.entity;

import com.rudra.BookingApp.service.common.entity.Identifier;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "organization")
@NamedQueries({
    @NamedQuery(name = "fetchAllOrganizations", query = "SELECT O FROM OrganizationEntity O ORDER BY O.organizationname"),
    @NamedQuery(name = "fetchOrganizationById", query = "SELECT Oi FROM OrganizationEntity Oi WHERE Oi.id=:id")
})

public class OrganizationEntity implements Identifier<Integer>, Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "organizationid")
    @NotNull
    private Integer organizationid;

    @Column(name = "organizationname")
    @NotNull
    private String organizationname;

    @Column(name = "description")
    private String description;

//    @ManyToOne
//    @JoinColumn(name = "projectid")
//    private ProjectEntity projectEntity;

    @Override
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrganizationid() {
		return organizationid;
	}

	public void setOrganizationid(Integer organizationid) {
		this.organizationid = organizationid;
	}

	public String getOrganizationname() {
		return organizationname;
	}

	public void setOrganizationname(String organizationname) {
		this.organizationname = organizationname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

//	public ProjectEntity getProjectEntity() {
//		return projectEntity;
//	}
//
//	public void setProjectEntity(ProjectEntity projectEntity) {
//		this.projectEntity = projectEntity;
//	}

    
    
    
    
   
}
