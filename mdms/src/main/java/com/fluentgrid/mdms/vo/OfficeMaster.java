package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Where;

import java.util.Date;


/**
 * The persistent class for the OFFICE_MASTER database table.
 * 
 */
@Entity
@Table(name="OFFICE_MASTER",schema="CDB")
@Where(clause="record_status=1")
public class OfficeMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE", nullable=false)
	private Date createDate;

	@Column(name="CREATED_BY", nullable=false, length=50)
	private String createdBy;

	@Column(name="OFFICE_CODE", nullable=false, length=50)
	private String officeCode;

	@Column(name="OFFICE_NAME", nullable=false, length=150)
	private String officeName;

	@Column(name="PARENTOFFICE_ID", nullable=false, length=50)
	private String parentofficeId;

	@Column(name="RECORD_STATUS", nullable=false)
	private int recordStatus=1;

	@Column(name="SERVER_IP", nullable=false, length=50)
	private String serverIp="127.0.0.1";

	@Column(name="UPDATE_BY", length=50)
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Date updateDate;

	/*
	 * //bi-directional many-to-one association to ConsumerMaster
	 * 
	 * @OneToMany(mappedBy="officeMaster") private List<ConsumerMaster>
	 * consumerMasters;
	 */

	//bi-directional many-to-one association to OfficeTypeM
	@ManyToOne
	@JoinColumn(name="OFFICETYPE_ID",insertable = false, updatable = false, nullable=false)
	private OfficeTypeM officeTypeM1;

	/*
	 * //bi-directional many-to-one association to OfficeTypeM
	 * 
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="OFFICETYPE_ID", insertable = false, updatable =
	 * false,nullable=false) private OfficeTypeM officeTypeM2;
	 */

	public OfficeMaster() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/*
	 * public Timestamp getCreateDate() { return this.createDate; }
	 * 
	 * public void setCreateDate(Timestamp createDate) { this.createDate =
	 * createDate; }
	 */

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getOfficeCode() {
		return this.officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getOfficeName() {
		return this.officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getParentofficeId() {
		return this.parentofficeId;
	}

	public void setParentofficeId(String parentofficeId) {
		this.parentofficeId = parentofficeId;
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


	/*
	 * public List<ConsumerMaster> getConsumerMasters() { return
	 * this.consumerMasters; }
	 * 
	 * public void setConsumerMasters(List<ConsumerMaster> consumerMasters) {
	 * this.consumerMasters = consumerMasters; }
	 * 
	 * public ConsumerMaster addConsumerMaster(ConsumerMaster consumerMaster) {
	 * getConsumerMasters().add(consumerMaster);
	 * consumerMaster.setOfficeMaster(this);
	 * 
	 * return consumerMaster; }
	 * 
	 * public ConsumerMaster removeConsumerMaster(ConsumerMaster consumerMaster) {
	 * getConsumerMasters().remove(consumerMaster);
	 * consumerMaster.setOfficeMaster(null);
	 * 
	 * return consumerMaster; }
	 */

	public OfficeTypeM getOfficeTypeM1() {
		return this.officeTypeM1;
	}

	public void setOfficeTypeM1(OfficeTypeM officeTypeM1) {
		this.officeTypeM1 = officeTypeM1;
	}

	/*
	 * public OfficeTypeM getOfficeTypeM2() { return this.officeTypeM2; }
	 * 
	 * public void setOfficeTypeM2(OfficeTypeM officeTypeM2) { this.officeTypeM2 =
	 * officeTypeM2; }
	 */
	
	 @PrePersist
	  protected void onCreate() {
		  createDate = new Date();
	  }

	  @PreUpdate
	  protected void onUpdate() {
		  updateDate = new Date();
	  }
	

}