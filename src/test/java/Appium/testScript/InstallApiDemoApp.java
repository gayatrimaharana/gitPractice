package Appium.testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallApiDemoApp {
	@Test
	public void installApp() throws MalformedURLException
	{
		//install ApiDemo app in Emulator using diver methods
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dc);
		driver.installApp("C:\\Users\\Dell\\Downloads\\ApiDemos-debug.apk");
		boolean value = driver.isAppInstalled("io.appium.android.apis");
		System.out.println(value);
	}

}
