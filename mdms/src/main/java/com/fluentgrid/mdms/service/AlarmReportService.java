package com.fluentgrid.mdms.service;

import java.util.List;

import com.fluentgrid.mdms.dto.AlarmReportDto;
import com.fluentgrid.mdms.vo.AlarmMaster;

public interface AlarmReportService {

	List<AlarmMaster> fetchAlarmReport(String alarmName, String fromDate, String toDate);

	List<AlarmReportDto> fetchAlarmReportOnNativeSQL(String alarmName, String fromDate, String toDate);

	List<AlarmReportDto> getAlarmDetails(String alarmName, String fromDate, String toDate);
	
	List<AlarmReportDto> getAlarmReport(String alarmName, String fromDate, String toDate);

}
