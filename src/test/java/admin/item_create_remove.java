package admin;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class item_create_remove{
	
	private String integration_new_admin = new String("https://admin-integration.bypasslane.com/items");
	private String production_new_admin = new String("https://admin.bypassmobile.com/admin_sessions/new");
	
	private String old_admin_integration = "https://integration.bypasslane.com/admins/sign_in";
	private String old_admin_production = "https://bypasslane.com/admins/sign_in";
	
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
	@Test 
	public void createNewItem(){
		driver.navigate().to(determineUrl());
		WebElement user_name = driver.findElement(By.id("user_email"));
		user_name.sendKeys(user);
		WebElement password = driver.findElement(By.id("user_password"));
		password.sendKeys(password_login);
		password.submit();
		WebElement select_venue = driver.findElement(By.id("change_venue"));
		//Pass Venue under test
		select_venue.sendKeys(venue);
		select_venue.submit();
		WebElement LocationControl = driver.findElement(By.linkText("Location Control"));
		LocationControl.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement items = driver.findElement(By.linkText("Items"));
		items.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement b_new_item = driver.findElement(By.partialLinkText("New Item"));
		b_new_item.click();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		WebElement item_name = driver.findElement(By.id("item_name"));
		item_name.sendKeys("BotItem");
		WebElement item_base_price = driver.findElement(By.id("item_base_price"));
		item_base_price.sendKeys("10");
		WebElement item_description = driver.findElement(By.id("item_description"));
		item_description.sendKeys("item_under_test");
		WebElement category = driver.findElement(By.id("item_category_id"));
		category.sendKeys("botCategory");
		WebElement b_create_item = driver.findElement(By.id("item-create-button"));
		b_create_item.submit();
		driver.close();
	}
	
	private String determineOldUrl() {
		if(debugMode) {
			return old_admin_integration;
		} else {
			return old_admin_production;
		}
	}
	
	@Test
	public void rename_created_item(){
		driver.navigate().to(determineOldUrl());
		WebElement user_name = driver.findElement(By.id("admin_email"));
		user_name.sendKeys(user);
		WebElement password = driver.findElement(By.id("admin_password"));
		password.sendKeys(password_login);
		password.submit();
		WebElement venue_old_admin = driver.findElement(By.linkText(venue));
		venue_old_admin.click();
		WebElement menus_old_admin = driver.findElement(By.linkText("Menus"));
		menus_old_admin.click();
		WebElement items_old_admin = driver.findElement(By.linkText("Items"));
		items_old_admin.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement edit_old_admin = driver.findElement(By.partialLinkText("BotItem"));
		edit_old_admin.click();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		WebElement rename_item = driver.findElement(By.id("item_name"));
		rename_item.sendKeys("You_can_delete_this_item_if_needed");
		WebElement b_editform_submit = driver.findElement(By.id("submit"));
		b_editform_submit.submit();
		driver.close();
	}
}

