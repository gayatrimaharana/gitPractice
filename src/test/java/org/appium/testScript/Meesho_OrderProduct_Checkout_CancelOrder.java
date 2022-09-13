package org.appium.testScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.tyss.ObjectRepository.CancelOrderMeesho;
import org.tyss.ObjectRepository.CartPage;
import org.tyss.ObjectRepository.CheckOutPage;
import org.tyss.ObjectRepository.PaymentPageMeesho;
import org.tyss.ObjectRepository.ProductListCategoryPage;
import org.tyss.genericUtility.MobileMeeshoBaseClass;

@Listeners(org.tyss.genericUtility.MobileListenersImplementation.class)

public class Meesho_OrderProduct_Checkout_CancelOrder extends MobileMeeshoBaseClass {
	@Test
	
	public void prodCheckout() throws InterruptedException
	{
		ProductListCategoryPage productListCategoryPage=new ProductListCategoryPage(driver);
		CartPage cartPage=new CartPage(driver);
		PaymentPageMeesho paymentPage=new PaymentPageMeesho(driver);
		CheckOutPage checkOutPage=new CheckOutPage(driver);
		CancelOrderMeesho cancelOrder=new CancelOrderMeesho(driver);
		productListCategoryPage.productListCategory();
		cartPage.cartPage();
		paymentPage.paymentPageM();
		checkOutPage.placeOrder();
		cancelOrder.cancelOrder();
	}
	

}
