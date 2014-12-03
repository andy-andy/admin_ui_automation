package map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reports {
	
	private static WebElement element = null;
	
	public static WebElement select_report(WebDriver driver) {
		element = driver.findElement(By.
				xpath("[@id='select2-drop-mask']"));
		return element;
	}

}
