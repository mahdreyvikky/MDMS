package com.fluentgrid.mdms.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fluentgrid.mdms.dao.NetworkAreaAggregationDao;
import com.fluentgrid.mdms.dto.AreawiseAggDailyReportDto;
import com.fluentgrid.mdms.service.AreawiseAggregationDailyReportService;
import com.fluentgrid.mdms.utils.DateUtil;

@Service
public class AreawiseAggregationDailyReportServiceImpl implements AreawiseAggregationDailyReportService {

	private static final Logger logger = LogManager.getLogger(AreawiseAggregationDailyReportServiceImpl.class);

	@Autowired
	private NetworkAreaAggregationDao networkAreaAggregationDao;

	@Override
	public List<AreawiseAggDailyReportDto> getAreawiseAggregationDailyReport(String fromDate, String toDate,
			String officeName, String feederName, String dtrName, String category, String billGroup, String officeId) {
		logger.info("getAreawiseAggregationDailyReport Service ...");
	
		List<AreawiseAggDailyReportDto> dtoList = null;
		dtoList = new ArrayList<AreawiseAggDailyReportDto>();
		List<Object[]> alarmReports = networkAreaAggregationDao.getAreawiseAggregationDailyReport(fromDate, toDate,
				officeName, feederName, dtrName, category, billGroup, officeId);
		for (Object[] ar : alarmReports) {
			AreawiseAggDailyReportDto dto = null;
			dto = new AreawiseAggDailyReportDto();

			dtoList.add(dto);

		}

		logger.info("getAreawiseAggregationDailyReport dtoList size =" + dtoList.size());

		return dtoList;
	}

}
