package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the OFFICE_TYPE_M database table.
 * 
 */
@Entity
@Table(name="OFFICE_TYPE_M",schema="CDB")
//@NamedQuery(name="OfficeTypeM.findAll", query="SELECT o FROM OfficeTypeM o")
@Where(clause="record_status=1")
public class OfficeTypeM implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=50)
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE", nullable=false)
	private Date createDate;

	@Column(name="CREATED_BY", nullable=false, length=50)
	private String createdBy;

	/*
	 * @Column(name="IS_NETWORK_EXITS") private boolean isNetworkExits;
	 */
	@Column(name="NETWORK_TYPE_ID", length=50)
	private String networkTypeId;

	
	@Column(name="OFF_CODE", length=20)
	private String offCode;

	@Column(name="OFFICE_TYPE", nullable=false, length=50)
	private String officeType;

	@Column(name="PARENTTYPE_ID", nullable=false, length=50)
	private String parenttypeId;

	@Column(name="RECORD_STATUS", nullable=false)
	private int recordStatus=1;

	@Column(name="SERVER_IP", nullable=false, length=50)
	private String serverIp="127.0.0.1";

	@Column(name="UPDATE_BY", length=50)
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Date updateDate;

	//bi-directional many-to-one association to OfficeMaster
	@OneToMany(mappedBy="officeTypeM1")
	private List<OfficeMaster> officeMasters1;

	/*
	 * //bi-directional many-to-one association to OfficeMaster
	 * 
	 * @OneToMany(mappedBy="officeTypeM2") private List<OfficeMaster>
	 * officeMasters2;
	 */

	public OfficeTypeM() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	/*
	 * public boolean getIsNetworkExits() { return this.isNetworkExits; }
	 * 
	 * public void setIsNetworkExits(boolean isNetworkExits) { this.isNetworkExits =
	 * isNetworkExits; }
	 */

	public String getNetworkTypeId() {
		return this.networkTypeId;
	}

	public void setNetworkTypeId(String networkTypeId) {
		this.networkTypeId = networkTypeId;
	}

	public String getOffCode() {
		return this.offCode;
	}

	public void setOffCode(String offCode) {
		this.offCode = offCode;
	}

	public String getOfficeType() {
		return this.officeType;
	}

	public void setOfficeType(String officeType) {
		this.officeType = officeType;
	}

	public String getParenttypeId() {
		return this.parenttypeId;
	}

	public void setParenttypeId(String parenttypeId) {
		this.parenttypeId = parenttypeId;
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
	 * public List<OfficeMaster> getOfficeMasters1() { return this.officeMasters1; }
	 * 
	 * public void setOfficeMasters1(List<OfficeMaster> officeMasters1) {
	 * this.officeMasters1 = officeMasters1; }
	 * 
	 * public OfficeMaster addOfficeMasters1(OfficeMaster officeMasters1) {
	 * getOfficeMasters1().add(officeMasters1);
	 * officeMasters1.setOfficeTypeM1(this);
	 * 
	 * return officeMasters1; }
	 * 
	 * public OfficeMaster removeOfficeMasters1(OfficeMaster officeMasters1) {
	 * getOfficeMasters1().remove(officeMasters1);
	 * officeMasters1.setOfficeTypeM1(null);
	 * 
	 * return officeMasters1; }
	 */

	/*
	 * public List<OfficeMaster> getOfficeMasters2() { return this.officeMasters2; }
	 * 
	 * public void setOfficeMasters2(List<OfficeMaster> officeMasters2) {
	 * this.officeMasters2 = officeMasters2; }
	 */

	/*
	 * public OfficeMaster addOfficeMasters2(OfficeMaster officeMasters2) {
	 * getOfficeMasters2().add(officeMasters2);
	 * officeMasters2.setOfficeTypeM2(this);
	 * 
	 * return officeMasters2; }
	 * 
	 * public OfficeMaster removeOfficeMasters2(OfficeMaster officeMasters2) {
	 * getOfficeMasters2().remove(officeMasters2);
	 * officeMasters2.setOfficeTypeM2(null);
	 * 
	 * return officeMasters2; }
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