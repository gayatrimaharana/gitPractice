package org.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CartPage {
	public CartPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//	@FindBy(id = "com.meesho.supply:id/cart_count")
//	private WebElement cartBtn;
	

	
	@FindBy(xpath="//android.widget.Button[@text='Go to Cart']")
	private WebElement goToCartBtn ;
	
	@FindBy(xpath="//android.widget.Button[@text='Continue']")
	private WebElement continueBtn ;
	
	@FindBy(xpath="//android.widget.Button[@text='Deliver to this Address']")
	private WebElement deliveryToThisAddressBtn;
	
	//business logic
	public void cartPage() throws InterruptedException
	{
	//	cartBtn.click();
	//	Thread.sleep(2000);
	//	continueBtn.click();
		Thread.sleep(2000);
		goToCartBtn.click();
		Thread.sleep(2000);
		continueBtn.click();
		Thread.sleep(2000);
		deliveryToThisAddressBtn.click();
	}
	

}
