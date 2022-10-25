package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;


import java.util.Date;


/**
 * The persistent class for the NETWORK_HIERARCHY database table.
 * 
 */
@Entity
@Table(name="NETWORK_HIERARCHY")
//@NamedQuery(name="NetworkHierarchy.findAll", query="SELECT n FROM NetworkHierarchy n")
@Where(clause = "record_status=1")
public class NetworkHierarchy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID", unique=true, nullable=false, length=50)
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;

	@Column(name="ADMINISTRATIVE_ID", length=50)
	private String administrativeId;

	@Column(name="CAPACITY", length=20)
	private String capacity;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", nullable = false)
	private Date createDate;

	@Column(name="CREATED_BY", nullable=false)
	private String createdBy = "1000-101";

	@Column(name="IS_ASSIGNED", length=5)
	private String isAssigned;

	@Column(name="NETWORK_CODE", length=50)
	private String networkCode;

	@Column(name="NETWORK_NAME", length=50)
	private String networkName;

	@Column(name="PARENT_ID", nullable=false, length=50)
	private String parentId;

	@Column(name="RECORD_STATUS")
	private int recordStatus = 1;

	@Column(name="SERVER_IP", nullable=false, length=50)
	private String serverIp = "127.0.0.1";

	@Column(name="UPDATE_BY", length=50)
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Date updateDate;

	//bi-directional many-to-one association to NetworkTypeM
	@ManyToOne
	@JoinColumn(name="NETWORK_TYPE_ID", nullable=false)
	private NetworkTypeM networkTypeM;

	public NetworkTypeM getNetworkTypeM() {
		return networkTypeM;
	}

	public void setNetworkTypeM(NetworkTypeM networkTypeM) {
		this.networkTypeM = networkTypeM;
	}

	public NetworkHierarchy() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdministrativeId() {
		return this.administrativeId;
	}

	public void setAdministrativeId(String administrativeId) {
		this.administrativeId = administrativeId;
	}

	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getIsAssigned() {
		return this.isAssigned;
	}

	public void setIsAssigned(String isAssigned) {
		this.isAssigned = isAssigned;
	}

	public String getNetworkCode() {
		return this.networkCode;
	}

	public void setNetworkCode(String networkCode) {
		this.networkCode = networkCode;
	}

	public String getNetworkName() {
		return this.networkName;
	}

	public void setNetworkName(String networkName) {
		this.networkName = networkName;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
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

	@PrePersist
	  protected void onCreate() {
		  createDate = new Date();
	  }

	  @PreUpdate
	  protected void onUpdate() {
		  updateDate = new Date();
	  }
	
	/*
	 * public Date getUpdateDate() { return this.updateDate; }
	 * 
	 * @PreUpdate public void setUpdateDate() { this.updateDate = new Date(); }
	 */
	
	

	/*
	 * public NetworkTypeM getNetworkTypeM() { return this.networkTypeM; }
	 * 
	 * public void setNetworkTypeM(NetworkTypeM networkTypeM) { this.networkTypeM =
	 * networkTypeM; }
	 */

	/*
	 * public Date getCreateDate() { return createDate; }
	 * 
	 * @PrePersist public void setCreateDate() { this.createDate = new Date(); }
	 */


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

	
}