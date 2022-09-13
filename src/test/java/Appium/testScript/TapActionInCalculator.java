package Appium.testScript;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TapActionInCalculator {
	
	public AndroidDriver driver;
	@Test
	
	public void tapAction() throws MalformedURLException
	{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "R9ZNC03VN6X");
		dc.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		dc.setCapability("appActivity", ".Calculator");
		URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url, dc);
		WebElement two = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
		driver.tap(1, two, 500);
		 WebElement plus = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
	//	 driver.tap(1, 612, 1230, 500);
		tapAction(1, plus, 500);
		WebElement five = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
		driver.tap(1, five, 500);
		WebElement equal = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
		driver.tap(1, equal, 500);
		String value = driver.findElement(By.id("com.sec.android.app.popupcalculator:id/calc_tv_result")).getText();
		System.out.println(value);
		
	}
	
	public void tapAction(int fingure, WebElement element, int duration )
	{
		driver.tap(fingure, element, duration);
	}
	
	public void tapAction(int fingure,int x, int y, int duration )
	{
		driver.tap(fingure, x, y, duration);
	}

}
