package admin;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RemoveJustCreatedItem {
	
	private WebDriver driver = new FirefoxDriver();
	private String user = new String("andrey@bypassmobile.com");
	private String password_login = new String("andrey198318");
	private String old_admin_integration = "https://integration.bypasslane.com/admins/sign_in";
	private String old_admin_production = "https://bypasslane.com/admins/sign_in";
	private String venue = new String("Bypass WORLD Headquarters");
	private boolean debugMode = true;
	//true for integration
	private String determineUrl() {
		if(debugMode) {
			return old_admin_integration;
		} else {
			return old_admin_production;
		}
	}
	
	@Test
	public void loginToOldAdmin(){
		driver.navigate().to(determineUrl());
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


