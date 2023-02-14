package com.magnaperitia.sicog.devices.weighing.domain.model;

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
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.magnaperitia.sicog.devices.weighing.service.dtos.AxleDto;
import com.magnaperitia.sicog.devices.weighing.service.dtos.VehicleDto;

@Entity
@Table(name="LECTURAS_BASCULAS",
	uniqueConstraints={
			@UniqueConstraint(name="lecturasbasculas_id_ukey", columnNames={"id"})
})
@JsonInclude(value=Include.NON_EMPTY, content=Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true, value = {"oid"})
public class Vehicle extends Identifiable {
	
	@Column(name="id", nullable = false)
	private String id;
	
	@Column(name="station")
	private String station;
	
	@Column(name="lane")
	private Integer lane;
	
	@Column(name="wtunits")
	private String wtUnits;
	
	@Column(name="speedunits")
	private String speedUnits;
	
	@Column(name="distanceunits")
	private String distanceUnits;
	
	@Column(name="datetime")
	private ZonedDateTime dateTime;
	
	@Column(name="grosswt")
	private Integer grossWt;
	
	@Column(name="class_")
	private Integer clazz;
	
	@Column(name="speed")
	private Integer speed;
	
	@Column(name="violation")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean violation;
	
	@Column(name="offscale")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean offScale;
	
	@Column(name="overheight")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean overHeight;
	
	@Column(name="wrongdir")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean wrongDir;
	
	@Column(name="stopped")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean stopped;
	
	@Column(name="tooclose")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean tooClose;
	
	@Column(name="overwtgross")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean overWtGross;
	
	@Column(name="overwtaxle")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean overWtAxle;
	
	@Column(name="overwttandems")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean overWtTandems;
	
	@Column(name="overwtbridge")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean overWtBridge;
	
	@Column(name="overspeed")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean overSpeed;
	
	@Column(name="speedchange")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean speedChange;
	
	@Column(name="unbalanced")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean unbalanced;
	
	@Column(name="random")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean random;
	
	@Column(name="overlength")
	@org.hibernate.annotations.Type(type="org.hibernate.type.YesNoType")
	private Boolean overLength;
	
	@Column(name="vehflags")
	private Integer vehFlags;
	
	@Column(name="numaxles")
	private Integer numAxles;
	
	@JsonIgnoreProperties(value = {"oid"}, allowSetters = true)
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "lecturabascula_oid")
	private List<Axle> axles = new ArrayList<>();
	
	public Vehicle() {
		
	}
	
	public Vehicle(VehicleDto v) {
		
		this.id = v.get_id();
		this.station = v.get_station();
		this.lane = v.get_lane();
		this.wtUnits = v.get_wtUnits();
		this.speedUnits = v.get_speedUnits();
		this.distanceUnits = v.get_distanceUnits();
		this.dateTime = v.getDatetime();
		this.grossWt = v.getGrossWt();
		this.clazz = v.get_class();
		this.speed = v.getSpeed();
		this.violation = v.getViolation();
		this.offScale = v.getOffScale();
		this.overHeight = v.getOverHeight();
		this.wrongDir = v.getWrongDir();
		this.stopped = v.getStopped();
		this.tooClose = v.getTooClose();
		this.overWtGross = v.getOverWtGross();
		this.overWtAxle = v.getOverWtAxle();
		this.overWtTandems = v.getOverWtTandems();
		this.overWtBridge = v.getOverWtBridge();
		this.overSpeed = v.getOverSpeed();
		this.speedChange = v.getSpeedChange();
		this.unbalanced = v.getUnbalanced();
		this.random = v.getRandom();
		this.overLength = v.getOverLength();
		this.vehFlags = v.getVehFlags();
		this.numAxles = v.getNumAxles();
		
		for (AxleDto a : v.getAxles()) {
			Axle axle = new Axle(a);
			this.axles.add(axle);
		}
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public Integer getLane() {
		return lane;
	}

	public void setLane(Integer lane) {
		this.lane = lane;
	}

	public String getWtUnits() {
		return wtUnits;
	}

	public void setWtUnits(String wtUnits) {
		this.wtUnits = wtUnits;
	}

	public String getSpeedUnits() {
		return speedUnits;
	}

	public void setSpeedUnits(String speedUnits) {
		this.speedUnits = speedUnits;
	}

	public String getDistanceUnits() {
		return distanceUnits;
	}

	public void setDistanceUnits(String distanceUnits) {
		this.distanceUnits = distanceUnits;
	}

	public ZonedDateTime getDateTime() {
		return dateTime;
	}

	public void setDatetime(ZonedDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Integer getGrossWt() {
		return grossWt;
	}

	public void setGrossWt(Integer grossWt) {
		this.grossWt = grossWt;
	}

	public Integer getClazz() {
		return clazz;
	}

	public void setClazz(Integer clazz) {
		this.clazz = clazz;
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

	public List<Axle> getAxles() {
		return axles;
	}

	public void setAxles(List<Axle> axles) {
		this.axles = axles;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(500);
		sb.append("id::")
			.append(id)
			.append(" station::")
			.append(station)
			.append(" dateTime::")
			.append(dateTime)
			.append(" grossWt::")
			.append(grossWt)
			.append(" numAxles::")
			.append(numAxles)
			.append("\n");
		axles.stream().forEach(s -> sb.append(s.toString()));
		return sb.toString();
	}
	
}
