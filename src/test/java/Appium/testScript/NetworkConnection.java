package Appium.testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;
import io.appium.java_client.remote.MobileCapabilityType;

public class NetworkConnection {
	@Test
	public void connection() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "R9ZNC03VN6X");
//		dc.setCapability("appPackage","io.appium.android.apis");
//		dc.setCapability("appActivity",".ApiDemos");
		URL url = new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc);
		Connection conn = driver.getConnection();
	//	driver.setConnection(conn.AIRPLANE);
		driver.setConnection(conn.WIFI);
	//	driver.setConnection(conn.DATA);
	}

}
