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

public class TC_07VerifyTheLogoutFunctionality extends TestBaseClass
{
	@Test
public void TheLogoutFunctionality() throws IOException
{
    
//   Select the product
    
    HomePOMClass y= new HomePOMClass(driver);
    y.Addtocart();
  log.info("ADD IN A CART LOGO SHOWING NUMBER OF PRODUCT");
  log.info("Apply Validation");
 // validating the Whether Item Is Added In Cart Or Not

    String procarttext="1";
    
    WebElement cart= driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
    cart.getText();
    String actcarttext= cart.getText();

    Assert.assertEquals(procarttext,actcarttext);
    
//    Select the Add to cart
    
    y.selectcart();
    log.info("IN THE CART");
    
    //CHECKOUT
    
    CheckoutPOMClass z= new CheckoutPOMClass(driver);
    z.checkout();
    log.info("INFO PAGE");
    
//    CHECKOUT INFO
    
    CheckoutInfoPMOClass a= new CheckoutInfoPMOClass(driver);
    a.Firstname();
    log.info("FIRST NAME PASSED");
    
    a.Lastname();
    log.info("LAST NAME PASSED");
    
    a.Zipcode();
    log.info("ZIP CODE PASSED");
    
    a.contButton();
    log.info("Continue Button Clicked");
    
//    CHECKOUT OVERVIEW
    
    CheckoutOverviewPMoClass b=new CheckoutOverviewPMoClass(driver);
    b.overview();
log.info("OVERVIEW COMPLETE");
log.info("Apply Validation");
//    VALIDATING FOR CHECKOUT
    
    String procheckouturl="https://www.saucedemo.com/checkout-complete.html";
    String actcheckouturl=driver.getCurrentUrl();
    Assert.assertEquals(procheckouturl,actcheckouturl);
    
    
//    MENU
    
    b.menu();
    ScreenshotClass.Screenshotmethod(driver,"Menu Option");
    log.info("MENU WINDOW OPEN");
    
    b.logout();
    log.info("Logout Button Clicked");
    log.info("Apply Validation");
//    Validating the logout
    
    String pro="https://www.saucedemo.com/";
    String act= driver.getCurrentUrl();

    Assert.assertEquals(pro,act);
    
}
}
