package com.fluentgrid.mdms.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fluentgrid.mdms.dao.MdmNetworkHierarchyDao;
import com.fluentgrid.mdms.service.MeterReportService;
import com.fluentgrid.mdms.vo.MdmNetworkHierarchy;
@Service
public class MeterReportServiceImpl implements MeterReportService {
	private static final Logger logger = LogManager.getLogger(MeterReportServiceImpl.class);
	
	@Autowired
	private MdmNetworkHierarchyDao mdmNetworkHierarchyDao;

	@Override
	public List<MdmNetworkHierarchy> dailyNetMeteringReport() {
		// TODO Auto-generated method stub
		return mdmNetworkHierarchyDao.dailyNetMeteringReport();
	}
}
