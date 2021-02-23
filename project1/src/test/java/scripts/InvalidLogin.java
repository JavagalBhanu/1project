package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import pages.LoginPage;

public class InvalidLogin extends BaseTest {

	@Test
	public void testInvalidLogin() {
		//Get input data from excel
		String un=Excel.getData(XL_PATH, "InvalidLogin", 1,0);
		String pw=Excel.getData(XL_PATH, "InvalidLogin", 1,1);
		LoginPage l=new LoginPage(driver);
//		1. Enter invalid username (admin)
		l.setUsername(un);
//		2. enter invalid password (manager)
		l.setPassword(pw);
//		3.click login
		l.clickLogin();
//		4. verify that err msg is displayed
		boolean result = l.verifyErrMsgDispalyed(driver, TIME);
		Assert.assertTrue(result);
	}
}
