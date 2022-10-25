package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

@Entity
@Table(name="MDM_EVENT_MASTER",schema="MDMS")
@Where(clause="record_status=true")
public class EventMaster implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
	
	@Column(name="EVENT_CODE")
	private String eventCode;
	
	@Column(name="EVENT_NAME")
	private String eventName;
	
	@Column(name="EVENT_DESCRIPTION")
	private String eventDesc;
	
	@Column(name="NOTIFICATION_REQ")
	private String notificationRequired;
	
	@Column(name="EMAIL_REQUIRED")
	private String emailRequired;

	@Column(name="SMS_REQUIRED")
	private String smsRequired;
	
	@Column(name="EMAIL_ID")
	private String emailId;
	
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
	
	@Column(name="RECORD_STATUS" ,nullable=false)
	private int recordStatus=1;
	
	@Column(name="SERVER_IP")
	private String serverIp="127.0.0.1";
	
	@Column(name="PARENT_ID")
	private String parentId;
	
	@Column(name="DISPATCH_PATTERN")
	private String dispatchPattern;
	
	@Column(name="MOBILE_NUMBER")
	private String mobileNo;
	
	@Column(name="ESCALATE_TO")
	private String escalateTo;
	
	@Column(name="NOTIFICATION_TYPE")
	private String notificationType;
	
	@Column(name="DISPATCH_INTERVAL")
	private String dispatchInterval;
	
	@Column(name="ON_SCN_NOTIFY")
	private String onScnNotify;
	
	@Column(name="PROVISION_TIME")
	private String provisionTime;
	
	@Column(name="AUDIBLE_REQUIRED")
	private String audibleRequired;
	
	@Column(name="EVEN_TYPE")
	private String evenType;
	
	@Column(name="SHORT_CODE")
	private String shortCode;
	
	@Column(name="OBIS_CODE")
	private String obisCode;
	
	//bi-directional many-to-one association to MeterMaster
	@OneToMany(mappedBy="eventMaster")
	private java.util.List<EventNotification> eventNotification;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEventCode() {
		return eventCode;
	}

	public void setEventCode(String eventCode) {
		this.eventCode = eventCode;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventDesc() {
		return eventDesc;
	}

	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
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

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
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

	public int isRecordStatus() {
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

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getDispatchPattern() {
		return dispatchPattern;
	}

	public void setDispatchPattern(String dispatchPattern) {
		this.dispatchPattern = dispatchPattern;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEscalateTo() {
		return escalateTo;
	}

	public void setEscalateTo(String escalateTo) {
		this.escalateTo = escalateTo;
	}

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public String getDispatchInterval() {
		return dispatchInterval;
	}

	public void setDispatchInterval(String dispatchInterval) {
		this.dispatchInterval = dispatchInterval;
	}

	public String getOnScnNotify() {
		return onScnNotify;
	}

	public void setOnScnNotify(String onScnNotify) {
		this.onScnNotify = onScnNotify;
	}

	public String getProvisionTime() {
		return provisionTime;
	}

	public void setProvisionTime(String provisionTime) {
		this.provisionTime = provisionTime;
	}

	public String getAudibleRequired() {
		return audibleRequired;
	}

	public void setAudibleRequired(String audibleRequired) {
		this.audibleRequired = audibleRequired;
	}

	public String getEvenType() {
		return evenType;
	}

	public void setEvenType(String evenType) {
		this.evenType = evenType;
	}

	public String getShortCode() {
		return shortCode;
	}

	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}

	public String getObisCode() {
		return obisCode;
	}

	public void setObisCode(String obisCode) {
		this.obisCode = obisCode;
	}
	
	

}
