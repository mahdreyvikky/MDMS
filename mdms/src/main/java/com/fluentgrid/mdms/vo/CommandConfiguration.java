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

@Entity
@Table(name="MDM_COMMANDS",schema="MDMS")
@Where(clause="record_status=true")
public class CommandConfiguration implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
	
	@Column(name="MDM_COMMAND_NAME")
	private String mdmCommandName;
	
	@Column(name="CMD_SHORT_NAME")
	private String cmdShortName;
	
	@Column(name="MDM_COMMAND_CODE")
	private String mdmCommandCode;
	
	@Column(name="TRANSPARENT")
	private String transparent;
	
	@Column(name="NON_TRANSPARENT")
	private String nonTransparent;

	@Column(name="DLMS_GRP_NAME")
	private String dlmsGrpName;
	
	@Column(name="EURIDIS_GRP_NAME")
	private String euridisGrpName;
	
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
	private String serverIp = "127.0.0.1";
	
	@Column(name="IS_SCHEDULED")
	private String isScheduled;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="FIELD_DEVICE_TYPE")
	private String fieldDeviceType;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="MODULE_TYPE")
	private String moduleType;
	
	@Column(name="PRIORITY")
	private String priority;
	
	@Column(name="CMD_TYPE")
	private String cmdType;
	
	@Column(name="CMD_SEQ")
	private String cmdSeq;
	
	@Column(name="COMMAND_TYPE")
	private String commandType;
	
	@Column(name="CONTENT_TYPE")
	private String contentType;
	
	@Column(name="IS_VISIBILITY")
	private String isVisibility;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMdmCommandName() {
		return mdmCommandName;
	}

	public void setMdmCommandName(String mdmCommandName) {
		this.mdmCommandName = mdmCommandName;
	}

	public String getCmdShortName() {
		return cmdShortName;
	}

	public void setCmdShortName(String cmdShortName) {
		this.cmdShortName = cmdShortName;
	}

	public String getMdmCommandCode() {
		return mdmCommandCode;
	}

	public void setMdmCommandCode(String mdmCommandCode) {
		this.mdmCommandCode = mdmCommandCode;
	}

	public String getTransparent() {
		return transparent;
	}

	public void setTransparent(String transparent) {
		this.transparent = transparent;
	}

	public String getNonTransparent() {
		return nonTransparent;
	}

	public void setNonTransparent(String nonTransparent) {
		this.nonTransparent = nonTransparent;
	}

	public String getDlmsGrpName() {
		return dlmsGrpName;
	}

	public void setDlmsGrpName(String dlmsGrpName) {
		this.dlmsGrpName = dlmsGrpName;
	}

	public String getEuridisGrpName() {
		return euridisGrpName;
	}

	public void setEuridisGrpName(String euridisGrpName) {
		this.euridisGrpName = euridisGrpName;
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

	public String getIsScheduled() {
		return isScheduled;
	}

	public void setIsScheduled(String isScheduled) {
		this.isScheduled = isScheduled;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFieldDeviceType() {
		return fieldDeviceType;
	}

	public void setFieldDeviceType(String fieldDeviceType) {
		this.fieldDeviceType = fieldDeviceType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getModuleType() {
		return moduleType;
	}

	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getCmdType() {
		return cmdType;
	}

	public void setCmdType(String cmdType) {
		this.cmdType = cmdType;
	}

	public String getCmdSeq() {
		return cmdSeq;
	}

	public void setCmdSeq(String cmdSeq) {
		this.cmdSeq = cmdSeq;
	}

	public String getCommandType() {
		return commandType;
	}

	public void setCommandType(String commandType) {
		this.commandType = commandType;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getIsVisibility() {
		return isVisibility;
	}

	public void setIsVisibility(String isVisibility) {
		this.isVisibility = isVisibility;
	}
	
	
	
}
