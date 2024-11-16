package browserFacctory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chromebrowser implements Browser{

	@Override
	public WebDriver launchBrowser() {
		System.out.println("Chrome Browser launched");
		return new ChromeDriver();
	}

	

}
