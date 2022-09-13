package Appium.testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwipeHeightWidth {
	public void swipe() throws MalformedURLException
	{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
		dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
		dc.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity",".TouchScreenTestActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Dimension value = driver.manage().window().getSize();
		int ht=value.getHeight();
		int wd=value.getWidth();
		System.out.println("height of phone is "+ht);
		System.out.println("width of phone is"+wd);
		//Vertical swipe
		
		driver.swipe(wd/2, (int)(ht*0.25), wd/2, (int)(ht*0.80), 1000);
		driver.swipe((int)(wd*0.1), (int)(ht*0.2), (int)(wd*0.1), (int)(ht*0.8), 500);
		driver.swipe((int)(wd*0.5), (int)(ht*0.2), (int)(wd*0.5), (int)(ht*0.8), 500);
		driver.swipe((int)(wd*0.9), (int)(ht*0.2), (int)(wd*0.9), (int)(ht*0.8), 500);
		
		//Horizontal swipe
		driver.swipe((int)(wd*0.25), ht/2, (int)(wd*0.80), ht/2, 1000);
		driver.swipe((int)(wd*0.1), (int)(ht*0.8), (int)(wd*0.9), (int)(ht*0.80), 500);
		driver.swipe((int)(wd*0.1), (int)(ht*0.2), (int)(wd*0.9), (int)(ht*0.20), 500);
		driver.swipe((int)(wd*0.1), (int)(ht*0.5), (int)(wd*0.9), (int)(ht*0.50), 500);
		
		
		
	}

}
