package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePOMClass;
import com.SauceDemo.POMClass.LoginPOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TC_08VerifyWhetherWeAreAbleToApplyTheFilter extends TestBaseClass
{
	@Test
public void AbleToApplyTheFilterMethod() throws IOException 
{

    
//    APPLY FILTER FROM HIGH TO LOW
    
    HomePOMClass y= new HomePOMClass(driver);
    y.applyfilter();
    ScreenshotClass.Screenshotmethod(driver,"Filter Applied");
    log.info("Filter Clicked");
    log.info("Apply Validation");
//    validation for filter
    
    y.validfilterhtlo();
    
    String provideprice="$49.99";
    String actualprice=y.validfilterhtlo();
    
    Assert.assertEquals(provideprice,actualprice); 
}
}
