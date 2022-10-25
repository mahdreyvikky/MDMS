package com.fluentgrid.mdms.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fluentgrid.mdms.vo.CategoryMaster;

@Repository
public interface CategoryMasterDao extends JpaRepository<CategoryMaster, Serializable> {

	@Query("From CategoryMaster cg, MdmNetworkHierarchy net where cg.id = net.categoryId")
	List<CategoryMaster> getMeterCategoryFromCategoryMaster();

}
