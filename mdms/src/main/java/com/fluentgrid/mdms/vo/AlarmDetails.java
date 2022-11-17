package com.fluentgrid.mdms.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "MDM_ALARM_DETAILS", schema = "MDMS")
@Where(clause = "record_status=true")
public class AlarmDetails {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "ID", unique = true, nullable = false, length = 50)
	private String id;

	@Column(name = "METER_ID")
	private String meterId;

	@Column(name = "OFFICE_ID")
	private String officeId;

	@Column(name = "ALARM_DATE")
	private Date alarmDate;

	@Column(name = "ALARM_INFORMATION")
	private String alarmInformation;

	@Column(name = "ALARM_STATUS")
	private Integer alarmStatus;

	@Column(name = "DISPATCH_STATUS")
	private Integer dispatchStatus;

	@Column(name = "DISPATCH_TYPE")
	private Integer dispatchType;

	@Column(name = "DISPATCH_TIME")
	private Date dispatchTime;

	@Column(name = "RECORD_STATUS", nullable = false)
	private int recordStatus = 1;

	@Column(name = "CREATED_BY", length = 50)
	private String createdBy;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", nullable = false)
	private Date createDate;

	@Column(name = "UPDATE_BY", length = 50)
	private String updatedBy;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	@Column(name = "SERVER_IP", nullable = false, length = 50)
	private String serverIp = "127.0.0.1";

	@Column(name = "ACKNOWLEDGE")
	private Integer acknowledge;

	@Column(name = "COMMENTS")
	private String comments;

	@Column(name = "REQUEST_TIME")
	private Date requestTime;

	@Column(name = "RESPONSE_TIME")
	private Date responseTime;

	@Column(name = "FILE_NAME")
	private String fileName;

	@Column(name = "SOURCE_TYPE")
	private String sourceType;

	@Column(name = "NEW_COM_ID")
	private String newComId;

	@Column(name = "ALARM_ID")
	private String alarmId;

	// bi-directional many-to-one association to AlarmMaster
	@org.hibernate.annotations.ForeignKey(name = "none")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ALARM_ID",insertable=false, updatable=false)
	private AlarmMaster alarmMaster2;

	// @JoinColumn(name = "NETWORK_ID")

	// bi-directional many-to-one association to MdmNetworkHierarchy
	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({@JoinColumn(name="NETWORK_ID", referencedColumnName = "NETWORK_ID", insertable = false, updatable = false)
    }}, foreignKey = @javax.persistence.ForeignKey(name="none",value = ConstraintMode.NO_CONSTRAINT))
	private MdmNetworkHierarchy mdmNetworkHierarchy;*/
	
	@org.hibernate.annotations.ForeignKey(name = "none")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NETWORK_ID",insertable=false, updatable=false)    
	private MdmNetworkHierarchy mdmNetworkHierarchy;

	public AlarmDetails() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMeterId() {
		return meterId;
	}

	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

	public Date getAlarmDate() {
		return alarmDate;
	}

	public void setAlarmDate(Date alarmDate) {
		this.alarmDate = alarmDate;
	}

	public String getAlarmInformation() {
		return alarmInformation;
	}

	public void setAlarmInformation(String alarmInformation) {
		this.alarmInformation = alarmInformation;
	}

	public Integer getAlarmStatus() {
		return alarmStatus;
	}

	public void setAlarmStatus(Integer alarmStatus) {
		this.alarmStatus = alarmStatus;
	}

	public Integer getDispatchStatus() {
		return dispatchStatus;
	}

	public void setDispatchStatus(Integer dispatchStatus) {
		this.dispatchStatus = dispatchStatus;
	}

	public Integer getDispatchType() {
		return dispatchType;
	}

	public void setDispatchType(Integer dispatchType) {
		this.dispatchType = dispatchType;
	}

	public Date getDispatchTime() {
		return dispatchTime;
	}

	public void setDispatchTime(Date dispatchTime) {
		this.dispatchTime = dispatchTime;
	}

	public int getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
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

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
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

	public Integer getAcknowledge() {
		return acknowledge;
	}

	public void setAcknowledge(Integer acknowledge) {
		this.acknowledge = acknowledge;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

	public Date getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getNewComId() {
		return newComId;
	}

	public void setNewComId(String newComId) {
		this.newComId = newComId;
	}

	public String getAlarmId() {
		return alarmId;
	}

	public void setAlarmId(String alarmId) {
		this.alarmId = alarmId;
	}

	public AlarmMaster getAlarmMaster2() {
		return alarmMaster2;
	}

	public void setAlarmMaster2(AlarmMaster alarmMaster2) {
		this.alarmMaster2 = alarmMaster2;
	}

	public MdmNetworkHierarchy getMdmNetworkHierarchy() {
		return mdmNetworkHierarchy;
	}

	public void setMdmNetworkHierarchy(MdmNetworkHierarchy mdmNetworkHierarchy) {
		this.mdmNetworkHierarchy = mdmNetworkHierarchy;
	}
	
	
}
