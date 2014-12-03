package map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Venue_Select {
	
private static WebElement element = null;
	
	public static WebElement VenueList(WebDriver driver) {
		element = driver.findElement(By.id("change_venue"));
		 return element;
        }

    public static WebElement drpdwn_VenueText(WebDriver driver) {
    	element = driver.findElement(By.xpath("//*[contains(text(), 'QA Kingdom')]"));
    	return element;
        }
    
    public static WebElement btn_Go(WebDriver driver) {
        element = driver.findElement(By.cssSelector("button.btn.green.pull-right"));
        return element;
        }
    
    public static WebElement form_Title(WebDriver driver) {
    	element = driver.findElement(By.xpath("//*[contains(text(), 'Please Select a Venue')]"));
    	return element;
    }

}
