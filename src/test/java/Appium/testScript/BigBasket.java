package Appium.testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.tyss.genericUtility.ExcelUtility;
import org.tyss.genericUtility.FileUtility;
import org.tyss.genericUtility.IConstants;
import org.tyss.genericUtility.JavaUtility;
import org.tyss.genericUtility.MobileDriverUtility;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BigBasket {
	FileUtility fileUtility = new FileUtility();
	ExcelUtility excelUtility = new ExcelUtility();
	MobileDriverUtility mobileDriverUtility=new MobileDriverUtility();
	JavaUtility javaUtility = new JavaUtility();
	AndroidDriver driver;
	String prodXpath = "//[.='%s']";
	@Test
	public void bigb() throws MalformedURLException
	{
		
		fileUtility.initializePropertiesFile(IConstants.ECOMMPROPERTYFILEPATH);
		excelUtility.initializeExcelFile(IConstants.ECOMMEXCELFILEPATH);
		String timeouts = fileUtility.getDataFromPropertyFile("timeouts");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "com.bigbasket.mobileapp");
		dc.setCapability("appActivity", ".activity.DeepLinkDispatcherActivity");
		URL url = new URL("http://localhost:4723/wd/hub");
		 driver=new AndroidDriver(url, dc);
		Long longTimeOut = javaUtility.convertStringToLong(timeouts);
		mobileDriverUtility.implicitWait(longTimeOut);
		mobileDriverUtility.tapAction(1, 347, 280, 500);
		
		String expectedProd = excelUtility.getDataFromExcel(3, 1, "Products");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Search products']")).sendKeys("expectedProd");
		
		
		
	}
	
	public WebElement convertXpathToDynamicElement(String xPath, String replace)
	{
		String x = String.format(xPath, replace);
		return driver.findElement(By.xpath(xPath));
		
	}
	

}
