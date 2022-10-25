package com.fluentgrid.mdms.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fluentgrid.mdms.vo.OfficeMaster;

@Repository
public interface OfficeMasterDao extends JpaRepository<OfficeMaster, Serializable> {

	@Query("From OfficeMaster om , MdmNetworkHierarchy net where om.id = net.administrativeId and om.recordStatus=1")
	List<OfficeMaster> getOfficeNameFrmOfficeMaster();
	
}
