package org.tyss.genericUtility;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MobileDriverUtility {
	DesiredCapabilities dc;
	AndroidDriver driver;
	URL url;
	public void launchApp() {
	 dc= new DesiredCapabilities();
	
	try {
		url = new URL(IConstants.ECOMMPROPERTYFILEPATH);
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 driver=new AndroidDriver(url, dc);
	}
	
	public void scrollToElement(AndroidDriver driver, String an,String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}
	
	public void dragAndDrop(WebElement src, WebElement dest)
	{
		TouchAction t=new TouchAction(driver);
		t.longPress(src).waitAction().moveTo(dest).release().perform();
		
	}
	
	public void swipeApp(int startX,int startY,int endX,int endY,int duration)
	{
		driver.swipe(startX, startY, endX, endY, duration);
	}
	
	public void tapAction(int fingure, WebElement element, int duration )
	{
		driver.tap(fingure, element, duration);
	}
	
	public void tapAction(int fingure,int x, int y, int duration )
	{
		driver.tap(fingure, x, y, duration);
	}
	
	public void implicitWait(Long longTimeout)
	{
		driver.manage().timeouts().implicitlyWait(longTimeout, TimeUnit.SECONDS);
	}

}
