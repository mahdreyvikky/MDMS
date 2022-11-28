package com.fluentgrid.mdms.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fluentgrid.mdms.vo.MdmNetworkHierarchy;

@Repository
public interface MdmNetworkHierarchyDao extends JpaRepository<MdmNetworkHierarchy, Serializable>{

	@Query("From MdmNetworkHierarchy net inner join MdmEnergyData ed on ed.mdmNetworkHierarchy inner join MeterMaster mm on mm.mtrNumber=net.meterNumber "
			+"left outer join NetworkAreaAggregation ag on net.meterNumber = ag.meterNumber and ag.meterNumber = ed.mtrNumber "
			+ "where ed.mtrNumber = net.meterNumber and ed.billDate = :billDate and ed.dType = 1 and mm.recordStatus=1 and ag.eneDate = :eneDate and "
			+ "(net.consType = :consType OR mm.meteringMode = :consType1)")
	List<MdmNetworkHierarchy> dailyNetMeteringReport();

}
