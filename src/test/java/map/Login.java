package map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	private static WebElement element = null;

	public static WebElement UserNameField(WebDriver driver){
		 element = driver.findElement(By.id("user_email"));
		 return element;
       }

   public static WebElement PasswordField(WebDriver driver){
   	element = driver.findElement(By.id("user_password"));
   	return element;
       }

   public static WebElement LogInBtn(WebDriver driver){
       element = driver.findElement(By.cssSelector("button.btn.green.pull-right"));
       return element;
       }

}
