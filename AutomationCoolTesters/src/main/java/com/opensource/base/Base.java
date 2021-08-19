package com.opensource.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.opensource.Admin.AdminPage;

public class Base {
	/*
	 * Constructor
	 * 
	 * @author Oscar.Trujillo
	 * 
	 * @param
	 * 
	 * @return
	 * 
	 * @throws
	 */

	private WebDriver driver;

	public Base(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * Reporter
	 * 
	 * @author oscar.trujillo
	 */

	public void reporter(String log) {
		Reporter.log(log);

	}

	public WebDriver chromedriver() {
		System.setProperty(GlobalVariables.CHROME_DRIVER_KEY, GlobalVariables.CHROME_DRIVER_NAME);
		driver = new ChromeDriver();
		return driver;

	}

	/*
	 * Implicity wait
	 */

	public void implicitlywait(int seconds) {
		try {
			driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	public void implicitlywait() {
		try {
			driver.manage().timeouts().implicitlyWait(GlobalVariables.GENERAL_TIME_OUT, TimeUnit.SECONDS);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	/*
	 * Wait for element present
	 */

	public void waitforElementPresent(By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, GlobalVariables.GENERAL_TIME_OUT);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
	/*
	 * Wait for element present
	 */

	public void waitforElementPresent(By locator, int timeout) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, timeout);
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));

		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Launch Browser
	 */

	public void launchBrowser(String url) {
		reporter(GlobalVariables.LAUNCHING_MESSAGE + url);
		driver.get(url);
		driver.manage().window().maximize();
		implicitlywait();

	}

	/*
	 * Type
	 */
	public void type(By locator, String inputText) {
		try {
			driver.findElement(locator).sendKeys(inputText);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	/*
	 * click
	 */
	public void click(By locator) {
		try {
			driver.findElement(locator).click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}
	/*
	 * is displayed
	 */

	public boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}

	}
	/*
	 * Get text
	 */

	public String getText(By locator) {
		try {
			return driver.findElement(locator).getText();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return null;
		}
	}

	/*
	 * Assertion String
	 */
	public void assertEquals(String actualValue, String expectedValue) {
		try {
			Assert.assertEquals(actualValue, expectedValue);
		} catch (AssertionError e) {
			Assert.fail(e.getMessage() + " Actual Value" + actualValue + " Does not match with the expected value "
					+ expectedValue);

		}
	}

	/*
	 * Assertion string by locator
	 */
	public void assertionEqualsByLocator(By locator, String expectedValue) {
		String actualValue = driver.findElement(locator).getText();
		try {
			Assert.assertEquals(actualValue, expectedValue);
		} catch (AssertionError e) {
			Assert.fail(e.getMessage() + " Actual Value" + actualValue + " Does not match with the expected value "
					+ expectedValue);

		}
	}

	/*
	 * Soft Assertion
	 */
	public SoftAssert softassertEquals(String actualValue, String expectedValue) {
		try {
			SoftAssert soft = new SoftAssert();
			soft.assertEquals(actualValue, expectedValue);
			return soft;
		} catch (AssertionError e) {
			Assert.fail(e.getMessage() + " Actual Value" + actualValue + " Does not match with the expected value "
					+ expectedValue);
			return null;
		}
	}
	/*
	 * Get table value
	 */

	
	public String tablevalue() {
	reporter("select a random value from the table");
	int tr, td, max;
	WebElement table = driver.findElement(By.xpath("//table[@id='resultTable']"));
	List <WebElement> rows = table.findElements(By.tagName("tr"));
	System.out.println(rows.size());
	max = rows.size();
	tr = (int)(Math.random()*max+1);
	td = 2;
	String xpath = "//tbody/tr[" + tr + "]/td[" + td + "]";
	return driver.findElement(By.xpath(xpath)).getText();
	}
	
	/*
	 * Select User Name
	 */
	
	public String creatingValidUserName() {
		String newUserName = "OskiTrujillo";
		String nrf = "No Records Found";
		boolean exist = true;
		int i = 0;
		do {
			    	    
		type(By.xpath("//input[@id='searchSystemUser_userName']"), newUserName);
		click(By.xpath("//input[@id='searchBtn']"));
		implicitlywait();
		String notexist_message = driver.findElement(By.xpath("//tbody/tr[1]/td[1]")).getText();
		if(notexist_message.equals(nrf)) {
			exist =false;}
		else {
			i++;
			newUserName = "OskiTrujillo"+i;
			driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).clear();
		}	
		}
		while(exist == true);
		return newUserName;
	}
	
	
		
	

	/*
	 * Close Browser
	 */

	public void closeBrowser() {

		driver.close();
	}

}