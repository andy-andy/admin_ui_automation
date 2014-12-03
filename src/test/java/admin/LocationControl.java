package admin;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocationControl {
	
	private String integration_new_admin = new String("https://admin-integration.bypasslane.com/items");
	private String production_new_admin = new String("https://admin.bypassmobile.com/admin_sessions/new");
	private String venue = new String("Bypass WORLD Headquarters");
	private String user = new String("andrey@bypassmobile.com");
	private String password_login = new String("andrey198318");
	private WebDriver driver = new FirefoxDriver();
	
	private boolean debugMode = true;
	//true for integration
	private String determineUrl() {
		if(debugMode) {
			return integration_new_admin;
		} else {
			return production_new_admin;
		}
	}
	
	@Before 
	public void loginToNewAdmin(){
		driver.navigate().to(determineUrl());
		WebElement user_name = driver.findElement(By.id("user_email"));
		user_name.sendKeys(user);
		WebElement password = driver.findElement(By.id("user_password"));
		password.sendKeys(password_login);
		password.submit();
	}
	
	@After
	public void closeDriver() {
		driver.quit();;
	}
	
	@Test	
	public void pickVenue(){
		//Expand Venue drop-down
		WebElement select_venue = driver.findElement(By.id("change_venue"));
		//Pass Venue under test
		select_venue.sendKeys(venue);
		select_venue.submit();
	}
	
	@Test
	public void navigateToLocationControl(){
		pickVenue();
		WebElement LocationControl = driver.findElement(By.linkText("Location Control"));
		LocationControl.click();
	}
	
	@Test
	public void navigateToItems(){
		navigateToLocationControl();
		//WebElement items = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Items")));
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement items = driver.findElement(By.linkText("Items"));
		items.click();
	}

}

