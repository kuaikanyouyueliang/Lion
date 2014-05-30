package com.lion.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 解析properties文件
 * 添加：
 * 1.定义静态变量;
 * 2.在static块里面为静态变量赋值;
 */
public class PropertiesUtil {
	public static String USERNAME = "";
	public static String PASSWORD = "";
	static {
		try {
			InputStream in = PropertiesUtil.class.getClassLoader().getResourceAsStream("lion.properties");
			Properties prop = new Properties();
			prop.load(in);
			USERNAME = prop.getProperty("username");
			PASSWORD = prop.getProperty("password");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
