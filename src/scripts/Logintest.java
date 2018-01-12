package scripts;

import org.testng.annotations.Test;

import com.framework.generic.waitstatement;
import com.framework.generic.baselib;
import com.framework.generic.excelutilities;
import com.framework.pageobject.EnterTimeTrack;
import com.framework.pageobject.LoginPage;

public class Logintest extends baselib
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
		

	}
	
	
}
