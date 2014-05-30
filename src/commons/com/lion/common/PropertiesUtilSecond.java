package com.lion.common;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 *解析properties文件 试用inputstream 
 *要指定lion.properties文件的路径;
 */
public class PropertiesUtilSecond {
	public static void main(String[] args) {
		try {
			InputStream in=new FileInputStream("lion.properties");
			Properties prop=new Properties();
			prop.load(in);
			System.out.println(prop.getProperty("username"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
