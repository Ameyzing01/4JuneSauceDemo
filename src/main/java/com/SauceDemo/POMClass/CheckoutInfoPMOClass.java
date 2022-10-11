package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutInfoPMOClass 
{
WebDriver driver;
	
//	1. checkout info first name
	
	@FindBy(xpath="//input[@id='first-name']")
	WebElement Firstname;
	public void Firstname()
	{
		Firstname.sendKeys("AMEY");
	}
	
//2. checkout info last name
	
	@FindBy(xpath="//input[@id='last-name']")
	WebElement Lastname;
	public void Lastname()
	{
		Lastname.sendKeys("Gawande");
	}
	
	
	//3. checkout info zip code
	
		@FindBy(xpath="//input[@id='postal-code']")
		WebElement Zipcode;
		public void Zipcode()
		{
			Zipcode.sendKeys("445001");
		}
	
   //4. checkout info continue button
		
			@FindBy(xpath="//input[@id='continue']")
			WebElement contButton;
			public void contButton()
			{
				contButton.click();
			}
	
	
			public CheckoutInfoPMOClass(WebDriver driver)
			{
				//global       local
				this.driver = driver;
				
				//sele class
				PageFactory.initElements(driver, this);
				
			}
	
	
	
	
}
