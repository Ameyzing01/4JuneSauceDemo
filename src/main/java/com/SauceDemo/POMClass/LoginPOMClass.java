package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
	//POM Class steps
			//1.WebDriver driver declare
			//2.ele find by @FindBy Annotation
			//3.created a method to perform a action on element
			//4.Constructor create

	
 WebDriver driver;
//	1.
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username;
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}

//	2.
	@FindBy(xpath="//input[@id='password']")
    WebElement password;
	public void password()
	{
		password.sendKeys("secret_sauce");
	}
	
//  3.
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement loginButton;
	public void loginButton()
	{
		loginButton.click();
	}
    
//4.
	
	public LoginPOMClass(WebDriver driver)
	{
		//global       local
		this.driver = driver;
		
		//sele class
		PageFactory.initElements(driver, this);
		
	}

	
}
