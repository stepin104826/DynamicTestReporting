package tests;

import java.time.Duration;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import org.assertj.core.api.Assertions;

import drivers.DriverManager;
import extentLogging.ExtentLogger;
import extentReports.ExtentManager;
import extentReports.ExtentReporting;
import pageObjects.OrangeHRMHomePage;
import pageObjects.OrangeHRMLoginPage;
import tests.BaseTest;

public class OrangeHRMLoginTests extends BaseTest{

	
	@Test(dataProvider = "getData")
	public void test1(String username, String password) throws Exception {
		
		OrangeHRMLoginPage Loginpage= new OrangeHRMLoginPage();
		String LoginPageTitle = Loginpage.getTitle();
		
		Assertions.assertThat(LoginPageTitle)
				  .containsIgnoringCase("Orange");
			
		Loginpage.enterUsername(username)		
			 .enterPassword(password)
			 .clickLogin()
			 .waitSometime();
		
		OrangeHRMHomePage Homepage = new OrangeHRMHomePage();
		
		String Dashboardtitle = Homepage.getDashboardText();
		
		Assertions.assertThat(Dashboardtitle)
				  .as("Wrong Dashboard title").containsIgnoringCase("dashboard");	
		
		Homepage.clickLogout();
		
		Assertions.assertThat(LoginPageTitle)
		  .containsIgnoringCase("Orange");
	}
	
	@DataProvider(parallel = true)
	public Object[][] getData() {
		return new Object[][] {
			{"Admin" , "admin123"},
			{"asca","asdecf"}
		};
	}
	
}
