package com.fluentgrid.mdms.dao;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fluentgrid.mdms.vo.RequestTypeM;

@Repository
public interface RequestTypeMDao extends JpaRepository<RequestTypeM, Serializable>{

	@Query("From RequestTypeM m where m.type='MDMS'")
	List<RequestTypeM> getRequestTypeM();

}
