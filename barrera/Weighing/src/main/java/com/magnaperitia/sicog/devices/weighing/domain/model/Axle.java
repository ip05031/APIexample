package com.magnaperitia.sicog.devices.weighing.domain.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.magnaperitia.sicog.devices.weighing.service.dtos.AxleDto;

@Entity
@Table(name="LECTURAS_BASCULAS_DETALLES",
	uniqueConstraints={
			@UniqueConstraint(name="lecturasbasculasdetalles_parentoiditem_ukey", columnNames={"lecturabascula_oid","item"})
})
@JsonInclude(value=Include.NON_EMPTY, content=Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Axle extends Identifiable {
	
	@Column(name="item")
	private Integer item;
	
	@Column(name="wt")
	private Integer wt;
	
	@Column(name="overwtaxle")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean overWtAxle;
	
	@Column(name="overwttandems")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean overWtTandems;
	
	@Column(name="overwtbridge")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean overWtBridge;
	
	@Column(name="unbalanced")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean unbalanced;
	
	@Column(name="axleflags")
	private Integer axleFlags;
	
	@Column(name="spacing")
	private BigDecimal spacing;
	
	public Axle() {
		
	}
	
	public Axle(AxleDto a) {
		this.item = a.get_item();
		this.wt = a.getWt();
		this.overWtAxle = a.getOverWtAxle();
		this.overWtTandems = a.getOverWtTandems();
		this.overWtBridge = a.getOverWtBridge();
		this.unbalanced = a.getUnbalanced();
		this.axleFlags = a.getAxleFlags();
		this.spacing = a.getSpacing();
	}

	public Integer getItem() {
		return item;
	}

	public void setItem(Integer item) {
		this.item = item;
	}

	public Integer getWt() {
		return wt;
	}

	public void setWt(Integer wt) {
		this.wt = wt;
	}

	public Boolean getOverWtAxle() {
		return overWtAxle;
	}

	public void setOverWtAxle(Boolean overWtAxle) {
		this.overWtAxle = overWtAxle;
	}

	public Boolean getOverWtTandems() {
		return overWtTandems;
	}

	public void setOverWtTandems(Boolean overWtTandems) {
		this.overWtTandems = overWtTandems;
	}

	public Boolean getOverWtBridge() {
		return overWtBridge;
	}

	public void setOverWtBridge(Boolean overWtBridge) {
		this.overWtBridge = overWtBridge;
	}

	public Boolean getUnbalanced() {
		return unbalanced;
	}

	public void setUnbalanced(Boolean unbalanced) {
		this.unbalanced = unbalanced;
	}

	public Integer getAxleFlags() {
		return axleFlags;
	}

	public void setAxleFlags(Integer axleFlags) {
		this.axleFlags = axleFlags;
	}

	public BigDecimal getSpacing() {
		return spacing;
	}

	public void setSpacing(BigDecimal spacing) {
		this.spacing = spacing;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(500);
		sb.append("item::")
			.append(item)
			.append(" wt::")
			.append(wt)
			.append("\n");
		return sb.toString();
	}
	
}
