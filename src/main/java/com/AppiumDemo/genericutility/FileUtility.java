package com.AppiumDemo.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String getCapability(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\DesiredCapabilities.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
	
	public String getCredentials(String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\TestData.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
	}
}
