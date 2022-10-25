package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

import java.util.Date;


/**
 * The persistent class for the TOU_DAYZONE_TEMP database table.
 * 
 */
@Entity
@Table(name="TOU_DAYZONE_TEMP",schema="CDB")
@Where(clause="record_status=1")
public class TouDayZoneTemp implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;

	@Column(name="METER_ID")
	private String meterId;
	
	@Column(name="DAY_ID")
	private String dayId;
	
	@Column(name="ZONE_ID")
	private String zoneId;
	
	@Column(name="START_TIME")
	private String startTime;
	
	@Column(name="METER_MANAFACTURE")
	private String meterManafacture;
	
	@Column(name="METER_TYPE")
	private String meterType;
	
	@Column(name="CALENDER_NAME")
	private String calenderName;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE", nullable=false)
	private Date createDate;

	@Column(name="CREATED_BY", length=50)
	private String createdBy;
	
	@Column(name="RECORD_STATUS", nullable=false)
	private int recordStatus=1;

	@Column(name="SERVER_IP", nullable=false, length=50)
	private String serverIp="127.0.0.1";
	
	@Column(name="UPDATE_BY", length=50)
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Date updateDate;
	
	public TouDayZoneTemp() {
		
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMeterId() {
		return this.meterId;
	}

	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

	public String getDayId() {
		return this.dayId;
	}

	public void setDayId(String dayId) {
		this.dayId = dayId;
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getMeterManafacture() {
		return this.meterManafacture;
	}

	public void setMeterManafacture(String meterManafacture) {
		this.meterManafacture = meterManafacture;
	}

	public String getMeterType() {
		return this.meterType;
	}

	public void setMeterType(String meterType) {
		this.meterType = meterType;
	}

	public String getCalenderName() {
		return this.calenderName;
	}

	public void setCalenderName(String calenderName) {
		this.calenderName = calenderName;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public int getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getServerIp() {
		return this.serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}