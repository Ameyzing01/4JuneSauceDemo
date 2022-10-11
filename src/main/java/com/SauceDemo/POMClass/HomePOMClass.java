package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass 
{
	private WebDriver driver;
	private Select s;
//	1. Select the product give info about prod
	@FindBy(xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")
	WebElement selectprodct;
	
	public void selectprodct()
	{
		selectprodct.click();
	}

//	2.Select the Add to cart and it will add in cart
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    WebElement Addtocart;
	public void Addtocart()
	{
		Addtocart.click();
	}
	
//	3. Select the Add to cart
    
	@FindBy(xpath="//a[@class='shopping_cart_link']")
    WebElement selectcart;
	public void selectcart()
	{
		selectcart.click();
	}
	
	
//	4. validating whether the product add in a cart
	@FindBy(xpath="//span[@class='shopping_cart_badge']")
    WebElement cartBadge;
	public String cartBadge()
	{
		String actcarttext=cartBadge.getText();
		System.out.println("NUMBER OF PRODUCT ADDED IN CART--"+actcarttext);
		return actcarttext;
		
	}
	
//	5. APPLY FILTER
	 @FindBy(xpath="//select[@class='product_sort_container']")
	 WebElement filter;
	 
	 
	public void applyfilter()
	{
		filter.click();
	    s=new Select(filter);
		s.selectByValue("hilo");
		
	}
	
//	6.validating filter
	@FindBy(xpath="(//div[@class='inventory_item_price'])[1]")
	 WebElement validfilterhtlo;
	
	public String validfilterhtlo()
	{
		String actualprice=validfilterhtlo.getText();
		System.out.println("TEXT FROM PRODUCT AFTER APPLYING FILTER--"+actualprice);
		return actualprice;
	}
	
	
//7.
	
	public HomePOMClass(WebDriver driver)
	{
		//global       local
		this.driver = driver;
		
		//sele class
		PageFactory.initElements(driver, this);
		
	}
}
