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
@Table(name = "MDM_DASHBOARD_ADDWIDGET", schema = "MDMS")
public class HomeDashboardConfigVO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")

	@Column(name = "ID", unique = true, nullable = false, length = 50)
	private String id;

	@Column(name = "WIDGET_ID")
	private String widgetId;

	@Column(name = "WIDGET_LABEL")
	private String widgetLabel;

	@Column(name = "WIDGET_URL")
	private String widgetUrl;

	@Column(name = "IS_DEFAULT")
	private String isDefault;

	@Column(name = "PRIORITY", nullable = false)
	private Integer priorty;

	@Column(name = "CREATED_BY", length = 50)
	private String createdBy;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", nullable = false)
	private Date createDate;

	@Column(name = "UPDATE_BY", length = 50)
	private String updateBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_DATE", nullable = false)
	private Date updateDate;

	@Column(name = "SERVER_IP")
	private String serverIp = "127.0.0.1";

	@Column(name = "RECORD_STATUS", nullable = false)
	private int recordStatus;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWidgetId() {
		return widgetId;
	}

	public void setWidgetId(String widgetId) {
		this.widgetId = widgetId;
	}

	public String getWidgetLabel() {
		return widgetLabel;
	}

	public void setWidgetLabel(String widgetLabel) {
		this.widgetLabel = widgetLabel;
	}

	public String getWidgetUrl() {
		return widgetUrl;
	}

	public void setWidgetUrl(String widgetUrl) {
		this.widgetUrl = widgetUrl;
	}

	public String getIsDefault() {
		return isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	public Integer getPriorty() {
		return priorty;
	}

	public void setPriorty(Integer priorty) {
		this.priorty = priorty;
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

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public int getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}

}
