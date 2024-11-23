package com.indiatoday.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestListerners{
	
	static ExtentReports report;
	ExtentTest Test;
	
	public static ExtentReports extReport() {
		
		ExtentReports report = new ExtentReports();
		String reportPath = System.getProperty("user.dir")+"/Report/test.html";
		
		ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
		report.attachReporter(spark);
		
		return report;
		
		
	}

}
