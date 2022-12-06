package com.fluentgrid.mdms.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fluentgrid.mdms.dao.MdmNetworkHierarchyDao;
import com.fluentgrid.mdms.dto.DailyNetMeteringReportDto;
import com.fluentgrid.mdms.service.MeterReportService;
import com.fluentgrid.mdms.utils.StringUtil;

@Service
public class MeterReportServiceImpl implements MeterReportService {
	private static final Logger logger = LogManager.getLogger(MeterReportServiceImpl.class);

	@Autowired
	private MdmNetworkHierarchyDao mdmNetworkHierarchyDao;

	@Override
	public List<DailyNetMeteringReportDto> dailyNetMeteringReport(String billDate, String consType, String meteringMode,
			String eneDate, String status) {
		logger.debug("In MeterReportServiceImpl..");
		List<DailyNetMeteringReportDto> dailyNetMeteringReportList = null;
		dailyNetMeteringReportList = new ArrayList<DailyNetMeteringReportDto>();

		List<Object[]> getDailyNetMeteringReportList = mdmNetworkHierarchyDao.getDailyNetMeteringReport(billDate,
				consType, meteringMode, eneDate, status);
		logger.debug("getDailyNetMeteringReportList size = " + dailyNetMeteringReportList.size());
		for (Object[] ar : getDailyNetMeteringReportList) {
			DailyNetMeteringReportDto dto = null;
			dto = new DailyNetMeteringReportDto();
			dto.setBillDate(StringUtil.objectNullChecker(ar[0]));
			dto.setOfficeName(StringUtil.objectNullChecker(ar[1]));
			dto.setSsName(StringUtil.objectNullChecker(ar[2]));
			dto.setFeederName(StringUtil.objectNullChecker(ar[3]));
			dto.setDtrName(StringUtil.objectNullChecker(ar[4]));
			dto.setCustomerName(StringUtil.objectNullChecker(ar[5]));
			dto.setCustomerAccountNo(StringUtil.objectNullChecker(ar[6]));
			dto.setMeterumber(StringUtil.objectNullChecker(ar[7]));
			dto.setMeterType(StringUtil.objectNullChecker(ar[8]));
			dto.setContractedLoad(StringUtil.objectNullChecker(ar[9]));
			dto.setrN(StringUtil.objectNullChecker(ar[10]));
			dto.setAddress(StringUtil.objectNullChecker(ar[11]));
			dto.setCtRatioNumerator(StringUtil.objectNullChecker(ar[12]));
			dto.setVtRatioNumerator(StringUtil.objectNullChecker(ar[13]));
			dto.setmF(StringUtil.objectNullChecker(ar[14]));
			dto.setTariff(StringUtil.objectNullChecker(ar[15]));
			dto.setCategoryName(StringUtil.objectNullChecker(ar[16]));
			dto.setKwhImp(StringUtil.objectNullChecker(ar[17]));
			dto.setKwhExp(StringUtil.objectNullChecker(ar[18]));
			dto.setNetKwhImp(StringUtil.objectNullChecker(ar[19]));
			dto.setNetkwhExp(StringUtil.objectNullChecker(ar[20]));
			dto.setConsType(StringUtil.objectNullChecker(ar[21]));
			dto.setStatus(StringUtil.objectNullChecker(ar[22]));
			dailyNetMeteringReportList.add(dto);
		}

		return dailyNetMeteringReportList;
	}
}
