package com.fluentgrid.mdms.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

@Entity
@Table(name="VIRTUAL_METER_MASTER",schema="MDMS")
@Where(clause="record_status=true")
public class VirtualMeterConfig {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
		
	@Column(name="MTR_SR_NO")
	private String mtrSrNo;
	
	@Column(name="MTR_TYPE")
	private String mtrType;
	
	@Column(name="METERING_POINT")
	private String meteringPoint;
	
	@Column(name="CAPACITY")
	private Integer capacity;
	
	@Column(name="NETWORK_CODE")
	private String networkCode;
	
	@Column(name="CONSUMER_NUMBER")
	private String consumerNumber;
	
	@Column(name="NO_OF_POINTS")
	private Integer noOfPoints;
	
	@Column(name="POINT_CAPACITY")
	private Integer pointCapacity;
	
	@Column(name="POWER_ON_DURATION")
	private Integer powerOnDuration;
	
	@Column(name="CONS_TYPE")
	private String consType;
	
	@Column(name="RECORD_STATUS", nullable=false)
	private int recordStatus=1;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE", nullable=false)
	private Date createDate;

	@Column(name="CREATED_BY", length=50)
	private String createdBy;
	
	@Column(name="SERVER_IP", nullable=false, length=50)
	private String serverIp="127.0.0.1";
	
	@Column(name="UPDATE_BY", length=50)
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Date updateDate;
	
	@Column(name="ELEMENT_TYPE")
	private String elementType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMtrSrNo() {
		return mtrSrNo;
	}

	public void setMtrSrNo(String mtrSrNo) {
		this.mtrSrNo = mtrSrNo;
	}

	public String getMtrType() {
		return mtrType;
	}

	public void setMtrType(String mtrType) {
		this.mtrType = mtrType;
	}

	public String getMeteringPoint() {
		return meteringPoint;
	}

	public void setMeteringPoint(String meteringPoint) {
		this.meteringPoint = meteringPoint;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public String getNetworkCode() {
		return networkCode;
	}

	public void setNetworkCode(String networkCode) {
		this.networkCode = networkCode;
	}

	public String getConsumerNumber() {
		return consumerNumber;
	}

	public void setConsumerNumber(String consumerNumber) {
		this.consumerNumber = consumerNumber;
	}

	public Integer getNoOfPoints() {
		return noOfPoints;
	}

	public void setNoOfPoints(Integer noOfPoints) {
		this.noOfPoints = noOfPoints;
	}

	public Integer getPointCapacity() {
		return pointCapacity;
	}

	public void setPointCapacity(Integer pointCapacity) {
		this.pointCapacity = pointCapacity;
	}

	public Integer getPowerOnDuration() {
		return powerOnDuration;
	}

	public void setPowerOnDuration(Integer powerOnDuration) {
		this.powerOnDuration = powerOnDuration;
	}

	public String getConsType() {
		return consType;
	}

	public void setConsType(String consType) {
		this.consType = consType;
	}

	public int getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getElementType() {
		return elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
