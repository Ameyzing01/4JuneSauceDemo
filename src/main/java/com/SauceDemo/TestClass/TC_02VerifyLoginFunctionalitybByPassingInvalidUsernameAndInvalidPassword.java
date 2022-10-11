package com.SauceDemo.TestClass;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.LoginWrongCrediantial;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TC_02VerifyLoginFunctionalitybByPassingInvalidUsernameAndInvalidPassword extends TestBaseClassLogout
{
	@Test
public void VerifyLoginWithWrongCredentialMethod() throws IOException
{

	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);	
	LoginWrongCrediantial x=new LoginWrongCrediantial(driver);
	
	x.sendUsername();
	log.info(" Wrong Username Passed");
	x.password();
	log.info("Wrong Password Passed");
	x.loginButton();
	ScreenshotClass.Screenshotmethod(driver,"Loginpage");
	log.info("Login Clicked");
	ScreenshotClass.Screenshotmethod(driver,"Failed login");
	log.info("Apply Validation");
// validating the successful login

    String provideurl="https://www.saucedemo.com/inventory.html";
    String actualurl= driver.getCurrentUrl();

    Assert.assertEquals(actualurl, provideurl,"TC FAILED DUE TO WRONG CREDENTIAL");
 driver.quit();
}
}
