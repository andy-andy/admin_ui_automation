package admin;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cash_order_verify {

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("chrome://restclient/content/restclient.html");
	}

}
