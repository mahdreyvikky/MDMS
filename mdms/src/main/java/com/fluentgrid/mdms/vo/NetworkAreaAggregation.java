package com.fluentgrid.mdms.vo;

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
@Table(name="NETWORK_AREA_AGGREGATION",schema="DWH")
@Where(clause="record_status=true")
public class NetworkAreaAggregation {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
		
	@Column(name="OFFICE_NAME")
	private String officeName;
	
	@Column(name="SS_NAME")
	private String ssName;
	
	@Column(name="FEEDER_NAME")
	private String feederName;
	
	@Column(name="DTR_NAME")
	private String dtrName;
	
	@Column(name="CUSTOMER_ACCOUNT_NO")
	private String customerAccountNo;
	
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	
	@Column(name="METER_NUMBER")
	private String meterNumber;
		
	@Column(name="CONTRACTED_LOAD")
	private String contractedLoad;
	
	@Column(name="METER_TYPE")
	private String meterType;
	
	@Column(name="ENE_DATE")
	private String eneDate;
		
	@Column(name="MAX_ENE_DATE")
	private Date maxEneDate;
	
	@Column(name="KWH_IMP")
	private Double kwhIMP;
	
	@Column(name="KVA_IMP")
	private Double kvaImp;
	
	@Column(name="KVA_EXP")
	private Double kvaExp;
	
	@Column(name="KWH_EXP")
	private Double kwhExp;
	
	@Column(name="OFF_ID")
	private String offId;
	
	@Column(name="ELE_TYPE")
	private String eleType;
	
	@Column(name="CATY_NAME")
	private String catyName;	
	
	@Column(name="MT_MAKE")
	private String mtMake;
	
	@Column(name="MT_MANFACT")
	private String mtManfact;
	
	@Column(name="EST_FLAG")
	private String estFlag;
	
	@Column(name="CONS_BILL_GRP")
	private String consBillGrp;
	
	@Column(name="N_COM_ID")
	private String nComId;
	
	public NetworkAreaAggregation() {
		
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getSsName() {
		return ssName;
	}

	public void setSsName(String ssName) {
		this.ssName = ssName;
	}

	public String getFeederName() {
		return feederName;
	}

	public void setFeederName(String feederName) {
		this.feederName = feederName;
	}

	public String getDtrName() {
		return dtrName;
	}

	public void setDtrName(String dtrName) {
		this.dtrName = dtrName;
	}

	public String getCustomerAccountNo() {
		return customerAccountNo;
	}

	public void setCustomerAccountNo(String customerAccountNo) {
		this.customerAccountNo = customerAccountNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMeterNumber() {
		return meterNumber;
	}

	public void setMeterNumber(String meterNumber) {
		this.meterNumber = meterNumber;
	}

	public String getContractedLoad() {
		return contractedLoad;
	}

	public void setContractedLoad(String contractedLoad) {
		this.contractedLoad = contractedLoad;
	}

	public String getMeterType() {
		return meterType;
	}

	public void setMeterType(String meterType) {
		this.meterType = meterType;
	}
	

	public String getEneDate() {
		return eneDate;
	}

	public void setEneDate(String eneDate) {
		this.eneDate = eneDate;
	}

	public Date getMaxEneDate() {
		return maxEneDate;
	}

	public void setMaxEneDate(Date maxEneDate) {
		this.maxEneDate = maxEneDate;
	}	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getKwhIMP() {
		return kwhIMP;
	}

	public void setKwhIMP(Double kwhIMP) {
		this.kwhIMP = kwhIMP;
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

	public Double getKwhExp() {
		return kwhExp;
	}

	public void setKwhExp(Double kwhExp) {
		this.kwhExp = kwhExp;
	}

	public String getOffId() {
		return offId;
	}

	public void setOffId(String offId) {
		this.offId = offId;
	}

	public String getEleType() {
		return eleType;
	}

	public void setEleType(String eleType) {
		this.eleType = eleType;
	}

	public String getCatyName() {
		return catyName;
	}

	public void setCatyName(String catyName) {
		this.catyName = catyName;
	}

	public String getMtMake() {
		return mtMake;
	}

	public void setMtMake(String mtMake) {
		this.mtMake = mtMake;
	}

	public String getMtManfact() {
		return mtManfact;
	}

	public void setMtManfact(String mtManfact) {
		this.mtManfact = mtManfact;
	}

	public String getEstFlag() {
		return estFlag;
	}

	public void setEstFlag(String estFlag) {
		this.estFlag = estFlag;
	}

	public String getConsBillGrp() {
		return consBillGrp;
	}

	public void setConsBillGrp(String consBillGrp) {
		this.consBillGrp = consBillGrp;
	}

	public String getnComId() {
		return nComId;
	}

	public void setnComId(String nComId) {
		this.nComId = nComId;
	}

}
