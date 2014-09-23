package com.lion.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 日期工具类
 */
public class DateUtil {
	/** 格式: HH:mm */
	private static final String FORMAT_HHMM = "HH:mm";
	/** 格式：HH:mm:ss */
	private static final String FORMAT_HHMMSS = "HH:mm:ss";
	/** 格式: yyyy-MM-dd */
	private static final String FORMAT_YYYYMMDD = "yyyy-MM-dd";
	/** 格式：yyyy-MM-dd HH:mm:ss */
	private static final String FORMAT_YYYYMMDDHHMMSS = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 日期格式化为指定格式
	 * 
	 * @param date
	 *            日期
	 * @param format
	 *            格式
	 * @return 字符串
	 */
	public static String dateFormatStr(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	/**
	 * 字符串转换为指定格式的日期
	 * 
	 * @param dateStr
	 *            日期字符串
	 * @param format
	 *            格式
	 * @return
	 */
	public static Date strParseDate(String dateStr, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		try {
			return sdf.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 判断当前时间是否在工作时间内
	 * 
	 * @return true:在工作时间内;false:不在工作时间内;
	 */
	public static boolean compareWorktime(String start, String end) {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_HHMM);
		String currentTime = sdf.format(currentDate).toString();// 当前时间
		Date amStart = null;
		Date amEnd = null;
		Date current = null;
		try {
			amStart = sdf.parse(start);
			amEnd = sdf.parse(end);
			current = sdf.parse(currentTime);
			if (compare(current, amStart, amEnd)) {
				return true;
			} else {
				return false;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 判断时间大小
	 * 
	 * @param current
	 *            当前时间
	 * @param start
	 *            开始时间
	 * @param end
	 *            结束时间
	 * @return
	 */
	public static boolean compare(Date current, Date start, Date end) {
		if ((current.getTime() >= start.getTime()) && (current.getTime() <= end.getTime())) {// 在start和end的时间段内;
			return true;
		} else {
			return false;
		}
	}

	/**
	 * 比较date1和date2的大小
	 * 
	 * @param date1
	 * @param date2
	 * @return 1 date1>date2; -1 date1<date2 ;0 date1=date2
	 */
	public static int compare(Date date1, Date date2) {
		if (date1.getTime() > date2.getTime()) {
			return 1;
		} else if (date1.getTime() < date2.getTime()) {
			return -1;
		} else {
			return 0;
		}
	}

	/**
	 * 计算两个日期的天数查
	 * 
	 * @param endDate
	 *            结束日期
	 * @param nowDate
	 *            当前日期
	 * @return
	 * @throws Exception
	 */
	public static int daysBetween(Date endDate, Date nowDate) throws Exception {
		SimpleDateFormat sf = new SimpleDateFormat(FORMAT_YYYYMMDD);
		endDate = sf.parse(sf.format(endDate));
		nowDate = sf.parse(sf.format(nowDate));
		Calendar cal = Calendar.getInstance();
		cal.setTime(endDate);
		long time1 = cal.getTimeInMillis();
		cal.setTime(nowDate);
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);
		return Integer.parseInt(String.valueOf(between_days));
	}

	/**
	 * 字符两个日期计算天数差
	 * 
	 * @param smdate
	 * @param bdate
	 * @return
	 * @throws ParseException
	 */
	public static int daysBetween(String smdate, String bdate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.setTime(sdf.parse(smdate));
		long time1 = cal.getTimeInMillis();
		cal.setTime(sdf.parse(bdate));
		long time2 = cal.getTimeInMillis();
		long between_days = (time2 - time1) / (1000 * 3600 * 24);
		return Integer.parseInt(String.valueOf(between_days));
	}

	public static void main(String[] args) throws Exception {
		// System.out.println(dateFormatStr(new Date(), FORMAT_YYYYMMDD));
		// System.out.println(dateFormatStr(new Date(), FORMAT_YYYYMMDDHHMMSS));
		// System.out.println(dateFormatStr(new Date(), FORMAT_HHMMSS));
		// System.out.println(strParseDate("2013-05-06", FORMAT_YYYYMMDD));
		// System.out.println(strParseDate("2013-05-06 08:09:09",
		// FORMAT_YYYYMMDDHHMMSS));
		System.out.println(daysBetween("2014-09-05", "2014-09-05"));
		System.out.println(daysBetween(strParseDate("2014-09-23", FORMAT_YYYYMMDD), new Date()));
	}
}
