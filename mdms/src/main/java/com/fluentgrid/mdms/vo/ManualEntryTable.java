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
@Table(name="MANUAL_ENTRY_TABLE",schema="MDMS")
@Where(clause="record_status=1")
public class ManualEntryTable {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
		
	@Column(name="MTR_NUMBER")
	private String mtrNumber;
	
	@Column(name="K_NUMBER")
	private String kNumber;
	
	@Column(name="PREV_READ_DATE")
	private int prevReadDate;
	
	@Column(name="PREV_MAIN_KWH")
	private int prevMainKwh;
	
	@Column(name="PREV_MAIN_KVAH")
	private int prevMainKvah;
	
	@Column(name="PREV_MAIN_KVA")
	private int prevMainKva;
	
	@Column(name="PRES_READ_DATE")
	private int presReadDate;
	
	@Column(name="PRST_MAIN_KWH")
	private int prstMainKwh;
	
	@Column(name="PRST_MAIN_KVAH")
	private int prstMainKvah;
	
	@Column(name="PRST_MAIN_KVA")
	private int prstMainKva;
	
	@Column(name="APPROVED_STATUS")
	private String approvedStatus;
	
	@Column(name="FLAG1")
	private String flag1;
	
	@Column(name="FLAG2")
	private String flag2;
	
	@Column(name="COMMENT")
	private String comment;
	
	@Column(name="PRST_MAIN_KW")
	private int prstMainKw;
	
	@Column(name="PREV_MAIN_KW")
	private int prevMainKw;
	
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

	public String getMtrNumber() {
		return mtrNumber;
	}

	public void setMtrNumber(String mtrNumber) {
		this.mtrNumber = mtrNumber;
	}

	public String getkNumber() {
		return kNumber;
	}

	public void setkNumber(String kNumber) {
		this.kNumber = kNumber;
	}

	public int getPrevReadDate() {
		return prevReadDate;
	}

	public void setPrevReadDate(int prevReadDate) {
		this.prevReadDate = prevReadDate;
	}

	public int getPrevMainKwh() {
		return prevMainKwh;
	}

	public void setPrevMainKwh(int prevMainKwh) {
		this.prevMainKwh = prevMainKwh;
	}

	public int getPrevMainKvah() {
		return prevMainKvah;
	}

	public void setPrevMainKvah(int prevMainKvah) {
		this.prevMainKvah = prevMainKvah;
	}

	public int getPrevMainKva() {
		return prevMainKva;
	}

	public void setPrevMainKva(int prevMainKva) {
		this.prevMainKva = prevMainKva;
	}

	public int getPresReadDate() {
		return presReadDate;
	}

	public void setPresReadDate(int presReadDate) {
		this.presReadDate = presReadDate;
	}

	public int getPrstMainKwh() {
		return prstMainKwh;
	}

	public void setPrstMainKwh(int prstMainKwh) {
		this.prstMainKwh = prstMainKwh;
	}

	public int getPrstMainKvah() {
		return prstMainKvah;
	}

	public void setPrstMainKvah(int prstMainKvah) {
		this.prstMainKvah = prstMainKvah;
	}

	public int getPrstMainKva() {
		return prstMainKva;
	}

	public void setPrstMainKva(int prstMainKva) {
		this.prstMainKva = prstMainKva;
	}

	public String getApprovedStatus() {
		return approvedStatus;
	}

	public void setApprovedStatus(String approvedStatus) {
		this.approvedStatus = approvedStatus;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getPrstMainKw() {
		return prstMainKw;
	}

	public void setPrstMainKw(int prstMainKw) {
		this.prstMainKw = prstMainKw;
	}

	public int getPrevMainKw() {
		return prevMainKw;
	}

	public void setPrevMainKw(int prevMainKw) {
		this.prevMainKw = prevMainKw;
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
