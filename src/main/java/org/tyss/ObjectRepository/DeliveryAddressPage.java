package org.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class DeliveryAddressPage {
	public DeliveryAddressPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//android.widget.Button[@text='Deliver to this Address']")
	private WebElement deliveryToThisAddressBtn;
	
	//business logic
	public void selectAddress() throws InterruptedException {
	Thread.sleep(2000);
	deliveryToThisAddressBtn.click();
	Thread.sleep(2000);
	}

}
