package com.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.generic.baselib;

public class OpenTaskPage extends baselib
{
	@FindBy(xpath="//a[text()='Projects & Customers']")
	private WebElement ProjectCustomers;
	@FindBy(xpath="//input[@value='Create New Customer']")
	private WebElement CreateNewCustomer;
	@FindBy(xpath="//input[@name='name']")
	private WebElement custName;
	
	public OpenTaskPage(WebDriver driver) 
	{
		super();
		PageFactory.initElements(driver, this);
		
	}
	public void ProjectCustomersclick()
	{
		ProjectCustomers.click();
	}
	public void CreateNewCustomerclick()
	{
		CreateNewCustomer.click();
		
	}
	public void custbox()
	{
		custName.click();
	}
	
}
