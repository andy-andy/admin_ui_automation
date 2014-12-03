package admin;

import java.util.concurrent.TimeUnit;

import map.Dashboard;
import map.Login;
import map.Venue_Select;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test2 {
	private String integration_new_admin = "https://admin-integration.bypasslane.com/items";
	private String production_new_admin = "https://admin.bypassmobile.com/admin_sessions/new";

	private String user = new String("bot@bypassmobile.com");
	private String password_login = new String("bypass");
	private String venue = new String("Bypass WORLD Headquarters");

	// true for integration
	private boolean debugMode = false;

	private String determineUrl() {
		if (debugMode) {
			return integration_new_admin;
		} else {
			return production_new_admin;
		}
	}

	@Test
	public void navigateToDashboard() {
		// Create a new instance of the Fire-fox driver
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to(determineUrl());
		//Login page
		Login.UserNameField(driver).sendKeys(user);
		Login.PasswordField(driver).sendKeys(password_login);
		Login.LogInBtn(driver).click();
		//Pick venue
		Venue_Select.VenueList(driver).sendKeys(venue);
		Venue_Select.btn_Go(driver).click();
		//Timeout
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Navigate to Reporting
		Dashboard.btn_Reports(driver).click();
		//Timeout
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//Navigate to Dashboard
		Dashboard.btn_Dashboard(driver).click();
		driver.close();
	}

}