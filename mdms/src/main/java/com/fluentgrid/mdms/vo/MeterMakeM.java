package com.fluentgrid.mdms.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

@Entity
@Table(name="METER_MAKE_M",schema="CDB")
@Where(clause="record_status=true")
public class MeterMakeM {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
		
	@Column(name="MAKE")
	private String make;
	
	@Column(name="DESCRIPTION")
	private String description;	
		
	@Column(name="RECORD_STATUS", nullable=false)
	private int recordStatus=1;
	
	@Column(name="CREATED_BY", length=50)
	private String createdBy;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE", nullable=false)
	private Date createDate;
	
	@Column(name="UPDATE_BY", length=50)
	private String updatedBy;
	
	@Column(name="UPDATE_DATE")
	private Date updateDate;
	
	@Column(name="SERVER_IP", nullable=false, length=50)
	private String serverIp="127.0.0.1";
	
	@Column(name="METER_DIGITS")
	private String meterDigits;	
	
	@Column(name="METER_DECIMAL")
	private String meterDecimal;
	
	@Column(name="MTR_MANFACTURE_ID")
	private String mtrManfactureId;
	
	
	public MeterMakeM() {
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getRecordStatus() {
		return recordStatus;
	}


	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public String getUpdatedBy() {
		return updatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	public Date getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}


	public String getServerIp() {
		return serverIp;
	}


	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}


	public String getMeterDigits() {
		return meterDigits;
	}


	public void setMeterDigits(String meterDigits) {
		this.meterDigits = meterDigits;
	}


	public String getMeterDecimal() {
		return meterDecimal;
	}


	public void setMeterDecimal(String meterDecimal) {
		this.meterDecimal = meterDecimal;
	}


	public String getMtrManfactureId() {
		return mtrManfactureId;
	}


	public void setMtrManfactureId(String mtrManfactureId) {
		this.mtrManfactureId = mtrManfactureId;
	}
	


}
