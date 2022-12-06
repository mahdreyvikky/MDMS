package com.fluentgrid.mdms.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fluentgrid.mdms.vo.MdmNetworkHierarchy;

@Repository
public interface MdmNetworkHierarchyDao extends JpaRepository<MdmNetworkHierarchy, Serializable>{

	/*@Query("From MdmNetworkHierarchy net inner join MdmEnergyData ed on ed.mdmNetworkHierarchy inner join MeterMaster mm on mm.mtrNumber=net.meterNumber "
			+"left outer join NetworkAreaAggregation ag on net.meterNumber = ag.meterNumber and ag.meterNumber = ed.mtrNumber "
			+ "where ed.mtrNumber = net.meterNumber and ed.billDate = :billDate and ed.dType = 1 and mm.recordStatus=1 and ag.eneDate = :eneDate and "
			+ "(net.consType = :consType OR mm.meteringMode = :meteringMode)")
	List<MdmNetworkHierarchy> dailyNetMeteringReport(@Param("billDate") String billDate, @Param("eneDate") String eneDate, @Param("consType") String consType, @Param("meteringMode") String meteringMode);*/

	/*@Query("From MdmNetworkHierarchy net,MdmEnergyData ed where ed.mtrNumber = net.meterNumber and net.createDate >= '2018-07-23 15:44:34.883' ")
	List<MdmNetworkHierarchy> dailyNetMeteringReport();*/
	
	
	@Query(value="SELECT * FROM (\r\n"
			+ "SELECT\r\n"
			+ "(SELECT DT.FISCAL_PERIOD FROM MDMS.MDM_DATE_DIMENSION DT(NOLOCK) WHERE DT.ID=ED.BILL_DATE) BILL_DATE,\r\n"
			+ "(SELECT OM.OFFICE_NAME FROM CDB.OFFICE_MASTER OM(NOLOCK) WHERE NET.ADMINISTRATIVE_ID=OM.ID) OFFICE_NAME,\r\n"
			+ "NET.SS_NAME,NET.FEEDER_NAME,NET.DTR_NAME,NET.CUSTOMER_NAME,NET.CUSTOMER_ACCOUNT_NO,NET.METER_NUMBER,\r\n"
			+ "NET.METER_TYPE,CAST((CAST (NET.CONS_MAX_DMD AS DECIMAL(15,3))) AS VARCHAR)+' '+NET.LOAD_UNIT AS CONTRACTED_LOAD,\r\n"
			+ "ROW_NUMBER()OVER(PARTITION BY NET.METER_NUMBER,EST_FLAG ORDER BY NET.METER_NUMBER) RN,\r\n"
			+ "(SELECT CM.ADDRESS_1 FROM CDB.CONSUMER_MASTER CM(NOLOCK) WHERE CM.ID=NET.CUSTOMER_ID) ADDRESS,CAST(NET.CT_RATIO_NUMERATOR AS DECIMAL(15,3))CT_RATIO_NUMERATOR,\r\n"
			+ "CAST(NET.VT_RATIO_NUMERATOR AS DECIMAL(15,3))VT_RATIO_NUMERATOR,\r\n"
			+ "CAST(NET.MF AS DECIMAL(15,3)) MF,(SELECT CG.NAME FROM CDB.CATEGORY_MASTER CG(NOLOCK) WHERE CG.ID=NET.CATEGORY_ID) TARIFF,\r\n"
			+ "(SELECT CG.CATEGORY_TYPE FROM CDB.CATEGORY_TYPE_MASTER CG(NOLOCK) WHERE CG.ID IN(\r\n"
			+ "SELECT CATEGORY_TYPE_ID FROM CDB.CATEGORY_MASTER CM(NOLOCK) WHERE CM.ID=NET.CATEGORY_ID)) CATEGORY_NAME,\r\n"
			+ "CAST(ED.KWH_IMP AS DECIMAL(15,3)) KWH_IMP,CAST(ED.KWH_EXP AS DECIMAL(15,3)) KWH_EXP,\r\n"
			+ "ISNULL(AG.KWH_IMP,0) NET_KWH_IMP,CAST(ISNULL(AG.KWH_EXP,0) AS DECIMAL(15,3)) NET_KWH_EXP,NET.CONS_TYPE\r\n"
			+ ",CASE WHEN EST_FLAG='ORIGINAL' THEN 'ACTUAL' ELSE 'ESTIMATED' END STATUS\r\n"
			+ "FROM MDMS.MDM_NETWORK_HIERARCHY NET (NOLOCK) INNER JOIN MDMS.MDM_ENERGY_DATA ED (NOLOCK) ON ED.MTR_NUMBER=NET.METER_NUMBER\r\n"
			+ "AND ED.NETWORK_ID=NET.ID AND ED.BILL_DATE=?1 AND ED.D_TYPE=1\r\n"
			+ "inner join cdb.meter_master mm(nolock) on mm.mtr_number=net.meter_number and mm.record_status=1\r\n"
			+ "AND (NET.CONS_TYPE=?2 OR mm.metering_mode=?3)\r\n"
			+ "LEFT OUTER JOIN DWH.NETWORK_AREA_AGGREGATION AG (NOLOCK) ON NET.METER_NUMBER=AG.METER_NUMBER AND AG.METER_NUMBER=ED.MTR_NUMBER\r\n"
			+ "AND AG.ENE_DATE=?4\r\n"
			+ "AND IS_RECORD_ESTIMATED=CASE WHEN EST_FLAG='ORIGINAL' THEN 0 ELSE 1 END\r\n"
			//+ "WHERE \"&[WhereClause]&\" \r\n"
			+ ") M WHERE (STATUS=?5 OR 'ALL'=?5)",nativeQuery = true)
	List<Object[]> getDailyNetMeteringReport(@Param("billDate") String billDate, @Param("consType") String consType, @Param("meteringMode") String meteringMode , @Param("eneDate") String eneDate , @Param("status") String status);


}
