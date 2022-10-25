package com.fluentgrid.mdms.vo;

import java.sql.Timestamp;
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

import io.swagger.models.auth.In;

@Entity
@Table(name="MANUAL_ENTRY_TABLE_HIS",schema="MDMS")
@Where(clause="record_status=1")
public class ManualEntryTableHisVO {
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
	
	@Column(name = "VERSION_NUMBER")
	private String versionNumber;
	
	@Column(name = "CONSUMER_NO")
	private String consumerNo;
	
	@Column(name = "MTR_NUMBER")
	private String mtrNumber;
	
	@Column(name = "KWH_IMP_PRST_RDG")
	private Double kwhImpPrstRdg;
	
	@Column(name = "KWH_EXP_PRST_RDG")
	private Double kwhExpPrstRdg;
	
	@Column(name = "STATUS")
	private String status;
	
	@Column(name = "MF")
	private String mf;
	
	@Column(name = "ANOMALIE_STATUS")
	private String anomalieStatus;
	
	@Column(name = "REQ_STATUS")
	private String reqStatus;
	
	@Column(name = "EST_FAIL__ID")
	private String estFailId;
	
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	
	@Column(name = "ACCOUNT_NO")
	private String accountNo;
	
	@Column(name = "OFFICE_ID")
	private String officeId;
	
	@Column(name = "KWHQ1Q4_IMP_INIT_RDG")
	private Double kwhq1q4ImpInitRdg;
	
	@Column(name = "MTR_DIGITS")
	private int mtrDigita;
	
	@Column(name = "PREVRDG_DATE")
	private Date prevrdgDate;
	
	@Column(name = "KVAH_IMP_INIT_RDG")
	private Double kvahImpInitRdg;
	
	@Column(name = "BILL_DATE")
	private Date billDate;
	
	@Column(name = "APPROVED")
	private String approved;
	
	@Column(name = "EDITED")
	private String edited;
	
	@Column(name = "KVAH_IMP_PRST_RDG")
	private Double kvahImpPrstRdg;
	
	@Column(name = "KVAH_EXP_PRST_RDG")
	private String kvahExpPrstRdg;
	
	@Column(name = "NETWORKID")
	private String networkid;
	
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

	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getConsumerNo() {
		return consumerNo;
	}

	public void setConsumerNo(String consumerNo) {
		this.consumerNo = consumerNo;
	}

	public String getMtrNumber() {
		return mtrNumber;
	}

	public void setMtrNumber(String mtrNumber) {
		this.mtrNumber = mtrNumber;
	}

	public Double getKwhImpPrstRdg() {
		return kwhImpPrstRdg;
	}

	public void setKwhImpPrstRdg(Double kwhImpPrstRdg) {
		this.kwhImpPrstRdg = kwhImpPrstRdg;
	}

	public Double getKwhExpPrstRdg() {
		return kwhExpPrstRdg;
	}

	public void setKwhExpPrstRdg(Double kwhExpPrstRdg) {
		this.kwhExpPrstRdg = kwhExpPrstRdg;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMf() {
		return mf;
	}

	public void setMf(String mf) {
		this.mf = mf;
	}

	public String getAnomalieStatus() {
		return anomalieStatus;
	}

	public void setAnomalieStatus(String anomalieStatus) {
		this.anomalieStatus = anomalieStatus;
	}

	public String getReqStatus() {
		return reqStatus;
	}

	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}

	public String getEstFailId() {
		return estFailId;
	}

	public void setEstFailId(String estFailId) {
		this.estFailId = estFailId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOfficeId() {
		return officeId;
	}

	public void setOfficeId(String officeId) {
		this.officeId = officeId;
	}

	public Double getKwhq1q4ImpInitRdg() {
		return kwhq1q4ImpInitRdg;
	}

	public void setKwhq1q4ImpInitRdg(Double kwhq1q4ImpInitRdg) {
		this.kwhq1q4ImpInitRdg = kwhq1q4ImpInitRdg;
	}

	public int getMtrDigita() {
		return mtrDigita;
	}

	public void setMtrDigita(int mtrDigita) {
		this.mtrDigita = mtrDigita;
	}

	public Date getPrevrdgDate() {
		return prevrdgDate;
	}

	public void setPrevrdgDate(Date prevrdgDate) {
		this.prevrdgDate = prevrdgDate;
	}

	public Double getKvahImpInitRdg() {
		return kvahImpInitRdg;
	}

	public void setKvahImpInitRdg(Double kvahImpInitRdg) {
		this.kvahImpInitRdg = kvahImpInitRdg;
	}

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}

	public String getApproved() {
		return approved;
	}

	public void setApproved(String approved) {
		this.approved = approved;
	}

	public String getEdited() {
		return edited;
	}

	public void setEdited(String edited) {
		this.edited = edited;
	}

	public Double getKvahImpPrstRdg() {
		return kvahImpPrstRdg;
	}

	public void setKvahImpPrstRdg(Double kvahImpPrstRdg) {
		this.kvahImpPrstRdg = kvahImpPrstRdg;
	}

	public String getKvahExpPrstRdg() {
		return kvahExpPrstRdg;
	}

	public void setKvahExpPrstRdg(String kvahExpPrstRdg) {
		this.kvahExpPrstRdg = kvahExpPrstRdg;
	}

	public String getNetworkid() {
		return networkid;
	}

	public void setNetworkid(String networkid) {
		this.networkid = networkid;
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
