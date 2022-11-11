package com.fluentgrid.mdms.vo;

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
@Table(name = "MDM_ALARM_MASTER", schema = "MDMS")
@Where(clause = "record_status=true")
public class AlarmMaster {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "ID", unique = true, nullable = false, length = 50)
	private String id;

	@Column(name = "ALARAM_TYPE")
	private String alarmType;

	@Column(name = "ALARAM_CODE")
	private String alarmCode;

	@Column(name = "ALARAM_NAME")
	private String alarmName;

	@Column(name = "ALARAM_DESCRIPTION")
	private String alarmDescription;

	@Column(name = "NOTIFICATION_REQUIRED")
	private String notificationRequired;

	@Column(name = "EMAIL_REQUIRED")
	private String emailRequired;

	@Column(name = "SMS_REQUIRED")
	private String smsRequired;

	@Column(name = "ACKWNOLEDGEMENT_REQUIRED")
	private String ackwnoledgementRequired;

	@Column(name = "PROVISION_TIME")
	private String provisionTime;

	@Column(name = "AUDIBLE_REQUIRED")
	private String audibleRequired;

	@Column(name = "EMAILDISPATCH_PATTERN")
	private String emaildispatchPattern;

	@Column(name = "EMAILDISPATCH_INTERVAL")
	private String emaildispatchIntervel;

	@Column(name = "ON_SCN_NOTIFY")
	private String onScnNotify;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", nullable = false)
	private Date createDate;

	@Column(name = "CREATED_BY", length = 50)
	private String createdBy;

	@Column(name = "RECORD_STATUS", nullable = false)
	private int recordStatus = 1;

	@Column(name = "SERVER_IP", nullable = false, length = 50)
	private String serverIp = "127.0.0.1";

	@Column(name = "UPDATE_BY", length = 50)
	private String updateBy;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	@Column(name = "EMAIL_ID")
	private String emailId;

	@Column(name = "MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name = "NOTIFICATION_TYPE")
	private String notificationType;

	@Column(name = "SMSDISPATCH_PATTERN")
	private String smsdispatchPattern;

	@Column(name = "SMSDISPATCH_INTERVAL")
	private String smsdispatchIntervel;

	
	// bi-directional many-to-one association to MeterMaster
	@OneToMany(mappedBy = "alarmMaster1")
	@org.hibernate.annotations.ForeignKey(name = "none")
	private java.util.List<AlarmNotification> alarmNotification;

	// bi-directional one-to-many association to AlarmDetails
	@OneToMany(mappedBy = "alarmMaster2")
	@org.hibernate.annotations.ForeignKey(name = "none")
	private java.util.List<AlarmDetails> alarmDetails;

	public AlarmMaster() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAlarmType() {
		return alarmType;
	}

	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
	}

	public String getAlarmCode() {
		return alarmCode;
	}

	public void setAlarmCode(String alarmCode) {
		this.alarmCode = alarmCode;
	}

	public String getAlarmName() {
		return alarmName;
	}

	public void setAlarmName(String alarmName) {
		this.alarmName = alarmName;
	}

	public String getAlarmDescription() {
		return alarmDescription;
	}

	public void setAlarmDescription(String alarmDescription) {
		this.alarmDescription = alarmDescription;
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

	public String getAckwnoledgementRequired() {
		return ackwnoledgementRequired;
	}

	public void setAckwnoledgementRequired(String ackwnoledgementRequired) {
		this.ackwnoledgementRequired = ackwnoledgementRequired;
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

	public String getEmaildispatchPattern() {
		return emaildispatchPattern;
	}

	public void setEmaildispatchPattern(String emaildispatchPattern) {
		this.emaildispatchPattern = emaildispatchPattern;
	}

	public String getEmaildispatchIntervel() {
		return emaildispatchIntervel;
	}

	public void setEmaildispatchIntervel(String emaildispatchIntervel) {
		this.emaildispatchIntervel = emaildispatchIntervel;
	}

	public String getOnScnNotify() {
		return onScnNotify;
	}

	public void setOnScnNotify(String onScnNotify) {
		this.onScnNotify = onScnNotify;
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

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public String getSmsdispatchPattern() {
		return smsdispatchPattern;
	}

	public void setSmsdispatchPattern(String smsdispatchPattern) {
		this.smsdispatchPattern = smsdispatchPattern;
	}

	public String getSmsdispatchIntervel() {
		return smsdispatchIntervel;
	}

	public void setSmsdispatchIntervel(String smsdispatchIntervel) {
		this.smsdispatchIntervel = smsdispatchIntervel;
	}

	public java.util.List<AlarmNotification> getAlarmNotification() {
		return alarmNotification;
	}

	public void setAlarmNotification(java.util.List<AlarmNotification> alarmNotification) {
		this.alarmNotification = alarmNotification;
	}

	public java.util.List<AlarmDetails> getAlarmDetails() {
		return alarmDetails;
	}

	public void setAlarmDetails(java.util.List<AlarmDetails> alarmDetails) {
		this.alarmDetails = alarmDetails;
	}
	
}
