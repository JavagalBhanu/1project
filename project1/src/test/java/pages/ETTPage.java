package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ETTPage {

	public ETTPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyHomePageDisplayed(WebDriver driver,long time,String expectedTitle) {
		WebDriverWait wait=new WebDriverWait(driver, time);
		try {
			wait.until(ExpectedConditions.titleContains(expectedTitle));
			return true;
		}
		catch (Exception e) {
			return false;
		}
	}
}
