package browserFacctory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edgebrowser implements Browser{

	@Override
	public WebDriver launchBrowser() {
		System.out.println("Edge browser opened");
		return new EdgeDriver();
	}
	

}
