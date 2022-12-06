package com.fluentgrid.mdms.service;

import java.util.List;

import com.fluentgrid.mdms.dto.DailyNetMeteringReportDto;

public interface MeterReportService {

	List<DailyNetMeteringReportDto> dailyNetMeteringReport(String billDate, String consType, String meteringMode,
			String eneDate, String status);

}
