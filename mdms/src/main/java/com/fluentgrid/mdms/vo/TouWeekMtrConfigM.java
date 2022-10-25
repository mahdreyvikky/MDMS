package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

import java.util.Date;


/**
 * The persistent class for the TOUWEEK_MTR_CONF_M database table.
 * 
 */
@Entity
@Table(name="TOUWEEK_MTR_CONF_M",schema="CDB")
@Where(clause="record_status=1")
public class TouWeekMtrConfigM implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;

	@Column(name="METER_ID")
	private String meterId;
	
	@Column(name="WEEK_ID")
	private String weekId;
	
	@Column(name="MON_DAYID")
	private String monDayid;
	
	@Column(name="TUE_DAYID")
	private String tueDayid;
	
	@Column(name="WED_DAYID")
	private String wedDayid;
	
	@Column(name="THU_DAYID")
	private String thuDayid;
	
	@Column(name="FRI_DAYID")
	private String friDayid;
	
	@Column(name="SAT_DAYID")
	private String satDayid;
	
	@Column(name="SUN_DAYID")
	private String sunDayid;
	
	@Column(name="TRANSACTION_ID")
	private String transactionId;
	
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
	
	public TouWeekMtrConfigM() {
		
	}
	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getmeterId() {
		return this.meterId;
	}

	public void setmeterId(String meterId) {
		this.meterId = meterId;
	}
	
	public String getweekId() {
		return this.weekId;
	}

	public void setweekId(String weekId) {
		this.weekId = weekId;
	}
	
	public String getmonDayid() {
		return this.monDayid;
	}

	public void setmonDayid(String monDayid) {
		this.monDayid = monDayid;
	}
	
	public String gettueDayid() {
		return this.tueDayid;
	}

	public void settueDayid(String tueDayid) {
		this.tueDayid = tueDayid;
	}
	
	public String getwedDayid() {
		return this.wedDayid;
	}

	public void setwedDayid(String wedDayid) {
		this.wedDayid = wedDayid;
	}
	
	public String getthuDayid() {
		return this.thuDayid;
	}

	public void setthuDayid(String thuDayid) {
		this.thuDayid = thuDayid;
	}
	
	public String getfriDayid() {
		return this.friDayid;
	}

	public void setfriDayid(String friDayid) {
		this.friDayid = friDayid;
	}
	
	public String getsatDayid() {
		return this.satDayid;
	}

	public void setsatDayid(String satDayid) {
		this.satDayid = satDayid;
	}
	
	public String getsunDayid() {
		return this.sunDayid;
	}

	public void setsunDayid(String sunDayid) {
		this.sunDayid = sunDayid;
	}
	
	public String gettransactionId() {
		return this.transactionId;
	}

	public void settransactionId(String transactionId) {
		this.transactionId = transactionId;
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
	
	public int getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}

	public String getServerIp() {
		return this.serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
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
}