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
	
	
	
	public MeterMaster() {
		
	}


	
}
