package cn.cqupt;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Test {
	public static void main(String args[]) {
		Properties properties = new Properties();
		String projectPath = System.getProperty("user.dir");
		
		String propertiesPath = projectPath + File.separator + "resourcse" + File.separator + "first.properties";
		try{
			InputStream in = new FileInputStream(projectPath);
			properties.load(in);
			System.out.println(properties.get("key1"));
			System.out.println(properties.get("key2"));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
