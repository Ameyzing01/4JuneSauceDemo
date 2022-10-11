package com.SauceDemo.TestClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClass.LoginPOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TestBaseClassLogout 
{
	//for logout
			public WebDriver driver;
			
			Logger log= Logger.getLogger("SauceDemo");
			
			@Parameters("browserName")
			@BeforeMethod
		public void setup(String browserName) throws IOException
		{
				if(browserName.equals("chrome"))
				{
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			driver =  new ChromeDriver();
				}
				else if(browserName.equals("firefox"))
				{
					System.setProperty("webdriver.gecko.driver","./Drivers\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			        driver= new FirefoxDriver();
				}
				else
				{
					System.out.println("SHOW EXCEPTION");
				}
				
				PropertyConfigurator.configure("log4j.properties");
				log.info("Browser open");
				
				
				driver.manage().window().maximize();
				log.info("Browser maximize");
			driver.get("https://www.saucedemo.com/");
			log.info("Website open");
			
		}
			@AfterMethod
		public void tearDown()
		{
			driver.quit();
			log.info("browser is closed");
		    
			log.info("end of Program");

		}











	
}
