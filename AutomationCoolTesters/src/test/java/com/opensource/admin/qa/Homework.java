package com.opensource.admin.qa;

import org.testng.annotations.Test;

import com.opensource.Admin.AdminPage;
import com.opensource.base.Base;
import com.opensource.base.GlobalVariables;
import com.opensource.main.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Homework {
	WebDriver driver;
	Base base;
	LoginPage login;
	AdminPage admin;
	String username, password, tableValue, newFolderPath;

	@Test
	public void homework_table_value() {
		// Step 1
		base.launchBrowser(GlobalVariables.QA_URL, newFolderPath);

		// Step 2
		login.LoginOrange(username, password, newFolderPath);

		// Step 3
		admin.validatelogged(newFolderPath);

		// Step 4
		admin.clickAdmin(newFolderPath);

		// Step 5
		admin.getTableValue();

		// Step 6
		login.logout(newFolderPath);

		// Step 7
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

		// Generate evidence folder
		this.newFolderPath = base.generaFolders(this.getClass().getSimpleName());

	}

	@AfterTest
	public void afterTest() {
	}

}
