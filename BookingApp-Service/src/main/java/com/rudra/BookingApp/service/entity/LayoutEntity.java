package com.rudra.BookingApp.service.entity;

import com.rudra.BookingApp.service.common.entity.CommonEntity;
import com.rudra.BookingApp.service.common.entity.Identifier;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "layouts")
@NamedQueries({
        @NamedQuery(name = "getLayoutsByProject", query = "Select L from LayoutEntity L WHERE L.projectid=:projectid")
})
public class LayoutEntity implements Identifier<Integer>, Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "layoutid")
    @NotNull
    private Integer layoutId;

    @Column(name = "layoutname")
    @NotNull
    private String layoutname;

    @Column(name = "description")
    private String description;

    @Column(name = "projectid")
    private Integer projectid;

	@Override
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLayoutId() {
		return layoutId;
	}

	public void setLayoutId(Integer layoutId) {
		this.layoutId = layoutId;
	}

	public String getLayoutname() {
		return layoutname;
	}

	public void setLayoutname(String layoutname) {
		this.layoutname = layoutname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getProjectid() {
		return projectid;
	}

	public void setProjectid(Integer projectid) {
		this.projectid = projectid;
	}

//    @ManyToOne
//    @JoinColumn(name = "layoutId")
//    private PlotEntity plotEntity;

    

   
//    public PlotEntity getPlotEntity() {
//        return plotEntity;
//    }
//
//    public void setPlotEntity(PlotEntity plotEntity) {
//        this.plotEntity = plotEntity;
//    }
}
