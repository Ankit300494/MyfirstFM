package scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.framework.generic.baselib;
import com.framework.generic.excelutilities;
import com.framework.generic.waitstatement;
import com.framework.pageobject.CusNewPage;
import com.framework.pageobject.EnterTimeTrack;
import com.framework.pageobject.LoginPage;
import com.framework.pageobject.OpenTaskPage;
import com.framework.pageobject.basepage;
import com.framework.pageobject.createTask;

//import bsh.This;

public  class TaskCreate extends baselib
{

	@Test
	public void validlogin()
	{
		String username= excelutilities.readData("Sheet1", 1, 1);
		String pwdtxt=excelutilities.readData("Sheet1", 1, 2);
		LoginPage lp = new LoginPage(driver);
		lp.login(username, pwdtxt);
		EnterTimeTrack ett = new EnterTimeTrack(driver);
		ett.verifyHomePage();
		waitstatement.implicitwaitforseconds(driver,20);
		ett.clickTask();
		OpenTaskPage otp = new OpenTaskPage(driver);
		otp.ProjectCustomersclick();
		waitstatement.implicitwaitforseconds(driver, 20);
		otp.CreateNewCustomerclick();
		String customername= excelutilities.readData("Sheet1", 1, 1);
		CusNewPage cus= new CusNewPage(driver);
		cus.cusname(customername);
		Reporter.log("customer created.....", true);
		cus.cusbtn();
		
		
	
		

	}
	
	
}
