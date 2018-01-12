package com.framework.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitstatement 
{
	
	
	

	public static void implicitwaitforseconds(WebDriver driver, int sec)
	{
	
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		
	}
	
	/************************************************************************************************************/
	
	
	public static void implicitwaitforminutes(WebDriver driver, int min)
	{
	
		driver.manage().timeouts().implicitlyWait(min, TimeUnit.MINUTES);
		
	}
	
	/*************************************************************************************************************/
	
	public static void explicitwaitforClickable(WebDriver driver,int sec, WebElement ele)
	{
		WebDriverWait wait= new WebDriverWait(driver,sec);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		
	}	
		/**********************************************************************************************************/
		
	public static void explicitwaitforvisiblity(WebDriver driver,int sec, WebElement ele)	
	{
		WebDriverWait wait1= new WebDriverWait(driver,sec);
		wait1.until(ExpectedConditions.visibilityOf(ele));
		
		
	}
		
		
	
}
