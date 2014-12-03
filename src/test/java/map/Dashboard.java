package map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard {
	private static WebElement element = null;

	public static WebElement btn_Dashboard(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[2]/div/div/div/ul/li/a/span"));
		return element;
	}

	public static WebElement btn_Reports(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[2]/div/div/div/ul/ul/li[6]/a/span/"));
		return element;
	}

	/**
	 * Logout button at the upper right corner of the view
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement btn_Logout(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div/div/ul[2]/li[2]/a"));
		return element;
	}

	/**
	 * Home button on the Breadcrumb bar
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement btn_HomeCrumb(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[2]/div[2]/div/div/ul/li/a"));
		return element;
	}

	/**
	 * Dashboard button on the Breadcrumb bar
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement btn_DashboardCrumb(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[2]/div[2]/div/div/ul/li[2]/a"));
		return element;
	}

	// Page objects for the Date Select menu starts below

	/**
	 * Date Select button above Total Sales banner
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement btn_DateSelect(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[2]/div/div/div[2]/div/span[2]/button"));
		return element;
	}

	/**
	 * Today menu option from Date Select button above Total Sales Banner
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement dateSelect_Today(WebDriver driver) {
		element = driver
				.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li"));
		return element;
	}

	/**
	 * Yesterday menu option from Date Select button above Total Sales Banner
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement dateSelect_Yesterday(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[4]/div[3]/ul/li[2]"));
		return element;
	}

	/**
	 * Last 7 Days menu option from Date Select button above Total Sales Banner
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement dateSelect_SevenDays(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[4]/div[3]/ul/li[3]"));
		return element;
	}

	/**
	 * Last 30 Days menu option from Date Select button above Total Sales Banner
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement dateSelect_ThirtyDays(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[4]/div[3]/ul/li[4]"));
		return element;
	}

	/**
	 * This Month menu option from Date Select button above Total Sales Banner
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement dateSelect_ThisMonth(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[4]/div[3]/ul/li[5]"));
		return element;
	}

	/**
	 * Last Month menu option from Date Select button above Total Sales Banner
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement dateSelect_LastMonth(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[4]/div[3]/ul/li[6]"));
		return element;
	}

	/**
	 * Custm Date Range menu option from Date Select button above Total Sales
	 * Banner
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement dateSelect_Custom(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[4]/div[3]/ul/li[7]"));
		return element;
	}

	/**
	 * Date start calendar for custom date range selection
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement dateSelect_CalendarStart(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div"));
		return element;
	}

	/**
	 * Date end calendar for custom date range selection
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement dateSelect_CalendarEnd(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[4]/div[2]/div"));
		return element;
	}

	/**
	 * Apply button for the Date Select drop down
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement dateSelect_btn_Apply(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[4]/div[3]/div/button[1]"));
		return element;
	}

	/**
	 * Cancel button for the Date Select drop down
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement dateSelect_btn_Cancel(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[4]/div[3]/div/button[2]"));
		return element;
	}

	// Page objects for the Items Sold graph begin below

	/**
	 * Menu button for the Items Sold graph
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_MnuBtn(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/div/button"));
		return element;
	}

	/**
	 * Locations button on the Items Sold drop down menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_Locations(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/div/ul/li[1]/a"));
		return element;
	}

	/**
	 * Checkbox for the All selection off of the locations option
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_chkbox_All(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/div/ul/li[1]/ul/label[1]/div/span/input"));
		return element;
	}

	/**
	 * Checkbox for the None selection off of the locations option
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_chkbox_None(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/div/ul/li[1]/ul/label[2]/div/span/input"));
		return element;
	}

	/**
	 * Calendar button on the Items Sold menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_btn_Calendar(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/div/ul/li[3]/div/span[2]/button"));
		return element;
	}

	/**
	 * Today button on the Items Sold menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_btn_Today(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[6]/div[3]/ul/li[1]"));
		return element;
	}

	/**
	 * Yesterday button on the Items Sold menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_btn_Yesterday(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[6]/div[3]/ul/li[2]"));
		return element;
	}

	/**
	 * Last 7 Days button on the Items Sold menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_btn_SevenDays(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[6]/div[3]/ul/li[3]"));
		return element;
	}

	/**
	 * Last 30 Days button on the Items Sold menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_btn_ThirtyDays(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[6]/div[3]/ul/li[4]"));
		return element;
	}

	/**
	 * This Month button on the Items Sold menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_btn_ThisMonth(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[6]/div[3]/ul/li[5]"));
		return element;
	}

	/**
	 * Last Month button on the Items Sold menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_btn_LastMonth(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[6]/div[3]/ul/li[6]"));
		return element;
	}

	/**
	 * Custom Range button on the Items Sold menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_btn_Custom(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[6]/div[3]/ul/li[7]"));
		return element;
	}

	/**
	 * Calendar object for the From part of Custom Range
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_FromCalendar(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[6]/div[2]/div"));
		return element;
	}

	/**
	 * Calendar object for the To part of Custom Range
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_ToCalendar(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div"));
		return element;
	}

	/**
	 * Apply button on the Items Sold menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_btn_Apply(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[6]/div[3]/div/button[1]"));
		return element;
	}

	/**
	 * Cancel button on the Items Sold menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_btn_Cancel(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[6]/div[3]/div/button[2]"));
		return element;
	}

	/**
	 * Sales radio button on the Items Sold menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_btn_Sales(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/div/ul/li[4]/label[1]/div/span"));
		return element;
	}

	/**
	 * Counts radio button on the Items Sold menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_btn_Counts(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/div/ul/li[4]/label[2]/div/span"));
		return element;
	}

	/**
	 * Apply button at the bottom of the Sold Items menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement itemsSold_btn_MenuApply(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div/div[1]/div/div/ul/div/button"));
		return element;
	}

	// Page objects for Orders Placed menu

	/**
	 * Drop down menu for the Orders Placed graph
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_Menu(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div/button"));
		return element;
	}

	/**
	 * Locations button on the Orders Placed drop down menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_Locations(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div/ul/li[1]/a"));
		return element;
	}

	/**
	 * Checkbox for the All selection from the Locations button
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_chkbox_All(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div/ul/li[1]/ul/label[1]/div/span/input"));
		return element;
	}

	/**
	 * Checkbox for the None selection from the Locations button
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_chkbox_None(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div/ul/li[1]/ul/label[2]/div/span/input"));
		return element;
	}

	/**
	 * Order Takers button on the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_OrderTakers(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div/ul/li[2]/a"));
		return element;
	}

	/**
	 * Checkbox for the All option under the Order Takers button
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_AllOrderTakers(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div/ul/li[2]/ul/label[1]/div/span/input"));
		return element;
	}

	/**
	 * Checkbox for the None option under the Order Takers button
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_NoneOrderTakers(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div/ul/li[2]/ul/label[2]/div/span/input"));
		return element;
	}

	/**
	 * Calendar button for the date select on the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_Calendar(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div/ul/li[3]/div/span[2]/button"));
		return element;
	}

	/**
	 * Today button on the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_Today(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[5]/div[3]/ul/li[1]"));
		return element;
	}

	/**
	 * Yesterday button on the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_Yesterday(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[5]/div[3]/ul/li[2]"));
		return element;
	}

	/**
	 * Last 7 Days button on the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_LastSevenDays(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[5]/div[3]/ul/li[3]"));
		return element;
	}

	/**
	 * Last 30 days button on the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_LastThirtyDays(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[5]/div[3]/ul/li[4]"));
		return element;
	}

	/**
	 * This Month button on the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_ThisMonth(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[5]/div[3]/ul/li[5]"));
		return element;
	}

	/**
	 * Last Month button on the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_LastMonth(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[5]/div[3]/ul/li[6]"));
		return element;
	}

	/**
	 * Custom Range button on the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_Custom(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[5]/div[3]/ul/li[7]"));
		return element;
	}

	/**
	 * From Calendar object for the Custom Range option on the Orders Placed
	 * menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_FromCalendar(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div"));
		return element;
	}

	/**
	 * To Calendar object for the Custom Range option for the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_ToCalendar(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div"));
		return element;
	}

	/**
	 * Apply button for the Order Takers section of the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_ApplyOrderTakers(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[5]/div[3]/div/button[1]"));
		return element;
	}

	/**
	 * Cancel button the Order Takers section of the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_Cancel(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[5]/div[3]/div/button[2]"));
		return element;
	}

	/**
	 * Sales radio button on the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_Sales(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div/ul/li[4]/label[1]/div/span"));
		return element;
	}

	/**
	 * Counts radio button on the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_Counts(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div/ul/li[4]/label[2]/div/span"));
		return element;
	}

	/**
	 * Apply button for the Orders Placed menu
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ordersPlaced_btn_Apply(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("/html/body/div[2]/div[2]/div[3]/div[2]/div/div[1]/div/div/ul/div/button"));
		return element;
	}

	/**
	 * Contact link at bottom of page
	 * 
	 * @param driver
	 * @return
	 */
	public static WebElement ContactLink(WebDriver driver) {
		element = driver.findElement(By.xpath("/html/body/div[3]/div[1]/a"));
		return element;
	}

	// NEED TO FIND A WAY TO VALIDATE TEXT ON THIS
	/**
	 * String used as verification we arrived at the Dashboard view after login
	 * 
	 * @param driver
	 * @return
	 */
	public static String txt_Dashboard(WebDriver driver) {
		element = driver.findElement(By
				.xpath("/html/body/div[2]/div[2]/div/div/h3"));
		String a = element.getText();
		return a;
	}
}
