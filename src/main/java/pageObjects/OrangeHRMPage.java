package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverManager;

public class OrangeHRMPage {

	By usernametextbox_name = By.name("username");
	By passwordtextbox_name = By.name("password");
	By loginbutton_xpath = 	By.xpath("//button[@type=\"submit\"]");
	By userprofiledd_xpath = By.xpath("//span[@class=\"oxd-userdropdown-tab\"]");
	By logoutbutton_xpath = By.xpath("//a[@href=\"/web/index.php/auth/logout\"]");
	
	public OrangeHRMPage enterUsername(String username) {
		DriverManager.getDriver().findElement(usernametextbox_name).sendKeys(username);
		return this;
	}
	
	public OrangeHRMPage enterPassword(String password) {
		DriverManager.getDriver().findElement(passwordtextbox_name).sendKeys(password);
		return this;
	}
	
	public OrangeHRMPage clickLogin() {
		DriverManager.getDriver().findElement(loginbutton_xpath).click();
		return this;
	}
	
	public OrangeHRMPage clickLogout() {
		Actions chain = new Actions(DriverManager.getDriver());
		chain.moveToElement(DriverManager.getDriver().findElement(userprofiledd_xpath)).click()
		.pause(Duration.ofSeconds(3)).perform();
		chain.moveToElement(DriverManager.getDriver().findElement(logoutbutton_xpath)).click().perform();		
		return this;
	}
	
	public OrangeHRMPage waitSometime() throws InterruptedException {
		Thread.sleep(5000);
		return this;
	}
	
	public String getTitle() {
		return DriverManager.getDriver().getTitle();
	}
}
