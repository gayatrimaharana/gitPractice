package org.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.genericUtility.MobileUtility;

import io.appium.java_client.android.AndroidDriver;

public class CategoriesPage extends MobileUtility {
	
	@FindBy(xpath = "//android.widget.ImageView[@bounds='[377,363][678,475]']")
	private WebElement languageTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Categories']")
	private WebElement categoriesTab;
	
	
	@FindBy(xpath = "//android.widget.TextView[@text='Popular']")
	private WebElement popularCategory;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Women Ethnic']")
	private WebElement womenEthnicCategory;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Women Western']")
	private WebElement womenWesternCategory;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Men']")
	private WebElement menCategory;
	
	@FindBy(xpath = "//android.widget.TextView[@text='All Bottomwear']")
	private WebElement allBottomCategory;

	
	@FindBy(xpath = "//android.widget.TextView[@text='Kids']")
	private WebElement kidsCategory;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Home & Kitchen ']")
	private WebElement homeAndKitchenCategory;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Beauty & Health ']")
	private WebElement beautyCategory;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Jewellery & Accessories']")
	private WebElement accessoriesCategory;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Bags & Footwear']")
	private WebElement bagsAndFootwareCategory;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Backpacks']")
	private WebElement backPackCat;
	
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.meesho.supply:id/catalog_cover']")
	private WebElement productImage;
	
		
	@FindBy(xpath = "//android.widget.TextView[@text='Electronics']")
	private WebElement electronicsCategory;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Sports & Fitness']")
	private WebElement sportsAndFitnessCategory;
	
	public CategoriesPage(AndroidDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	
	//business logic
	public void catPage() throws InterruptedException
	{
		languageTab.click();
		Thread.sleep(2000);
		categoriesTab.click();
		Thread.sleep(2000);
		
	}
	public void scrollDownPage(AndroidDriver driver) throws InterruptedException
	{
//		scrolltoElement(driver, "text", "Bags & Footwear");
		menCategory.click();
		Thread.sleep(2000);

//		bagsAndFootwareCategory.click();
		Thread.sleep(2000);
	//	backPackCat.click();
		allBottomCategory.click();
		Thread.sleep(2000);
		productImage.click();
		Thread.sleep(2000);
		
		
	}


}
