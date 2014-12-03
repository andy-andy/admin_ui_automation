package admin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {
	
		//private String event = new String("oct2/2014");
		//private String venue = new String("Bypass WORLD Headquarters");
		
		private String integration_new_admin = "https://admin-integration.bypasslane.com/items";
		private String production_new_admin = "https://admin.bypassmobile.com/admin_sessions/new";
		//"BBVA Compass Stadium"
		//"Bypass WORLD Headquarters"
		private String user = new String("andrey@bypassmobile.com");
		private String password_login = new String("andrey198318");
		
		private WebDriver driver = new FirefoxDriver();
		
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
	public void login() {
		driver = new FirefoxDriver();
		driver.navigate().to(determineUrl());
		WebElement user_name = driver.findElement(By.id("user_email"));
		user_name.sendKeys(user);
		WebElement password = driver.findElement(By.id("user_password"));
		password.sendKeys(password_login);
		password.submit();
	}
	
	@Test
	public void getText() throws IOException {
		String text = driver.findElement(By.xpath("//div[@id='page-title']/h3")).getText();
		Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("status.txt"), "utf-8"));
		writer.write(text);
		writer.close();
	}
	
	@Test
	public void saveScreenshot() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("screenshot.png"));
	}
   
}
