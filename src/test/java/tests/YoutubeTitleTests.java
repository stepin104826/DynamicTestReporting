package tests;

import org.testng.annotations.Test;

import java.util.Objects;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;

import drivers.Driver;
import drivers.DriverManager;
import testConstants.FrameworkConstants;

import org.assertj.core.api.Assertions;

public class YoutubeTitleTests extends BaseTest{
	
	@Test
	public void test1() {
		String title = DriverManager.getDriver().getTitle();
		Assertions.assertThat(title)
				  .containsIgnoringCase("youtube");
	}

}
