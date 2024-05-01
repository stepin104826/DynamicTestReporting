package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import drivers.DriverManager;
import extentLogging.ExtentLogger;

public class OrangeHRMHomePage{
	
	By userprofiledd_xpath = By.xpath("//span[@class=\"oxd-userdropdown-tab\"]");
	By logoutbutton_xpath = By.xpath("//a[@href=\"/web/index.php/auth/logout\"]");
	By dashboard_xpath = By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[1]/span/h6");
	
	public OrangeHRMHomePage clickLogout() {
		Actions chain = new Actions(DriverManager.getDriver());
		chain.moveToElement(DriverManager.getDriver().findElement(userprofiledd_xpath)).click()
		.pause(Duration.ofSeconds(3)).perform();
		chain.moveToElement(DriverManager.getDriver().findElement(logoutbutton_xpath)).click().perform();		
		ExtentLogger.pass("Logged out successfully!");
		return this;
	}
	
	public OrangeHRMHomePage waitSometime() throws InterruptedException {
		Thread.sleep(5000);
		return this;
	}
	
	public String getDashboardText() {
		return DriverManager.getDriver().findElement(dashboard_xpath).getText();
	}

}
