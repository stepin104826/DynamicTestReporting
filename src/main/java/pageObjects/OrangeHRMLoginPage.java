package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverManager;
import extentLogging.ExtentLogger;

public class OrangeHRMLoginPage {

	By usernametextbox_name = By.name("username");
	By passwordtextbox_name = By.name("password");
	By loginbutton_xpath = 	By.xpath("//button[@type=\"submit\"]");
	
	
	public OrangeHRMLoginPage enterUsername(String username) {
		DriverManager.getDriver().findElement(usernametextbox_name).sendKeys(username);
		ExtentLogger.pass("Username entered successfully: "+ username);
		return this;
	}
	
	public OrangeHRMLoginPage enterPassword(String password) {
		DriverManager.getDriver().findElement(passwordtextbox_name).sendKeys(password);
		ExtentLogger.pass("Password entered successfully: "+ password);
		return this;
	}
	
	public OrangeHRMLoginPage clickLogin() {
		DriverManager.getDriver().findElement(loginbutton_xpath).click();
		ExtentLogger.pass("Login clicked");
		return this;
	}
	
	public OrangeHRMLoginPage waitSometime() throws InterruptedException {
		Thread.sleep(5000);
		return this;
	}
	
	public String getTitle() {
		return DriverManager.getDriver().getTitle();
	}
}
