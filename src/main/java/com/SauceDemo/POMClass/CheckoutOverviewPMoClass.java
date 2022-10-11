package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutOverviewPMoClass 
{
WebDriver driver;
	
//	1. checkout overview
	
	@FindBy(xpath="//button[@id='finish']")
	WebElement overview;
	public void overview()
	{
		overview.click();
	}
	
//	2. menu
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")
	WebElement menu;
	public void menu()
	{
		menu.click();
	}
	
//	3. 
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	WebElement logout;
	public void logout()
	{
		logout.click();
	}
	
	public CheckoutOverviewPMoClass(WebDriver driver)
	{
		//global       local
		this.driver = driver;
		
		//sele class
		PageFactory.initElements(driver, this);
		
	}
}
