package com.SauceDemo.UtilityClass;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotClass 
{
public static void Screenshotmethod(WebDriver driver, String SSname) throws IOException
{
	Date d=new Date();
	DateFormat d1 = new SimpleDateFormat("MM-dd-yy & HH-mm-ss");
	String date = d1.format(d);

	TakesScreenshot ss=(TakesScreenshot) driver;
    File source=ss.getScreenshotAs(OutputType.FILE);
    File dest= new File("./Screenshots\\"+SSname+date+".jpg");
    FileHandler.copy(source, dest);
}
}
