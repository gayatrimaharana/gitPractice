package org.appium.testScript;

import org.testng.annotations.Test;
import org.tyss.ObjectRepository.CancelOrderMeesho;
import org.tyss.ObjectRepository.CategoriesPage;
import org.tyss.ObjectRepository.CheckOutPage;
import org.tyss.ObjectRepository.DeliveryAddressPage;
import org.tyss.ObjectRepository.PaymentPageMeesho;
import org.tyss.ObjectRepository.WishListPage;
import org.tyss.genericUtility.MobileMeeshoBaseClass;

public class AddProductToWishList_Checkout_Meesho extends MobileMeeshoBaseClass {
	@Test
	public void addtoWishListCheckout() throws InterruptedException
	{
		CategoriesPage categoriesPage=new CategoriesPage(driver);
		WishListPage wishListPage= new WishListPage(driver);
		DeliveryAddressPage deliveryAddressPage=new DeliveryAddressPage(driver);
		PaymentPageMeesho paymentPage=new PaymentPageMeesho(driver);
		CheckOutPage checkOutPage=new CheckOutPage(driver);
		CancelOrderMeesho cancelOrder=new CancelOrderMeesho(driver);
		categoriesPage.catPage();
		categoriesPage.scrollDownPage(driver);
		wishListPage.wishlistPage(mobileUtility);
		deliveryAddressPage.selectAddress();
		paymentPage.paymentPageM();
		checkOutPage.placeOrder();
		cancelOrder.cancelOrder();
	}

}
