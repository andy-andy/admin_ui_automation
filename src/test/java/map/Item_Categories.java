package map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Item_Categories {
	
		private static WebElement element = null;
		
	/**
	 * Categories page title 
	 * @param driver
	 * @return
	 */
	public static String CategoriesText(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/h3"));
		String a = element.getText();
		return a;
	}
	
	/**
	 * Home breadcrumb button
	 * @param driver
	 * @return
	 */
	public static WebElement HomeCrumb(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/ul/li[1]/a"));
		return element;
	}
	
	/**
	 * Categories button on the breadcrumb bar
	 * @param driver
	 * @return
	 */
	public static WebElement CategoriesCrumb(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/div/ul/li[2]/a"));
		return element;
	}
	
	/**
	 * Categories menu button (Wrench icon in header)
	 * @param driver
	 * @return
	 */
	public static WebElement CatMenu_btn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div[1]/div[2]/div/a"));
		return element;
	}
	
	/**
	 * Search input box on the Categories table
	 * @param driver
	 * @return
	 */
	public static WebElement CatSearch_txtbx(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div/label/input"));
		return element;
	}
	
	/**
	 * Display list count drop down button
	 * @param driver
	 * @return
	 */
	public static WebElement DisplayList_drpdwn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/label/div/a"));
		return element;
	}
	
	/**
	 * Name column header for the categories table view
	 * @param driver
	 * @return
	 */
	public static WebElement NameHeader(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/table/thead/tr/th[1]"));
		return element;
	}
	
	/**
	 * IMPORTANT Returns the FIRST Edit button in the list. 
	 * Recommend copying method and adding new xpath for buttons further down the list 
	 * @param driver
	 * @return
	 */
	public static WebElement Edit_btn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/table/tbody/tr[1]/td[2]/a"));
		return element;
	}
	
	/**
	 * Previous button for list pagination
	 * @param driver
	 * @return
	 */
	public static WebElement Previous_btn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/div/ul/li[1]/a"));
		return element;
	}
	
	/**
	 * Next button for list pagination
	 * @param driver
	 * @return
	 */
	public static WebElement Next_btn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div[2]/div[2]/div/ul/li[3]/a"));
		return element;
	}
	
	/**
	 * Name text input field for New Category
	 * @param driver
	 * @return
	 */
	public static WebElement NewCatName(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div[1]/div/div/input"));
		return element;
	}
	
	/**
	 * Position text input field for New Category
	 * @param driver
	 * @return
	 */
	public static WebElement NewCatPosition(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div[2]/div/div/input"));
		return element;
	}
	
	/**
	 * Limit Per Order text input field for New Category
	 * @param driver
	 * @return
	 */
	public static WebElement NewCatLimitPerOrder(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div[3]/div/div/input"));
		return element;
	}
	
	/**
	 * Alcohol checkbox for New Category
	 * @param driver
	 * @return
	 */
	public static WebElement Alcohol_chkbox(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div[4]/div/div[2]/div/span/input"));
		return element;
	}
	
	/**
	 * Limited checbox for New Category
	 * @param driver
	 * @return
	 */
	public static WebElement Limited_chkbox(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div[4]/div/div[3]/div/span/input"));
		return element;
	}
	
	/**
	 * Create Category button for New Category
	 * @param driver
	 * @return
	 */
	public static WebElement CreateNewCat_btn(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div[5]/div/div/input"));
		return element;
	}
	
	/**
	 * General Tab button in Edit Category
	 * @param driver
	 * @return
	 */
	public static WebElement GeneralTab(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/ul/li[2]/a"));
		return element;
	}
	
	/**
	 * Items Tab button in Edit Category
	 * @param driver
	 * @return
	 */
	public static WebElement ItemsTab(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/ul/li[1]/a"));
		return element;
	}
	
	/**
	 * Name input field in Edit Category
	 * @param driver
	 * @return
	 */
	public static WebElement GeneralName(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[1]/div/div[1]/div/div/input"));
		return element;
	}
	
	/**
	 * Position input field in Edit Category
	 * @param driver
	 * @return
	 */
	public static WebElement GeneralPosition(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div/input"));
		return element;
	}
	
	/**
	 * Limit Per Order input field in Edit Category
	 * @param driver
	 * @return
	 */
	public static WebElement GeneralLimitPerOrder(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[1]/div/div[3]/div/div/input"));
		return element;
	}
	
	/**
	 * Alcohol checkbox on Edit Category
	 * @param driver
	 * @return
	 */
	public static WebElement GeneralAlcohol(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[1]/div/div[4]/div/div[2]/div/span/input"));
		return element;
	}
	
	/**
	 * Limited checkbox on Edit Category
	 * @param driver
	 * @return
	 */
	public static WebElement GeneralLimited(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[1]/div/div[4]/div/div[3]/div/span/input"));
		return element;
	}
	
	/**
	 * Cancel button on Edit Category
	 * @param driver
	 * @return
	 */
	public static WebElement EditCancel(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[3]/div/div/button"));
		return element;
	}
	
	/**
	 * Update Category button on Edit Category
	 * @param driver
	 * @return
	 */
	public static WebElement UpdateCategory(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[3]/div/div/input"));
		return element;
	}
	
	/**
	 * Search box for Uncategorized items on the Items tab
	 * @param driver
	 * @return
	 */
	public static WebElement UncatSearch(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[3]/div/div/input"));
		return element;
	}
	
	/**
	 * Search box for selected items on the Items tab
	 * @param driver
	 * @return
	 */
	public static WebElement SelectedSearch(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/div/input"));
		return element;
	}
	
	/**
	 * Returns first row of the Uncategorized Items list.
	 * Recommend copying method and adding xpath for each new row needed
	 * @param driver
	 * @return
	 */
	public static WebElement UncatRowOne(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[1]/ul/li[1]"));
		return element;
	}
	
	/**
	 * Returns first row of the Selected Items list.
	 * Recommend copying method and adding xpath for each new row needed.
	 * @param driver
	 * @return
	 */
	public static WebElement SelectedRowOne(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[2]/div/div/div/div/div[2]/ul/li[3]"));
		return element;
	}
	
	/**
	 * Cancel button on the Items view of Edit Category
	 * @param driver
	 * @return
	 */
	public static WebElement ItemsCancel(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[3]/div/div/button"));
		return element;
	}
	
	/**
	 * Update Category button on the Items view of Edit Category
	 * @param driver
	 * @return
	 */
	public static WebElement ItemsUpdate(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[2]/div[2]/form/div[2]/div[2]/div/div/div[3]/div/div/input"));
		return element;
	}

}



