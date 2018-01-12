package com.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(name="username")
	private WebElement usertxt;
	@FindBy(name="pwd")
	private WebElement pwdtxt;
	@FindBy(id="loginButton")
	private WebElement Loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		//super(driver);
		//This initElements method will create all WebElements
		PageFactory.initElements(driver, this);
	}
	public void login(String username, String pwd)
	{
		usertxt.sendKeys(username);
		pwdtxt.sendKeys(pwd);
		Loginbtn.click();
		
	}
	
}
