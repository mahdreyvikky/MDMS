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
 * The persistent class for the MDM_METER_CONFIGURATION database table.
 * 
 */
@Entity
@Table(name = "MDM_METER_CONFIGURATION", schema = "MDMS")
@Where(clause = "record_status=1")
public class MdmMeterConfiguration implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "ID", unique = true, nullable = false, length = 50)
	private String id;

	@Column(name = "JOB_NAME")
	private String jobName;
	
	@Column(name = "GROUP_NAME")
	private String groupName;

	@Column(name = "STATUS")
	private int status;

	@Column(name = "REQUEST_TYPE")
	private String requestType;

	@Column(name = "JOB_CREATETIME")
	private Date jobCreatetime;

	@Column(name = "JOB_UPDATETIME")
	private Date jobUpdatetime;

	@Column(name = "TOTAL_PROCESS_DEVICES")
	private int totalProcessDevices;

	@Column(name = "TOTAL_SUCESSFUL_DEVICES")
	private int totalSucessfulDevices;

	@Column(name = "TOTAL_FAILURE_DEVICES")
	private int totalFailureDevices;

	@Column(name = "TYPE")
	private String type;

	@Column(name = "CAPTURE_PERIOD")
	private String capturePeriod;

	@Column(name = "PROFILE_TYPE")
	private String profileType;

	@Column(name = "CONFIG_COMMANDS")
	private String configCommands;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "BILLING_DATE")
	private Date billingDate;

	@Column(name = "RESPONSE")
	private String response;

	@Column(name = "REFNUMBER")
	private String refnumber;
	
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public Date getJobCreatetime() {
		return jobCreatetime;
	}

	public void setJobCreatetime(Date jobCreatetime) {
		this.jobCreatetime = jobCreatetime;
	}

	public Date getJobUpdatetime() {
		return jobUpdatetime;
	}

	public void setJobUpdatetime(Date jobUpdatetime) {
		this.jobUpdatetime = jobUpdatetime;
	}

	public int getTotalProcessDevices() {
		return totalProcessDevices;
	}

	public void setTotalProcessDevices(int totalProcessDevices) {
		this.totalProcessDevices = totalProcessDevices;
	}

	public int getTotalSucessfulDevices() {
		return totalSucessfulDevices;
	}

	public void setTotalSucessfulDevices(int totalSucessfulDevices) {
		this.totalSucessfulDevices = totalSucessfulDevices;
	}

	public int getTotalFailureDevices() {
		return totalFailureDevices;
	}

	public void setTotalFailureDevices(int totalFailureDevices) {
		this.totalFailureDevices = totalFailureDevices;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCapturePeriod() {
		return capturePeriod;
	}

	public void setCapturePeriod(String capturePeriod) {
		this.capturePeriod = capturePeriod;
	}

	public String getProfileType() {
		return profileType;
	}

	public void setProfileType(String profileType) {
		this.profileType = profileType;
	}

	public String getConfigCommands() {
		return configCommands;
	}

	public void setConfigCommands(String configCommands) {
		this.configCommands = configCommands;
	}

	public Date getBillingDate() {
		return billingDate;
	}

	public void setBillingDate(Date billingDate) {
		this.billingDate = billingDate;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public String getRefnumber() {
		return refnumber;
	}

	public void setRefnumber(String refnumber) {
		this.refnumber = refnumber;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
