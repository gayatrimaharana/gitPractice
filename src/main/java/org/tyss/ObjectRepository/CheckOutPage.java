package org.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CheckOutPage {
	public CheckOutPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//android.widget.TextView[@resource-id='com.meesho.supply:id/quantity_value")
//	private WebElement quantity;
	
	@FindBy(xpath="//android.widget.Button[@resource-id='com.meesho.supply:id/multi_cta_info_primary_cta']")
	private WebElement placeOrderbtn;
	
	@FindBy(id="com.meesho.supply:id/app_rating_bar")
	private WebElement ratingStar;
	
	@FindBy(xpath="//android.widget.Button[@text='Not Now']")
	private WebElement notNowBtn;
	
	@FindBy(xpath="//android.widget.Button[@text='TRACK ORDER']")
	private WebElement trackOrderBtn;
	
	
	//business logic
	public void placeOrder() throws InterruptedException
	{
	//	quantity.getText();
		Thread.sleep(2000);
		placeOrderbtn.click();
		Thread.sleep(2000);
		ratingStar.click();
		Thread.sleep(2000);
		notNowBtn.click();
		Thread.sleep(2000);
		trackOrderBtn.click();
		
		
	}

}
