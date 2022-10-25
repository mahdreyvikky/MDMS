package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

import java.util.Date;


/**
 * The persistent class for the TOUDAYZONE_CONFIG_M database table.
 * 
 */
@Entity
@Table(name="TOUDAYZONE_CONFIG_M",schema="CDB")
@Where(clause="record_status=1")
public class TouDayZoneConfigM implements Serializable {
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
	
	@Column(name="TRANSACTION_ID")
	private String transactionId;
	
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
	
	public TouDayZoneConfigM() {
		
	}
	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getmeterId() {
		return this.meterId;
	}

	public void setmeterId(String meterId) {
		this.meterId = meterId;
	}
	
	public String getdayId() {
		return this.dayId;
	}

	public void setdayId(String dayId) {
		this.dayId = dayId;
	}
	
	public String getzoneId() {
		return this.zoneId;
	}

	public void setzoneId(String zoneId) {
		this.zoneId = zoneId;
	}
	
	public String getstartTime() {
		return this.startTime;
	}

	public void setstartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String gettransactionId() {
		return this.transactionId;
	}

	public void settransactionId(String transactionId) {
		this.transactionId = transactionId;
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