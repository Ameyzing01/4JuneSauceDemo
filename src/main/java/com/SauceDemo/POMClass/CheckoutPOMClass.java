package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPOMClass 
{

	WebDriver driver;
	
//	1.proceed to checkout
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement checkout;
	public void checkout()
	{
		checkout.click();
	}
	
	public CheckoutPOMClass(WebDriver driver)
	{
		//global       local
		this.driver = driver;
		
		//sele class
		PageFactory.initElements(driver, this);
		
	}
	
	
}
