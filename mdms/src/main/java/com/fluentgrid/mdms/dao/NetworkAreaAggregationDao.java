package com.fluentgrid.mdms.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fluentgrid.mdms.vo.NetworkAreaAggregation;

@Repository
public interface NetworkAreaAggregationDao extends JpaRepository<NetworkAreaAggregation, Serializable> {

	@Query("From NetworkAreaAggregation a")
	List<Object[]> getAreawiseAggregationDailyReport(@Param("fromDate") String fromDate, @Param("toDate") String toDate,
			@Param("officeName") String officeName, @Param("feederName") String feederName,
			@Param("dtrName") String dtrName, @Param("category") String category, @Param("billGroup") String billGroup,
			@Param("officeId") String officeId);
	
	/*@Query("select a.officeName, a.feederName, a.dtrName, a.ssName, a.consBillGrp, a.customerAccountNo, a.customerName, a.contractedLoad, "
			+ "a.meterType, a.catyName, sum(a.kwhIMP), sum(a.kwhExp), sum(a.kvaImp), sum(a.kvaExp), a.meterNumber From NetworkAreaAggregation a, "
			+ "MdmDateDimension dd, ConsumerNetworkMapping net, MdmNetworkHierarchy net1 where dd.id = a.eneDate and a.eneDate between :fromDate and "
			+ ":toDate and a.estFlag='original' and  a.officeName = :officeName and a.feederName = :feederName and a.dtrName = :dtrName and "
			+ "a.catyName = :category and a.consBillGrp = :billGroup and net.networkId = net1.newComId and net.elementType = 'C' group by a.officeName , a.feederName, a.dtrName, a.ssName, a.consBillGrp, a.catyName, a.customerAccountNo, "
			+ "a.customerName, a.contractedLoad, a.meterType, a.meterNumber")
	List<Object[]> getAreawiseAggregationDailyReport(@Param("fromDate") String fromDate, @Param("toDate") String toDate,
			@Param("officeName") String officeName, @Param("feederName") String feederName,
			@Param("dtrName") String dtrName, @Param("category") String category, @Param("billGroup") String billGroup,
			@Param("officeId") String officeId);*/

}
