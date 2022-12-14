package com.fluentgrid.mdms.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DateUtil {
	private static final Logger logger = LogManager.getLogger(DateUtil.class);

	public static Date convertToDayAndHour(String id) {

		try {

			int hrs = Integer.parseInt(id);
			int day = hrs / 24;
			int hrscompltd = day * 24;
			int dayhr = hrs - hrscompltd;

			day += 1;
			String hrmm = "";

			if (hrs == 23 || hrs == 47 || hrs == 71 || hrs == 95 || hrs == 119 || hrs == 143 || hrs == 167 || hrs == 191
					|| hrs == 215 || hrs == 239 || hrs == 263 || hrs == 287 || hrs == 311 | hrs == 335 || hrs == 359
					|| hrs == 383 || hrs == 407 || hrs == 431 || hrs == 455 || hrs == 479 || hrs == 503 || hrs == 527
					|| hrs == 551 || hrs == 575 || hrs == 599 || hrs == 623 || hrs == 647 || hrs == 671 || hrs == 695
					|| hrs == 719 || hrs == 743) {

				hrmm = ":59:59";
			} else {
				hrmm = ":00:00";
				dayhr += 1;

			}

			System.out.println("day" + day);

			Date today = new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(today);
			int month = 0;
			int year = cal.get(Calendar.YEAR);

			if (hrs > 360 && day <= 6) {

				month = cal.get(Calendar.MONTH);
			} else {

				month = cal.get(Calendar.MONTH) + 1;
			}

			String getdate = year + "-" + month + "-" + day;

			String startDate = getdate + " " + dayhr + hrmm;
			TimeZone.setDefault(TimeZone.getTimeZone("IST"));
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			sdf1.setTimeZone(TimeZone.getTimeZone("IST"));

			java.util.Date date = sdf1.parse(startDate);
			System.out.println("utilDate " + date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());

			System.out.println("sqlDate " + sqlDate);

			return sqlDate;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Date convertToDayAndHourForMissingPkt(String id) {

		try {

			int hrs = Integer.parseInt(id);
			int day = hrs / 24;
			int hrscompltd = day * 24;
			int dayhr = hrs - hrscompltd;

			day += 1;
			String hrmm = "";

			if (hrs == 23 || hrs == 47 || hrs == 71 || hrs == 95 || hrs == 119 || hrs == 143 || hrs == 167 || hrs == 191
					|| hrs == 215 || hrs == 239 || hrs == 263 || hrs == 287 || hrs == 311 | hrs == 335 || hrs == 359
					|| hrs == 383 || hrs == 407 || hrs == 431 || hrs == 455 || hrs == 479 || hrs == 503 || hrs == 527
					|| hrs == 551 || hrs == 575 || hrs == 599 || hrs == 623 || hrs == 647 || hrs == 671 || hrs == 695
					|| hrs == 719 || hrs == 743) {

				hrmm = ":59:59";
			} else {
				hrmm = ":00:00";
				dayhr += 1;

			}

			System.out.println("day" + day);

			Date today = new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(today);
			int month = 0;
			int year = cal.get(Calendar.YEAR);

			if (hrs > 360 && day <= 6) {

				month = cal.get(Calendar.MONTH);
			} else {

				month = cal.get(Calendar.MONTH) + 1;
			}

			String getdate = year + "-" + (month - 1) + "-" + day;

			String startDate = getdate + " " + dayhr + hrmm;
			TimeZone.setDefault(TimeZone.getTimeZone("IST"));
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			sdf1.setTimeZone(TimeZone.getTimeZone("IST"));

			java.util.Date date = sdf1.parse(startDate);
			System.out.println("utilDate " + date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());

			System.out.println("sqlDate " + sqlDate);

			return sqlDate;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Date convertDevMapIdToDate(String id) {

		try {

			int hrs = Integer.parseInt(id);
			int day = hrs / 24;
			int hrscompltd = day * 24;
			int dayhr = hrs - hrscompltd;

			day += 1;
			String hrmm = "";

			if (hrs == 23 || hrs == 47 || hrs == 71 || hrs == 95 || hrs == 119 || hrs == 143 || hrs == 167 || hrs == 191
					|| hrs == 215 || hrs == 239 || hrs == 263 || hrs == 287 || hrs == 311 | hrs == 335 || hrs == 359
					|| hrs == 383 || hrs == 407 || hrs == 431 || hrs == 455 || hrs == 479 || hrs == 503 || hrs == 527
					|| hrs == 551 || hrs == 575 || hrs == 599 || hrs == 623 || hrs == 647 || hrs == 671 || hrs == 695
					|| hrs == 719 || hrs == 743) {

				hrmm = ":59:59";
			} else {
				hrmm = ":00:00";
				dayhr += 1;

			}

			System.out.println("day" + day);

			Date today = new Date();
			Calendar cal = Calendar.getInstance();
			cal.setTime(today);
			int month = 0;
			int year = cal.get(Calendar.YEAR);

			if (hrs > 360 && day <= 6) {

				month = cal.get(Calendar.MONTH);
			} else {

				month = cal.get(Calendar.MONTH) + 1;
			}

			String getdate = year + "-" + month + "-" + day;

			String startDate = getdate + " " + dayhr + hrmm;
			TimeZone.setDefault(TimeZone.getTimeZone("IST"));
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			sdf1.setTimeZone(TimeZone.getTimeZone("IST"));

			java.util.Date date = sdf1.parse(startDate);
			System.out.println("utilDate " + date);
			java.sql.Date sqlDate = new java.sql.Date(date.getTime());

			System.out.println("sqlDate " + sqlDate);

			return sqlDate;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Date convertStringToDate(String strTime, String srcFormat, String destFormat) {
		Date date = null;
		try {
			DateFormat srcFormatter = new SimpleDateFormat(srcFormat);
			date = srcFormatter.parse(strTime);
			DateFormat destFormatter = new SimpleDateFormat(destFormat);
			System.out.println("str date in dest format : " + destFormatter.format(date));
			date = destFormatter.parse(destFormatter.format(date));
		} catch (Exception e) {
			logger.error("error in Timestamp", e);
		}
		System.out.println("Dateeeeeeeee" + date);
		return date;
	}
	public static Date convertDateTimeStrToDateTime(String strDateTime) {
		
		DateTimeFormatter inSDF = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter outSDF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		Date formattedDate = null;
		try{
		   String dateString = outSDF.format(inSDF.parse(strDateTime));
		   formattedDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
		}catch (Exception e) {
		   e.printStackTrace();
		}
		return formattedDate;
	}
	public static Date getDateFromStringDate(String strDate, String destFormat) {
		Date date = null;
		try {
			
			DateFormat destFormatter = new SimpleDateFormat(destFormat);
			System.out.println("str date in dest format : " + destFormatter.format(strDate));
			date = destFormatter.parse(destFormatter.format(strDate));
		} catch (Exception e) {
			logger.error("error in Timestamp", e);
		}
		System.out.println("Dateeeeeeeee" + date);
		return date;
	}

	public static String convertDateToStringFormat(String date) {

		String formattedTime = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSXX");
			SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			output.setTimeZone(TimeZone.getTimeZone("IST"));
			Date d = sdf.parse(date);
			formattedTime = output.format(d);
		} catch (Exception e) {
			logger.error("error in Timestamp", e);
		}
		return formattedTime;

	}
	
	public static String convertDateStringToStringFormat(String date) {

		String formattedTime = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("mm/dd/yyyy");
			SimpleDateFormat output = new SimpleDateFormat("yyyy-mm-dd");
			output.setTimeZone(TimeZone.getTimeZone("IST"));
			Date d = sdf.parse(date);
			formattedTime = output.format(d);
		} catch (Exception e) {
			logger.error("error in Timestamp", e);
		}
		return formattedTime;

	}
	
	public static String getDateStringFromStringFormat(String date) {

		String formattedTime = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			output.setTimeZone(TimeZone.getTimeZone("IST"));
			Date d = sdf.parse(date);
			formattedTime = output.format(d);
		} catch (Exception e) {
			logger.error("error in Timestamp", e);
		}
		return formattedTime;

	}
	
	public static String getDateStringFromatString(String date) {

		String formattedTime = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyyHH:mm");
			SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			output.setTimeZone(TimeZone.getTimeZone("IST"));
			Date d = sdf.parse(date);
			formattedTime = output.format(d);
		} catch (Exception e) {
			logger.error("error in Timestamp", e);
		}
		return formattedTime;

	}
	
	public static String convertDateStringToStringTimeFormat(String date) {

		String formattedTime = "";
		try {
			//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			//SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");	
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");  
			SimpleDateFormat output = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			output.setTimeZone(TimeZone.getTimeZone("GMT"));
			Date d = sdf.parse(date);
			formattedTime = output.format(d);
		} catch (Exception e) {
			logger.error("error in Timestamp", e);
		}
		return formattedTime;

	}

	public static Date getCurrentDateTime(String format) {
		Date date = null;
		try {
			Calendar calendar = Calendar.getInstance();
			long currentDateTime = calendar.getTimeInMillis();
			DateFormat formatter = new SimpleDateFormat(format);
			formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
			// String dateStr = formatter.format(currentDateTime);
			// System.out.println("dateStr = "+dateStr);
			date = formatter.parse(formatter.format(currentDateTime));
		} catch (Exception e) {
			logger.error("error in  convertStringToTimestamp", e);
		}
		return date;
	}

	public static Date getCurrentDateTimeIST(String format) {
		Date date = null;
		try {
			Calendar calendar = Calendar.getInstance();
			long currentDateTime = calendar.getTimeInMillis();
			DateFormat formatter = new SimpleDateFormat(format);
			formatter.setTimeZone(TimeZone.getTimeZone("IST"));
			// String dateStr = formatter.format(currentDateTime);
			// System.out.println("dateStr = "+dateStr);
			date = formatter.parse(formatter.format(currentDateTime));
		} catch (Exception e) {
			logger.error("error in  convertStringToTimestamp", e);
		}
		return date;
	}

	public static Date getCurrentDateTimeIST() {
		Date date = null;
		try {
			TimeZone.setDefault(TimeZone.getTimeZone("IST"));
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			formatter.setTimeZone(TimeZone.getTimeZone("IST")); // Or whatever IST is supposed to be
			date = formatter.parse(formatter.format(new Date(System.currentTimeMillis())));

		} catch (Exception e) {
			logger.error("error in  convertStringToTimestamp", e);
		}
		return date;
	}

	public static String changeDateFromat(Date sqlFormat) {
		// System.out.println("Got Here");
		try {
			String naturalFormat = "";
			DateFormat formatter;
			formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			formatter.setTimeZone(TimeZone.getTimeZone("IST"));
			naturalFormat = formatter.format(sqlFormat);

			// System.out.println("Date" + naturalFormat);
			return naturalFormat;
		} catch (Exception e) {
			// System.out.println("Error" + e);
			return sqlFormat.toString();
		}
	}

	public static String changeDateFromatIST(Date sqlFormat) {
		// System.out.println("Got Here");
		try {
			String naturalFormat = "";
			DateFormat formatter;
			formatter = new SimpleDateFormat("yyyy-MM-dd");
			naturalFormat = formatter.format(sqlFormat);

			// System.out.println("Date" + naturalFormat);
			return naturalFormat;
		} catch (Exception e) {
			// System.out.println("Error" + e);
			return sqlFormat.toString();
		}
	}

	public static Date convertLongToDate(long longTime, String format) {
		Date date = null;
		try {
			DateFormat formatter = new SimpleDateFormat(format);
			formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(longTime);
			System.out.println(formatter.format(calendar.getTime()));
			date = formatter.parse(formatter.format(calendar.getTime()));
		} catch (Exception e) {

			logger.error("error in Timestamp", e);
		}
		return date;
	}

	public static Date convertLongToDateIST(long longTime, String format) {
		Date date = null;
		try {
			DateFormat formatter = new SimpleDateFormat(format);
			// formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
			formatter.setTimeZone(TimeZone.getTimeZone("IST"));
			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(longTime);
			System.out.println(formatter.format(calendar.getTime()));
			date = formatter.parse(formatter.format(calendar.getTime()));
		} catch (Exception e) {

			logger.error("error in Timestamp", e);
		}
		return date;
	}

	public static Date convertLongToDateNoZone(long longTime, String format) {
		Date date = null;
		try {
			DateFormat formatter = new SimpleDateFormat(format);
			// formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
			// formatter.setTimeZone(TimeZone.getTimeZone("IST"));
			Calendar calendar = Calendar.getInstance();
			calendar.setTimeInMillis(longTime);
			System.out.println(formatter.format(calendar.getTime()));
			date = formatter.parse(formatter.format(calendar.getTime()));
		} catch (Exception e) {

			logger.error("error in Timestamp", e);
		}
		return date;
	}
	
	
	public static String getDateStringFromString(String date) {

		String formattedTime = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat output = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			output.setTimeZone(TimeZone.getTimeZone("IST"));
			Date d = sdf.parse(date);
			formattedTime = output.format(d);
		} catch (Exception e) {
			logger.error("error in Timestamp", e);
		}
		return formattedTime;

	}
	
	public static String getDateStringFromDate(Date date) {

		String formattedTime = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat output = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			output.setTimeZone(TimeZone.getTimeZone("IST"));
			formattedTime = output.format(date);
		} catch (Exception e) {
			logger.error("error in Timestamp", e);
		}
		return formattedTime;

	}
	
	public static String getDateStringFromStringDate(String date) {

		String formattedTime = "";
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			SimpleDateFormat output = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
			output.setTimeZone(TimeZone.getTimeZone("IST"));
			Date d = sdf.parse(date);
			formattedTime = output.format(d);
			String[] str = formattedTime.split("-");
			String monthName = getMonthName(str[1]);
			if(!monthName.isEmpty()) {
				formattedTime = str[0]+"-"+monthName+"-"+str[2];	
			}
			
			
		} catch (Exception e) {
			logger.error("error in Timestamp", e);
		}
		return formattedTime;

	}
	
	public static String getMonthName(String str) {
		
		if(str.equals("01")) {
			return "Jan";
		}else if(str.equals("02")) {
			return "Feb";
		}else if(str.equals("03")) {
			return "Mar";
		}else if(str.equals("04")) {
			return "Apr";
		}else if(str.equals("05")) {
			return "May";
		}else if(str.equals("06")) {
			return "Jun";
		}else if(str.equals("07")) {
			return "Jul";
		}else if(str.equals("08")) {
			return "Aug";
		}else if(str.equals("09")) {
			return "Sep";
		}else if(str.equals("10")) {
			return "Oct";
		}else if(str.equals("11")) {
			return "Num";
		}else if(str.equals("12")) {
			return "Dec";
		}else {
			return "";
		}
		
	}

}