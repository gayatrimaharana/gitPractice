package org.appium.testScript;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.tyss.genericUtility.MobileDriverUtility;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AddProductToCart {
	
	MobileDriverUtility mobileDriverUtility=new MobileDriverUtility();
	@Test
	public void addProd() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
		dc.setCapability(MobileCapabilityType.UDID,"R9ZNC03VN6X");
		dc.setCapability("appPackage","com.meesho.supply");
		dc.setCapability("appActivity",".main.MainActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver= new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.ImageView[@bounds='[377,363][678,475]']")).click();
	//	driver.findElement(By.xpath("//android.widget.TextView[@text='ENGLISH']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Categories']")).click();
		Thread.sleep(6000);
	//	driver.findElementByAccessibilityId("com.meesho.supply:id/query_edit_text").sendKeys("chocolate");
		driver.findElement(By.xpath("//android.widget.TextView[@text='Kids']")).click();
		Thread.sleep(3000);
		//mobileDriverUtility.scrollToElement(driver, "text", "Newborn Care");
	//	scrollToElement(driver,"text","Newborn Care");
//		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Baby Sets']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Filters']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Color']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Multicolor']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Price']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Under ₹ 149']")).click();
//		String expPrice = driver.findElement(By.xpath("//android.widget.TextView[@text='Under ₹ 149']")).getText();
//		System.out.println(expPrice);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Rating']")).click();
//		driver.findElement(By.xpath("//android.widget.CheckBox[@text='4.0 and above']")).click();
		driver.findElement(By.xpath("//android.widget.CheckBox[@text='M-Trusted']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Combo']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.CheckBox[@text='Combos']")).click();
	//	driver.findElement(By.id("com.meesho.supply:id/primary_cta")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='Done']")).click();
		Thread.sleep(3000);
		List<MobileElement> prodPrice = driver.findElements(By.xpath("//*[@resource-id='com.meesho.supply:id/price']"));
		for(MobileElement price:prodPrice)
		{
			System.out.println(price.getText());
			price.click();
		}
		Thread.sleep(3000);
		mobileDriverUtility.scrollToElement(driver, "text", "Sold By");
		driver.findElement(By.xpath("//android.widget.CompoundButton[@text='Free Size']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Add to Cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.meesho.supply:id/secondary_cta")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("com.truecaller:id/confirm")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.Button[@text='Go to Cart']")).click();
		String offPriceInShopingart = driver.findElement(By.id("com.meesho.supply:id/offerPrice")).getText();
		System.out.println(offPriceInShopingart);
		String quantity = driver.findElement(By.id("com.meesho.supply:id/quantity_value")).getText();
		System.out.println(quantity);
		driver.findElement(By.id("com.meesho.supply:id/multi_cta_info_primary_cta")).click();
		driver.findElement(By.id("com.meesho.supply:id/deliver_this_add_cta")).click();
		String priceTotal = driver.findElement(By.id("com.meesho.supply:id/multi_cta_info_text")).getText();
		System.out.println(priceTotal);
		String quantityInCheckout = driver.findElement(By.xpath("//*[@text='Price Details (1 Item)']")).getText();
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add(quantityInCheckout);
		String offerValue = arrayList.get(1);
		System.out.println(quantityInCheckout);
		
	//	WebElement prodPrice = driver.findElement(By.xpath("//android.widget.TextView[@text='Voguish Blankets & Swaddlers']//parent::android.view.ViewGroup[@resource-id='com.meesho.supply:id/item_catalog_card_v3']/following::android.view.ViewGroup[@resource-id='com.meesho.supply:id/price_layout']/child::android.widget.TextView[@resource-id='com.meesho.supply:id/price']"));
	//	System.out.println(prodPrice);
	//	prodPrice.click();
//		String offer = driver.findElement(By.xpath("//android.widget.TextView[@text='₹128 with 1 Special Offer']")).getText();
//		System.out.println(offer);
//		
//		List listOfProdWithOff = driver.findElements(By.xpath(""));
		
		
		
		
		
	}
	public void scrollToElement(AndroidDriver driver, String an,String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
	}

}
