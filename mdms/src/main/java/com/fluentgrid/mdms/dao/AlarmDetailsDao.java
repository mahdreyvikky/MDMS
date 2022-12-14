package com.fluentgrid.mdms.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fluentgrid.mdms.vo.AlarmDetails;

@Repository
public interface AlarmDetailsDao extends JpaRepository<AlarmDetails, Serializable> {

	@Query("From AlarmDetails ad where ad.alarmDate between :fromDate and :toDate and  ad.recordStatus = 1 ")
	List<AlarmDetails> getAlarmDetailsByAlarmDateRange1(@Param("fromDate") Date fromDate, @Param("toDate") Date toDate);
	
	
	@Query("Select net.ssName, net.feederName, net.dtrName, net.meterNumber, net.customerAccountNo, "
			+ "net.customerName, net.consMaxDmd, net.loadUnit, ad.alarmInformation, am.alarmName, ad.alarmDate "
			+ "From AlarmDetails ad inner join ad.mdmNetworkHierarchy as net "
			+ "on ad.meterId = net.meterNumber inner join ad.alarmMaster2 as am on ad.alarmId = am.id where ad.alarmDate between :fromDate "
			+ "and :toDate and ad.recordStatus = 1 and net.recordStatus = 1 and net.elementType = 'C' "
			+ "and (am.alarmName=:alarmName OR 'ALL'=:alarmName) and am.recordStatus = 1 "
			+ "ORDER BY net.meterNumber, am.alarmName, ad.alarmDate DESC")
	List<Object[]> getAlarmDetailsByAlarmDateRange(@Param("alarmName") String alarmName, @Param("fromDate") Date fromDate,
			@Param("toDate") Date toDate);
	

	@Query("From AlarmDetails ad")
	List<AlarmDetails> fetchAlarmDetails();
	
	@Query(value="SELECT (SELECT OFFICE_NAME FROM CDB.OFFICE_MASTER OM(NOLOCK) WHERE OM.ID=NET.ADMINISTRATIVE_ID AND OM.RECORD_STATUS=1) OFFICE_NAME,\r\n"
			+ "NET.SS_NAME,NET.FEEDER_NAME,NET.DTR_NAME,NET.METER_NUMBER,NET.CUSTOMER_ACCOUNT_NO,NET.CUSTOMER_NAME,\r\n"
			+ "cast(CAST(net.cons_max_dmd AS DECIMAL(15,3)) as varchar)+' '+cast(net.load_unit as varchar) CONTRACTED_LOAD,AD.ALARM_INFORMATION,\r\n"
			+ "AM.ALARAM_NAME,REPLACE(CONVERT(VARCHAR(11),AD.ALARM_DATE,106),' ','-')+' '+CONVERT(VARCHAR(8),AD.ALARM_DATE,108)ALARM_DATE,\r\n"
			+ "(SELECT CG.NAME FROM CDB.CATEGORY_MASTER CG(NOLOCK) WHERE CG.ID=NET.CATEGORY_ID) METER_CATEGORY,\r\n"
			+ "(select mf.code+'-'+mk.make  from cdb.METER_MANUFACTURER mf (nolock) inner join cdb.meter_make_m mk (nolock) on mf.id=mk.mtr_manfacture_id \r\n"
			+ "inner join cdb.meter_master mm (nolock) on mm.mtr_make=mk.id and mm.mtr_number=net.meter_number\r\n"
			+ "where mk.record_status=1 and mf.record_status=1 and mm.record_status=1 ) METER_MANUFACTURE\r\n"
			+ ",NET.METER_TYPE\r\n"
			+ "FROM\r\n"
			+ "MDMS.MDM_ALARM_dETAILS AD(NOLOCK) \r\n"
			+ "INNER JOIN MDMS.MDM_NETWORK_HIERARCHY NET(NOLOCK) ON NET.METER_NUMBER=AD.METER_ID AND NET.RECORD_STATUS=1 AND NET.ELEMENT_TYPE='C'\r\n"
			+ "INNER JOIN MDMS.MDM_ALARM_MASTER AM(NOLOCK) ON AM.ID=AD.ALARM_ID AND AM.RECORD_STATUS=1 AND AD.RECORD_STATUS=1\r\n"
			+ "inner join cdb.meter_master mm (nolock) on mm.mtr_number=net.meter_number \r\n"
			+ "AND (AM.ALARAM_NAME=?1 OR 'ALL'=?1)\r\n"
			+ "AND AD.ALARM_DATE BETWEEN ?2 and ?3\r\n"
			+ "ORDER BY METER_NUMBER,ALARAM_NAME,ALARM_DATE DESC",nativeQuery = true)
	List<Object[]> getAlarmReport(@Param("alarmName") String alarmName, @Param("fromDate") Date fromDate, @Param("toDate") Date toDate);

	@Query("Select om.officeName, net.ssName, net.feederName, net.dtrName, net.meterNumber, net.customerAccountNo, "
			+ "net.customerName, net.consMaxDmd, net.loadUnit, ad.alarmInformation, am.alarmName, ad.alarmDate, "
			+ "cg.name, mf.code, mk.make, net.meterType From AlarmDetails ad, MdmNetworkHierarchy net, AlarmMaster am, "
			+ "OfficeMaster om, CategoryMaster cg, MeterManufacturer mf, MeterMakeM mk, MeterMaster mm where ad.alarmDate between :fromDate "
			+ "and :toDate and ad.recordStatus = 1 and net.meterNumber = ad.meterId and net.recordStatus = 1 "
			+ "and net.elementType = 'C' and am.id = ad.alarmId "
			+ "and (am.alarmName=:alarmName OR 'ALL'=:alarmName) and am.recordStatus = 1 "
			+ "and om.id = net.administrativeId and om.recordStatus = 1 and cg.id = net.categoryId "
			+ "and mf.id=mk.mtrManfactureId and mm.mtrMake=mk.id and mm.mtrNumber=net.meterNumber "
			+ "and mk.recordStatus=1 and mf.recordStatus=1 "
			+ "ORDER BY net.meterNumber, am.alarmName, ad.alarmDate DESC")
	List<Object[]> getAlarmDetails(@Param("alarmName") String alarmName, @Param("fromDate") Date fromDate,
			@Param("toDate") Date toDate);
	
	@Query("Select om.officeName, net.ssName, net.feederName, net.dtrName, net.meterNumber, net.customerAccountNo, "
			+ "net.customerName, net.consMaxDmd, net.loadUnit, ad.alarmInformation, am.alarmName, ad.alarmDate, "
			+ "cg.name, mf.code, mk.make, net.meterType From AlarmDetails ad, MdmNetworkHierarchy net, AlarmMaster am, "
			+ "OfficeMaster om, CategoryMaster cg, MeterManufacturer mf, MeterMakeM mk, MeterMaster mm where ad.alarmDate between :fromDate "
			+ "and :toDate and ad.recordStatus = 1 and net.meterNumber = ad.meterId and net.recordStatus = 1 "
			+ "and net.elementType = 'C' and am.id = ad.alarmId "
			+ "and (am.alarmName=:alarmName OR 'ALL'=:alarmName) and am.recordStatus = 1 "
			+ "and om.id = net.administrativeId and om.recordStatus = 1 and cg.id = net.categoryId "
			+ "and mf.id=mk.mtrManfactureId and mm.mtrMake=mk.id and mm.mtrNumber=net.meterNumber "
			+ "and mk.recordStatus=1 and mf.recordStatus=1 "
			+ "ORDER BY net.meterNumber, am.alarmName, ad.alarmDate DESC")
	List<Object[]> getAlarmDetailsWithoutForeignKeyConstraints(@Param("alarmName") String alarmName, @Param("fromDate") Date fromDate,
			@Param("toDate") Date toDate);
	
	
	@Query("Select om.officeName, net.ssName, net.feederName, net.dtrName, net.meterNumber, net.customerAccountNo, "
			+ "net.customerName, net.consMaxDmd, net.loadUnit, ad.alarmInformation, am.alarmName, ad.alarmDate, "
			+ "cg.name, mf.code, mk.make, net.meterType From AlarmDetails ad, MdmNetworkHierarchy net, AlarmMaster am, "
			+ "OfficeMaster om, CategoryMaster cg, MeterManufacturer mf, MeterMakeM mk, MeterMaster mm where ad.alarmDate between :fromDate "
			+ "and :toDate and ad.recordStatus = 1 and net.meterNumber = ad.meterId and net.recordStatus = 1 "
			+ "and net.elementType = 'C' and am.id = ad.alarmId "
			+ "and (am.alarmName=:alarmName OR 'ALL'=:alarmName) and am.recordStatus = 1 "
			+ "and om.id = net.administrativeId and om.recordStatus = 1 and cg.id = net.categoryId "
			+ "and mf.id=mk.mtrManfactureId and mm.mtrMake=mk.id and mm.mtrNumber=net.meterNumber "
			+ "and mk.recordStatus=1 and mf.recordStatus=1 and mm.recordStatus=1 "
			+ "ORDER BY net.meterNumber, am.alarmName, ad.alarmDate DESC")
	List<Object[]> getAlarmDetailsTest(@Param("alarmName") String alarmName, @Param("fromDate") Date fromDate,
			@Param("toDate") Date toDate);
	
	
	@Query("From AlarmDetails ad, MdmNetworkHierarchy net, AlarmMaster am, MeterMaster mm where ad.alarmDate between :fromDate "
			+ "and :toDate and ad.recordStatus = 1 and net.meterNumber = ad.meterId and net.recordStatus = 1 "
			+ "and net.elementType = 'C' and am.id = ad.alarmId "
			+ "and (am.alarmName=:alarmName OR 'ALL'=:alarmName) and am.recordStatus = 1 and mm.mtrNumber=net.meterNumber "
			+ "ORDER BY net.meterNumber, am.alarmName, ad.alarmDate DESC")
	List<AlarmDetails> getAlarmDetailsTestTwo(@Param("alarmName") String alarmName, @Param("fromDate") Date fromDate,
			@Param("toDate") Date toDate);

}
