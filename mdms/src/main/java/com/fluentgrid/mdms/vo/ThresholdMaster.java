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
@Where(clause="record_status=true")
public class ThresholdMaster implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
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
	private String notificationRequired;
	
	@Column(name="EMAIL_REQUIRED")
	private String emailRequired;
	
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
	private String serverIp="127.0.0.1";
	
	@Column(name="RECORD_STATUS" ,nullable=false)
	private int recordStatus=1;
	
	@Column(name="SMS_REQUIRED")
	private String smsRequired;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="MOBILE_NUMBER")
	private String mobileNo;
	
	@Column(name="ON_SCN_NOTIFY")
	private String onScnNotify;
	
	@Column(name="NOTIFICATION_TYPE")
	private String notificationType;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="THRESHOLDCODE_ID")
	private String thresholdCodeId;

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

	public String getNotificationRequired() {
		return notificationRequired;
	}

	public void setNotificationRequired(String notificationRequired) {
		this.notificationRequired = notificationRequired;
	}

	public String getEmailRequired() {
		return emailRequired;
	}

	public void setEmailRequired(String emailRequired) {
		this.emailRequired = emailRequired;
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

	public int isRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
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

	public void setDescription(String descreption) {
		this.description = descreption;
	}

	public String getThresholdCodeId() {
		return thresholdCodeId;
	}

	public void setThresholdCodeId(String thresholdCodeId) {
		this.thresholdCodeId = thresholdCodeId;
	}
	
	

}
