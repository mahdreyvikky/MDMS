package com.fluentgrid.mdms.vo;

import java.math.BigDecimal;
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
@Table(name="CONSUMER_NETWORK_MAPPING",schema="CDB")
@Where(clause="record_status=true")
public class ConsumerNetworkMapping {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
		
	@Column(name="CONSUMER_ID")
	private String consumerId;
	
	@Column(name="NETWORK_ID")
	private String networkId;
		
	@Column(name="MTR_NUMBER")
	private String mtrNumber;
	
	@Column(name="MTR_MAKE")
	private String mtrMake;
	
	@Column(name="CAT_ID")
	private String catId;
	
	@Column(name="SUPPLY_RELEASE_DATE")
	private Date supplyReleaseDate;
	
	@Column(name="CONS_CONNECTED_LOAD")
	private BigDecimal consConnectedLoad;
	
	@Column(name="CONS_LOAD_UNIT")
	private String consLoadUnit;
	
	@Column(name="RECORD_STATUS", nullable=false)
	private int recordStatus=1;
	
	@Column(name="CREATED_BY", length=50)
	private String createdBy;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE", nullable=false)
	private Date createDate;
	
	@Column(name="UPDATE_BY", length=50)
	private String updatedBy;
	
	@Column(name="UPDATE_DATE")
	private Date updateDate;
	
	@Column(name="SERVER_IP", nullable=false, length=50)
	private String serverIp="127.0.0.1";
	
	@Column(name="CONS_TYPE")
	private String consType;
	
	@Column(name="DISCONNTION_APPLICABLE", nullable=false)
	private int disconntionApplicable=1;
	
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;
	
	@Column(name="CONS_LATITUDE")
	private String consLatitue;
	
	@Column(name="CONS_LONGITUDE")
	private String consLongitude;
	
	@Column(name="CONSUMERSTATUS")
	private String consumerStatus;
	
	@Column(name="PARENT_ID")
	private String parentId;
	
	@Column(name="ROUTE_ID")
	private String routeId;
	
	@Column(name="BILL_SCHEDULE")
	private String billSchedule;	
	
	@Column(name="BILL_CYCLE")
	private String billCycle;	
	
	@Column(name="CONS_BILL_GRP")
	private String consBillGrp;
	
	public ConsumerNetworkMapping() {
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	public String getNetworkId() {
		return networkId;
	}

	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}

	public String getMtrNumber() {
		return mtrNumber;
	}

	public void setMtrNumber(String mtrNumber) {
		this.mtrNumber = mtrNumber;
	}

	public String getMtrMake() {
		return mtrMake;
	}

	public void setMtrMake(String mtrMake) {
		this.mtrMake = mtrMake;
	}

	public String getCatId() {
		return catId;
	}

	public void setCatId(String catId) {
		this.catId = catId;
	}

	public Date getSupplyReleaseDate() {
		return supplyReleaseDate;
	}

	public void setSupplyReleaseDate(Date supplyReleaseDate) {
		this.supplyReleaseDate = supplyReleaseDate;
	}

	public BigDecimal getConsConnectedLoad() {
		return consConnectedLoad;
	}

	public void setConsConnectedLoad(BigDecimal consConnectedLoad) {
		this.consConnectedLoad = consConnectedLoad;
	}

	public String getConsLoadUnit() {
		return consLoadUnit;
	}

	public void setConsLoadUnit(String consLoadUnit) {
		this.consLoadUnit = consLoadUnit;
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

	public String getConsType() {
		return consType;
	}

	public void setConsType(String consType) {
		this.consType = consType;
	}

	public int getDisconntionApplicable() {
		return disconntionApplicable;
	}

	public void setDisconntionApplicable(int disconntionApplicable) {
		this.disconntionApplicable = disconntionApplicable;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getConsLatitue() {
		return consLatitue;
	}

	public void setConsLatitue(String consLatitue) {
		this.consLatitue = consLatitue;
	}

	public String getConsLongitude() {
		return consLongitude;
	}

	public void setConsLongitude(String consLongitude) {
		this.consLongitude = consLongitude;
	}

	public String getConsumerStatus() {
		return consumerStatus;
	}

	public void setConsumerStatus(String consumerStatus) {
		this.consumerStatus = consumerStatus;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getBillSchedule() {
		return billSchedule;
	}

	public void setBillSchedule(String billSchedule) {
		this.billSchedule = billSchedule;
	}

	public String getBillCycle() {
		return billCycle;
	}

	public void setBillCycle(String billCycle) {
		this.billCycle = billCycle;
	}

	public String getConsBillGrp() {
		return consBillGrp;
	}

	public void setConsBillGrp(String consBillGrp) {
		this.consBillGrp = consBillGrp;
	}
	
	
	
}
