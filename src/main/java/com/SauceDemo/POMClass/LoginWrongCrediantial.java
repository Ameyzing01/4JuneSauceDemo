package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWrongCrediantial 
{
	WebDriver driver;
//	1.
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username;
	
	public void sendUsername()
	{
		username.sendKeys("amey");
	}

//	2.
	@FindBy(xpath="//input[@id='password']")
    WebElement password;
	public void password()
	{
		password.sendKeys("secr");
	}
	
//  3.
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement loginButton;
	public void loginButton()
	{
		loginButton.click();
	}
    
//4.
	
	public LoginWrongCrediantial(WebDriver driver)
	{
		//global       local
		this.driver = driver;
		
		//sele class
		PageFactory.initElements(driver, this);
		
	}
}
