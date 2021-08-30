package com.rudra.BookingApp.service.entity;

import com.rudra.BookingApp.service.common.entity.CommonEntity;
import com.rudra.BookingApp.service.common.entity.Identifier;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "blocks")
@NamedQueries({
        @NamedQuery(name = "getBlocksByProject", query = "Select B from BlockEntity B WHERE B.projectid=:projectid")
})

public class BlockEntity implements Identifier<Integer>, Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "blockid")
    @NotNull
    private Integer blockid;

    @Column(name = "blockname")
    @NotNull
    private String blockname;

    @Column(name = "projectid")
    private Integer projectid;

	@Override
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getBlockid() {
		return blockid;
	}

	public void setBlockid(Integer blockid) {
		this.blockid = blockid;
	}

	public String getBlockname() {
		return blockname;
	}

	public void setBlockname(String blockname) {
		this.blockname = blockname;
	}

	public Integer getProjectid() {
		return projectid;
	}

	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}

	

    
}
