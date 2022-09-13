package Appium.testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallTouchScreeApp {
	@Test
	public void installApp() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability(MobileCapabilityType.APP, "‪C:\\Users\\Dell\\Downloads\\Touch Screen Test_v1.7.14_apkpure.com.apk");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc);
	//	driver.installApp("C:\\Users\\Dell\\Downloads\\Touch Screen Test_v1.7.14_apkpure.com.apk");
	}

}
