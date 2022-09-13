package org.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CancelOrderPage {
	
	public CancelOrderPage(AndroidDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.bigbasket.mobileapp:id/iv_drawer']")
	private WebElement DrawerBtn;
	@FindBy(xpath = "//android.widget.TextView[@text='Customer Service']") 
	private WebElement CustomerServiceBtn;
	@FindBy(xpath = "//android.widget.TextView[@text='PLACED']")
	private WebElement EnterCancel;
	@FindBy(xpath = "//android.widget.TextView[@text='I want to cancel my order']") 
	private WebElement CancelOrder;
	@FindBy(xpath = "//android.widget.TextView[@text='PLACED']") 
	private WebElement EnterCancel2;
	@FindBy(xpath = "//android.widget.RadioButton[@text='I forgot to add additional products/items']") 
	private WebElement AdditionalInformationRadioBtn;
	@FindBy(xpath = "//android.widget.Button[@text='CANCEL ORDER']") 
	private WebElement CancelOrderBtn;
	
	
	//business logics
	
	public void cancelOrder() throws InterruptedException {
		DrawerBtn.click();
		CustomerServiceBtn.click();
		Thread.sleep(2000);
		EnterCancel.click();
		CancelOrder.click();
		Thread.sleep(2000);
		EnterCancel2.click();
		AdditionalInformationRadioBtn.click();
		CancelOrderBtn.click();
	}
	

}
