package com.rudra.BookingApp.service.entity;

import com.rudra.BookingApp.service.common.entity.CommonEntity;
import com.rudra.BookingApp.service.common.entity.Identifier;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "projecttype")
@NamedQueries({
        @NamedQuery(name = "getAllProjectTypes", query = "Select T from ProjectTypeEntity T")
})
public class ProjectTypeEntity implements Identifier<Integer>, Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

   
    @Column(name = "typeid")
    private Integer typeid;

    @Column(name = "typename")
    private String typename;


    @Override
    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }
}
