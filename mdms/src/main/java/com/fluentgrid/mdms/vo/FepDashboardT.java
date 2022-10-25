package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;

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
@Table(name="Dashboard_T",schema="MDMS")
@Where(clause = "record_status=1")
public class FepDashboardT implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="id", unique=true, nullable=false, length=50)
	private String id;
	
	@Column(name="Widget_Id")
	private String widgetId;
	
	@Column(name="office_Id")
	private String officeId;
	
	@Column(name="Widget_elems")
	private String widgetElems;
	
	@Column(name="Widget_values")
	private String widgetValues;
	
	@Column(name="attribute_type")
	private String attributeType;
	
	@Column(name="refresh_date")
	private Date refreshDate;
	
	@Column(name="RECORD_STATUS")
	private int recordstatus=1;
	
	@Column(name="CREATED_BY")
	private String createdBy;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE", nullable=false)
	private Date createdDate;
	
	@Column(name="UPDATE_BY")
	private String updatedBy;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="UPDATE_DATE", nullable=false)
	private Date updateDate;
	
	@Column(name="SERVER_IP")
	private String serverIp;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWidgerId() {
		return widgetId;
	}

	public void setWidgerId(String widgetId) {
		this.widgetId = widgetId;
	}

	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

	public String getWidgetElems() {
		return widgetElems;
	}

	public void setWidgetElems(String widgetElems) {
		this.widgetElems = widgetElems;
	}

	public String getWidgetValues() {
		return widgetValues;
	}

	public void setWidgetValues(String widgetValues) {
		this.widgetValues = widgetValues;
	}

	public String getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(String attributeType) {
		this.attributeType = attributeType;
	}

	public Date getRefreshDate() {
		return refreshDate;
	}

	public void setRefreshDate(Date refreshDate) {
		this.refreshDate = refreshDate;
	}

	public int getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(int recordstatus) {
		this.recordstatus = recordstatus;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
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
	
	
}
