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

public class TC_03VerifyWhetherWeAreAbleToSelectTheProductOrNot extends TestBaseClass
{
	@Test
public void SelectTheProductOrNotMethod() throws IOException
{
  
//    Select the product
    
    HomePOMClass y= new HomePOMClass(driver);
    y.selectprodct();
    ScreenshotClass.Screenshotmethod(driver,"homepage");
    log.info("Apply Validation");
 // validating the Whether We Are Able To Select The Product Or Not

    String proproducturl="https://www.saucedemo.com/inventory-item.html?id=1";
    String actproducturl= driver.getCurrentUrl();
    
//    Assert.assertEquals(actualTitle,expectedTitle );
    Assert.assertEquals(proproducturl,actproducturl );


}
}
