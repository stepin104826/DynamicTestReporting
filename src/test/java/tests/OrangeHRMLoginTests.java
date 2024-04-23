package tests;

import java.time.Duration;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import org.assertj.core.api.Assertions;

import drivers.DriverManager;
import pageObjects.OrangeHRMPage;
import tests.BaseTest;

public class OrangeHRMLoginTests extends BaseTest{

	
	@Test(dataProvider = "getData")
	public void test1(String username, String password) throws Exception {
		
		OrangeHRMPage ohrmlObject = new OrangeHRMPage();
		OrangeHRMPage Homepage = ohrmlObject.enterUsername(username)
				   .enterPassword(password)
				   .clickLogin()
				   .waitSometime();
		
		String homePageTitle = Homepage.getTitle();

		Assertions.assertThat(homePageTitle)
				  .as("Home page title not equal to OrangeHRM").isEqualTo("OrangeHRM");
		
		String title = Homepage.clickLogout().waitSometime().getTitle();
		
		Assertions.assertThat(title)
				  .containsIgnoringCase("Orange");
		
		
	}
	
	@DataProvider
	public Object[][] getData() {
		return new Object[][] {
			{"Admin" , "admin123"},
			{"Admin123","admin1234"}
		};
	}
	
}
