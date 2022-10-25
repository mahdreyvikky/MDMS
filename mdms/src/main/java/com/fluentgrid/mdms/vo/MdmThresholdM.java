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
@Table(name="MDM_THRESHOLD_M",schema="MDMS")
@Where(clause="record_status=1")
public class MdmThresholdM implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="Id", unique=true, nullable=false, length=50)
	private String id;
	
	@Column(name="THRESHOLD_NAME")
	private String thresholdName;
	
	@Column(name="THRESHOLD_CODE")
	private String thresholdCode;
	
	@Column(name="THRESHOLD_VALUE")
	private String thresholdValue;
	
	@Column(name="COMMENTS")
	private String comments;
	
	@Column(name="THRESHOLD_TYPE")
	private String thresholdType;
	
	@Column(name="NOTIFICATION_REQ")
	private String notificationReq;
	
	@Column(name="EMAIL_REQUIRED")
	private String emailRequired;
	
	@Column(name="SMS_REQUIRED")
	private String smsRequired;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;
	
	@Column(name="ON_SCN_NOTIFY")
	private String onScnNotify;
	
	@Column(name="NOTIFICATION_TYPE")
	private String notificationType;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="THRESHOLDCODE_ID")
	private String thresholdcodeId;
	
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
	
	public MdmThresholdM() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getThresholdName() {
		return thresholdName;
	}

	public void setThresholdName(String thresholdName) {
		this.thresholdName = thresholdName;
	}

	public String getThresholdCode() {
		return thresholdCode;
	}

	public void setThresholdCode(String thresholdCode) {
		this.thresholdCode = thresholdCode;
	}

	public String getThresholdValue() {
		return thresholdValue;
	}

	public void setThresholdValue(String thresholdValue) {
		this.thresholdValue = thresholdValue;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getThresholdType() {
		return thresholdType;
	}

	public void setThresholdType(String thresholdType) {
		this.thresholdType = thresholdType;
	}

	public String getNotificationReq() {
		return notificationReq;
	}

	public void setNotificationReq(String notificationReq) {
		this.notificationReq = notificationReq;
	}

	public String getEmailRequired() {
		return emailRequired;
	}

	public void setEmailRequired(String emailRequired) {
		this.emailRequired = emailRequired;
	}

	public String getSmsRequired() {
		return smsRequired;
	}

	public void setSmsRequired(String smsRequired) {
		this.smsRequired = smsRequired;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getOnScnNotify() {
		return onScnNotify;
	}

	public void setOnScnNotify(String onScnNotify) {
		this.onScnNotify = onScnNotify;
	}

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getThresholdcodeId() {
		return thresholdcodeId;
	}

	public void setThresholdcodeId(String thresholdcodeId) {
		this.thresholdcodeId = thresholdcodeId;
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
}
