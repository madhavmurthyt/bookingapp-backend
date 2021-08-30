package com.rudra.BookingApp.service.entity;

import com.rudra.BookingApp.service.common.entity.CommonEntity;
import com.rudra.BookingApp.service.common.entity.Identifier;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


@Entity
@Table(name = "projects")

@NamedQueries({
        @NamedQuery(name = "getAllProjectsByOrg", query = "SELECT P from ProjectEntity P WHERE P.orgid = :orgid"),
        @NamedQuery(name = "getProjectById", query = "SELECT P from ProjectEntity P WHERE P.id = :id")

})

        public class ProjectEntity implements Identifier<Integer>, Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "projectid")
    @NotNull
    private Integer projectId;

    @Column(name = "projectname")
    @NotNull
    private String projectname;

    @Column(name = "orgid")
    private Integer orgid;

    @Column(name = "typeid")
    private Integer typeid;

	@Override
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectname() {
		return projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public Integer getOrgid() {
		return orgid;
	}

	public void setOrgid(Integer orgid) {
		this.orgid = orgid;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

   
}
