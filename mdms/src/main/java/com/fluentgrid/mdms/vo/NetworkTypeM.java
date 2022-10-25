package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Where;

import java.util.Date;
import java.util.List;

/**
 * The persistent class for the NETWORK_TYPE_M database table.
 * 
 */
@Entity
@Table(name = "NETWORK_TYPE_M")
@Where(clause = "record_status=1")
public class NetworkTypeM implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 50)
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	private String id;

	@Column(name = "CAPCITY_APPLICABLE", nullable = false)
	private boolean capcityApplicable;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATE_DATE", nullable = false)
	private Date createDate;

	@Column(name = "CREATED_BY", nullable = false, length = 50)
	private String createdBy = "1000-101";

	@Column(name = "IP_MTR_REQ", nullable = false)
	private boolean ipMtrReq;

	@NotBlank
	@Column(name = "NETWORK_CODE", nullable = false, length = 20)
	private String networkCode;

	@NotBlank
	@Column(name = "NETWORK_NAME", nullable = false, length = 50)
	private String networkName;

	@Column(name = "NETWORK_TYPE_ID", length = 50)
	private String networkTypeId;

	@Column(name = "OP_MTR_REQ", nullable = false)
	private boolean opMtrReq;

	@Column(name = "PARENT_ID", length = 50)
	private String parentId;

	@Column(name = "RECORD_STATUS", nullable = false)
	private int recordStatus = 1;

	@Column(name = "SERVER_IP", nullable = false, length = 50)
	private String serverIp = "127.0.0.1";

	@Column(name = "UPDATE_BY", length = 50)
	private String updateBy;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;

	// bi-directional many-to-one association to NetworkHierarchy
	@OneToMany(mappedBy = "networkTypeM")
	private List<NetworkHierarchy> networkHierarchies;
	public NetworkTypeM() {
	}
	
	/*
	 * public List<NetworkHierarchy> getNetworkHierarchies() { return
	 * networkHierarchies; }
	 * 
	 * public void setNetworkHierarchies(List<NetworkHierarchy> networkHierarchies)
	 * { this.networkHierarchies = networkHierarchies; }
	 */



	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean getCapcityApplicable() {
		return this.capcityApplicable;
	}

	public void setCapcityApplicable(boolean capcityApplicable) {
		this.capcityApplicable = capcityApplicable;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public boolean getIpMtrReq() {
		return this.ipMtrReq;
	}

	public void setIpMtrReq(boolean ipMtrReq) {
		this.ipMtrReq = ipMtrReq;
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

	public String getNetworkTypeId() {
		return this.networkTypeId;
	}

	public void setNetworkTypeId(String networkTypeId) {
		this.networkTypeId = networkTypeId;
	}

	public boolean getOpMtrReq() {
		return this.opMtrReq;
	}

	public void setOpMtrReq(boolean opMtrReq) {
		this.opMtrReq = opMtrReq;
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

	/*
	 * public Date getCreateDate() { return createDate; }
	 * 
	 * @PrePersist public void setCreateDate() { this.createDate = new Date(); }
	 */

	public int getRecordStatus() {
		return recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
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
	 * public Date getUpdateDate() { return updateDate; }
	 * 
	 * @PreUpdate public void setUpdateDate() { this.updateDate = new Date(); }
	 */

}