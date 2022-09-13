package Appium.testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ApiDemo {
	 AndroidDriver driver;
	 @Test
	public void clickApiDemo() throws MalformedURLException
	{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12");
		dc.setCapability(MobileCapabilityType.UDID, "R9ZNC03VN6X");
//		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
//		dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		URL url=new URL("http://localhost:4723/wd/hub");
		driver=new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
		driver.findElement(By.id("android:id/button1")).click();
	//	driver.tap(1, 70, 1123, 500);
		driver.tap(1, 70, 1123, 500);
	 //   driver.findElementByAccessibilityId("Views").click();
	//	driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1']")).click();
		driver.findElementByAccessibilityId("Controls").click();
		driver.findElementByAccessibilityId("1. Light Theme").click();
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("demo");
		driver.findElementByAccessibilityId("Checkbox 1").click();
		driver.findElementByAccessibilityId("Checkbox 2").click();
		driver.findElementByAccessibilityId("RadioButton 1").click();
		driver.hideKeyboard();
		driver.findElement(By.id("io.appium.android.apis:id/star")).click();
		driver.findElement(By.id("io.appium.android.apis:id/toggle1")).click();
		driver.findElement(By.id("io.appium.android.apis:id/toggle2")).click();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
//		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.CheckedTextView[5]")).click();
//		driver.findElement(By.id("io.appium.android.apis:id/button")).click();
		
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Earth']")).click();
		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
		List<WebElement> values = driver.findElements(By.className("android.widget.CheckedTextView"));
		
		for(WebElement a:values)
		{
			System.out.println(a.getText());
		}
	}

}
