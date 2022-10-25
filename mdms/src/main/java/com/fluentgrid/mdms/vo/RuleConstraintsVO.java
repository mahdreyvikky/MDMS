package com.fluentgrid.mdms.vo;

import java.io.Serializable;
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
@Table(name = "RULE_CONSTRAINTS", schema = "MDMS")
@Where(clause = "record_status=true")
public class RuleConstraintsVO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "ID", unique = true, nullable = false, length = 50)
	private String id;

	@Column(name = "RULE_MASTER_ID")
	private String ruleMasterId;

	@Column(name = "NETWORK_ID")
	private String networkId;

	@Column(name = "OFFICE_ID")
	private String officeId;

	@Column(name = "MTR_NO")
	private String meterNumber;

	@Column(name = "IS_EXCLUSION")
	private String isExclusion;

	@Column(name = "CHECK_TYPE")
	private String checkType;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "VALID_FROM_DATE")
	private Date validFromDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "VALID_TO_DATE")
	private Date validToDate;

	@Column(name = "CREATED_BY", length = 50)
	private String createdBy;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", nullable = false)
	private Date createDate;

	@Column(name = "UPDATE_BY", length = 50)
	private String updateBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATE", nullable = false)
	private Date updateDate;

	@Column(name = "SERVER_IP")
	private String serverIp = "127.0.0.1";

	@Column(name = "RECORD_STATUS", nullable = false)
	private int recordStatus = 1;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRuleMasterId() {
		return ruleMasterId;
	}

	public void setRuleMasterId(String ruleMasterId) {
		this.ruleMasterId = ruleMasterId;
	}

	public String getNetworkId() {
		return networkId;
	}

	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}

	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

	public String getMeterNumber() {
		return meterNumber;
	}

	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}

	public String getIsExclusion() {
		return isExclusion;
	}

	public void setIsExclusion(String isExclusion) {
		this.isExclusion = isExclusion;
	}

	public String getCheckType() {
		return checkType;
	}

	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	public Date getValidFromDate() {
		return validFromDate;
	}

	public void setValidFromDate(Date validFromDate) {
		this.validFromDate = validFromDate;
	}

	public Date getValidToDate() {
		return validToDate;
	}

	public void setValidToDate(Date validToDate) {
		this.validToDate = validToDate;
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

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public int getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}

	
}
