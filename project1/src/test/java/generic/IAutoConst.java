package generic;

public interface IAutoConst {
	String KEY="webdriver.chrome.driver";
	String VALUE="./src/test/resources/driver/chromedriver.exe";
	String APP_URL="http://www.google.com";
	public static final long TIME=10;
	String XL_PATH="./src/test/resources/input/data.xlsx";
	String HUB_URL="http://localhost:4444/wd/hub";
	String BROWSER="chrome";
	//by default all the variables declared in interface are 'public static final'
}
