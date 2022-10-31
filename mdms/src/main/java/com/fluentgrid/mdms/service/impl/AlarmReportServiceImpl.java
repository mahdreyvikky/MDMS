package com.fluentgrid.mdms.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fluentgrid.mdms.dao.AlarmDetailsDao;
import com.fluentgrid.mdms.dao.CategoryMasterDao;
import com.fluentgrid.mdms.dao.OfficeMasterDao;
import com.fluentgrid.mdms.dto.AlarmReportDto;
import com.fluentgrid.mdms.service.AlarmReportService;
import com.fluentgrid.mdms.utils.DateUtil;
import com.fluentgrid.mdms.utils.StringUtil;
import com.fluentgrid.mdms.vo.AlarmDetails;
import com.fluentgrid.mdms.vo.AlarmMaster;
import com.fluentgrid.mdms.vo.CategoryMaster;
import com.fluentgrid.mdms.vo.MdmNetworkHierarchy;
import com.fluentgrid.mdms.vo.OfficeMaster;

@Service
public class AlarmReportServiceImpl implements AlarmReportService {

	private static final Logger logger = LogManager.getLogger(AlarmReportServiceImpl.class);

	@Autowired
	private AlarmDetailsDao alarmDetailsDao;

	@Autowired
	private OfficeMasterDao officeMasterDao;

	@Autowired
	private CategoryMasterDao categoryMasterDao;

	@Override
	public List<AlarmDetails> fetchAlarmReport(String alarmName, String fromDate, String toDate) {
		logger.info("AlarmReportServiceImpl fetchAlarmReport...");

		Date fDate = DateUtil.convertStringToDate(fromDate, "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
		Date tDate = DateUtil.convertStringToDate(toDate, "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");

		List<AlarmDetails> alarmDetails = alarmDetailsDao.getAlarmDetailsByAlarmDateRange(fDate, tDate);
		if (alarmDetails != null && !alarmDetails.isEmpty()) {
			for (AlarmDetails ad : alarmDetails) {

			}

			logger.info("AlarmDetails size = " + alarmDetails.size());
		} else {
			logger.info("Empty AlarmDetails");
		}

		return alarmDetails;
	}

	@Override
	public List<AlarmReportDto> fetchAlarmReportOnNativeSQL(String alarmName, String fromDate, String toDate) {
		logger.info("AlarmReportServiceImpl fetchAlarmReportOnNativeSQL...");
		Date fDate = DateUtil.convertStringToDate(fromDate, "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
		Date tDate = DateUtil.convertStringToDate(toDate, "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
		List<Object[]> alarmReports = alarmDetailsDao.getAlarmReport(alarmName, fDate, tDate);
		List<AlarmReportDto> dtoList = null;
		dtoList = new ArrayList<AlarmReportDto>();

		for (Object[] ar : alarmReports) {
			AlarmReportDto dto = null;
			dto = new AlarmReportDto();
			dto.setOfficeName(ar[0].toString());
			dto.setSsName(ar[1].toString());
			dto.setFeederName(ar[2].toString());
			dto.setDtrName(ar[3].toString());
			dto.setMeterumber(ar[4].toString());
			dto.setCustomerAccountNo(ar[5].toString());
			dto.setCustomerName(ar[6].toString());
			dto.setContractedLoad(ar[7].toString());
			dto.setAlarmInformation(ar[8].toString());
			dto.setAlaramName(ar[9].toString());
			dto.setAlarmDate(ar[10].toString());
			dto.setMeterCategory(ar[11].toString());
			dto.setMeterManufacture("");
			dto.setMeterType(ar[13].toString());
			dtoList.add(dto);
		}

		logger.info("AlarmReportServiceImpl dtoList size =" + dtoList.size());

		return dtoList;
	}

	@Override
	public List<AlarmReportDto> getAlarmDetails(String alarmName, String fromDate, String toDate) {
		logger.info("AlarmReportServiceImpl getAlarmDetails...");
		Date fDate = DateUtil.convertStringToDate(fromDate, "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");
		Date tDate = DateUtil.convertStringToDate(toDate, "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm:ss");

		// Testing Prospective
		List<AlarmDetails> alarmReportsTestTwo = alarmDetailsDao.getAlarmDetailsTestTwo(alarmName, fDate, tDate);

		if (alarmReportsTestTwo != null && !alarmReportsTestTwo.isEmpty()) {
			logger.info("alarmReportsTestTwo size..." + alarmReportsTestTwo.size());
		}

		List<AlarmReportDto> dtoList = null;
		dtoList = new ArrayList<AlarmReportDto>();
		List<Object[]> alarmReports = alarmDetailsDao.getAlarmDetails(alarmName, fDate, tDate);
		for (Object[] ar : alarmReports) {
			AlarmReportDto dto = null;
			dto = new AlarmReportDto();
			dto.setOfficeName(StringUtil.objectNullChecker(ar[0]));
			dto.setSsName(StringUtil.objectNullChecker(ar[1]));
			dto.setFeederName(StringUtil.objectNullChecker(ar[2]));
			dto.setDtrName(StringUtil.objectNullChecker(ar[3]));
			dto.setMeterumber(StringUtil.objectNullChecker(ar[4]));
			dto.setCustomerAccountNo(StringUtil.objectNullChecker(ar[5]));
			dto.setCustomerName(StringUtil.objectNullChecker(ar[6]));
			if (!StringUtil.objectNullChecker(ar[7]).isEmpty()) {
				dto.setContractedLoad(StringUtil.objectNullChecker(ar[7]) + " " + StringUtil.objectNullChecker(ar[8]));
			}
			dto.setAlarmInformation(StringUtil.objectNullChecker(ar[9]));
			dto.setAlaramName(StringUtil.objectNullChecker(ar[10]));

			if (!StringUtil.objectNullChecker(ar[11]).isEmpty()) {
				dto.setAlarmDate(DateUtil.getDateStringFromStringDate(StringUtil.objectNullChecker(ar[11])));
			}

			dto.setMeterCategory(StringUtil.objectNullChecker(ar[12]));

			if (!StringUtil.objectNullChecker(ar[13]).isEmpty()) {
				dto.setMeterManufacture(
						StringUtil.objectNullChecker(ar[13]) + "-" + StringUtil.objectNullChecker(ar[14]));
			}

			dto.setMeterType(StringUtil.objectNullChecker(ar[15]));
			dtoList.add(dto);

		}

		logger.info("AlarmReportServiceImpl dtoList size =" + dtoList.size());

		return dtoList;

	}

}
