package Appium.testScript;



import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import  org.tyss.ObjectRepository.CancelOrderPage; 
import org.tyss.ObjectRepository.OrderPage;
import org.tyss.ObjectRepository.PaymentPage; 
import org.tyss.genericUtility.MobileBigBasketBaseClass;    
@Listeners(org.tyss.genericUtility.MobileListenersImplementation.class)
public class BigBasket2 extends MobileBigBasketBaseClass {

	@Test
	public void bigBasket() throws InterruptedException, IOException {
		org.tyss.ObjectRepository.OrderPage orderPage= new OrderPage(driver);
		PaymentPage paymentPage= new PaymentPage(driver);
		CancelOrderPage cancelOrderPage= new CancelOrderPage(driver);
		orderPage.orderpage();
		paymentPage.paymentPage();
		
		paymentPage.cashOnDelivery(driver);
		paymentPage.placeOrder(driver);
		cancelOrderPage.cancelOrder();
		
		
		
		
		
		
}
	
}

