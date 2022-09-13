package org.tyss.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tyss.genericUtility.InstanceClass;
import org.tyss.genericUtility.MobileUtility;

import io.appium.java_client.android.AndroidDriver;

public class WishListPage extends InstanceClass{
	public WishListPage(AndroidDriver driver )
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.ImageView[@bounds='[0,250][720,882]']")
	private WebElement ProdImage;
	
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.meesho.supply:id/full_screen_image_view']")
	private WebElement zoomImage;
	
	@FindBy(xpath = "//android.widget.ImageButton[@bounds='[0,77][98,175]']")
	private WebElement backBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Wishlist']")
	private WebElement wishListBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@text='CONTINUE']")
	private WebElement continueBtn;
	
	@FindBy(xpath = "//android.widget.TextView[@resource-id='com.meesho.supply:id/menu_wishlist']")
	private WebElement wishListsmallIcon;
	
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.meesho.supply:id/product_image']")
	private WebElement wishProdImg;
	
	@FindBy(xpath = "//android.widget.Button[@text='Add to Cart']")
	private WebElement addToCartBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text='Add to Cart']")
	private WebElement addToCartBtn2;
	
	@FindBy(xpath = "//android.widget.ImageView[@bounds='[643,108][720,143]']")
	private WebElement cartBtnIcon;
	
	@FindBy(xpath = "//android.widget.CompoundButton[@text='28']")
	private WebElement selectSizeTab;
	
	
	@FindBy(xpath = "//android.widget.LinearLayout[@bounds='[0,1357][720,1411]']")
	private WebElement addToCartBtn3;
	
	
	@FindBy(xpath = "//android.widget.TextView[@text='Wishlist']")
	private WebElement wishListTab;
	
	
	@FindBy(xpath = "//android.widget.TextView[@text='Aagam Ensemble Women Kurta Sets']")
	private WebElement scrollToImg;
	
	
	@FindBy(xpath = "//android.widget.ImageView[@resource-id='com.meesho.supply:id/iv_icon']")
	private WebElement closeBtn;
	
	@FindBy(xpath = "//android.widget.Button[@text='Continue']")
	private WebElement continueBtn2;
	//business logic
	public void wishlistPage(MobileUtility mobileUtility) throws InterruptedException
	{
		ProdImage.click();
		Thread.sleep(2000);
	//	mobileUtility.zoomImage(zoomImage);
	//	mobileUtility.tap(2, 329, 661, 500);
		backBtn.click();
		Thread.sleep(2000);
	//	mobileUtility.zoomOutImage(zoomImage);
	//	mobileUtility.tap(2, 329, 661, 500);
	//	Thread.sleep(2000);
		wishListBtn.click();
		Thread.sleep(2000);
		continueBtn.click();
		Thread.sleep(2000);
		wishListsmallIcon.click();
		Thread.sleep(2000);
		wishProdImg.click();
		Thread.sleep(2000);
		addToCartBtn.click();
		Thread.sleep(2000);
		addToCartBtn2.click();
		Thread.sleep(2000);
		cartBtnIcon.click();
		Thread.sleep(2000);
		selectSizeTab.click();
		Thread.sleep(2000);
		addToCartBtn3.click();
		Thread.sleep(2000);
		cartBtnIcon.click();
//		wishListTab.click();
		Thread.sleep(2000);
		wishListTab.click();
	//	mobileUtility.orientationLandscape();
	//	orientationLandscape();
		Thread.sleep(2000);
	//	mobileUtility.scrolltoElement(driver, "text", "Aagam Ensemble Women Kurta Sets");
		
	//	mobileUtility.orientationPortrait();
		Thread.sleep(2000);
		closeBtn.click();
		Thread.sleep(2000);
		continueBtn2.click();
		Thread.sleep(2000);
	}

}
