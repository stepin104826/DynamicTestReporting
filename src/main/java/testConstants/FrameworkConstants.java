package testConstants;

public class FrameworkConstants {
	
	private static final String CHROMEDRIVERPATH = "C:\\WebDrivers\\chromedriver-win64\\chromedriver.exe";
	private static final String FIREFOXDRIVERPATH =  "C:\\WebDrivers\\geckodriver\\geckodriver.exe";
	private static final String EDGEDRIVERPATH = "C:\\WebDrivers\\edgedriver\\msedgedriver.exe";
	private static final String CONFIGFILEPATH = System.getProperty("user.dir") + "/src/test/resources/Configuration/config.properties";
	private static final String REPORTSFOLDERPATH = System.getProperty("user.dir") + "/ExtentReports";
		
	
	public static String getChromeDriverPath() {
		return CHROMEDRIVERPATH;
	}
	
	
	public static String getFirefoxDriverPath() {
		return FIREFOXDRIVERPATH;
	}
	
	
	public static String getEdgeDriverPath() {
		return EDGEDRIVERPATH;
	}


	public static String getConfigfilepath() {
		return CONFIGFILEPATH;
	}
	
	public static String getReportsfolderpath() {
		return REPORTSFOLDERPATH;
	}

}
