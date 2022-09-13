package org.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class CancelOrderMeesho {
	public CancelOrderMeesho(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Cancel Order']")
	private WebElement canceleOrderbtn;
	
	@FindBy(xpath="//android.widget.TextView[@text='Select reason for cancellation']")
	private WebElement selectReasonForCancelDropDown;
	
	@FindBy(xpath="//android.widget.RadioButton[@text='Customer changed their mind']")
	private WebElement selectReasonRadioBtn;
	
	@FindBy(xpath="//android.widget.Button[@text='Cancel Product']")
	private WebElement cancelProductBtn;
	
	//business logic
	public void cancelOrder() throws InterruptedException
	{
	canceleOrderbtn.click();
	Thread.sleep(2000);
	selectReasonForCancelDropDown.click();
	Thread.sleep(2000);
	selectReasonRadioBtn.click();
	Thread.sleep(2000);
	cancelProductBtn.click();
	
	}
}
