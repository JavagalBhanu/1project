package generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IAutoConst{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void preCondition() throws MalformedURLException {
		System.setProperty(KEY,VALUE);
		URL remoteAddress=new URL(HUB_URL);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName(BROWSER);
		driver=new RemoteWebDriver(remoteAddress, capabilities);	
		driver.manage().timeouts().implicitlyWait(TIME,TimeUnit.SECONDS);
		driver.get(APP_URL);
	}
	
	@AfterMethod
	public void postCondition() {
		driver.quit();
	}
}
