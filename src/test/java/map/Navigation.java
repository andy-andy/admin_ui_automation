package map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navigation {
	
	private static WebElement element = null;
	
	// Dashboard group starts here		
			
		/**
		 * Dashboard button
		 * @param driver
		 * @return
		 */
		public static WebElement Dashboard(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[1]/a"));
			return element;
		}
		
	// Location Control group starts here	
		
		/**
		 * Location Control button
		 * @param driver
		 * @return
		 */
		public static WebElement LocationControl(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[2]/a"));
			return element;
		}
		
		/**
		 * Categories button under Location Control group
		 * @param driver
		 * @return
		 */
		public static WebElement Categories(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[2]/ul/li[1]/a"));
			return element;
		}
		
		/**
		 * Item Categories submenu button
		 * @param driver
		 * @return
		 */
		public static WebElement ItemCateogries(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[2]/ul/li[1]/ul/li[1]/a"));
			return element;
		}
		
		/**
		 * Modifier Categories submenu button
		 * @param driver
		 * @return
		 */
		public static WebElement ModifierCategories(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[2]/ul/li[1]/ul/li[2]/a"));
			return element;
		}
		
		/**
		 * Groups button under the Locations Control group
		 * @param driver
		 * @return
		 */
		public static WebElement Groups(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[2]/ul/li[2]/a"));
			return element;
		}
		
		/**
		 * Items button under the Locations Control group
		 * @param driver
		 * @return
		 */
		public static WebElement Items(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[2]/ul/li[3]/a"));
			return element;
		}
		
		/**
		 * Menus button under the Locations Control group
		 * @param driver
		 * @return
		 */
		public static WebElement Menus(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[2]/ul/li[4]/a"));
			return element;
		}
		
		/**
		 * Locations button under the Locations Control group
		 * @param driver
		 * @return
		 */
		public static WebElement Locations(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[2]/ul/li[5]/a"));
			return element;
		}
		
		/**
		 * Sections button under the Locations Control group
		 * @param driver
		 * @return
		 */
		public static WebElement Sections(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[2]/ul/li[6]/a"));
			return element;
		}
		
		/**
		 * Tables button under the Locations Control group
		 * @param driver
		 * @return
		 */
		public static WebElement Tables(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[2]/ul/li[7]/a"));
			return element;
		}
		
		/**
		 * Variant Sets button under the Locations Control group
		 * @param driver
		 * @return
		 */
		public static WebElement VariantSets(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[2]/ul/li[8]/a"));
			return element;
		}
		
		/**
		 * Modifiers button under the Locations Control group
		 * @param driver
		 * @return
		 */
		public static WebElement Modifiers(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[2]/ul/li[9]/a"));
			return element;
		}
		
		/**
		 * Addon Groups button under the Locations Control group
		 * @param driver
		 * @return
		 */
		public static WebElement AddonGroups(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[2]/ul/li[10]/a"));
			return element;
		}
		
	// Suites group starts here	
		
		/**
		 * Suites group button
		 * @param driver
		 * @return
		 */
		public static WebElement Suites(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[3]/a"));
			return element;
		}
		
		/**
		 * Suites Accounts button under the Suites group
		 * @param driver
		 * @return
		 */
		public static WebElement SuitesAccounts(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[3]/ul/li[1]/a"));
			return element;
		}
		
		/**
		 * Suites Setup button under the Suites group
		 * @param driver
		 * @return
		 */
		public static WebElement SuitesSetup(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[3]/ul/li[2]/a"));
			return element;
		}
		
		/**
		 * Suites PreOrder button under the Suites group
		 * @param driver
		 * @return
		 */
		public static WebElement SuitesPreOrder(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[3]/ul/li[3]/a"));
			return element;
		}
		
	// Events group starts here	
		
		/**
		 * Events group button
		 * @param driver
		 * @return
		 */
		public static WebElement Events(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[4]/a"));
			return element;
		}
		
		/**
		 * Events Calendar button under the Events group
		 * @param driver
		 * @return
		 */
		public static WebElement EventsCalendar(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[4]/ul/li[1]/a"));
			return element;
		}
		
		/**
		 * Orders button under the Events group
		 * @param driver
		 * @return
		 */
		public static WebElement Orders(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[4]/ul/li[2]/a"));
			return element;
		}
		
		/**
		 * Tips button under the Events group
		 * @param driver
		 * @return
		 */
		public static WebElement Tips(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[4]/ul/li[3]/a"));
			return element;
		}
		
		/**
		 * Cash Room button under the Events group
		 * @param driver
		 * @return
		 */
		public static WebElement CashRoom(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[4]/ul/li[4]/a"));
			return element;
		}
		
	// Inventory group starts here	
		
		/**
		 * Inventory group button
		 * @param driver
		 * @return
		 */
		public static WebElement Inventory(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[5]/a"));
			return element;
		}
		
		/**
		 * Status button under the Inventory group
		 * @param driver
		 * @return
		 */
		public static WebElement Status(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[5]/ul/li[1]/a"));
			return element;
		}
		
		/**
		 * Inventory Categories button under the Inventory group
		 * @param driver
		 * @return
		 */
		public static WebElement InventoryCategories(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[5]/ul/li[2]/a"));
			return element;
		}
		
		/**
		 * Inventory Transfers button under the Inventory group
		 * @param driver
		 * @return
		 */
		public static WebElement InventoryTransfers(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[5]/ul/li[3]/a"));
			return element;
		}
		
		/**
		 * Inventory Movements button under the Inventory group
		 * @param driver
		 * @return
		 */
		public static WebElement InventoryMovements(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[5]/ul/li[4]/a"));
			return element;
		}
		
		/**
		 * Standsheets button under the Inventory group
		 * @param driver
		 * @return
		 */
		public static WebElement Standsheets(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[5]/ul/li[5]/a"));
			return element;
		}
		
		/**
		 * Stock Items button under the Inventory group
		 * @param driver
		 * @return
		 */
		public static WebElement StockItems(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[5]/ul/li[6]/a"));
			return element;
		}
		
		/**
		 * Recipes button under the Inventory group 
		 * @param driver
		 * @return
		 */
		public static WebElement Recipes(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[5]/ul/li[7]/a"));
			return element;
		}
		
		/**
		 * Vendors button under the Inventory group
		 * @param driver
		 * @return
		 */
		public static WebElement Vendors(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[5]/ul/li[8]/a"));
			return element;
		}
		
		/**
		 * Inventory Audits button under the Inventory group
		 * @param driver
		 * @return
		 */
		public static WebElement InventoryAudits(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[5]/ul/li[9]/a"));
			return element;
		}
		
		/**
		 * Purchasing & Receiving button under the Inventory group
		 * @param driver
		 * @return
		 */
		public static WebElement PurchasingReceiving(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[5]/ul/li[10]/a"));
			return element;
		}
		
		/**
		 * Warehouses button under the Inventory category
		 * @param driver
		 * @return
		 */
		public static WebElement Warehouses(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[5]/ul/li[11]/a"));
			return element;
		}
		
	// Reporting group starts here	
		
		/**
		 * Reporting group button
		 * @param driver
		 * @return
		 */
		public static WebElement Reporting(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[6]/a"));
			return element;
		}
		
		/**
		 * Reports button under the Reporting group
		 * @param driver
		 * @return
		 */
		public static WebElement Reports(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[6]/ul/li[1]/a"));
			return element;
		}
		
		/**
		 * Report Templates button under the Reporting group
		 * @param driver
		 * @return
		 */
		public static WebElement ReportTemplates(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[6]/ul/li[2]/a"));
			return element;
		}
		
	// Order Takers group starts here	
		
		/**
		 * Order Takers group button
		 * @param driver
		 * @return
		 */
		public static WebElement OrderTakers(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[7]/a"));
			return element;
		}
		
	// Devices group starts here	
		
		/**
		 * Devices group button
		 * @param driver
		 * @return
		 */
		public static WebElement Devices(WebDriver driver) {
			element = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/ul/li[8]/a"));
			return element;
		}
		
	}

