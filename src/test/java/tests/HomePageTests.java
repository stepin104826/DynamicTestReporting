package tests;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import drivers.Driver;
import drivers.DriverManager;
import testConstants.FrameworkConstants;

public final class HomePageTests extends BaseTest{


	@Test
	public void test3(){
		DriverManager.getDriver().manage().window().maximize();
		WebElement searchbox = DriverManager.getDriver().findElement(By.id("APjFqb"));
		searchbox.sendKeys("Cricket",Keys.ENTER);
	}
}
