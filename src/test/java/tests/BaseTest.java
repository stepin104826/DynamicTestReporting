package tests;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import drivers.Driver;

public class BaseTest {

	
	@BeforeMethod
	public void setUp() throws Exception{
		Driver.initDriver();
	}
	
	@AfterMethod
	public void tearDown() {
		Driver.quitDriver();
	}
}
