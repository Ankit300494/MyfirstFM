package com.framework.pageobject;

import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnterTimeTrack  extends basepage
{
		
		WebDriver driver;
		@FindBy(xpath="//img[contains(@src,'default-logo.png')]")
		private WebElement logo;
		public EnterTimeTrack(WebDriver driver) 
		{
		
				super(driver);
				this.driver=driver;
				PageFactory.initElements(driver, this);
				
		}

		public void verifyHomePage()
		{

			AssertJUnit.assertTrue(logo.isDisplayed());
			Reporter.log("Home Page logo is displayed", true);
			String expTitle="actiTIME - Enter Time-Track";
			String actTitle=driver.getTitle();
			AssertJUnit.assertEquals(actTitle, expTitle);
			Reporter.log("Home page title is verified", true);
			/*EnterTimeTrack ett= new EnterTimeTrack(driver);
			ett.clickTask();*/
		}
		
		
		

	
	
		
}
