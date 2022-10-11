package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePOMClass;
import com.SauceDemo.POMClass.LoginPOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TC_05VerifyWhetherWeAreAbleToBuyTheProductOrNot extends  TestBaseClass
{
	@Test
public void BuyTheProductOrNotMethod() throws IOException
{
	
    
//   Select the product
    
    HomePOMClass y= new HomePOMClass(driver);
    y.Addtocart();
   log.info("ADD IN A CART LOGO SHOWING NUMBER OF PRODUCT");
   log.info("Apply Validation");
 // validating the Whether Item Is Added In Cart Or Not

    String procarttext="1";
    String actcarttext= y.cartBadge();
  Assert.assertEquals(procarttext,actcarttext);

    
//    Select the Add to cart
    
    y.selectcart();
    ScreenshotClass.Screenshotmethod(driver,"cart");
    log.info("IN THE CART");
    
}
}
