package org.tyss.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	private Properties properties;
	public void initializePropertiesFile(String filePath)
	{
		FileInputStream fis=null;
		try {
			 fis=new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 properties=new Properties();
		try {
			properties.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getDataFromPropertyFile(String key)
	{
	return	properties.getProperty(key);
	
	}

}
