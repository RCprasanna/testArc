package browserFacctory;

import org.openqa.selenium.WebDriver;

public class OpenBrowserr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = BrowserFactory.openWebApplication(browserType.CHROME);
		driver.close();
		

	}

}
