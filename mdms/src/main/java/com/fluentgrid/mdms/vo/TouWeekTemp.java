package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

import java.util.Date;


/**
 * The persistent class for the TOU_WEEK_TEMP database table.
 * 
 */
@Entity
@Table(name="TOU_WEEK_TEMP",schema="CDB")
@Where(clause="record_status=1")
public class TouWeekTemp implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;

	@Column(name="METER_ID")
	private String meterId;
	
	@Column(name="WEEK_ID")
	private String weekId;
	
	@Column(name="MON_DAYID")
	private String monDayid;
	
	@Column(name="TUE_DAYID")
	private String tueDayid;
	
	@Column(name="WED_DAYID")
	private String wedDayid;
	
	@Column(name="THU_DAYID")
	private String thuDayid;
	
	@Column(name="FRI_DAYID")
	private String friDayid;
	
	@Column(name="SAT_DAYID")
	private String satDayid;
	
	@Column(name="SUN_DAYID")
	private String sunDayid;
	
	@Column(name="TRANSACTION_ID")
	private String transactionId;
	
	@Column(name="STATUS")
	private String status;
	
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
	
	public TouWeekTemp() {
		
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

	public String getWeekId() {
		return this.weekId;
	}

	public void setWeekId(String weekId) {
		this.weekId = weekId;
	}

	public String getMonDayid() {
		return this.monDayid;
	}

	public void setMonDayid(String monDayid) {
		this.monDayid = monDayid;
	}

	public String getTueDayid() {
		return this.tueDayid;
	}

	public void setTueDayid(String tueDayid) {
		this.tueDayid = tueDayid;
	}

	public String getWedDayid() {
		return this.wedDayid;
	}

	public void setWedDayid(String wedDayid) {
		this.wedDayid = wedDayid;
	}

	public String getThuDayid() {
		return this.thuDayid;
	}

	public void setThuDayid(String thuDayid) {
		this.thuDayid = thuDayid;
	}

	public String getFriDayid() {
		return this.friDayid;
	}

	public void setFriDayid(String friDayid) {
		this.friDayid = friDayid;
	}

	public String getSatDayid() {
		return this.satDayid;
	}

	public void setSatDayid(String satDayid) {
		this.satDayid = satDayid;
	}

	public String getSunDayid() {
		return this.sunDayid;
	}

	public void setSunDayid(String sunDayid) {
		this.sunDayid = sunDayid;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
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