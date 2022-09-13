package Appium.testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwipeClass {
	@Test
	
	public void swipe() throws MalformedURLException {
	
	DesiredCapabilities dc= new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
	dc.setCapability(MobileCapabilityType.UDID,"emulator-5554");
	dc.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
	dc.setCapability("appActivity",".TouchScreenTestActivity");
	URL url=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver= new AndroidDriver(url, dc);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//vertical swipe
	driver.swipe(505, 305, 474, 1662, 500);
	//horizontal swipe
	driver.swipe(50, 922, 984, 983, 500);
	}

}
