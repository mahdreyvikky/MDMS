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
@Table(name="REQUEST_TYPE_M",schema="CDB")
@Where(clause="record_status=true")
public class RequestTypeM implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
	
	@Column(name="TYPE")
	private String type;
	
	@Column(name="SOURCE_OFFICE_ID")
	private String sourceOfficeId;
	
	@Column(name="TARGET_OFFICE_ID")
	private String targetOfficeId;
	
	@Column(name="FORM_ID")
	private String formId;
	
	@Column(name="FLAG1")
	private String flag1;
	
	@Column(name="FLAG2")
	private String flag2;
	
	@Column(name="FLAG3")
	private String flag3;
	
	@Column(name="FLAG4")
	private String flag4;
	
	@Column(name="CHECK_CONDITION")
	private String checkCondition;
	
	@Column(name="MODULE_ID")
	private String moduleId;
	
	@Column(name="SUBMODULE_ID")
	private String submoduleID;
	
	@Column(name="IS_MAINTENANCE_REQUIRED")
	private String isMainteanceRequired;
	
	@Column(name="ECALL_SCOPE")
	private String ecallScope;
	
	@Column(name="LEGACY_ID")
	private String legacyId;
	
	@Column(name="SOURCE_TYPE")
	private String sourceType;
	
	@Column(name="SOURCE_DATA")
	private String sourceData;
	
	@Column(name="UPDATE_REMARKS")
	private String updateRemarks;
	
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
	
	@Column(name="UPDATED_BY", length=50)
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Date updateDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSourceOfficeId() {
		return sourceOfficeId;
	}

	public void setSourceOfficeId(String sourceOfficeId) {
		this.sourceOfficeId = sourceOfficeId;
	}

	public String getTargetOfficeId() {
		return targetOfficeId;
	}

	public void setTargetOfficeId(String targetOfficeId) {
		this.targetOfficeId = targetOfficeId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
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

	public String getFlag3() {
		return flag3;
	}

	public void setFlag3(String flag3) {
		this.flag3 = flag3;
	}

	public String getFlag4() {
		return flag4;
	}

	public void setFlag4(String flag4) {
		this.flag4 = flag4;
	}

	public String getCheckCondition() {
		return checkCondition;
	}

	public void setCheckCondition(String checkCondition) {
		this.checkCondition = checkCondition;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getSubmoduleID() {
		return submoduleID;
	}

	public void setSubmoduleID(String submoduleID) {
		this.submoduleID = submoduleID;
	}

	public String getIsMainteanceRequired() {
		return isMainteanceRequired;
	}

	public void setIsMainteanceRequired(String isMainteanceRequired) {
		this.isMainteanceRequired = isMainteanceRequired;
	}

	public String getEcallScope() {
		return ecallScope;
	}

	public void setEcallScope(String ecallScope) {
		this.ecallScope = ecallScope;
	}

	public String getLegacyId() {
		return legacyId;
	}

	public void setLegacyId(String legacyId) {
		this.legacyId = legacyId;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getSourceData() {
		return sourceData;
	}

	public void setSourceData(String sourceData) {
		this.sourceData = sourceData;
	}

	public String getUpdateRemarks() {
		return updateRemarks;
	}

	public void setUpdateRemarks(String updateRemarks) {
		this.updateRemarks = updateRemarks;
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
