package com.lion.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
public class DateUtils {
	/**格式: HH:mm*/
	public static final String FORMAT_HH_MM="HH:mm";
	/**格式：HH:mm:ss*/
	public static final String FORMAT_HH_MM_SS="HH:mm:ss";
	
	/**
	 * 判断当前时间是否在工作时间内
	 * @return true:在工作时间内;false:不在工作时间内;
	 */
	public static boolean compareWorktime(String start,String end) {
		Date currentDate = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(FORMAT_HH_MM);
		String currentTime = sdf.format(currentDate).toString();//当前时间
		Date amStart = null;
		Date amEnd = null;
		Date current = null;
		try {
			amStart = sdf.parse(start);
			amEnd = sdf.parse(end);
			current = sdf.parse(currentTime);
			if(compare(current,amStart,amEnd)){
				return true;
			}else{
				return false;
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return false;
	}
	/**
	 * 判断时间大小
	 * @param current 当前时间
	 * @param start 开始时间
	 * @param end 结束时间
	 * @return
	 */
	public static boolean compare(Date current,Date start,Date end){
		if ((current.getTime() >= start.getTime()) && (current.getTime() <= end.getTime())) {//在start和end的时间段内;
			return true;
		} else {
			return false;
		}
	}
	/**
	 * 比较date1和date2的大小
	 * @param date1
	 * @param date2
	 * @return 1 date1>date2; -1 date1<date2 ;0 date1=date2
	 */
	public static int compare(Date date1,Date date2){
		if(date1.getTime()>date2.getTime()){
			return 1;
		}else if(date1.getTime()<date2.getTime()){
			return -1;
		}else{
			return 0;
		}
	}
	public static void main(String[] args) {
		
	}
}
