package com.fluentgrid.mdms.vo;

import java.io.Serializable;
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

@Entity
@Table(name="REQUEST_M",schema="CDB")
@Where(clause="record_status=true")
public class RequestM implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
	@Column(name="ID", unique=true, nullable=false, length=50)
	private String id;
	
	@Column(name="REQUEST_TYPE_ID")
	private String requestTypeId;
	
	@Column(name="REQUEST_NATURE")
	private String requestNature;
	
	@Column(name="SERVICE_LEVEL")
	private Integer serviceLevel = 0;
	
	@Column(name="FIRST_ESCALATION_ON")
	private Integer firstEscalationOn = 0;
	
	@Column(name="SECOND_ESCALATION_ON")
	private Integer secondEscalationOn = 0;
	
	@Column(name="FIRST_ESCALATIONTO_ID")
	private String firstEsclationtoId;
	
	@Column(name="SECOND_ESCALATIONTO_ID")
	private String secondEscalationtoId;
	
	@Column(name="RESPONSIBLEOFFICETYPE_ID")
	private String responsibleofficetypeId;
	
	@Column(name="REQUEST_RESOLVING_BASIS")
	private String requestResolvingBasis;
	
	@Column(name="SOURCE_OFFICE_ID")
	private String sourceOfficeId;
	
	@Column(name="TARGET_OFFICE_ID")
	private String targetOfficeId;
	
	@Column(name="FORM_ID")
	private String formId;
	
	@Column(name="FLAG1")
	private String flag1;
	
	@Column(name="FLAG2")
	private String flag2;
	
	@Column(name="FLAG3")
	private String flag3;
	
	@Column(name="FLAG4")
	private String flag4;
	
	@Column(name="FLAG5")
	private String flag5;
	
	@Column(name="FLAG6")
	private String flag6;
	
	@Column(name="FLAG7")
	private String flag7;
	
	@Column(name="CHECK_CONDITION")
	private String checkCondition;
	
	@Column(name="IS_INSPECTION_REQUIRED")
	private String isinspectionRequired;
	
	@Column(name="INSPECTION_DURATION")
	private Integer inspectionDuration = 0;
	
	@Column(name="MODULE_ID")
	private String moduleId;
	
	@Column(name="SUBMODULE_ID")
	private String submoduleID;
	
	@Column(name="OTHERCATAMOUNT")
	private Integer othercatamount = 0;
	
	@Column(name="CAT1AMOUNT")
	private Integer cat1amount = 0;
	
	@Column(name="PAYMENT_REQUIRED")
	private String paymenyRequired;
	
	@Column(name="IS_APP_FEES_REQUIRED")
	private String isAppFeesRequired;
	
	@Column(name="TYPE_OF_SERVICE")
	private String typeOfService;
	
	@Column(name="IS_ESCALATION_REQUIRED")
	private String isEscalationRequired;
	
	@Column(name="IS_SCNO_REQUIRED")
	private String isScnoRequired;
	
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;
	
	@Column(name="DISPLAY_NATURE")
	private String displayNature;
	
	@Column(name="PENDING_BEYOND")
	private String pendingBeyond;
	
	@Column(name="DURATION")
	private Integer duration = 0;
	
	@Column(name="CONSUMER_CHANGE_STATUS")
	private Integer consumerChangeStatus = 0;
	
	@Column(name="ISDIRECT_PAYMENT")
	private String isdirectPayment;
	
	@Column(name="ISESTIMATION_REQUIRED")
	private String isestimationRequired;
	
	@Column(name="CODE")
	private String code;
	
	@Column(name="MODULE_TYPE")
	private String moduleType;
	
	@Column(name="SEARCH_BY")
	private String searchBy;
	
	@Column(name="CONDITION")
	private String condition;
	
	@Column(name="IS_AUTO_DISPATCH")
	private String isAutoDispatch;
	
	@Column(name="IS_AUTO_DISPATCH_ID")
	private String isAutoDispatchId;
	
	@Column(name="PROCESS_M_ID")
	private String processMId;
	
	@Column(name="DESIGNATION_ID")
	private String designationId;
	
	@Column(name="NOESCALATIONS")
	private String noescalations;
	
	@Column(name="WSS_SCOPE")
	private String wssScope;
	
	@Column(name="CONSUMER_STATUS")
	private String consumerStatus;
	
	@Column(name="PRIORITY")
	private String priority;
	
	@Column(name="COMPENSATION_PAY")
	private String compensationPay;
	
	@Column(name="SERVICE_LEVEL_RURAL")
	private String serviceLevelRural;
	
	@Column(name="LEGACY_ID")
	private String legacyId;
	
	@Column(name="SOURCE_TYPE")
	private String sourceType;
	
	@Column(name="SOURCE_DATA")
	private String sourceData;
	
	@Column(name="AMOUNT_PAY_FLAG")
	private String amoutPayflag;
	
	@Column(name="WSS_APPLICABLE")
	private String wssApplicable;
	
	@Column(name="UPDATE_REMARKS")
	private String updateRemarks;
	
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
	
	@Column(name="UPDATED_BY", length=50)
	private String updateBy;

	@Column(name="UPDATE_DATE")
	private Date updateDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRequestTypeId() {
		return requestTypeId;
	}

	public void setRequestTypeId(String requestTypeId) {
		this.requestTypeId = requestTypeId;
	}

	public String getRequestNature() {
		return requestNature;
	}

	public void setRequestNature(String requestNature) {
		this.requestNature = requestNature;
	}

	public Integer getServiceLevel() {
		return serviceLevel;
	}

	public void setServiceLevel(Integer serviceLevel) {
		this.serviceLevel = serviceLevel;
	}

	public Integer getFirstEscalationOn() {
		return firstEscalationOn;
	}

	public void setFirstEscalationOn(Integer firstEscalationOn) {
		this.firstEscalationOn = firstEscalationOn;
	}

	public Integer getSecondEscalationOn() {
		return secondEscalationOn;
	}

	public void setSecondEscalationOn(Integer secondEscalationOn) {
		this.secondEscalationOn = secondEscalationOn;
	}

	public String getFirstEsclationtoId() {
		return firstEsclationtoId;
	}

	public void setFirstEsclationtoId(String firstEsclationtoId) {
		this.firstEsclationtoId = firstEsclationtoId;
	}

	public String getSecondEscalationtoId() {
		return secondEscalationtoId;
	}

	public void setSecondEscalationtoId(String secondEscalationtoId) {
		this.secondEscalationtoId = secondEscalationtoId;
	}

	public String getResponsibleofficetypeId() {
		return responsibleofficetypeId;
	}

	public void setResponsibleofficetypeId(String responsibleofficetypeId) {
		this.responsibleofficetypeId = responsibleofficetypeId;
	}

	public String getRequestResolvingBasis() {
		return requestResolvingBasis;
	}

	public void setRequestResolvingBasis(String requestResolvingBasis) {
		this.requestResolvingBasis = requestResolvingBasis;
	}

	public String getSourceOfficeId() {
		return sourceOfficeId;
	}

	public void setSourceOfficeId(String sourceOfficeId) {
		this.sourceOfficeId = sourceOfficeId;
	}

	public String getTargetOfficeId() {
		return targetOfficeId;
	}

	public void setTargetOfficeId(String targetOfficeId) {
		this.targetOfficeId = targetOfficeId;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getFlag1() {
		return flag1;
	}

	public void setFlag1(String flag1) {
		this.flag1 = flag1;
	}

	public String getFlag2() {
		return flag2;
	}

	public void setFlag2(String flag2) {
		this.flag2 = flag2;
	}

	public String getFlag3() {
		return flag3;
	}

	public void setFlag3(String flag3) {
		this.flag3 = flag3;
	}

	public String getFlag4() {
		return flag4;
	}

	public void setFlag4(String flag4) {
		this.flag4 = flag4;
	}

	public String getFlag5() {
		return flag5;
	}

	public void setFlag5(String flag5) {
		this.flag5 = flag5;
	}

	public String getFlag6() {
		return flag6;
	}

	public void setFlag6(String flag6) {
		this.flag6 = flag6;
	}

	public String getFlag7() {
		return flag7;
	}

	public void setFlag7(String flag7) {
		this.flag7 = flag7;
	}

	public String getCheckCondition() {
		return checkCondition;
	}

	public void setCheckCondition(String checkCondition) {
		this.checkCondition = checkCondition;
	}

	public String getIsinspectionRequired() {
		return isinspectionRequired;
	}

	public void setIsinspectionRequired(String isinspectionRequired) {
		this.isinspectionRequired = isinspectionRequired;
	}

	public Integer getInspectionDuration() {
		return inspectionDuration;
	}

	public void setInspectionDuration(Integer inspectionDuration) {
		this.inspectionDuration = inspectionDuration;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getSubmoduleID() {
		return submoduleID;
	}

	public void setSubmoduleID(String submoduleID) {
		this.submoduleID = submoduleID;
	}

	public Integer getOthercatamount() {
		return othercatamount;
	}

	public void setOthercatamount(Integer othercatamount) {
		this.othercatamount = othercatamount;
	}

	public Integer getCat1amount() {
		return cat1amount;
	}

	public void setCat1amount(Integer cat1amount) {
		this.cat1amount = cat1amount;
	}

	public String getPaymenyRequired() {
		return paymenyRequired;
	}

	public void setPaymenyRequired(String paymenyRequired) {
		this.paymenyRequired = paymenyRequired;
	}

	public String getIsAppFeesRequired() {
		return isAppFeesRequired;
	}

	public void setIsAppFeesRequired(String isAppFeesRequired) {
		this.isAppFeesRequired = isAppFeesRequired;
	}

	public String getTypeOfService() {
		return typeOfService;
	}

	public void setTypeOfService(String typeOfService) {
		this.typeOfService = typeOfService;
	}

	public String getIsEscalationRequired() {
		return isEscalationRequired;
	}

	public void setIsEscalationRequired(String isEscalationRequired) {
		this.isEscalationRequired = isEscalationRequired;
	}

	public String getIsScnoRequired() {
		return isScnoRequired;
	}

	public void setIsScnoRequired(String isScnoRequired) {
		this.isScnoRequired = isScnoRequired;
	}

	public Date getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getDisplayNature() {
		return displayNature;
	}

	public void setDisplayNature(String displayNature) {
		this.displayNature = displayNature;
	}

	public String getPendingBeyond() {
		return pendingBeyond;
	}

	public void setPendingBeyond(String pendingBeyond) {
		this.pendingBeyond = pendingBeyond;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getConsumerChangeStatus() {
		return consumerChangeStatus;
	}

	public void setConsumerChangeStatus(Integer consumerChangeStatus) {
		this.consumerChangeStatus = consumerChangeStatus;
	}

	public String getIsdirectPayment() {
		return isdirectPayment;
	}

	public void setIsdirectPayment(String isdirectPayment) {
		this.isdirectPayment = isdirectPayment;
	}

	public String getIsestimationRequired() {
		return isestimationRequired;
	}

	public void setIsestimationRequired(String isestimationRequired) {
		this.isestimationRequired = isestimationRequired;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getModuleType() {
		return moduleType;
	}

	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}

	public String getSearchBy() {
		return searchBy;
	}

	public void setSearchBy(String searchBy) {
		this.searchBy = searchBy;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getIsAutoDispatch() {
		return isAutoDispatch;
	}

	public void setIsAutoDispatch(String isAutoDispatch) {
		this.isAutoDispatch = isAutoDispatch;
	}

	public String getIsAutoDispatchId() {
		return isAutoDispatchId;
	}

	public void setIsAutoDispatchId(String isAutoDispatchId) {
		this.isAutoDispatchId = isAutoDispatchId;
	}

	public String getProcessMId() {
		return processMId;
	}

	public void setProcessMId(String processMId) {
		this.processMId = processMId;
	}

	public String getDesignationId() {
		return designationId;
	}

	public void setDesignationId(String designationId) {
		this.designationId = designationId;
	}

	public String getNoescalations() {
		return noescalations;
	}

	public void setNoescalations(String noescalations) {
		this.noescalations = noescalations;
	}

	public String getWssScope() {
		return wssScope;
	}

	public void setWssScope(String wssScope) {
		this.wssScope = wssScope;
	}

	public String getConsumerStatus() {
		return consumerStatus;
	}

	public void setConsumerStatus(String consumerStatus) {
		this.consumerStatus = consumerStatus;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getCompensationPay() {
		return compensationPay;
	}

	public void setCompensationPay(String compensationPay) {
		this.compensationPay = compensationPay;
	}

	public String getServiceLevelRural() {
		return serviceLevelRural;
	}

	public void setServiceLevelRural(String serviceLevelRural) {
		this.serviceLevelRural = serviceLevelRural;
	}

	public String getLegacyId() {
		return legacyId;
	}

	public void setLegacyId(String legacyId) {
		this.legacyId = legacyId;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getSourceData() {
		return sourceData;
	}

	public void setSourceData(String sourceData) {
		this.sourceData = sourceData;
	}

	public String getAmoutPayflag() {
		return amoutPayflag;
	}

	public void setAmoutPayflag(String amoutPayflag) {
		this.amoutPayflag = amoutPayflag;
	}

	public String getWssApplicable() {
		return wssApplicable;
	}

	public void setWssApplicable(String wssApplicable) {
		this.wssApplicable = wssApplicable;
	}

	public String getUpdateRemarks() {
		return updateRemarks;
	}

	public void setUpdateRemarks(String updateRemarks) {
		this.updateRemarks = updateRemarks;
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
