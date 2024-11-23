package com.inditoday.Tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.indiatoday.TestBase.TestBase;
import com.indiatoday.utils.DriverFactory;
import com.indiatoday.utils.TestListerners;
import com.inditoday.pages.HomePage;


public class HomePageValidationTest {
	
	
	WebDriver driver = DriverFactory.getDriver(TestBase.getProperty("browserName"));
	
	HomePage home = PageFactory.initElements(driver, HomePage.class);
	
	private ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	public void setUp() {
		report = TestListerners.extReport();
		driver.get(TestBase.getProperty("url"));
	}
	
	
	@Test
	public void homeTest() {
		test = report.createTest("HomePageValidation Started");
		String name = home.logoName();
		assertTrue(name.equalsIgnoreCase("flipkart"));
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		if(result.isSuccess()) {
			test.pass("passed");
		}else {
			test.fail("failed");
		}
		
		driver.quit();
		
	}

}
