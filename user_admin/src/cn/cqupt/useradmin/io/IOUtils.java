package cn.cqupt.useradmin.io;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class IOUtils {
	public static Properties loadProperties(String dir, String fileName) {
		Properties properties = new Properties();
		String projectDir = System.getProperty("user.dir");
		String propertiesFilePath = projectDir + File.separator + dir + File.separator + fileName;
		try {
			properties.load(new FileInputStream(new File(propertiesFilePath)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}
}
