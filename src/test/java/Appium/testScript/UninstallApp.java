package Appium.testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class UninstallApp {
	@Test
	public void uninstallesApp() throws MalformedURLException {
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
	dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
	dc.setCapability("appPackage","io.appium.android.apis");
	dc.setCapability("appActivity",".ApiDemos");
	dc.setCapability(MobileCapabilityType.FULL_RESET, "true");
	URL ur=new URL("http://localhost:4723/wd/hub");
	AndroidDriver driver=new AndroidDriver(ur, dc);
	boolean value = driver.isAppInstalled("io.appium.android.apis");
	System.out.println(value);
	
	}
	

}
