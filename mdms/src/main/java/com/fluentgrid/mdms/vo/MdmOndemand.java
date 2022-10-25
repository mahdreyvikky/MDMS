package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

/**
 * The persistent class for the MDM_ONDEMAND database table.
 * 
 */
@Entity
@Table(name="MDM_ONDEMAND",schema="MDMS")
@Where(clause = "record_status=1")
public class MdmOndemand implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "ID", unique = true, nullable = false, length = 50)
	private String id;
	
	@Column(name="NETWORK_ID")
	private Integer networkId = 0;
	
	@Column(name="ADMINISTRATIVE_ID", length=250)
	private String administrativeId;
	
	@Column(name="CUSTOMER_ID", length=250)
	private String customerId;
	
	@Column(name="METER_NUMBER", length=250)
	private String meterNumber;
	
	@Column(name="REQUEST_TYPE", length=250)
	private String requestType;
	
	@Column(name="REQUEST_FROM", length=250)
	private String requestFrom;
	
	@Column(name="FROM_DATE")
	private String fromDate;
	
	@Column(name="TO_DATE")
	private String toDate;
	
	@Column(name="REQUEST_TIME")
	private String requestTime;
	
	@Column(name="TRANSACTION_ID", length=250)
	private String transactionId;
	
	@Column(name="USERS_ID", length=250)
	private String userId;
	
	@Column(name="OD_STATUS")
	private Integer odStatus;
	
	@Column(name="RESPONSE_TIME")
	private String responseTime;
	
	@Lob
	@Column(name="RESPONSE_DATA")
	private String responseData;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE", nullable=false)
	private Date createDate;

	@Column(name="CREATED_BY", length=50)
	private String createdBy;
	
	@Column(name="RECORD_STATUS", nullable=false)
	private Integer recordStatus=1;

	@Column(name="SERVER_IP", nullable=false, length=50)
	private String serverIp="127.0.0.1";
	
	@Column(name="UPDATE_BY", length=50)
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Date updateDate;
	
	@Column(name="RESPONSE_CODE", length=100)
	private String responseCode;
	
	@Column(name="REQUEST_STATUS", length=100)
	private String requestStatus;
	
	@Column(name="METER_ID", length=100)
	private String meterId;
	
	@Column(name="DTYPE_PARAM", length=100)
	private String dtypeParam;
	
	@Column(name="REASON", length=100)
	private String reason;
	
	@Column(name="RESPONSE_ID", length=100)
	private String responseId;
	
	@Column(name="COMMUNICATION_MODE")
	private Integer communicationMode = 0;
	
	@Column(name="COMMUNICATION_TYPE")
	private Integer communicationType = 0;
	
	@Column(name="FIELD_DEVICE_ID", length=100)
	private String fieldDeviceId;
	
	@Column(name="FIELD_DEVICE_NUMBER", length=100)
	private String fieldDeviceNumber;
	
	@Column(name="REF_NUMBER", length=100)
	private String refNumber;
	
	@Column(name="MTR_RELAY_RESULT")
	private Integer mtrRelayResult = 0;
	
	@Column(name="MTR_RELAY_STATUS")
	private Integer mtrRelayStatus = 0;
	
	@Column(name="NO_OF_DAYS")
	private Integer noOfDays = 0;
	
	@Column(name="COMMENTS", length=100)
	private String comments;
	
	@Column(name="CONNECTION_STATUS", length=100)
	private String connectionStatus;
	
	@Column(name="REMARKS", length=100)
	private String remarks;
	
	@Column(name="REQ_COMMAND_TYPE", length=100)
	private String reqCommandType;
	
	@Column(name="CONNECTION_TYPE", length=100)
	private String connectionType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getNetworkId() {
		return networkId;
	}

	public void setNetworkId(Integer networkId) {
		this.networkId = networkId;
	}

	public String getAdministrativeId() {
		return administrativeId;
	}

	public void setAdministrativeId(String administrativeId) {
		this.administrativeId = administrativeId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getMeterNumber() {
		return meterNumber;
	}

	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestFrom() {
		return requestFrom;
	}

	public void setRequestFrom(String requestFrom) {
		this.requestFrom = requestFrom;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate2) {
		this.fromDate = fromDate2;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate2) {
		this.toDate = toDate2;
	}

	public String getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(String requestTime) {
		this.requestTime = requestTime;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Integer getOdStatus() {
		return odStatus;
	}

	public void setOdStatus(Integer odStatus) {
		this.odStatus = odStatus;
	}

	public String getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(String responseTime) {
		this.responseTime = responseTime;
	}

	public String getResponseData() {
		return responseData;
	}

	public void setResponseData(String responseData) {
		this.responseData = responseData;
	}

	public Integer getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(Integer recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public String getMeterId() {
		return meterId;
	}

	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

	public String getDtypeParam() {
		return dtypeParam;
	}

	public void setDtypeParam(String dtypeParam) {
		this.dtypeParam = dtypeParam;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getResponseId() {
		return responseId;
	}

	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	public Integer getCommunicationMode() {
		return communicationMode;
	}

	public void setCommunicationMode(Integer communicationMode) {
		this.communicationMode = communicationMode;
	}

	public Integer getCommunicationType() {
		return communicationType;
	}

	public void setCommunicationType(Integer communicationType) {
		this.communicationType = communicationType;
	}

	public String getFieldDeviceId() {
		return fieldDeviceId;
	}

	public void setFieldDeviceId(String fieldDeviceId) {
		this.fieldDeviceId = fieldDeviceId;
	}

	public String getFieldDeviceNumber() {
		return fieldDeviceNumber;
	}

	public void setFieldDeviceNumber(String fieldDeviceNumber) {
		this.fieldDeviceNumber = fieldDeviceNumber;
	}

	public String getRefNumber() {
		return refNumber;
	}

	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}

	public Integer getMtrRelayResult() {
		return mtrRelayResult;
	}

	public void setMtrRelayResult(Integer mtrRelayResult) {
		this.mtrRelayResult = mtrRelayResult;
	}

	public Integer getMtrRelayStatus() {
		return mtrRelayStatus;
	}

	public void setMtrRelayStatus(Integer mtrRelayStatus) {
		this.mtrRelayStatus = mtrRelayStatus;
	}

	public Integer getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(Integer noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getConnectionStatus() {
		return connectionStatus;
	}

	public void setConnectionStatus(String connectionStatus) {
		this.connectionStatus = connectionStatus;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getReqCommandType() {
		return reqCommandType;
	}

	public void setReqCommandType(String reqCommandType) {
		this.reqCommandType = reqCommandType;
	}

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}
	
	

}
