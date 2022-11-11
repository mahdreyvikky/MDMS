package com.fluentgrid.mdms.restcontroller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fluentgrid.mdms.dto.AlarmReportDto;
import com.fluentgrid.mdms.dto.AreawiseAggDailyReportDto;
import com.fluentgrid.mdms.service.AlarmReportService;
import com.fluentgrid.mdms.service.AreawiseAggregationDailyReportService;
import com.fluentgrid.mdms.service.RequestTypeMService;
import com.fluentgrid.mdms.utils.JsonUtil;
import com.fluentgrid.mdms.vo.AlarmDetails;
import com.fluentgrid.mdms.vo.AlarmMaster;
import com.fluentgrid.mdms.vo.AlarmNotification;
import com.fluentgrid.mdms.vo.CategoryMaster;
import com.fluentgrid.mdms.vo.MdmNetworkHierarchy;
import com.fluentgrid.mdms.vo.OfficeMaster;
import com.google.gson.Gson;

@RestController
@RequestMapping("/mdms")
public class ReportRestControllerHandler {

	private static final Logger logger = LogManager.getLogger(ReportRestControllerHandler.class);

	@Autowired
	private RequestTypeMService requestTypeMService;

	@Autowired
	private AlarmReportService alarmReportService;

	@Autowired
	private AreawiseAggregationDailyReportService areawiseAggregationDailyReportService;

	@SuppressWarnings("unchecked")
	@GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
	public JSONObject appTest() {
		logger.info("App started...");
		JSONObject result = null;
		result = new JSONObject();
		result.put("message", "success");
		result.put("responseCode", HttpStatus.OK);
		return result;
	}

	@SuppressWarnings("unchecked")
	@PostMapping(value = "/alarmReportOnNativeSQL", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AlarmReportDto> alarmReportOnNativeSQLHandler(@RequestBody String request) {
		logger.info("alarmReportOnNativeSQL checker..");
		List<AlarmReportDto> alarmDetails = null;

		try {
			JSONObject reqJson = null;
			reqJson = (JSONObject) new JSONParser().parse(request);
			logger.info("/alarmReportOnNativeSQL requster = " + reqJson);

			alarmDetails = alarmReportService.fetchAlarmReportOnNativeSQL(reqJson.get("alarmName").toString(),
					reqJson.get("fromDate").toString(), reqJson.get("toDate").toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return alarmDetails;
	}

	@SuppressWarnings("unchecked")
	@PostMapping(value = "/getAlarmReport", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AlarmReportDto> getAlarmReportHandler(@RequestBody String request) {
		logger.info("getAlarmReport checker..");
		List<AlarmReportDto> alarmDetails = null;

		try {
			JSONObject reqJson = null;
			reqJson = (JSONObject) new JSONParser().parse(request);
			logger.info("/getAlarmReport requster = " + reqJson);

			alarmDetails = alarmReportService.getAlarmDetails(reqJson.get("alarmName").toString(),
					reqJson.get("fromDate").toString(), reqJson.get("toDate").toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
		return alarmDetails;
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping(value = "/getAlarmReportWithoutForeignKeyConstraint", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<AlarmNotification> getAlarmReportWithoutForeignKeyConstraint(@RequestBody String request) {
		logger.info("getAlarmReportWithoutForeignKeyConstraint checker..");
		List<AlarmNotification> alarmNotification = null;

		try {
			JSONObject reqJson = null;
			reqJson = (JSONObject) new JSONParser().parse(request);
			logger.info("/getAlarmReportWithoutForeignKeyConstraint requster = " + reqJson);			
			List<AlarmMaster> alarmReport = alarmReportService.fetchAlarmReport(reqJson.get("alarmName").toString(),
					reqJson.get("fromDate").toString(), reqJson.get("toDate").toString());
			
			logger.info("alarmMasterList size.."+alarmReport.size());
			if(alarmReport!=null && !alarmReport.isEmpty()) {
				for(AlarmMaster am : alarmReport) {
					logger.info(am.getId());
					logger.info("alarmNotificationList size.."+am.getAlarmNotification().size());
				}
				alarmNotification = alarmReport.get(0).getAlarmNotification();
			}
			
			logger.info("getAlarmReportWithoutForeignKeyConstraint size.."+alarmReport);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return alarmNotification;
	}

	@SuppressWarnings("unchecked")
	@PostMapping(value = "/getAreawiseAggregationDailyReport", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getAreawiseAggregationDailyReport(@RequestBody String request) {
		logger.info("getAreawiseAggregationDailyReport checker..");
		ResponseEntity<String> responseEntity = null;
		JSONObject result = null;
		result = new JSONObject();
		String resultant = "";

		try {
			JSONObject reqJson = null;
			reqJson = (JSONObject) new JSONParser().parse(request);
			logger.info("/getAreawiseAggregationDailyReport requster = " + reqJson);

			List<AreawiseAggDailyReportDto> areawiseAggDailyReportList = areawiseAggregationDailyReportService
					.getAreawiseAggregationDailyReport(reqJson.get("fromDate").toString(),
							reqJson.get("toDate").toString(), reqJson.get("officeName").toString(),
							reqJson.get("feederName").toString(), reqJson.get("dtrName").toString(),
							reqJson.get("category").toString(), reqJson.get("billGroup").toString(),
							reqJson.get("officeId").toString());

			if (areawiseAggDailyReportList != null && !areawiseAggDailyReportList.isEmpty()) {
				logger.info("areawiseAggDailyReportList size == " + areawiseAggDailyReportList.size());
				resultant = JsonUtil.objToJson(areawiseAggDailyReportList);
			}

			result.put("message", "success");
			result.put("data", resultant);
			result.put("responseCode", HttpStatus.OK);

			responseEntity = new ResponseEntity<String>(result.toString(), HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<String>(result.toString(), HttpStatus.EXPECTATION_FAILED);
		}
		return responseEntity;
	}

}