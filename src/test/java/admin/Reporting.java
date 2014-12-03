package admin;

import map.Reports;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Reporting {
	private String event = new String("Ethan test for nov (Everyone use this one)");
	private String venue = new String("Bypass WORLD Headquarters");
	
	private String integration_new_admin = "https://admin-integration.bypasslane.com/items";
	private String production_new_admin = "https://admin.bypassmobile.com/admin_sessions/new";
	//"BBVA Compass Stadium"
	//"Bypass WORLD Headquarters"
	private String user = new String("andrey@bypassmobile.com");
	private String password_login = new String("andrey198318");
	
	private boolean debugMode = false;
	//true for integration
	private String determineUrl() {
		if(debugMode) {
			return integration_new_admin;
		} else {
			return production_new_admin;
		}
	}
	
	@Test
	public void generateRecipeIngredientsReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				WebElement reports = driver.findElement(By.linkText("Reports"));
				reports.click();
				
				Reports.select_report(driver).click();
				Reports.select_report(driver).sendKeys("Receipe Ingredients Report");
				
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateCashOverShortSummaryReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Cash Over/Short Summary Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateOrderTakerSummaryReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Order Taker Summary Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateLossPreventionReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Loss Prevention");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateGosByStockItemReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("GOS By Stock Item Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateGosByLocationReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("GOS By Location Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateEndOfNightReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("End-of-Night Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	
	@Test
	public void generateSummaryReport(){
		// Create a new instance of the Firefox driver 
		WebDriver driver = new FirefoxDriver();
		//Maximize chrome window
		//driver.manage().window().maximize();
		// Alternatively the same thing can be done like this
        // driver.get("http://www.google.com");
		driver.navigate().to(determineUrl());
		// Find the text input element by its name
		WebElement user_name = driver.findElement(By.id("user_email"));
		user_name.sendKeys(user);
		WebElement password = driver.findElement(By.id("user_password"));
		password.sendKeys(password_login);
		password.submit();
		//Expand Venue drop-down
		WebElement select_venue = driver.findElement(By.id("change_venue"));
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//Pass Venue under test
		select_venue.sendKeys(venue);
		
		select_venue.submit();
		//Generate Summary report
		WebElement report = driver.findElement(By.linkText("Reporting"));
		report.click();
		WebElement select_report = driver.findElement(By.id("report_type_chooser"));
		select_report.sendKeys("Summary Report");
		WebElement select_event = driver.findElement(By.id("report_event"));
		select_event.sendKeys(event);
		select_event.submit();
		driver.close();
		
	}
	
	@Test
	public void generateBatchReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				//Generate Batch report
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Batch Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);		
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateCashierSummaryReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Cashier Summary Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateGreen4LoyaltyReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				//Generate Batch report
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Green4 Loyalty Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateLineItemReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Line Item Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateLineItemReportByLocation(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Line Item Report By Location");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void LocationInventoryDetailReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Location Inventory Detail Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateLoyaltyAccountReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Loyalty Account Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateOrdersReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Orders Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	
	@Test
	public void generatePaymentReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Payments Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generatePosGosPaymentsReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Pos to Gos Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateSpecialInstructionsReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Special Instructions Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateTicketsReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Tickets Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateSVPaymentReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Stored Value Payment Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateTipsReportByDeviceSerialNumber(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Tips Report by Device Serial Number");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateTipsReportByOrderTaker(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Tips Report By Order Taker");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateTotalsReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Totals Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	@Test
	public void generateVenueInventorySummaryReport(){
		// Create a new instance of the Firefox driver 
				WebDriver driver = new FirefoxDriver();
				// Alternatively the same thing can be done like this
		        // driver.get("http://www.google.com");
				driver.navigate().to(determineUrl());
				// Find the text input element by its name
				WebElement user_name = driver.findElement(By.id("user_email"));
				user_name.sendKeys(user);
				
				WebElement password = driver.findElement(By.id("user_password"));
				password.sendKeys(password_login);
				password.submit();
				
				WebElement select_venue = driver.findElement(By.id("change_venue"));
				select_venue.sendKeys(venue);
				select_venue.submit();
				
				
				WebElement report = driver.findElement(By.linkText("Reporting"));
				report.click();
				
				WebElement select_report = driver.findElement(By.id("report_type_chooser"));
				select_report.sendKeys("Venue Inventory Summary Report");
				WebElement select_event = driver.findElement(By.id("report_event"));
				select_event.sendKeys(event);
				select_event.submit();
				driver.close();
		
	}
	
	
	

}
