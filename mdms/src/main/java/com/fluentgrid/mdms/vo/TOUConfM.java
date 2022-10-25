package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

import java.util.Date;


/**
 * The persistent class for the TOUCONF_M database table.
 * 
 */
@Entity
@Table(name="TOUCONF_M",schema="CDB")
@Where(clause="record_status=1")
public class TOUConfM implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;

	@Column(name="TOU_ZONE")
	private String touZone;
	
	@Column(name="TOD_CODE")
	private String todCode;
	
	@Column(name="DLMS_TOD_CODE")
	private String dlsmTodCode;
	
	@Column(name="EURIDIS_DMD_TOU")
	private String euridisDmdTou;
	
	@Column(name="EURIDIS_ENE_TOU")
	private String euridisEneTou;
	
	@Column(name="EUR_BILL_ENE_TOU")
	private String eurBillEneTou;
	
	@Column(name="EUR_BILL_DMD_TOU")
	private String EurBillDmdTou;
	
	@Column(name="EUR_DAY_PRO_CON_TOU")
	private String eurDayProConTou;
	
	@Column(name="DLMS_ENE_TOU_CODE")
	private String dlmsEneTouCode;
	
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
	
	public TOUConfM() {
		
	}
	
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String gettouZone() {
		return this.touZone;
	}

	public void settouZone(String touZone) {
		this.touZone = touZone;
	}
	
	public String gettodCode() {
		return this.todCode;
	}

	public void settodCode(String todCode) {
		this.todCode = todCode;
	}
	
	public String getdlsmTodCode() {
		return this.dlsmTodCode;
	}

	public void setdlsmTodCode(String dlsmTodCode) {
		this.dlsmTodCode = dlsmTodCode;
	}
	
	public String geteuridisDmdTou() {
		return this.euridisDmdTou;
	}

	public void seteuridisDmdTou(String euridisDmdTou) {
		this.euridisDmdTou = euridisDmdTou;
	}
	
	public String geteuridisEneTou() {
		return this.euridisEneTou;
	}

	public void seteuridisEneTou(String euridisEneTou) {
		this.euridisEneTou = euridisEneTou;
	}
	
	public String geteurBillEneTou() {
		return this.eurBillEneTou;
	}

	public void seteurBillEneTou(String eurBillEneTou) {
		this.eurBillEneTou = eurBillEneTou;
	}
	
	public String getEurBillDmdTou() {
		return this.EurBillDmdTou;
	}

	public void setEurBillDmdTou(String EurBillDmdTou) {
		this.EurBillDmdTou = EurBillDmdTou;
	}
	
	public String geteurDayProConTou() {
		return this.eurDayProConTou;
	}

	public void seteurDayProConTou(String eurDayProConTou) {
		this.eurDayProConTou = eurDayProConTou;
	}
	
	public String getdlmsEneTouCode() {
		return this.dlmsEneTouCode;
	}

	public void setdlmsEneTouCode(String dlmsEneTouCode) {
		this.dlmsEneTouCode = dlmsEneTouCode;
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