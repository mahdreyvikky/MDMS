package com.fluentgrid.mdms.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Where;


/**
 * The persistent class for the MDM_NETWORK_HIERARCHY database table.
 * 
 */
@Entity
@Table(name="MDM_NETWORK_HIERARCHY",schema = "MDMS")
@Where(clause="record_status=1")
public class MdmNetworkHierarchy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	//@GeneratedValue(generator = "uuid2")
	//@GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	private int id;

	@Column(name="ADMINISTRATIVE_ID")
	private String administrativeId;

	@Column(name="BILLING_FREQ")
	private String billingFreq;

	@Column(name="BILLING_STATUS")
	private String billingStatus;

	@Column(name="CATEGORY_ID")
	private String categoryId;

	@Column(name="CONS_BILL_GRP")
	private String consBillGrp;

	@Column(name="CONS_MAX_DMD")
	private BigDecimal consMaxDmd;

	@Column(name="CONS_TYPE")
	private String consType;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="CREATE_DATE", nullable=false)
	private Date createDate;


	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CT_RATIO_DENOMINATOR")
	private BigDecimal ctRatioDenominator;

	@Column(name="CT_RATIO_NUMERATOR")
	private BigDecimal ctRatioNumerator;

	@Column(name="CUSTOMER_ACCOUNT_NO")
	private String customerAccountNo;

	@Column(name="CUSTOMER_ID")
	private String customerId;

	@Column(name="CUSTOMER_NAME")
	private String customerName;

	@Column(name="DTR")
	private String dtr;

	@Column(name="DTR_NAME")
	private String dtrName;

	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name="ELEMENT_TYPE")
	private String elementType;

	@Column(name="EOB_DATE")
	private String eobDate;

	@Column(name="FDR_CAPACITY")
	private String fdrCapacity;

	@Column(name="FEEDER")
	private String feeder;

	@Column(name="FEEDER_NAME")
	private String feederName;

	@Column(name="KVA_RDG")
	private BigDecimal kvaRdg;

	@Column(name="KVAH_RDG")
	private BigDecimal kvahRdg;

	@Column(name="KWH_RDG")
	private BigDecimal kwhRdg;

	@Column(name="LOAD_UNIT")
	private String loadUnit;

	@Column(name="LP_INTERVAL")
	private int lpInterval;

	@Column(name="MAX_DATE")
	private Date maxDate;

	@Column(name="METER_FLOW")
	private String meterFlow;

	@Column(name="METER_MAKE")
	private String meterMake;

	@Column(name="METER_NUMBER")
	private String meterNumber;

	@Column(name="METER_TYPE")
	private String meterType;

	@Column(name="MF")
	private BigDecimal mf;

	@Column(name="MTR_CAPACITY")
	private String mtrCapacity;

	@Column(name="MTR_DECIMAL")
	private BigDecimal mtrDecimal;

	@Column(name="MTR_DIGITS")
	private String mtrDigits;

	@Column(name="NETWORK_CODE")
	private String networkCode;

	@Column(name="NETWORK_ID")
	private String networkId;

	@Column(name="NETWORK_TYPE")
	private String networkType;

	@Column(name="NEW_COM_ID")
	private String newComId;

	@Column(name="PARENT_ID")
	private Integer parentId;

	@Column(name="PARENT_ID_INT")
	private String parentIdInt;

	@Column(name="PILLAR")
	private String pillar;

	@Column(name="PILLAR_NAME")
	private String pillarName;

	@Column(name="RECORD_STATUS")
	private int recordStatus=1;

	@Column(name="RF")
	private Integer rf;

	@Column(name="SEC_ITEM_NUMBER")
	private String secItemNumber;

	@Column(name="SERVER_IP")
	private String serverIp="127.0.0.1";

	@Column(name="SS_CAPACITY")
	private String ssCapacity;

	@Column(name="SS_NAME")
	private String ssName;

	@Column(name="SUBSTATION")
	private String substation;

	@Column(name="UNIT_ID")
	private String unitId;

	@Column(name="UPDATE_BY")
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Date updateDate;

	@Column(name="VT_RATIO_DENOMINATOR")
	private BigDecimal vtRatioDenominator;

	@Column(name="VT_RATIO_NUMERATOR")
	private BigDecimal vtRatioNumerator;
	
	/*
	//bi-directional one-to-many association to MdmNetworkHierarchy
	@OneToMany(mappedBy="mdmNetworkHierarchy")
	private java.util.List<AlarmDetails> alarmDetails;*/

	public MdmNetworkHierarchy() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdministrativeId() {
		return this.administrativeId;
	}

	public void setAdministrativeId(String administrativeId) {
		this.administrativeId = administrativeId;
	}

	public String getBillingFreq() {
		return this.billingFreq;
	}

	public void setBillingFreq(String billingFreq) {
		this.billingFreq = billingFreq;
	}

	public String getBillingStatus() {
		return this.billingStatus;
	}

	public void setBillingStatus(String billingStatus) {
		this.billingStatus = billingStatus;
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getConsBillGrp() {
		return this.consBillGrp;
	}

	public void setConsBillGrp(String consBillGrp) {
		this.consBillGrp = consBillGrp;
	}

	public BigDecimal getConsMaxDmd() {
		return this.consMaxDmd;
	}

	public void setConsMaxDmd(BigDecimal consMaxDmd) {
		this.consMaxDmd = consMaxDmd;
	}

	public String getConsType() {
		return this.consType;
	}

	public void setConsType(String consType) {
		this.consType = consType;
	}


	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public BigDecimal getCtRatioDenominator() {
		return this.ctRatioDenominator;
	}

	public void setCtRatioDenominator(BigDecimal ctRatioDenominator) {
		this.ctRatioDenominator = ctRatioDenominator;
	}

	public BigDecimal getCtRatioNumerator() {
		return this.ctRatioNumerator;
	}

	public void setCtRatioNumerator(BigDecimal ctRatioNumerator) {
		this.ctRatioNumerator = ctRatioNumerator;
	}

	public String getCustomerAccountNo() {
		return this.customerAccountNo;
	}

	public void setCustomerAccountNo(String customerAccountNo) {
		this.customerAccountNo = customerAccountNo;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDtr() {
		return this.dtr;
	}

	public void setDtr(String dtr) {
		this.dtr = dtr;
	}

	public String getDtrName() {
		return this.dtrName;
	}

	public void setDtrName(String dtrName) {
		this.dtrName = dtrName;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getElementType() {
		return this.elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	

	/**
	 * @return the eobDate
	 */
	public String getEobDate() {
		return eobDate;
	}

	/**
	 * @param eobDate the eobDate to set
	 */
	public void setEobDate(String eobDate) {
		this.eobDate = eobDate;
	}

	public String getFdrCapacity() {
		return this.fdrCapacity;
	}

	public void setFdrCapacity(String fdrCapacity) {
		this.fdrCapacity = fdrCapacity;
	}

	public String getFeeder() {
		return this.feeder;
	}

	public void setFeeder(String feeder) {
		this.feeder = feeder;
	}

	public String getFeederName() {
		return this.feederName;
	}

	public void setFeederName(String feederName) {
		this.feederName = feederName;
	}

	public BigDecimal getKvaRdg() {
		return this.kvaRdg;
	}

	public void setKvaRdg(BigDecimal kvaRdg) {
		this.kvaRdg = kvaRdg;
	}

	public BigDecimal getKvahRdg() {
		return this.kvahRdg;
	}

	public void setKvahRdg(BigDecimal kvahRdg) {
		this.kvahRdg = kvahRdg;
	}

	public BigDecimal getKwhRdg() {
		return this.kwhRdg;
	}

	public void setKwhRdg(BigDecimal kwhRdg) {
		this.kwhRdg = kwhRdg;
	}

	public String getLoadUnit() {
		return this.loadUnit;
	}

	public void setLoadUnit(String loadUnit) {
		this.loadUnit = loadUnit;
	}

	public int getLpInterval() {
		return this.lpInterval;
	}

	public void setLpInterval(int lpInterval) {
		this.lpInterval = lpInterval;
	}

	public Date getMaxDate() {
		return this.maxDate;
	}

	public void setMaxDate(Date maxDate) {
		this.maxDate = maxDate;
	}

	public String getMeterFlow() {
		return this.meterFlow;
	}

	public void setMeterFlow(String meterFlow) {
		this.meterFlow = meterFlow;
	}

	public String getMeterMake() {
		return this.meterMake;
	}

	public void setMeterMake(String meterMake) {
		this.meterMake = meterMake;
	}

	public String getMeterNumber() {
		return this.meterNumber;
	}

	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}

	public String getMeterType() {
		return this.meterType;
	}

	public void setMeterType(String meterType) {
		this.meterType = meterType;
	}

	public BigDecimal getMf() {
		return this.mf;
	}

	public void setMf(BigDecimal mf) {
		this.mf = mf;
	}

	public String getMtrCapacity() {
		return this.mtrCapacity;
	}

	public void setMtrCapacity(String mtrCapacity) {
		this.mtrCapacity = mtrCapacity;
	}

	public BigDecimal getMtrDecimal() {
		return this.mtrDecimal;
	}

	public void setMtrDecimal(BigDecimal mtrDecimal) {
		this.mtrDecimal = mtrDecimal;
	}

	/*
	 * public BigDecimal getMtrDigits() { return this.mtrDigits; }
	 * 
	 * public void setMtrDigits(BigDecimal mtrDigits) { this.mtrDigits = mtrDigits;
	 * }
	 */

	public String getNetworkCode() {
		return this.networkCode;
	}

	public String getMtrDigits() {
		return mtrDigits;
	}

	public void setMtrDigits(String mtrDigits) {
		this.mtrDigits = mtrDigits;
	}

	public void setNetworkCode(String networkCode) {
		this.networkCode = networkCode;
	}

	public String getNetworkId() {
		return this.networkId;
	}

	public void setNetworkId(String networkId) {
		this.networkId = networkId;
	}

	public String getNetworkType() {
		return this.networkType;
	}

	public void setNetworkType(String networkType) {
		this.networkType = networkType;
	}

	public String getNewComId() {
		return this.newComId;
	}

	public void setNewComId(String newComId) {
		this.newComId = newComId;
	}

	
	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getParentIdInt() {
		return this.parentIdInt;
	}

	public void setParentIdInt(String parentIdInt) {
		this.parentIdInt = parentIdInt;
	}

	public String getPillar() {
		return this.pillar;
	}

	public void setPillar(String pillar) {
		this.pillar = pillar;
	}

	public String getPillarName() {
		return this.pillarName;
	}

	public void setPillarName(String pillarName) {
		this.pillarName = pillarName;
	}

	public int getRecordStatus() {
		return this.recordStatus;
	}

	public void setRecordStatus(int recordStatus) {
		this.recordStatus = recordStatus;
	}

	

	/**
	 * @return the rf
	 */
	public Integer getRf() {
		return rf;
	}

	/**
	 * @param rf the rf to set
	 */
	public void setRf(Integer rf) {
		this.rf = rf;
	}

	public String getSecItemNumber() {
		return this.secItemNumber;
	}

	public void setSecItemNumber(String secItemNumber) {
		this.secItemNumber = secItemNumber;
	}

	public String getServerIp() {
		return this.serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public String getSsCapacity() {
		return this.ssCapacity;
	}

	public void setSsCapacity(String ssCapacity) {
		this.ssCapacity = ssCapacity;
	}

	public String getSsName() {
		return this.ssName;
	}

	public void setSsName(String ssName) {
		this.ssName = ssName;
	}

	public String getSubstation() {
		return this.substation;
	}

	public void setSubstation(String substation) {
		this.substation = substation;
	}

	public String getUnitId() {
		return this.unitId;
	}

	public void setUnitId(String unitId) {
		this.unitId = unitId;
	}

	public String getUpdateBy() {
		return this.updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public BigDecimal getVtRatioDenominator() {
		return this.vtRatioDenominator;
	}

	public void setVtRatioDenominator(BigDecimal vtRatioDenominator) {
		this.vtRatioDenominator = vtRatioDenominator;
	}

	public BigDecimal getVtRatioNumerator() {
		return this.vtRatioNumerator;
	}

	public void setVtRatioNumerator(BigDecimal vtRatioNumerator) {
		this.vtRatioNumerator = vtRatioNumerator;
	}
	 @PrePersist
	  protected void onCreate() {
		  createDate = new Date();
	  }

	  @PreUpdate
	  protected void onUpdate() {
		  updateDate = new Date();
	  }	
}