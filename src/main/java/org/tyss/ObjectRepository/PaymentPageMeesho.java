package org.tyss.ObjectRepository;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class PaymentPageMeesho {
	
	public PaymentPageMeesho(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//android.widget.RelativeLayout[@resource-id='com.meesho.supply:id/cod_header'])[1]")
	private WebElement cashOnDelivery;
	
	@FindBy(xpath="//android.widget.Button[@text='Continue']")
	private WebElement continueBtn;
	
	
	//business logic
	public void paymentPageM() throws InterruptedException {
	cashOnDelivery.click();
	Thread.sleep(2000);
	continueBtn.click();
	}
	
	
	
	
	
	
}
