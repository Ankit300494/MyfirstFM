package com.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.generic.baselib;

public class CusNewPage extends baselib
{
	


	@FindBy(xpath="//input[@name='name']")
	private WebElement custnanmebox;
	@FindBy(xpath="//input[@name='createCustomerSubmit']")
	private WebElement custnanmebtn;
	
	public CusNewPage(WebDriver driver)
	{
		super();
		PageFactory.initElements(driver, this);
	}
	
	public void cusname(String custname)
	{
		custnanmebox.sendKeys(custname);
	}
	public void cusbtn()
	{
		custnanmebtn.click();
	}
}
