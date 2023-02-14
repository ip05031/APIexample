package com.magnaperitia.sicog.devices.weighing.service.dtos;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_EMPTY, content=Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AxleDto {
	
	private Integer _item;
	
	private Integer wt;
	
	private Boolean overWtAxle;
	
	private Boolean overWtTandems;
	
	private Boolean overWtBridge;
	
	private Boolean unbalanced;
	
	private Integer axleFlags;
	
	private BigDecimal spacing;

	public Integer get_item() {
		return _item;
	}

	public void set_item(Integer _item) {
		this._item = _item;
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
		sb.append("_item::")
			.append(_item)
			.append(" wt::")
			.append(wt)
			.append("\n");
		return sb.toString();
	}
	
}
