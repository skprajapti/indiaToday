package com.indiatoday.TestBase;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class TestBase {
	
	public static String getProperty(final String key) {
		
		Properties prop = new Properties();
		String filepath= System.getProperty("user.dir")+"/src/main/resources/config.properties";
		
		FileInputStream fis;
		
		try {
			fis = new FileInputStream(filepath);
			prop.load(fis);
		}catch(Exception e) {
			
			e.printStackTrace();
		}
		
		String value = prop.get(key).toString();
		if (StringUtils.isEmpty(value)) {
			try {
				throw new Exception("value for"+key+"not found");
				
			}catch(Exception e) {}
		}
		return value;
		
	}

}
