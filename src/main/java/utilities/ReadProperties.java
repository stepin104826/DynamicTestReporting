package utilities;
import testConstants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class ReadProperties{
	

	private static Properties prop = new Properties();
	
	static {
		try {
			FileInputStream file = new FileInputStream(FrameworkConstants.getConfigfilepath());
			prop.load(file);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException E) {
			E.printStackTrace();
		}
	}
	
	public static String getValOf(String key) {
		return prop.getProperty(key);
	}

}