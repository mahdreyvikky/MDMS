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
@Table(name = "MDM_PREPAID_WALLET", schema = "MDMS")
@Where(clause = "record_status=true")
public class BalanceUpdate {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "ID", unique = true, nullable = false, length = 50)
	private String id;
	
	@Column(name="CONSUMER_ID")
	private String consumerId;
	
	@Column(name="METER_NUMBER")
	private String meterNumber;
	
	@Column(name="ATTRIBUTE_NAME")
	private String attributeName;
	
	@Column(name="ATTRIBUTE_VALUE")
	private int attributeValue;
	
	@Column(name="TRANSACTION_TIME")
	private String transactionTime;
	
	@Column(name="REMARKS")
	private String remarks;
	
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public int getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(int attributeValue) {
		this.attributeValue = attributeValue;
	}

	public String getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	public String getMeterNumber() {
		return meterNumber;
	}

	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public int getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
