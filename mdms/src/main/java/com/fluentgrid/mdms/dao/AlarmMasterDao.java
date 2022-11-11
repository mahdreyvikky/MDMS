package com.fluentgrid.mdms.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fluentgrid.mdms.vo.AlarmMaster;

@Repository
public interface AlarmMasterDao extends JpaRepository<AlarmMaster, Serializable>{

	@Query("From AlarmMaster am")
	List<AlarmMaster> getAlarmMasterDetails();

}
