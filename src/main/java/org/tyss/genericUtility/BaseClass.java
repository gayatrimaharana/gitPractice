package org.tyss.genericUtility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass {
	AppiumDriverLocalService service;
	AndroidDriver driver;
	@BeforeSuite
	public void openDB()
	{
		System.out.println("open db");
	}
	
	@BeforeClass
	public void startServer() throws MalformedURLException
	
	{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "R9ZNC03VN6X");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url, dc);
	}
//	{
//		service=AppiumDriverLocalService.buildDefaultService();
//		service.start();
//	}
	@BeforeMethod
	public void openApp() throws MalformedURLException
	{
		
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.closeApp();
	}
	
	@AfterClass
	public void stopServer()
	{
		service.stop();
	}
	
	

}
