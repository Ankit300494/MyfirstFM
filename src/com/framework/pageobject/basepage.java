package com.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class basepage
{
	
	//store all common webElements
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasks;
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement Report;
	@FindBy(xpath="//div[text()='Users']")
	private WebElement Users;
	@FindBy(xpath="//div[text()='Work Schedule']")
	private WebElement WorkSchedule;
	@FindBy(xpath="//div[text()='Settings']")
	private WebElement setting;
	
	
	public basepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		
	}
	public void clickTask() 
	{
	   tasks.click();
	}
	public void clickonLogoutLink()
	{
		logoutLink.click();
	}
    
}