package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

import java.sql.Timestamp;


/**
 * The persistent class for the NOTIFICATION_LOG database table.
 * 
 */
@Entity
@Table(name="NOTIFICATION_LOG", schema="MDMS")
@NamedQuery(name="NotificationLog.findAll", query="SELECT n FROM NotificationLog n")
public class NotificationLog implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;

	@Column(name="CREATE_DATE")
	private Timestamp createDate;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="[MESSAGE]")
	private String message;

	@Column(name="NOTIFIED_TO")
	private String notifiedTo;

	@Column(name="NOTIFIED_TYPE")
	private String notifiedType;

	@Column(name="OFFICE_ID")
	private String officeId;

	@Column(name="RECORD_STATUS")
	private boolean recordStatus = true;

	@Column(name="REPORT_TYPE")
	private String reportType;

	@Column(name="SENT_TIME")
	private Timestamp sentTime;

	@Column(name="SENT_TO")
	private String sentTo;

	@Column(name="SERVER_IP")
	private String serverIp;

	@Column(name="UPDATE_BY")
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Timestamp updateDate;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getNotifiedTo() {
		return this.notifiedTo;
	}

	public void setNotifiedTo(String notifiedTo) {
		this.notifiedTo = notifiedTo;
	}

	public String getNotifiedType() {
		return this.notifiedType;
	}

	public void setNotifiedType(String notifiedType) {
		this.notifiedType = notifiedType;
	}

	public String getOfficeId() {
		return this.officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

	public boolean getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(boolean recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getReportType() {
		return this.reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public Timestamp getSentTime() {
		return this.sentTime;
	}

	public void setSentTime(Timestamp sentTime) {
		this.sentTime = sentTime;
	}

	public String getSentTo() {
		return this.sentTo;
	}

	public void setSentTo(String sentTo) {
		this.sentTo = sentTo;
	}

	public String getServerIp() {
		return this.serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
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