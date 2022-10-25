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
@Table(name="MDM_TODZONE_M",schema="MDMS")
@Where(clause="record_status=true")
public class TodZone implements Serializable{
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
	
	@Column(name="CODE")
	private String code;
	
	@Column(name="MTRID")
	private String mtrId;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="DESCRIPTION")
	private String description;
	
	@Column(name="FROM_TOD")
	private String fromTod;

	@Column(name="TO_TOD")
	private String toTod;
	
	@Column(name="FORMATE_ID")
	private String fromDateId;
	
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
	private String serverIp;
	
	@Column(name="DB_IP_ADDRESS")
	private String dbIpAddress = "127.0.0.1";
	
	@Column(name="FLAG1")
	private String flag1;
	
	@Column(name="FLAG2")
	private String flag2;
	
	@Column(name="SOURCE_OFFICE_ID")
	private String sourceOfficeId;
	
	@Column(name="TARGET_OFFICE_ID")
	private String targetOfficeId;
	
	@Column(name="SCREEN_ID")
	private String screenId;
	
	@Column(name="SUBMODULE_ID")
	private String subModuleId;
	
	@Column(name="MODULE_ID")
	private String moduleId;
	
	@Column(name="YEAR")
	private String year;
	
	@Column(name="MONTH")
	private String month;
	
	@Column(name="ZONE")
	private String zone;
	
	@Column(name="ZONE_ID")
	private String zoneId;
	
	@Column(name="METER_CATEGORY")
	private String meterCategory;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public String getMtrId() {
		return mtrId;
	}

	public void setMtrId(String mtrId) {
		this.mtrId = mtrId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getFromTod() {
		return fromTod;
	}

	public void setFromTod(String fromTod) {
		this.fromTod = fromTod;
	}

	public String getToTod() {
		return toTod;
	}

	public void setToTod(String toTod) {
		this.toTod = toTod;
	}

	public String getFromDateId() {
		return fromDateId;
	}

	public void setFromDateId(String fromDateId) {
		this.fromDateId = fromDateId;
	}

	public String getDbIpAddress() {
		return dbIpAddress;
	}

	public void setDbIpAddress(String dbIpAddress) {
		this.dbIpAddress = dbIpAddress;
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

	public String getScreenId() {
		return screenId;
	}

	public void setScreenId(String screenId) {
		this.screenId = screenId;
	}

	public String getSubModuleId() {
		return subModuleId;
	}

	public void setSubModuleId(String subModuleId) {
		this.subModuleId = subModuleId;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}
	
	public int getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateDate() {
		return this.updateDate;
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

	public String getMeterCategory() {
		return meterCategory;
	}

	public void setMeterCategory(String meterCategory) {
		this.meterCategory = meterCategory;
	}

}
