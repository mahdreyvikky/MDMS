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


/**
* The persistent class for the MDM_SERVICE_ORDER database table.
* 
*/
@Entity
@Table(name="MDM_SERVICE_ORDER",schema="MDMS")
@Where(clause="record_status=1")
public class MdmServiceOrder implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
	
	@Column(name="SUBJECT")
	private String subject;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="SITE_REMARKS")
	private String siteRemarks;
	
	@Column(name="COMPLAINT_CREATION_DATE")
	private Date complaintCreationDate;
	
	@Column(name="RESOLUTION_DATE_TIME")
	private Date resolutionDateTime;

	@Column(name="COMPLAINT_STATUS")
	private String complaintStatus;
	
	@Column(name="REQUESTER_MAIL")
	private String requesterMail;
	
	@Column(name="CC_MAIL")
	private String ccMail;
	
	@Column(name="IMPACT")
	private String impact;
	
	@Column(name="PRIORITY")
	private String priority;
	
	@Column(name="COMPLAINT_ID")
	private String complaintId;
	
	@Column(name="FEEDBACK")
	private String feedback;
	
	@Column(name="COMPLAINT_CATEGORY")
	private String complaintCategory;
	
	@Column(name="COMPLAINT_SUB_CATEGORY")
	private String complaintSubCategory;
	
	@Column(name="REQUESTER_NAME")
	private String requesterName;
	
	@Column(name="METER_NUMBER")
	private String meterNumber;
	
	@Column(name="CONSUMER_NUMBER")
	private String consumerNumber;
	
	@Column(name="REASON_FOR_DEFECT")
	private String reasonForDefect;
	
	@Column(name="COMPLAINT_TYPE")
	private String complaintType;
	
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSiteRemarks() {
		return siteRemarks;
	}

	public void setSiteRemarks(String siteRemarks) {
		this.siteRemarks = siteRemarks;
	}

	public Date getComplaintCreationDate() {
		return complaintCreationDate;
	}

	public void setComplaintCreationDate(Date complaintCreationDate) {
		this.complaintCreationDate = complaintCreationDate;
	}

	public Date getResolutionDateTime() {
		return resolutionDateTime;
	}

	public void setResolutionDateTime(Date resolutionDateTime) {
		this.resolutionDateTime = resolutionDateTime;
	}

	public String getComplaintStatus() {
		return complaintStatus;
	}

	public void setComplaintStatus(String complaintStatus) {
		this.complaintStatus = complaintStatus;
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

	public String getComplaintId() {
		return complaintId;
	}

	public void setComplaintId(String complaintId) {
		this.complaintId = complaintId;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getComplaintCategory() {
		return complaintCategory;
	}

	public void setComplaintCategory(String complaintCategory) {
		this.complaintCategory = complaintCategory;
	}

	public String getComplaintSubCategory() {
		return complaintSubCategory;
	}

	public void setComplaintSubCategory(String complaintSubCategory) {
		this.complaintSubCategory = complaintSubCategory;
	}

	public String getRequesterName() {
		return requesterName;
	}

	public void setRequesterName(String requesterName) {
		this.requesterName = requesterName;
	}

	public String getMeterNumber() {
		return meterNumber;
	}

	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}

	public String getConsumerNumber() {
		return consumerNumber;
	}

	public void setConsumerNumber(String consumerNumber) {
		this.consumerNumber = consumerNumber;
	}

	public String getReasonForDefect() {
		return reasonForDefect;
	}

	public void setReasonForDefect(String reasonForDefect) {
		this.reasonForDefect = reasonForDefect;
	}

	public String getComplaintType() {
		return complaintType;
	}

	public void setComplaintType(String complaintType) {
		this.complaintType = complaintType;
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
