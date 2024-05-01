package tests;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Objects;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import drivers.Driver;
import extentReports.ExtentManager;
import extentReports.ExtentReporting;

public class BaseTest {

	@BeforeSuite
	public void beforeSuite() {
		
	}
	
	@AfterSuite
	public void afterSuite() throws IOException {
		
	}
	
	@BeforeMethod
	public void setUp(Method m) throws Exception{
		Driver.initDriver();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		Driver.quitDriver();
	}
}
