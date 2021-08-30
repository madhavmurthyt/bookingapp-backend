package com.rudra.BookingApp.service.entity;

import com.rudra.BookingApp.service.common.entity.CommonEntity;
import com.rudra.BookingApp.service.common.entity.Identifier;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "plots")
@NamedQueries({
        @NamedQuery(name = "getPlotsByLayout", query = "Select P from PlotEntity P WHERE P.layoutid=:layoutid")
})

public class PlotEntity implements Identifier<Integer>, Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "plotnumber")
    @NotNull
    private String plotnumber;

    @Column(name = "layoutid")
    private Integer layoutid;

	@Override
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPlotnumber() {
		return plotnumber;
	}

	public void setPlotnumber(String plotnumber) {
		this.plotnumber = plotnumber;
	}

	public Integer getLayoutid() {
		return layoutid;
	}

	public void setLayoutid(Integer layoutid) {
		this.layoutid = layoutid;
	}
    
    

}
