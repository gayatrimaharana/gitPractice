package org.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class LoginGeneralPage {
	@FindBy(id="com.androidsample.generalstore:id/spinnerCountry")
//	@iOSFindBy(id="")
	private WebElement countryDropDown;
	
	@FindBy(id="com.androidsample.generalstore:id/nameField")
	private WebElement nameTextFld;
	
	@FindBy(id="com.androidsample.generalstore:id/radioMale")
	private WebElement maleRadiobtn;
	
	@FindBy(id="com.androidsample.generalstore:id/radioFemale")
	private WebElement femaleRadiobtn;
	
	@FindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private WebElement letsShopBtn;
	
	public  LoginGeneralPage(AndroidDriver<WebElement> driver)
	{
	//	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PageFactory.initElements(driver, this);
	}
	

		public void login(String name)
		{
			
			nameTextFld.sendKeys(name);
			femaleRadiobtn.click();
			letsShopBtn.click();
		}

}
