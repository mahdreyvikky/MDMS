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
@Table(name="meter_master",schema="CDB")
@Where(clause="record_status=true")
public class MeterMaster {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
		
	@Column(name="MTR_NUMBER")
	private String mtrNumber;
	
	@Column(name="MTR_TYPE")
	private String mtrType;
		
	@Column(name="MTR_PHASE")
	private String mtrPhase;
	
	@Column(name="MTR_CAPACITY")
	private String mtrCapacity;
		
	@Column(name="ACTIVE_CONSTANT")
	private Double activeConstant;
	
	@Column(name="REACTIVE_CONSTANT")
	private Double reactiveConstant;
	
	@Column(name="MTR_MAKE")
	private String mtrMake;
	
	@Column(name="KWH_RDG")
	private Double kwhRdg;
	
	@Column(name="KVA_RDG")
	private Double kvaRdg;
	
	@Column(name="KVAH_RDG")
	private Double kvahRdg;
	
	@Column(name="MF")
	private Double mf;
	
	@Column(name="RF")
	private Integer rf;
	
	@Column(name="CT_RATIO_NUMERATOR")
	private Double ctRatioNumerator;
	
	@Column(name="CT_RATIO_DENOMINATOR")
	private Double ctRatioDenominator;
	
	@Column(name="VT_RATIO_NUMERATOR")
	private Double vtRatioNumerator;
	
	@Column(name="VT_RATIO_DENOMINATOR")
	private Double vtRationDenominator;
	
	@Column(name="MTR_SLNO")
	private String mtrSlno;
	
	@Column(name="MTR_SEALDT")
	private Date mtrSealdt;	
	
	@Column(name="MTR_DIGITS")
	private BigInteger mtrDigits;
	
	@Column(name="MTR_DECIMAL")
	private Double mtrDecimal;
	
	@Column(name="TOU_FLAG")
	private String touFlag;
	
	@Column(name="MTR_MFG_YEAR")
	private Date mtrMfgYear;
	
	@Column(name="MTR_ISSUED_DATE")
	private Date mtrIssuedDate;
	
	@Column(name="MTR_INSTALLED_DATE")
	private Date mtrInstalledDate;
	
	@Column(name="HDLC_ADDRESS")
	private String hdlcAddress;
	
	@Column(name="MTR_REGISTRATION_TIME")
	private Date mtrRegristrationTime;
	
	@Column(name="AUTO_BREAKER_AVAILABLE")
	private String autoBreakerAvialable;
	
	@Column(name="BREAKER_ENABLED")
	private String breakerEnabled;
	
	@Column(name="MCB_TYPE")
	private String mcbType;	
	
	@Column(name="GPSLOCATION_ID")
	private String gpslocationId;	
	
	@Column(name="ITEM_NUMBER")
	private String itemNumber;
	
	@Column(name="LOAD_PROFILE_INTERVAL")
	private String loadProfileInterval;
	
	@Column(name="CURRENT_OVERLIMIT_THRESHOLD")
	private String currentOverlimitThreshold;
	
	@Column(name="CURRENT_OVERLIMIT_DURATION")
	private String currentOverlimitDuration;
	
	@Column(name="VOLTAGE_UNDERLIMIT_THRESHOLD")
	private String voltageUnderlimitThreshold;
	
	@Column(name="VOLTAGE_UNDERLIMIT_DURATION")
	private String voltageUnderlimitDuration;
	
	@Column(name="AVG_PF_THRESHOLD")
	private String avgPfThreshold;
	
	@Column(name="MTR_LOCATION")
	private Integer mtrLocation;
	
	@Column(name="RELAY_STATUS")
	private Integer relayStatus;	
	
	@Column(name="INTEGRATION_METHOD")
	private String integrationMethod;
	
	@Column(name="EOB_DATE")
	private Integer eobDate;
	
	@Column(name="PROTOCOL_ID")
	private String protocolId;
	
	@Column(name="MTR_AVAILABLE")
	private String mtrAvilable;
	
	@Column(name="FIELD_MTR_AVAILABLE")
	private String fieldMtrAvialble;
	
	@Column(name="METER_CATEGORY")
	private String meterCategory;
	
	@Column(name="MTR_VOLTAGE")
	private String mtrVoltage;
	
	@Column(name="MTR_FIRMWARE")
	private String mtrFirmware;
	
	@Column(name="VOLT_GROUP")
	private String voltGroup;
	
	@Column(name="MAC_ADDRESS")
	private String macAddress;
	
	@Column(name="IS_NOTIFIED")
	private int IS_NOTIFIED;		
		
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
	
	@Column(name="MTR_INTERFACE")
	private String mtrInterface;
	
	@Column(name="SUBSCRIPTION_NUMBER")
	private String subscriptionNumber;
	
	@Column(name="PATH")
	private String path;
	
	@Column(name="CATEGORY_TYPE")
	private String categoryType;
	
	@Column(name="MTR_ENTRY_TYPE")
	private String mtrEntryType;
	
	@Column(name="MODE_INSERT_TYPE")
	private String modeInsertType;
	
	@Column(name="MTR_MFG_DATE")
	private Date mtrMfgDate;
	
	@Column(name="MTR_SEALNO1")
	private String mtrSealno1;
	
	@Column(name="MTR_SEALNO2")
	private String mtrSealno2;
	
	@Column(name="MTR_SEALNO3")
	private String mtrSealno3;
	
	@Column(name="MTR_SEALNO4")
	private String mtrSealno4;
	
	@Column(name="SEC_ITEM_NUMBER")
	private String secItemNumber;
	
	@Column(name="TERMINAL_SEALNO_1")
	private String terminalSealNo1;
	
	@Column(name="MTR_SEQ1")
	private Integer mtrSeq1;
	
	@Column(name="MR_PWD")
	private String mrPwd;
	
	@Column(name="US_PWD")
	private String usPwd;
	
	@Column(name="FW_PWD")
	private String fwPwd;
	
	@Column(name="AUTH_KEY")
	private String authKey;
	
	@Column(name="CYPHER_KEY")
	private String cypherKey;
	
	@Column(name="CURRENT_RATING")
	private String currentRating;
	
	@Column(name="PUSH_IP")
	private String pushIp;
	
	@Column(name="PAYMENT_MODE")
	private String paymentMode;
	
	@Column(name="METERING_MODE")
	private String meteringMode;
	
	@Column(name="DP_INTERVAL")
	private String dpInterval;
	
	public MeterMaster() {
		
	}

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

	public String getMtrType() {
		return mtrType;
	}

	public void setMtrType(String mtrType) {
		this.mtrType = mtrType;
	}

	public String getMtrPhase() {
		return mtrPhase;
	}

	public void setMtrPhase(String mtrPhase) {
		this.mtrPhase = mtrPhase;
	}

	public String getMtrCapacity() {
		return mtrCapacity;
	}

	public void setMtrCapacity(String mtrCapacity) {
		this.mtrCapacity = mtrCapacity;
	}

	public Double getActiveConstant() {
		return activeConstant;
	}

	public void setActiveConstant(Double activeConstant) {
		this.activeConstant = activeConstant;
	}

	public Double getReactiveConstant() {
		return reactiveConstant;
	}

	public void setReactiveConstant(Double reactiveConstant) {
		this.reactiveConstant = reactiveConstant;
	}

	public String getMtrMake() {
		return mtrMake;
	}

	public void setMtrMake(String mtrMake) {
		this.mtrMake = mtrMake;
	}

	public Double getKwhRdg() {
		return kwhRdg;
	}

	public void setKwhRdg(Double kwhRdg) {
		this.kwhRdg = kwhRdg;
	}

	public Double getKvaRdg() {
		return kvaRdg;
	}

	public void setKvaRdg(Double kvaRdg) {
		this.kvaRdg = kvaRdg;
	}

	public Double getKvahRdg() {
		return kvahRdg;
	}

	public void setKvahRdg(Double kvahRdg) {
		this.kvahRdg = kvahRdg;
	}

	public Double getMf() {
		return mf;
	}

	public void setMf(Double mf) {
		this.mf = mf;
	}

	public Integer getRf() {
		return rf;
	}

	public void setRf(Integer rf) {
		this.rf = rf;
	}

	public Double getCtRatioNumerator() {
		return ctRatioNumerator;
	}

	public void setCtRatioNumerator(Double ctRatioNumerator) {
		this.ctRatioNumerator = ctRatioNumerator;
	}

	public Double getCtRatioDenominator() {
		return ctRatioDenominator;
	}

	public void setCtRatioDenominator(Double ctRatioDenominator) {
		this.ctRatioDenominator = ctRatioDenominator;
	}

	public Double getVtRatioNumerator() {
		return vtRatioNumerator;
	}

	public void setVtRatioNumerator(Double vtRatioNumerator) {
		this.vtRatioNumerator = vtRatioNumerator;
	}

	public Double getVtRationDenominator() {
		return vtRationDenominator;
	}

	public void setVtRationDenominator(Double vtRationDenominator) {
		this.vtRationDenominator = vtRationDenominator;
	}

	public String getMtrSlno() {
		return mtrSlno;
	}

	public void setMtrSlno(String mtrSlno) {
		this.mtrSlno = mtrSlno;
	}

	public Date getMtrSealdt() {
		return mtrSealdt;
	}

	public void setMtrSealdt(Date mtrSealdt) {
		this.mtrSealdt = mtrSealdt;
	}

	public BigInteger getMtrDigits() {
		return mtrDigits;
	}

	public void setMtrDigits(BigInteger mtrDigits) {
		this.mtrDigits = mtrDigits;
	}

	public Double getMtrDecimal() {
		return mtrDecimal;
	}

	public void setMtrDecimal(Double mtrDecimal) {
		this.mtrDecimal = mtrDecimal;
	}

	public String getTouFlag() {
		return touFlag;
	}

	public void setTouFlag(String touFlag) {
		this.touFlag = touFlag;
	}

	public Date getMtrMfgYear() {
		return mtrMfgYear;
	}

	public void setMtrMfgYear(Date mtrMfgYear) {
		this.mtrMfgYear = mtrMfgYear;
	}

	public Date getMtrIssuedDate() {
		return mtrIssuedDate;
	}

	public void setMtrIssuedDate(Date mtrIssuedDate) {
		this.mtrIssuedDate = mtrIssuedDate;
	}

	public Date getMtrInstalledDate() {
		return mtrInstalledDate;
	}

	public void setMtrInstalledDate(Date mtrInstalledDate) {
		this.mtrInstalledDate = mtrInstalledDate;
	}

	public String getHdlcAddress() {
		return hdlcAddress;
	}

	public void setHdlcAddress(String hdlcAddress) {
		this.hdlcAddress = hdlcAddress;
	}

	public Date getMtrRegristrationTime() {
		return mtrRegristrationTime;
	}

	public void setMtrRegristrationTime(Date mtrRegristrationTime) {
		this.mtrRegristrationTime = mtrRegristrationTime;
	}

	public String getAutoBreakerAvialable() {
		return autoBreakerAvialable;
	}

	public void setAutoBreakerAvialable(String autoBreakerAvialable) {
		this.autoBreakerAvialable = autoBreakerAvialable;
	}

	public String getBreakerEnabled() {
		return breakerEnabled;
	}

	public void setBreakerEnabled(String breakerEnabled) {
		this.breakerEnabled = breakerEnabled;
	}

	public String getMcbType() {
		return mcbType;
	}

	public void setMcbType(String mcbType) {
		this.mcbType = mcbType;
	}

	public String getGpslocationId() {
		return gpslocationId;
	}

	public void setGpslocationId(String gpslocationId) {
		this.gpslocationId = gpslocationId;
	}

	public String getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getLoadProfileInterval() {
		return loadProfileInterval;
	}

	public void setLoadProfileInterval(String loadProfileInterval) {
		this.loadProfileInterval = loadProfileInterval;
	}

	public String getCurrentOverlimitThreshold() {
		return currentOverlimitThreshold;
	}

	public void setCurrentOverlimitThreshold(String currentOverlimitThreshold) {
		this.currentOverlimitThreshold = currentOverlimitThreshold;
	}

	public String getCurrentOverlimitDuration() {
		return currentOverlimitDuration;
	}

	public void setCurrentOverlimitDuration(String currentOverlimitDuration) {
		this.currentOverlimitDuration = currentOverlimitDuration;
	}

	public String getVoltageUnderlimitThreshold() {
		return voltageUnderlimitThreshold;
	}

	public void setVoltageUnderlimitThreshold(String voltageUnderlimitThreshold) {
		this.voltageUnderlimitThreshold = voltageUnderlimitThreshold;
	}

	public String getVoltageUnderlimitDuration() {
		return voltageUnderlimitDuration;
	}

	public void setVoltageUnderlimitDuration(String voltageUnderlimitDuration) {
		this.voltageUnderlimitDuration = voltageUnderlimitDuration;
	}

	public String getAvgPfThreshold() {
		return avgPfThreshold;
	}

	public void setAvgPfThreshold(String avgPfThreshold) {
		this.avgPfThreshold = avgPfThreshold;
	}

	public Integer getMtrLocation() {
		return mtrLocation;
	}

	public void setMtrLocation(Integer mtrLocation) {
		this.mtrLocation = mtrLocation;
	}

	public Integer getRelayStatus() {
		return relayStatus;
	}

	public void setRelayStatus(Integer relayStatus) {
		this.relayStatus = relayStatus;
	}

	public String getIntegrationMethod() {
		return integrationMethod;
	}

	public void setIntegrationMethod(String integrationMethod) {
		this.integrationMethod = integrationMethod;
	}

	public Integer getEobDate() {
		return eobDate;
	}

	public void setEobDate(Integer eobDate) {
		this.eobDate = eobDate;
	}

	public String getProtocolId() {
		return protocolId;
	}

	public void setProtocolId(String protocolId) {
		this.protocolId = protocolId;
	}

	public String getMtrAvilable() {
		return mtrAvilable;
	}

	public void setMtrAvilable(String mtrAvilable) {
		this.mtrAvilable = mtrAvilable;
	}

	public String getFieldMtrAvialble() {
		return fieldMtrAvialble;
	}

	public void setFieldMtrAvialble(String fieldMtrAvialble) {
		this.fieldMtrAvialble = fieldMtrAvialble;
	}

	public String getMeterCategory() {
		return meterCategory;
	}

	public void setMeterCategory(String meterCategory) {
		this.meterCategory = meterCategory;
	}

	public String getMtrVoltage() {
		return mtrVoltage;
	}

	public void setMtrVoltage(String mtrVoltage) {
		this.mtrVoltage = mtrVoltage;
	}

	public String getMtrFirmware() {
		return mtrFirmware;
	}

	public void setMtrFirmware(String mtrFirmware) {
		this.mtrFirmware = mtrFirmware;
	}

	public String getVoltGroup() {
		return voltGroup;
	}

	public void setVoltGroup(String voltGroup) {
		this.voltGroup = voltGroup;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public int getIS_NOTIFIED() {
		return IS_NOTIFIED;
	}

	public void setIS_NOTIFIED(int iS_NOTIFIED) {
		IS_NOTIFIED = iS_NOTIFIED;
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

	public String getMtrInterface() {
		return mtrInterface;
	}

	public void setMtrInterface(String mtrInterface) {
		this.mtrInterface = mtrInterface;
	}

	public String getSubscriptionNumber() {
		return subscriptionNumber;
	}

	public void setSubscriptionNumber(String subscriptionNumber) {
		this.subscriptionNumber = subscriptionNumber;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}

	public String getMtrEntryType() {
		return mtrEntryType;
	}

	public void setMtrEntryType(String mtrEntryType) {
		this.mtrEntryType = mtrEntryType;
	}

	public String getModeInsertType() {
		return modeInsertType;
	}

	public void setModeInsertType(String modeInsertType) {
		this.modeInsertType = modeInsertType;
	}

	public Date getMtrMfgDate() {
		return mtrMfgDate;
	}

	public void setMtrMfgDate(Date mtrMfgDate) {
		this.mtrMfgDate = mtrMfgDate;
	}

	public String getMtrSealno1() {
		return mtrSealno1;
	}

	public void setMtrSealno1(String mtrSealno1) {
		this.mtrSealno1 = mtrSealno1;
	}

	public String getMtrSealno2() {
		return mtrSealno2;
	}

	public void setMtrSealno2(String mtrSealno2) {
		this.mtrSealno2 = mtrSealno2;
	}

	public String getMtrSealno3() {
		return mtrSealno3;
	}

	public void setMtrSealno3(String mtrSealno3) {
		this.mtrSealno3 = mtrSealno3;
	}

	public String getMtrSealno4() {
		return mtrSealno4;
	}

	public void setMtrSealno4(String mtrSealno4) {
		this.mtrSealno4 = mtrSealno4;
	}

	public String getSecItemNumber() {
		return secItemNumber;
	}

	public void setSecItemNumber(String secItemNumber) {
		this.secItemNumber = secItemNumber;
	}

	public String getTerminalSealNo1() {
		return terminalSealNo1;
	}

	public void setTerminalSealNo1(String terminalSealNo1) {
		this.terminalSealNo1 = terminalSealNo1;
	}

	public Integer getMtrSeq1() {
		return mtrSeq1;
	}

	public void setMtrSeq1(Integer mtrSeq1) {
		this.mtrSeq1 = mtrSeq1;
	}

	public String getMrPwd() {
		return mrPwd;
	}

	public void setMrPwd(String mrPwd) {
		this.mrPwd = mrPwd;
	}

	public String getUsPwd() {
		return usPwd;
	}

	public void setUsPwd(String usPwd) {
		this.usPwd = usPwd;
	}

	public String getFwPwd() {
		return fwPwd;
	}

	public void setFwPwd(String fwPwd) {
		this.fwPwd = fwPwd;
	}

	public String getAuthKey() {
		return authKey;
	}

	public void setAuthKey(String authKey) {
		this.authKey = authKey;
	}

	public String getCypherKey() {
		return cypherKey;
	}

	public void setCypherKey(String cypherKey) {
		this.cypherKey = cypherKey;
	}

	public String getCurrentRating() {
		return currentRating;
	}

	public void setCurrentRating(String currentRating) {
		this.currentRating = currentRating;
	}

	public String getPushIp() {
		return pushIp;
	}

	public void setPushIp(String pushIp) {
		this.pushIp = pushIp;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getMeteringMode() {
		return meteringMode;
	}

	public void setMeteringMode(String meteringMode) {
		this.meteringMode = meteringMode;
	}

	public String getDpInterval() {
		return dpInterval;
	}

	public void setDpInterval(String dpInterval) {
		this.dpInterval = dpInterval;
	}

	

	
}
