package org.tyss.ObjectRepository;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;

public class LoginGeneralStorePage {
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
//	@iOSFindBy(id="")
	private MobileElement countryDropDown;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private MobileElement nameTextFld;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private MobileElement maleRadiobtn;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private MobileElement femaleRadiobtn;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private MobileElement letsShopBtn;
	
	public  LoginGeneralStorePage(AndroidDriver driver)
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	//	PageFactory.initElements(driver, this);
	}
	
	

	public MobileElement getCountryDropDown() {
		return countryDropDown;
	}

	public MobileElement getNameTextFld() {
		return nameTextFld;
	}

	public MobileElement getMaleRadiobtn() {
		return maleRadiobtn;
	}

	public MobileElement getFemaleRadiobtn() {
		return femaleRadiobtn;
	}

	public MobileElement getLetsShopBtn() {
		return letsShopBtn;
	}
	
	//business logic
	
		public void login(String name)
		{
			
			nameTextFld.sendKeys(name);
			femaleRadiobtn.click();
			letsShopBtn.click();
		}

}
