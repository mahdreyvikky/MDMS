package com.fluentgrid.mdms.vo;

import java.math.BigInteger;
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
@Table(name = "MDM_ENERGY_DATA", schema = "MDMS")
@Where(clause = "record_status=true")
public class MdmEnergyData {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name = "ID", unique = true, nullable = false, length = 50)
	private String id;

	@Column(name = "ADMINISTRATIVE_ID")
	private String administrativeId;

	@Column(name = "CUSTOMER_ID")
	private String customerId;

	@Column(name = "MTR_NUMBER")
	private String mtrNumber;

	@Column(name = "VERSION_NUMBER")
	private String versionNumber;

	@Column(name = "CATEGORY_ID")
	private String categoryId;

	@Column(name = "D_TYPE")
	private Integer dType;

	@Column(name = "BILL_DATE")
	private BigInteger billDate;

	@Column(name = "TIME_ID")
	private BigInteger timeId;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", nullable = false)
	private Date createDate;

	@Column(name = "CREATED_BY")
	private String createdBy;

	@Column(name = "phase")
	private Integer PHASE;

	@Column(name = "KWH_IMP")
	private Double kwhImp;

	@Column(name = "KWH_EXP")
	private Double kwhExp;

	@Column(name = "KVARH_IMP")
	private Double kvarhImp;

	@Column(name = "KVARH_EXP")
	private Double kvarhExp;

	@Column(name = "KVA_IMP")
	private Double kvaImp;

	@Column(name = "KVA_EXP")
	private Double kvaExp;

	@Column(name = "REACTIVE_ENG_Q1")
	private Double reactiveEngQ1;

	@Column(name = "REACTIVE_ENG_Q2")
	private Double reactiveEngQ2;

	@Column(name = "REACTIVE_ENG_Q3")
	private Double reactiveEngQ3;

	@Column(name = "REACTIVE_ENG_Q4")
	private Double reactiveEngQ4;

	@Column(name = "AVG_PF")
	private Double avgPf;

	@Column(name = "IS_RECORD_EDITED")
	private Integer isRecordEdited;

	@Column(name = "IS_RECORD_ESTIMATED")
	private Integer isRecordEstimated;

	@Column(name = "IS_DIALCYCLE_COMPLETE")
	private Integer isDialcycleComplete;

	@Column(name = "IS_NOLOAD")
	private Integer isNoLoad;

	@Column(name = "IS_OVERLOAD")
	private Integer isOverload;

	@Column(name = "RECORD_STATUS")
	private int recordStatus = 1;

	@Column(name = "SERVER_IP")
	private String serverIp = "127.0.0.1";

	@Column(name = "UPDATE_BY")
	private String updateBy;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	@Column(name = "STATUS")
	private Integer status;

	@Column(name = "NEW_COM_ID")
	private String newComId;

	@Column(name = "REQUEST_TIME")
	private Date requestTime;

	@Column(name = "RESPONSE_TIME")
	private Date responseTime;

	@Column(name = "FILE_NAME")
	private String fileName;

	@Column(name = "SOURCE_TYPE")
	private String sourceType;
	
	@org.hibernate.annotations.ForeignKey(name = "none")
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NETWORK_ID",insertable=false, updatable=false)    
	private MdmNetworkHierarchy mdmNetworkHierarchy;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdministrativeId() {
		return administrativeId;
	}

	public void setAdministrativeId(String administrativeId) {
		this.administrativeId = administrativeId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getMtrNumber() {
		return mtrNumber;
	}

	public void setMtrNumber(String mtrNumber) {
		this.mtrNumber = mtrNumber;
	}

	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public Integer getdType() {
		return dType;
	}

	public void setdType(Integer dType) {
		this.dType = dType;
	}

	public BigInteger getBillDate() {
		return billDate;
	}

	public void setBillDate(BigInteger billDate) {
		this.billDate = billDate;
	}

	public BigInteger getTimeId() {
		return timeId;
	}

	public void setTimeId(BigInteger timeId) {
		this.timeId = timeId;
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

	public Integer getPHASE() {
		return PHASE;
	}

	public void setPHASE(Integer pHASE) {
		PHASE = pHASE;
	}

	public Double getKwhImp() {
		return kwhImp;
	}

	public void setKwhImp(Double kwhImp) {
		this.kwhImp = kwhImp;
	}

	public Double getKwhExp() {
		return kwhExp;
	}

	public void setKwhExp(Double kwhExp) {
		this.kwhExp = kwhExp;
	}

	public Double getKvarhImp() {
		return kvarhImp;
	}

	public void setKvarhImp(Double kvarhImp) {
		this.kvarhImp = kvarhImp;
	}

	public Double getKvarhExp() {
		return kvarhExp;
	}

	public void setKvarhExp(Double kvarhExp) {
		this.kvarhExp = kvarhExp;
	}

	public Double getKvaImp() {
		return kvaImp;
	}

	public void setKvaImp(Double kvaImp) {
		this.kvaImp = kvaImp;
	}

	public Double getKvaExp() {
		return kvaExp;
	}

	public void setKvaExp(Double kvaExp) {
		this.kvaExp = kvaExp;
	}

	public Double getReactiveEngQ1() {
		return reactiveEngQ1;
	}

	public void setReactiveEngQ1(Double reactiveEngQ1) {
		this.reactiveEngQ1 = reactiveEngQ1;
	}

	public Double getReactiveEngQ2() {
		return reactiveEngQ2;
	}

	public void setReactiveEngQ2(Double reactiveEngQ2) {
		this.reactiveEngQ2 = reactiveEngQ2;
	}

	public Double getReactiveEngQ3() {
		return reactiveEngQ3;
	}

	public void setReactiveEngQ3(Double reactiveEngQ3) {
		this.reactiveEngQ3 = reactiveEngQ3;
	}

	public Double getReactiveEngQ4() {
		return reactiveEngQ4;
	}

	public void setReactiveEngQ4(Double reactiveEngQ4) {
		this.reactiveEngQ4 = reactiveEngQ4;
	}

	public Double getAvgPf() {
		return avgPf;
	}

	public void setAvgPf(Double avgPf) {
		this.avgPf = avgPf;
	}

	public Integer getIsRecordEdited() {
		return isRecordEdited;
	}

	public void setIsRecordEdited(Integer isRecordEdited) {
		this.isRecordEdited = isRecordEdited;
	}

	public Integer getIsRecordEstimated() {
		return isRecordEstimated;
	}

	public void setIsRecordEstimated(Integer isRecordEstimated) {
		this.isRecordEstimated = isRecordEstimated;
	}

	public Integer getIsDialcycleComplete() {
		return isDialcycleComplete;
	}

	public void setIsDialcycleComplete(Integer isDialcycleComplete) {
		this.isDialcycleComplete = isDialcycleComplete;
	}

	public Integer getIsNoLoad() {
		return isNoLoad;
	}

	public void setIsNoLoad(Integer isNoLoad) {
		this.isNoLoad = isNoLoad;
	}

	public Integer getIsOverload() {
		return isOverload;
	}

	public void setIsOverload(Integer isOverload) {
		this.isOverload = isOverload;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getNewComId() {
		return newComId;
	}

	public void setNewComId(String newComId) {
		this.newComId = newComId;
	}

	public Date getRequestTime() {
		return requestTime;
	}

	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

	public Date getResponseTime() {
		return responseTime;
	}

	public void setResponseTime(Date responseTime) {
		this.responseTime = responseTime;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	
	

}
