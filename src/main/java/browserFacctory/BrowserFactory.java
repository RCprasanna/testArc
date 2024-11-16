package browserFacctory;

import org.openqa.selenium.WebDriver;

 enum browserType {
	CHROME,
	EDGE,
	FIREFOX
}

public class BrowserFactory  {
	public static WebDriver driver;

	public static WebDriver openWebApplication (browserType browser){
		
		switch(browser) {
		case CHROME:
			driver = new Chromebrowser().launchBrowser();
			return driver;
		case EDGE:
			driver = new Edgebrowser().launchBrowser();
		case FIREFOX:
			driver = new Firefoxbrowser().launchBrowser();
			return driver;
		default:
			 throw new IllegalArgumentException("Browser type not supported: " + browser);
			
		}
	}

}
