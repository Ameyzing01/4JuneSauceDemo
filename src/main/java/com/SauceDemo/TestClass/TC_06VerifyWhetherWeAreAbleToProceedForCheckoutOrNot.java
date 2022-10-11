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

public class TC_06VerifyWhetherWeAreAbleToProceedForCheckoutOrNot extends TestBaseClass 
{
	@Test
public void AbleToProceedForCheckoutOrNot() throws IOException
{
    
		HomePOMClass y= new HomePOMClass(driver);
	    y.Addtocart();
	    ScreenshotClass.Screenshotmethod(driver,"HOMEP CART NUMBER");
	   System.out.println("ADD IN A CART LOGO SHOWING NUMBER OF PRODUCT");
	    
	 // validating the Whether Item Is Added In Cart Or Not

	    String procarttext="1";
	    
	    WebElement cart= driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
	    cart.getText();
	    String actcarttext= cart.getText();
	    Assert.assertEquals(procarttext,actcarttext);
	    
//	    Select the Add to cart
	    
	    y.selectcart();
	    ScreenshotClass.Screenshotmethod(driver,"IN THE CART");
	    log.info("IN THE CART");
		
		
    //CHECKOUT
    CheckoutPOMClass z= new CheckoutPOMClass(driver);
    z.checkout();
    ScreenshotClass.Screenshotmethod(driver,"Checkoutpage");
    log.info("INFO PAGE");
    
//    CHECKOUT INFO
    
    CheckoutInfoPMOClass a= new CheckoutInfoPMOClass(driver);
    a.Firstname();
    log.info("FIRST NAME PASSED");
    
    a.Lastname();
    log.info("LAST NAME PASSED");
    
    a.Zipcode();
    log.info("ZIP CODE PASSED");
    ScreenshotClass.Screenshotmethod(driver,"Checkout buyer detail");
    a.contButton();
    log.info("Continue Button Clicked");
    
//    CHECKOUT OVERVIEW
    
    CheckoutOverviewPMoClass b=new CheckoutOverviewPMoClass(driver);
    b.overview();
    ScreenshotClass.Screenshotmethod(driver,"Checkout overview");
    log.info("OVERVIEW COMPLETE");
    log.info("Apply Validation");
//    VALIDATING FOR CHECKOUT
    
    String procheckouturl="https://www.saucedemo.com/checkout-complete.html";
    String actcheckouturl=driver.getCurrentUrl();
    Assert.assertEquals(procheckouturl,actcheckouturl);

    
    
}
}
