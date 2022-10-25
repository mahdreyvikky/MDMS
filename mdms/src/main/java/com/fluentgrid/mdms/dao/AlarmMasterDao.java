package com.fluentgrid.mdms.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fluentgrid.mdms.vo.AlarmMaster;

@Repository
public interface AlarmMasterDao extends JpaRepository<AlarmMaster, Serializable>{

}
