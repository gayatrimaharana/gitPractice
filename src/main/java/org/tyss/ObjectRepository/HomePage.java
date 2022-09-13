package org.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class HomePage {
	@FindBy(xpath = "//android.widget.TextView[@text='Categories']")
	private WebElement category;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Account']")
	private WebElement accountimg;
	
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.meesho.supply:id/default_profile_image']")
	private WebElement profileImage;
	
	public HomePage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//business logic

}
