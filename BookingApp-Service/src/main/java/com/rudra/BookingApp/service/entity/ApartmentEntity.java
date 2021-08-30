package com.rudra.BookingApp.service.entity;

import com.rudra.BookingApp.service.common.entity.CommonEntity;
import com.rudra.BookingApp.service.common.entity.Identifier;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "apartments")
@NamedQueries({
        @NamedQuery(name = "getAptByBlock", query = "Select A from ApartmentEntity A WHERE A.blockid=:blockid")
})
public class ApartmentEntity implements Identifier<Integer>, Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "aptid")
    @NotNull
    private Integer aptid;

    @Column(name = "blockid")
    @NotNull
    private Integer blockid;

    @Column(name = "aptname")
    private String aptname;
   
    @Override
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAptid() {
		return aptid;
	}

	public void setAptid(Integer aptid) {
		this.aptid = aptid;
	}

	public Integer getBlockid() {
		return blockid;
	}

	public void setBlockid(Integer blockid) {
		this.blockid = blockid;
	}

	public String getAptname() {
		return aptname;
	}

	public void setAptname(String aptname) {
		this.aptname = aptname;
	}

    
}
