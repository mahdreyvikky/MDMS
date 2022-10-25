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
@Table(name="MDM_ALGORITHM_M",schema="MDMS")
@Where(clause="record_status=true")
public class AlgorithmMaster implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
	
	@Column(name="ALGORITHM_NAME")
	private String algorithmName;
	
	@Column(name="ALGORITHM_CODE")
	private String alogorithmCode;
	
	@Column(name="ALGORITHM_TYPE")
	private String algorithmType;
	
	@Column(name="DESCRIPTIONS")
	private String descriptions;
	
	@Column(name="FAILURE_TYPE")
	private Integer failureType;

	@Column(name="PRIORITY")
	private Double priority;
	
	@Column(name="EDIT_REQ")
	private Integer editReq;
	
	@Column(name="NOTIFICATION_REQ")
	private String notificationReq;
	
	@Column(name="EMAIL_REQUIRED")
	private String emailReq;

	@Column(name = "SMS_REQUIRED")
	private String smsRequired;
	
	@Column(name = "ACKWNOLEDGEMENT_REQUIRED")
	private String ackwnoledgementRequired;
	
	@Column(name = "AUDIBLE_REQUIRED")
	private String audibleRequired;
	
	@Column(name = "ON_SCN_NOTIFY")
	private String onScnNotify;
	
	@Column(name = "DISPATCH_PATTERN")
	private String dispatchPattern;
	
	@Column(name = "DISPATCH_INTERVAL")
	private String dispatchInterval;
	
	@Column(name="CREATED_BY", length=50)
	private String createdBy;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE", nullable=false)
	private Date createDate;
	
	@Column(name="UPDATE_BY", length=50)
	private String updateBy;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_DATE" , nullable=false)
	private Date updateDate;
	
	@Column(name="SERVER_IP")
	private String serverIp = "127.0.0.1";
	
	@Column(name="RECORD_STATUS" ,nullable=false)
	private int recordStatus=1;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAlgorithmName() {
		return algorithmName;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}

	public String getAlogorithmCode() {
		return alogorithmCode;
	}

	public void setAlogorithmCode(String alogorithmCode) {
		this.alogorithmCode = alogorithmCode;
	}

	public String getAlgorithmType() {
		return algorithmType;
	}

	public void setAlgorithmType(String algorithmType) {
		this.algorithmType = algorithmType;
	}

	public String getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}

	public Integer getFailureType() {
		return failureType;
	}

	public void setFailureType(Integer failureType) {
		this.failureType = failureType;
	}

	public Double getPriority() {
		return priority;
	}

	public void setPriority(Double priority) {
		this.priority = priority;
	}

	public Integer getEditReq() {
		return editReq;
	}

	public void setEditReq(Integer editReq) {
		this.editReq = editReq;
	}

	public String getNotificationReq() {
		return notificationReq;
	}

	public void setNotificationReq(String notificationReq) {
		this.notificationReq = notificationReq;
	}

	public String getEmailReq() {
		return emailReq;
	}

	public void setEmailReq(String emailReq) {
		this.emailReq = emailReq;
	}

	public String getSmsRequired() {
		return smsRequired;
	}

	public void setSmsRequired(String smsRequired) {
		this.smsRequired = smsRequired;
	}

	public String getAckwnoledgementRequired() {
		return ackwnoledgementRequired;
	}

	public void setAckwnoledgementRequired(String ackwnoledgementRequired) {
		this.ackwnoledgementRequired = ackwnoledgementRequired;
	}

	public String getAudibleRequired() {
		return audibleRequired;
	}

	public void setAudibleRequired(String audibleRequired) {
		this.audibleRequired = audibleRequired;
	}

	public String getOnScnNotify() {
		return onScnNotify;
	}

	public void setOnScnNotify(String onScnNotify) {
		this.onScnNotify = onScnNotify;
	}

	public String getDispatchPattern() {
		return dispatchPattern;
	}

	public void setDispatchPattern(String dispatchPattern) {
		this.dispatchPattern = dispatchPattern;
	}

	public String getDispatchInterval() {
		return dispatchInterval;
	}

	public void setDispatchInterval(String dispatchInterval) {
		this.dispatchInterval = dispatchInterval;
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
