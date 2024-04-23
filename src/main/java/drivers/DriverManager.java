package drivers;

import org.openqa.selenium.WebDriver;

public class DriverManager {

private static ThreadLocal<WebDriver> dr = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		return dr.get();
	}
	
	public static void setDriver(WebDriver drivervar) {
		dr.set(drivervar);
	}
	
	public static void unload() {
		dr.remove();
	}
	
}
