package com.magnaperitia.sicog.devices.weighing.service.dtos;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(value=Include.NON_EMPTY, content=Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class VehicleDto {
	
	private String _id;
	
	private String _station;
	
	private Integer _lane;
	
	private String _wtUnits;
	
	private String _speedUnits;
	
	private String _distanceUnits;
	
	private ZonedDateTime datetime;
	
	private Integer grossWt;
	
	private Integer _class;
	
	private Integer speed;
	
	private Boolean violation;
	
	private Boolean offScale;
	
	private Boolean overHeight;
	
	private Boolean wrongDir;
	
	private Boolean stopped;
	
	private Boolean tooClose;
	
	private Boolean overWtGross;
	
	private Boolean overWtAxle;
	
	private Boolean overWtTandems;
	
	private Boolean overWtBridge;
	
	private Boolean overSpeed;
	
	private Boolean speedChange;
	
	private Boolean unbalanced;
	
	private Boolean random;
	
	private Boolean overLength;
	
	private Integer vehFlags;
	
	private Integer numAxles;
	
	private List<AxleDto> axles = new ArrayList<>();
	
	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String get_station() {
		return _station;
	}

	public void set_station(String _station) {
		this._station = _station;
	}

	public Integer get_lane() {
		return _lane;
	}

	public void set_lane(Integer _lane) {
		this._lane = _lane;
	}

	public String get_wtUnits() {
		return _wtUnits;
	}

	public void set_wtUnits(String _wtUnits) {
		this._wtUnits = _wtUnits;
	}

	public String get_speedUnits() {
		return _speedUnits;
	}

	public void set_speedUnits(String _speedUnits) {
		this._speedUnits = _speedUnits;
	}

	public String get_distanceUnits() {
		return _distanceUnits;
	}

	public void set_distanceUnits(String _distanceUnits) {
		this._distanceUnits = _distanceUnits;
	}

	public ZonedDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(ZonedDateTime datetime) {
		this.datetime = datetime;
	}

	public Integer getGrossWt() {
		return grossWt;
	}

	public void setGrossWt(Integer grossWt) {
		this.grossWt = grossWt;
	}

	public Integer get_class() {
		return _class;
	}

	public void set_class(Integer _class) {
		this._class = _class;
	}

	public Integer getSpeed() {
		return speed;
	}

	public void setSpeed(Integer speed) {
		this.speed = speed;
	}

	public Boolean getViolation() {
		return violation;
	}

	public void setViolation(Boolean violation) {
		this.violation = violation;
	}

	public Boolean getOffScale() {
		return offScale;
	}

	public void setOffScale(Boolean offScale) {
		this.offScale = offScale;
	}

	public Boolean getOverHeight() {
		return overHeight;
	}

	public void setOverHeight(Boolean overHeight) {
		this.overHeight = overHeight;
	}

	public Boolean getWrongDir() {
		return wrongDir;
	}

	public void setWrongDir(Boolean wrongDir) {
		this.wrongDir = wrongDir;
	}

	public Boolean getStopped() {
		return stopped;
	}

	public void setStopped(Boolean stopped) {
		this.stopped = stopped;
	}

	public Boolean getTooClose() {
		return tooClose;
	}

	public void setTooClose(Boolean tooClose) {
		this.tooClose = tooClose;
	}

	public Boolean getOverWtGross() {
		return overWtGross;
	}

	public void setOverWtGross(Boolean overWtGross) {
		this.overWtGross = overWtGross;
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

	public Boolean getOverSpeed() {
		return overSpeed;
	}

	public void setOverSpeed(Boolean overSpeed) {
		this.overSpeed = overSpeed;
	}

	public Boolean getSpeedChange() {
		return speedChange;
	}

	public void setSpeedChange(Boolean speedChange) {
		this.speedChange = speedChange;
	}

	public Boolean getUnbalanced() {
		return unbalanced;
	}

	public void setUnbalanced(Boolean unbalanced) {
		this.unbalanced = unbalanced;
	}

	public Boolean getRandom() {
		return random;
	}

	public void setRandom(Boolean random) {
		this.random = random;
	}

	public Boolean getOverLength() {
		return overLength;
	}

	public void setOverLength(Boolean overLength) {
		this.overLength = overLength;
	}

	public Integer getVehFlags() {
		return vehFlags;
	}

	public void setVehFlags(Integer vehFlags) {
		this.vehFlags = vehFlags;
	}

	public Integer getNumAxles() {
		return numAxles;
	}

	public void setNumAxles(Integer numAxles) {
		this.numAxles = numAxles;
	}

	public List<AxleDto> getAxles() {
		return axles;
	}

	public void setAxles(List<AxleDto> axles) {
		this.axles.clear();
		this.axles.addAll(axles);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(500);
		sb.append("_id::")
			.append(_id)
			.append(" _station::")
			.append(_station)
			.append(" datetime::")
			.append(datetime)
			.append(" grossWt::")
			.append(grossWt)
			.append(" numAxles::")
			.append(numAxles)
			.append("\n");
		axles.stream().forEach(s -> sb.append(s.toString()));
		return sb.toString();
	}
	
}
