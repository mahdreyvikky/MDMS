package com.fluentgrid.mdms.service;

import java.util.List;

import com.fluentgrid.mdms.dto.AreawiseAggDailyReportDto;

public interface AreawiseAggregationDailyReportService {

	List<AreawiseAggDailyReportDto> getAreawiseAggregationDailyReport(String fromDate, String toDate, String officeName,
			String feederName, String dtrName, String category, String billGroup, String officeId);

}
