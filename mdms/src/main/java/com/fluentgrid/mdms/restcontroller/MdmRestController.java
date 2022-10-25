package com.fluentgrid.mdms.restcontroller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
import com.fluentgrid.mdms.service.AlarmReportService;
import com.fluentgrid.mdms.service.RequestTypeMService;
import com.fluentgrid.mdms.utils.JsonUtil;
import com.fluentgrid.mdms.vo.AlarmDetails;
import com.fluentgrid.mdms.vo.CategoryMaster;
import com.fluentgrid.mdms.vo.OfficeMaster;
import com.google.gson.Gson;

@RestController
@RequestMapping("/mdms")
public class MdmRestController {

	private static final Logger logger = LogManager.getLogger(MdmRestController.class);

	@Autowired
	private RequestTypeMService requestTypeMService;

	@Autowired
	private AlarmReportService alarmReportService;

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
	@PostMapping(value = "/alarmReport", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> alarmReportHandler(@RequestBody String request) {
		logger.info("alarmReport checker..");
		ResponseEntity<String> responseEntity = null;
		JSONObject result = null;
		result = new JSONObject();
		String resultant = "";
		Gson gson = new Gson();

		try {
			JSONObject reqJson = null;
			reqJson = (JSONObject) new JSONParser().parse(request);
			logger.info("/alarmReport requster = " + reqJson);

			List<AlarmDetails> alarmDetails = alarmReportService.fetchAlarmReport(reqJson.get("alarmName").toString(),
					reqJson.get("fromDate").toString(), reqJson.get("toDate").toString());

			if (alarmDetails != null && !alarmDetails.isEmpty()) {
				logger.info("/alarmReport resultant size = " + alarmDetails.size());
				// resultant = JsonUtil.objToJson(alarmDetails);
				// resultant = new ObjectMapper().writeValueAsString(alarmDetails);
			}

			logger.info("resultant = " + resultant);
			result.put("message", "success");
			// result.put("data", resultant);
			result.put("responseCode", HttpStatus.OK);

			responseEntity = new ResponseEntity<String>(result.toString(), HttpStatus.OK);

		} catch (Exception e) {
			e.printStackTrace();
			responseEntity = new ResponseEntity<String>(result.toString(), HttpStatus.EXPECTATION_FAILED);
		}
		return responseEntity;
	}

	@SuppressWarnings("unchecked")
	@PostMapping(value = "/getAlarmReport", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> getAlarmReportHandler(@RequestBody String request) {
		logger.info("getAlarmReport checker..");
		ResponseEntity<String> responseEntity = null;
		JSONObject result = null;
		result = new JSONObject();
		String resultant = "";
		Gson gson = new Gson();

		try {
			JSONObject reqJson = null;
			reqJson = (JSONObject) new JSONParser().parse(request);
			logger.info("/getAlarmReport requster = " + reqJson);
				
			List<AlarmReportDto> alarmDetails = alarmReportService.getAlarmDetails(reqJson.get("alarmName").toString(),
					reqJson.get("fromDate").toString(), reqJson.get("toDate").toString());
			
			if(alarmDetails!=null && !alarmDetails.isEmpty()) {
				logger.info("alarmDetails size == " + alarmDetails.size());
				resultant = JsonUtil.objToJson(alarmDetails);
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

	@SuppressWarnings("unchecked")
	@PostMapping(value = "/alarmReportOnNativeSQL", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> alarmReportOnNativeSQL(@RequestBody String request) {
		logger.info("alarmReportOnNativeSQL checker..");
		ResponseEntity<String> responseEntity = null;
		JSONObject result = null;
		result = new JSONObject();
		String resultant = "";
		Gson gson = new Gson();

		try {
			JSONObject reqJson = null;
			reqJson = (JSONObject) new JSONParser().parse(request);
			logger.info("/alarmReportOnNativeSQL requster = " + reqJson);

			List<AlarmReportDto> alarmDetails = alarmReportService.fetchAlarmReportOnNativeSQL(
					reqJson.get("alarmName").toString(), reqJson.get("fromDate").toString(),
					reqJson.get("toDate").toString());

			if (alarmDetails != null && !alarmDetails.isEmpty()) {
				logger.info("/alarmReportOnNativeSQL resultant size = " + alarmDetails.size());
				resultant = JsonUtil.objToJson(alarmDetails);
				// resultant = new ObjectMapper().writeValueAsString(alarmDetails);
			}

			logger.info("resultant = " + resultant);
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