package com.opensource.admin.qa;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.opensource.Admin.AdminPage;
import com.opensource.base.Base;
import com.opensource.base.GlobalVariables;
import com.opensource.main.LoginPage;

public class TC001_Admin_SearchEmployee_POM {
	WebDriver driver;
	Base base;
	LoginPage login;
	AdminPage admin;
	String username, password;

	@Test
	public void TC001_Admin_SearchEmployee_POM_Script() {

		// Step 1
		base.launchBrowser(GlobalVariables.QA_URL);

		// Step 2
		login.LoginOrange(username, password);

		// Step 3
		admin.validatelogged();

		// Step 4
		admin.clickAdmin();

		// Step 5
		admin.searchUser(username);

		// Step 6
		admin.validateUsernameTable(username);
		
		// Step 7
		login.logout();
		
		// Step 8
		login.closeBrowser();

	}

	@BeforeTest
	public void beforeTest() {
		// Setup data
		base = new Base(driver);
		driver = base.chromedriver();
		login = new LoginPage(driver);
		admin = new AdminPage(driver);

		// Test Data

		this.username = "Admin";
		this.password = "admin123";
	}

	@AfterTest
	public void afterTest() {
	}

}
