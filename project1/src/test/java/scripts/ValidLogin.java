package scripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.reporters.jq.BasePanel;

import generic.BaseTest;
import generic.Excel;
import generic.IAutoConst;
import pages.ETTPage;
import pages.LoginPage;

public class ValidLogin extends BaseTest{

	@Test
	public void testValidLogin() {
		//Get input data from excel
		String un=Excel.getData(XL_PATH, "ValidLogin", 1,0);
		String pw=Excel.getData(XL_PATH, "ValidLogin", 1,1);
		String eTitle=Excel.getData(XL_PATH, "ValidLogin", 1,2);
		
		LoginPage l=new LoginPage(driver);
//		1. Enter valid username (admin)
		l.setUsername(un);
//		2. enter valid password (manager)
		l.setPassword(pw);
//		3.click login
		l.clickLogin();
//		4. verify that home page is displayed
		ETTPage e=new ETTPage(driver);
		boolean result = e.verifyHomePageDisplayed(driver, TIME, eTitle);
		Assert.assertTrue(result);

	}
}
