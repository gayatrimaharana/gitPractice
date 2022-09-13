package org.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProductListCategoryPage {
	
	public ProductListCategoryPage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath = "//android.widget.Button[@text='SET UP LATER']")
//	private WebElement setUpLaterBtn;
	@FindBy(xpath = "//android.widget.ImageView[@bounds='[377,363][678,475]']")
	private WebElement languageTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Categories']")
	private WebElement categoriesTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Kids']")
	private WebElement kidTab;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Baby Sets']")
	private WebElement babySetTab;
	
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.meesho.supply:id/catalog_cover']")
	private WebElement productImage;
	
	@FindBy(xpath = "//android.widget.Button[@text='Add to Cart']")
	private WebElement addToCartBtn;
	
//	@FindBy(xpath = "//android.widget.TextView[@bounds='[28,890][141,931]']")
//	private WebElement freesizeTab;
	
	@FindBy(xpath="//android.widget.Button[@text='Add to Cart']")
	private WebElement addCartBtn;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='CONTINUE']") 
	private WebElement continueBtn;
	
	
//	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Filters']")
//	private MobileElement filtersTab;
//	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Size']")
//	private MobileElement sizeDropDown;
//	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price']")
//	private MobileElement priceDropDown;
//	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Sort']")
//	private MobileElement sortTab;
//	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Color']")
//	private MobileElement colorTabInFilter;
//	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Multicolor']")
//	private MobileElement multiColorTabInFilter;
//	
//	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Price']")
//	private MobileElement priceTabInFilter;

	//business logic
	public void productListCategory() throws InterruptedException
	{
		
		languageTab.click();
		
		Thread.sleep(2000);
		categoriesTab.click();
		Thread.sleep(2000);
		kidTab.click();
		Thread.sleep(2000);
		babySetTab.click();
		Thread.sleep(2000);
		productImage.click();
		Thread.sleep(2000);
		addToCartBtn.click();
		Thread.sleep(2000);
//		freesizeTab.click();
//		Thread.sleep(2000);
		addCartBtn.click();
		Thread.sleep(2000);
		continueBtn.click();
		
		
		
	}
	
}
