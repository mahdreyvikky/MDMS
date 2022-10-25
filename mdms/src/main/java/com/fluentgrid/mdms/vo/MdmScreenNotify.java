package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;


/**
 * The persistent class for the MDM_SCREEN_NOTIFY database table.
 * 
 */
@Entity
@Table(name="MDM_SCREEN_NOTIFY", schema="MDMS")
@NamedQuery(name="MdmScreenNotify.findAll", query="SELECT m FROM MdmScreenNotify m")
public class MdmScreenNotify implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="Id", unique=true, nullable=false, length=50)
	private String id;

	@Column(name="ALERT_MAIL")
	private String alertMail;

	@Column(name="ALERT_SMS")
	private String alertSms;

	@Column(name="CREATE_DATE")
	private Timestamp createDate;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="ESCALTE_TO")
	private String escalteTo;

	@Column(name="ISREAD")
	private short isread;

	@Column(name="METER_NUMBER")
	private String meterNumber;

	@Column(name="NOTIFICATION_ID")
	private String notificationId;

	@Column(name="NOTIFICATION_STATUS")
	private String notificationStatus;

	@Column(name="NOTIFY_DATE")
	private Timestamp notifyDate;

	@Column(name="NOTIFY_MSG")
	private String notifyMsg;

	@Column(name="NOTIFY_TO")
	private String notifyTo;

	@Column(name="NOTIFY_TYPE")
	private String notifyType;

	@Column(name="RECORD_STATUS")
	private Boolean recordStatus = true;

	@Column(name="REQUEST_TYPE")
	private Integer requestType;

	@Column(name="SCREEN_STATUS")
	private Boolean screenStatus;

	@Column(name="SERVER_IP")
	private String serverIp;

	@Column(name="TRANSACTION_ID")
	private String transactionId;

	@Column(name="UPDATE_BY")
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Timestamp updateDate;

	public MdmScreenNotify() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAlertMail() {
		return this.alertMail;
	}

	public void setAlertMail(String alertMail) {
		this.alertMail = alertMail;
	}

	public String getAlertSms() {
		return this.alertSms;
	}

	public void setAlertSms(String alertSms) {
		this.alertSms = alertSms;
	}

	public Timestamp getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getEscalteTo() {
		return this.escalteTo;
	}

	public void setEscalteTo(String escalteTo) {
		this.escalteTo = escalteTo;
	}

	public short getIsread() {
		return this.isread;
	}

	public void setIsread(short isread) {
		this.isread = isread;
	}

	public String getMeterNumber() {
		return this.meterNumber;
	}

	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}

	public String getNotificationId() {
		return this.notificationId;
	}

	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}

	public String getNotificationStatus() {
		return this.notificationStatus;
	}

	public void setNotificationStatus(String notificationStatus) {
		this.notificationStatus = notificationStatus;
	}

	public Timestamp getNotifyDate() {
		return this.notifyDate;
	}

	public void setNotifyDate(Timestamp notifyDate) {
		this.notifyDate = notifyDate;
	}

	public String getNotifyMsg() {
		return this.notifyMsg;
	}

	public void setNotifyMsg(String notifyMsg) {
		this.notifyMsg = notifyMsg;
	}

	public String getNotifyTo() {
		return this.notifyTo;
	}

	public void setNotifyTo(String notifyTo) {
		this.notifyTo = notifyTo;
	}

	public String getNotifyType() {
		return this.notifyType;
	}

	public void setNotifyType(String notifyType) {
		this.notifyType = notifyType;
	}

	public Boolean getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(Boolean recordStatus) {
		this.recordStatus = recordStatus;
	}

	public Integer getRequestType() {
		return this.requestType;
	}

	public void setRequestType(Integer requestType) {
		this.requestType = requestType;
	}

	public Boolean getScreenStatus() {
		return this.screenStatus;
	}

	public void setScreenStatus(Boolean screenStatus) {
		this.screenStatus = screenStatus;
	}

	public String getServerIp() {
		return this.serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Timestamp getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

}