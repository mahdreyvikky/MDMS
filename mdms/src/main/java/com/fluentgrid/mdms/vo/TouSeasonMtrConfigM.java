package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

import java.util.Date;


/**
 * The persistent class for the TOUSEASON_MTR_CONF_M database table.
 * 
 */
@Entity
@Table(name="TOUSEASON_MTR_CONF_M",schema="CDB")
@Where(clause="record_status=1")
public class TouSeasonMtrConfigM implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;

	@Column(name="METER_ID")
	private String meterId;
	
	@Column(name="SEASON_ID")
	private String seasonId;
	
	@Column(name="WEEK_ID")
	private String weekId;
	
	@Column(name="START_TIME")
	private String startTime;
	
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
	
	public TouSeasonMtrConfigM() {
		
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
	
	public String getseasonId() {
		return this.seasonId;
	}

	public void setseasonId(String seasonId) {
		this.seasonId = seasonId;
	}
	
	public String getweekId() {
		return this.weekId;
	}

	public void setweekId(String weekId) {
		this.weekId = weekId;
	}
	
	public String getstartTime() {
		return this.startTime;
	}

	public void setstartTime(String startTime) {
		this.startTime = startTime;
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