package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.CheckoutInfoPMOClass;
import com.SauceDemo.POMClass.CheckoutOverviewPMoClass;
import com.SauceDemo.POMClass.CheckoutPOMClass;
import com.SauceDemo.POMClass.HomePOMClass;
import com.SauceDemo.POMClass.LoginPOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TC_01VerifyTheLoginfFunctionality extends TestBaseClass
{
	
//	1.
	@Test(priority=0)
public void VerifyLoginMethod() throws InterruptedException, IOException 
{
log.info("Apply Validation");
// validating the successful login

    String provideurl="https://www.saucedemo.com/inventory.html";
    String actualurl= driver.getCurrentUrl();

    Assert.assertEquals(provideurl, actualurl);

}
	
////	2.
//	@Test(priority=1)
//	public void SelectTheProductOrNotMethod() throws IOException
//	{
//	  
////	    Select the product
//	    
//	    HomePOMClass y= new HomePOMClass(driver);
//	    y.selectprodct();
//	    ScreenshotClass.Screenshotmethod(driver,"homepage");
//	 // validating the Whether We Are Able To Select The Product Or Not
//
//	    String proproducturl="https://www.saucedemo.com/inventory-item.html?id=1";
//	    String actproducturl= driver.getCurrentUrl();
//
//	    if (proproducturl.equals(actproducturl))
//	    {
//		System.out.println("SUCCESSFUL PRODUCT SELECTED");
//	    }
//	    else 
//	    {
//		System.out.println("PRODUCT SELECTION FAILED");
//	    }
//	}
//	
//	
////	3.
//	@Test(priority=2)
//	public void AddToProductToCartOrNotMethod() throws IOException  
//	{
//	    
////	    Select the Add to cart
//	    
//	    HomePOMClass y= new HomePOMClass(driver);
//	    y.Addtocart();
//	    ScreenshotClass.Screenshotmethod(driver,"check cart badge");
//	   System.out.println("ADD IN A CART");
//	    
//	 // validating the Whether Item Is Added In Cart Or Not
//
//	    String procarttext="1";
//	    String actcarttext= y.cartBadge();
//	    
//
//	    if (procarttext.equals(actcarttext))
//	    {
//		System.out.println("SUCCESSFUL ADDED IN CART");
//	    }
//	    else 
//	    {
//		System.out.println("ADD TO CART FAILED");
//	    }
//	    
//	  
//	}
//	
//	
////	4.
//	@Test(priority=3)
//public void BuyTheProductOrNotMethod()
//{
//	
//    
////   Select the product
//    
//    HomePOMClass y= new HomePOMClass(driver);
//    y.Addtocart();
//   System.out.println("ADD IN A CART LOGO SHOWING NUMBER OF PRODUCT");
//    
// // validating the Whether Item Is Added In Cart Or Not
//
//    String procarttext="1";
//    String actcarttext= y.cartBadge();
//
//    if (procarttext.equals(actcarttext))
//    {
//	System.out.println("SUCCESSFUL ADDED IN CART");
//    }
//    else 
//    {
//	System.out.println("ADD TO CART FAILED");
//    }
//    
////    Select the Add to cart
//    
//    y.selectcart();
//    System.out.println("IN THE CART");
//}
//	
////	5.
//	@Test(priority=4)
//public void AbleToProceedForCheckoutOrNot()
//{
//  
//		HomePOMClass y= new HomePOMClass(driver);
//	    y.Addtocart();
//	   System.out.println("ADD IN A CART LOGO SHOWING NUMBER OF PRODUCT");
//	    
//	 // validating the Whether Item Is Added In Cart Or Not
//
//	    String procarttext="1";
//	    
//	    WebElement cart= driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
//	    cart.getText();
//	    String actcarttext= cart.getText();
//
//	    if (procarttext.equals(actcarttext))
//	    {
//		System.out.println("SUCCESSFUL ADDED IN CART");
//	    }
//	    else 
//	    {
//		System.out.println("ADD TO CART FAILED");
//	    }
//	    
////	    Select the Add to cart
//	    
//	    y.selectcart();
//	    System.out.println("IN THE CART");	
//		
//		
//		
//    //CHECKOUT
//    CheckoutPOMClass z= new CheckoutPOMClass(driver);
//    z.checkout();
//    System.out.println("INFO PAGE");
//    
////    CHECKOUT INFO
//    
//    CheckoutInfoPMOClass a= new CheckoutInfoPMOClass(driver);
//    a.Firstname();
//    System.out.println("FIRST NAME PASSED");
//    
//    a.Lastname();
//    System.out.println("LAST NAME PASSED");
//    
//    a.Zipcode();
//    System.out.println("ZIP CODE PASSED");
//    
//    a.contButton();
//    
//    
////    CHECKOUT OVERVIEW
//    
//    CheckoutOverviewPMoClass b=new CheckoutOverviewPMoClass(driver);
//    b.overview();
//    System.out.println("OVERVIEW COMPLETE");
//    
////    VALIDATING FOR CHECKOUT
//    
//    String procheckouturl="https://www.saucedemo.com/checkout-complete.html";
//    String actcheckouturl=driver.getCurrentUrl();
//    
//    if (procheckouturl.equals(actcheckouturl))
//    {
//	System.out.println("SUCCESSFUL BUY");
//    }
//    else 
//    {
//	System.out.println("BUYING FAILED");
//    }
//    
//    System.out.println("END OF PROGRAM");
//}
//	
//	
////	6.
//	@Test(priority=5)
//public void TheLogoutFunctionality()
//{
//    
////   Select the product
//    
//    HomePOMClass y= new HomePOMClass(driver);
//    y.Addtocart();
//   System.out.println("ADD IN A CART LOGO SHOWING NUMBER OF PRODUCT");
//    
// // validating the Whether Item Is Added In Cart Or Not
//
//    String procarttext="1";
//    
//    WebElement cart= driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
//    cart.getText();
//    String actcarttext= cart.getText();
//
//    if (procarttext.equals(actcarttext))
//    {
//	System.out.println("SUCCESSFUL ADDED IN CART");
//    }
//    else 
//    {
//	System.out.println("ADD TO CART FAILED");
//    }
//    
////    Select the Add to cart
//    
//    y.selectcart();
//    System.out.println("IN THE CART");
//    
//    //CHECKOUT
//    
//    CheckoutPOMClass z= new CheckoutPOMClass(driver);
//    z.checkout();
//    System.out.println("INFO PAGE");
//    
////    CHECKOUT INFO
//    
//    CheckoutInfoPMOClass a= new CheckoutInfoPMOClass(driver);
//    a.Firstname();
//    System.out.println("FIRST NAME PASSED");
//    
//    a.Lastname();
//    System.out.println("LAST NAME PASSED");
//    
//    a.Zipcode();
//    System.out.println("ZIP CODE PASSED");
//    
//    a.contButton();
//    
//    
////    CHECKOUT OVERVIEW
//    
//    CheckoutOverviewPMoClass b=new CheckoutOverviewPMoClass(driver);
//    b.overview();
//    System.out.println("OVERVIEW COMPLETE");
//    
////    VALIDATING FOR CHECKOUT
//    
//    String procheckouturl="https://www.saucedemo.com/checkout-complete.html";
//    String actcheckouturl=driver.getCurrentUrl();
//    
//    if (procheckouturl.equals(actcheckouturl))
//    {
//	System.out.println("SUCCESSFUL BUY");
//    }
//    else 
//    {
//	System.out.println("BUYING FAILED");
//    }
//    
////    MENU
//    
//    b.menu();
//    System.out.println("MENU WINDOW OPEN");
//    
//    b.logout();
//    
////    Validating the logout
//    
//    String pro="https://www.saucedemo.com/";
//    String act= driver.getCurrentUrl();
//
//    if (pro.equals(act))
//    {
//	System.out.println("SUCCESSFUL LOGOUT");
//    }
//    else 
//    {
//	System.out.println("LOGOT FAILED");
//    }
//    
//    System.out.println("END OF PROGRAM");
//}
//	
//	
////	7.
//	@Test(priority=6)
//public void AbleToApplyTheFilterMethod() 
//{
//
//    
////    APPLY FILTER FROM HIGH TO LOW
//    
//    HomePOMClass y= new HomePOMClass(driver);
//    y.applyfilter();
//    
//    
////    validation for filter
//    
//    y.validfilterhtlo();
//    
//    String provideprice="$49.99";
//    String actualprice=y.validfilterhtlo();
//    
//    if (provideprice.equals(actualprice))
//    {
//	System.out.println("SUCCESSFUL FILTER APPLYIED ");
//    }
//    else 
//    {
//	System.out.println("FILTER NOT APPLYIED");
//    }  
//}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
