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
@Table(name="MDMS_ALARAM_NOTIFICATION",schema="MDMS")
@Where(clause="record_status=true")
public class AlarmNotification implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ALARM_ID")
	private AlarmMaster alarmMaster;
	
	@Column(name="DESIGNATION_ID")
	private String desigId;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="NOTIFICATION_REQUIRED")
	private String notificationRequired;

	@Column(name="EMAIL_REQUIRED")
	private String emailRequired;
	
	@Column(name="SMS_REQUIRED")
	private String smsRequired;
	
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
	private String serverIp ="127.0.0.1";
	
	@Column(name="NOTIFICATION_TYPE")
	private String notificationType;
	
	@Column(name="FLAG1")
	private String flag1;
	
	@Column(name="FLAG2")
	private String flag2;
	
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
	
	@Column(name="EMAILDISPATCH_PATTERN")
	private String emailDispatchPattern;
	
	@Column(name="EMAILDISPATCH_INTERVAL")
	private String emailDispatchInterval;
	
	@Column(name="SMSDISPATCH_PATTERN")
	private String smsDispatchPattern;
	
	@Column(name="SMSDISPATCH_INTERVAL")
	private String smsDispatchInterval;
	
	@Column(name="RECORD_STATUS" ,nullable=false)
	private int recordStatus=1;
	
	@Column(name="SERVICE_REQUIRED")
	private String serviceRequired;
	
	@Column(name="REQUESTER_MAIL")
	private String requesterMail;
	
	@Column(name="CC_MAIL")
	private String ccMail;
	
	@Column(name="IMPACT")
	private String impact;
	
	@Column(name="PRIORITY")
	private String priority;
	
	@Column(name="REQUEST_ID")
	private String requestId;
	
	@Column(name="RESPONSE_MESSAGE")
	private String responseMsg;
	
	@Column(name="SO_CATEGORY")
	private String soCategory;
	
	@Column(name="SO_SUBCATEGORY")
	private String soSubCategory;
	
	@Column(name="COMBINATION_REQUIRED")
	private String combinationRequired;
	
	@Column(name="COMBINATION_ALARM_ID")
	private String combinationAlarmId;

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

	public AlarmMaster getAlarmMaster() {
		return alarmMaster;
	}

	public void setAlarmMaster(AlarmMaster alarmMaster) {
		this.alarmMaster = alarmMaster;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getNotificationType() {
		return notificationType;
	}

	public void setNotificationType(String notificationType) {
		this.notificationType = notificationType;
	}

	public String getFlag1() {
		return flag1;
	}

	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}

	public String getFlag2() {
		return flag2;
	}

	public void setFlag2(String flag2) {
		this.flag2 = flag2;
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

	public String getEmailDispatchPattern() {
		return emailDispatchPattern;
	}

	public void setEmailDispatchPattern(String emailDispatchPattern) {
		this.emailDispatchPattern = emailDispatchPattern;
	}

	public String getEmailDispatchInterval() {
		return emailDispatchInterval;
	}

	public void setEmailDispatchInterval(String emailDispatchInterval) {
		this.emailDispatchInterval = emailDispatchInterval;
	}

	public String getSmsDispatchPattern() {
		return smsDispatchPattern;
	}

	public void setSmsDispatchPattern(String smsDispatchPattern) {
		this.smsDispatchPattern = smsDispatchPattern;
	}

	public String getSmsDispatchInterval() {
		return smsDispatchInterval;
	}

	public void setSmsDispatchInterval(String smsDispatchInterval) {
		this.smsDispatchInterval = smsDispatchInterval;
	}

	public int isRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getServiceRequired() {
		return serviceRequired;
	}

	public void setServiceRequired(String serviceRequired) {
		this.serviceRequired = serviceRequired;
	}

	public String getRequesterMail() {
		return requesterMail;
	}

	public void setRequesterMail(String requesterMail) {
		this.requesterMail = requesterMail;
	}

	public String getCcMail() {
		return ccMail;
	}

	public void setCcMail(String ccMail) {
		this.ccMail = ccMail;
	}

	public String getImpact() {
		return impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResponseMsg() {
		return responseMsg;
	}

	public void setResponseMsg(String responseMsg) {
		this.responseMsg = responseMsg;
	}

	public String getSoCategory() {
		return soCategory;
	}

	public void setSoCategory(String soCategory) {
		this.soCategory = soCategory;
	}

	public String getSoSubCategory() {
		return soSubCategory;
	}

	public void setSoSubCategory(String soSubCategory) {
		this.soSubCategory = soSubCategory;
	}

	public String getCombinationRequired() {
		return combinationRequired;
	}

	public void setCombinationRequired(String combinationRequired) {
		this.combinationRequired = combinationRequired;
	}

	public String getCombinationAlarmId() {
		return combinationAlarmId;
	}

	public void setCombinationAlarmId(String combinationAlarmId) {
		this.combinationAlarmId = combinationAlarmId;
	}
	
	
	

}
