package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name="MDMS_EVENT_NOTIFICATION",schema="MDMS")
@Where(clause="record_status=true")
public class EventNotification implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="EVENT_ID")
	private EventMaster eventMaster;
	
	@Column(name="DESIGNATION_ID")
	private String desigId;
	
	@Column(name="NOTIFICATION_REQUIRED")
	private String notificationRequired;
	
	@Column(name="EMAIL_REQUIRED")
	private String emailRequired;
	
	@Column(name="SMS_REQUIRED")
	private String smsRequired;

	@Column(name="NOTIFICATION_TYPE")
	private String notificationType;
	
	@Column(name="DESCRIPTION")
	private String description;
	
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
	
	@Column(name="MOBILE_NUMBER")
	private String mobileNo;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
	@Column(name="PROVISION_TIME")
	private String provisionTime;
	
	@Column(name="DISPATCH_INTERVAL")
	private String dispatchInterval;
	
	@Column(name="DISPATCH_PATTERN")
	private String dispatchPattern;
	
	@Column(name="ON_SCN_NOTIFY")
	private String onScnNotify;
	
	@Column(name="EVENT_NAME")
	private String eventName;
	
	@Column(name="PARENT_ID")
	private String parentId;
	
	@Column(name="SERVER_IP")
	private String serverIp="127.0.0.1";
	
	@Column(name="RECORD_STATUS" ,nullable=false)
	private int recordStatus=1;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesigId() {
		return desigId;
	}

	public void setDesigId(String desigId) {
		this.desigId = desigId;
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

	public String getSmsRequired() {
		return smsRequired;
	}

	public void setSmsRequired(String smsRequired) {
		this.smsRequired = smsRequired;
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

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getProvisionTime() {
		return provisionTime;
	}

	public void setProvisionTime(String provisionTime) {
		this.provisionTime = provisionTime;
	}

	public String getDispatchInterval() {
		return dispatchInterval;
	}

	public void setDispatchInterval(String dispatchInterval) {
		this.dispatchInterval = dispatchInterval;
	}

	public String getDispatchPattern() {
		return dispatchPattern;
	}

	public void setDispatchPattern(String dispatchPattern) {
		this.dispatchPattern = dispatchPattern;
	}

	public String getOnScnNotify() {
		return onScnNotify;
	}

	public void setOnScnNotify(String onScnNotify) {
		this.onScnNotify = onScnNotify;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
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

	public EventMaster getEventMaster() {
		return eventMaster;
	}

	public void setEventMaster(EventMaster eventMaster) {
		this.eventMaster = eventMaster;
	}
	
	

}
