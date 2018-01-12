package com.framework.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.framework.generic.getpropertyvalue;
import com.framework.generic.waitstatement;

public class baselib 
{
public WebDriver driver;
	
	@BeforeMethod
//	@Parameters("browser")
//	public void setUP(String browserName)
//	{
	public void setUp()
	{
		String browserName = getpropertyvalue.getvalue("browser");
	if (browserName.equalsIgnoreCase("firefox"))
	{
		driver= new FirefoxDriver();
		Reporter.log("Firefox Launched", true);
	}
	else if (browserName.equalsIgnoreCase("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver",".\\exefiles\\chromedriver.exe");
		
	driver=new ChromeDriver();
	Reporter.log("Chrome Launched", true);
	}
	driver.manage().window().maximize();
	waitstatement.implicitwaitforseconds(driver,20);
	driver.get(getpropertyvalue.getvalue("url"));
	
}
	@AfterMethod
	public void teardown(ITestResult  iTest)
	{
		if(iTest.isSuccess())
		{
			System.out.println("Result pass");
		}
		
	}
	

}
