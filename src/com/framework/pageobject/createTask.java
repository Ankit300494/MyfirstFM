package com.framework.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.framework.generic.baselib;
import com.framework.generic.waitstatement;

public class createTask extends basepage
{
   
	
	public createTask(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//waitstatement ws = new waitstatement();
	
		
	
	
	String tasknamef="project";
	@FindBy(xpath="//input[@value='Create New Tasks']")
	private WebElement createtask;
	@FindBy(xpath=".//*[@id='task0.cell']/input[1]")
	private WebElement taskname;
/*	@FindBy(xpath="//input[@value='Create Tasks']")
	private WebElement CreateTasks;*/
	

	public void page(WebDriver driver)
	{
		EnterTimeTrack ett= new EnterTimeTrack(driver);
		ett.clickTask();
		waitstatement.implicitwaitforseconds(driver, 10);
		
	}
	
	public void clicknewtask()
	{
		createtask.click();
	}
	public void createtask()
	{
		taskname.sendKeys(tasknamef);
	
	}
	
}
