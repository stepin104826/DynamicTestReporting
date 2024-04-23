package tests;

import java.util.ArrayList;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import testConstants.FrameworkConstants;

import drivers.Driver;
import drivers.DriverManager;
public final class LoginPageTests extends BaseTest{

	@Test
	public void test1() throws InterruptedException {
		String pageTitle = DriverManager.getDriver().getTitle();
		Assertions.assertThat(pageTitle)
				  .as("The title is not equal to 'Google'").isEqualTo("Google");
		DriverManager.getDriver().findElement(By.id("APjFqb")).sendKeys("Football",Keys.ENTER);
		Thread.sleep(5000);
	}

	@Test
	public void test2() throws InterruptedException {
		List<WebElement> input_elements = DriverManager.getDriver().findElements(By.xpath("//input"));
		System.out.println("Number of input elements: " + input_elements.size());
		Assertions.assertThat(input_elements)
			      .hasSizeGreaterThan(10)
			      .doesNotHaveDuplicates()
			      .as("List is empty!").isNotEmpty();	
		DriverManager.getDriver().findElement(By.id("APjFqb")).sendKeys("LTTS",Keys.ENTER);
		Thread.sleep(5000);
		
	}

}
