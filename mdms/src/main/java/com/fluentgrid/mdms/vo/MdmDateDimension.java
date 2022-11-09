package com.fluentgrid.mdms.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "MDM_DATE_DIMENSION", schema = "MDMS")
@Where(clause = "record_status=true")
public class MdmDateDimension {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "ID", unique = true, nullable = false, length = 50)
	private String id;

	@Column(name = "DATE_VALUE")
	private Date dateValue;

	@Column(name = "DAY")
	private String day;

	@Column(name = "DAY_OF_WEEK")
	private Integer dayOfWeek;

	@Column(name = "DAY_OF_MONTH")
	private Integer dayOfMonth;

	@Column(name = "DAY_OF_YEAR")
	private Integer dayOfYear;

	@Column(name = "PREVIOUS_DAY")
	private Date previousDay;

	@Column(name = "NEXT_DAY")
	private Date nextDay;

	@Column(name = "WEEK_OF_YEAR")
	private Integer weekOfYear;

	@Column(name = "MONTH")
	private String month;

	@Column(name = "MONTH_OF_YEAR")
	private Integer monthOfYear;

	@Column(name = "QUARTER_OF_YEAR")
	private Integer quarterOfYear;

	@Column(name = "YEAR")
	private Integer year;

	@Column(name = "FISCAL_PERIOD")
	private String fiscalPeriod;
	
	@Column(name = "SEASON")
	private String season;

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

	public MdmDateDimension() {

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDateValue() {
		return dateValue;
	}

	public void setDateValue(Date dateValue) {
		this.dateValue = dateValue;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public Integer getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(Integer dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public Integer getDayOfMonth() {
		return dayOfMonth;
	}

	public void setDayOfMonth(Integer dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}

	public Integer getDayOfYear() {
		return dayOfYear;
	}

	public void setDayOfYear(Integer dayOfYear) {
		this.dayOfYear = dayOfYear;
	}

	public Date getPreviousDay() {
		return previousDay;
	}

	public void setPreviousDay(Date previousDay) {
		this.previousDay = previousDay;
	}

	public Date getNextDay() {
		return nextDay;
	}

	public void setNextDay(Date nextDay) {
		this.nextDay = nextDay;
	}

	public Integer getWeekOfYear() {
		return weekOfYear;
	}

	public void setWeekOfYear(Integer weekOfYear) {
		this.weekOfYear = weekOfYear;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public Integer getMonthOfYear() {
		return monthOfYear;
	}

	public void setMonthOfYear(Integer monthOfYear) {
		this.monthOfYear = monthOfYear;
	}

	public Integer getQuarterOfYear() {
		return quarterOfYear;
	}

	public void setQuarterOfYear(Integer quarterOfYear) {
		this.quarterOfYear = quarterOfYear;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getFiscalPeriod() {
		return fiscalPeriod;
	}

	public void setFiscalPeriod(String fiscalPeriod) {
		this.fiscalPeriod = fiscalPeriod;
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

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

}
