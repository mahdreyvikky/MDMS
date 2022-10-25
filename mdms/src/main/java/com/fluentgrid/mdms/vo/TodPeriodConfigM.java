package com.fluentgrid.mdms.vo;

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
@Table(name="TOD_PERIOD_CONFIG_M",schema="CDB")
@Where(clause="record_status=true")
public class TodPeriodConfigM {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
		
	@Column(name="CATEGORY_NAME")
	private String categoryName;
	
	@Column(name="FROM_PERIOD")
	private String fromPeriod;
	
	@Column(name="TO_PERIOD")
	private String toPeriod;
	
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;
	
	@Column(name="DISPLAY_NAME")
	private String displayName;
	
	@Column(name="TOD_ORDER")
	private Integer todOrder;
	
	@Column(name="TOD_CHG")
	private Integer todCharge;
	
	@Column(name="PERIOD_NAME")
	private String periodName;
	
	@Column(name="SLOTS_COUNT")
	private Integer slotsCount;
	
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

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getFromPeriod() {
		return fromPeriod;
	}

	public void setFromPeriod(String fromPeriod) {
		this.fromPeriod = fromPeriod;
	}

	public String getToPeriod() {
		return toPeriod;
	}

	public void setToPeriod(String toPeriod) {
		this.toPeriod = toPeriod;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public Integer getTodOrder() {
		return todOrder;
	}

	public void setTodOrder(Integer todOrder) {
		this.todOrder = todOrder;
	}

	public Integer getTodCharge() {
		return todCharge;
	}

	public void setTodCharge(Integer todCharge) {
		this.todCharge = todCharge;
	}

	public String getPeriodName() {
		return periodName;
	}

	public void setPeriodName(String periodName) {
		this.periodName = periodName;
	}

	public Integer getSlotsCount() {
		return slotsCount;
	}

	public void setSlotsCount(Integer slotsCount) {
		this.slotsCount = slotsCount;
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
