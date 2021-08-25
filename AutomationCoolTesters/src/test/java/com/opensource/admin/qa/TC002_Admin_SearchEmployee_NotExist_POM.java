package com.opensource.admin.qa;

import org.testng.annotations.Test;

import com.opensource.Admin.AdminPage;
import com.opensource.base.Base;
import com.opensource.base.GlobalVariables;
import com.opensource.main.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC002_Admin_SearchEmployee_NotExist_POM {
	WebDriver driver;
	Base base;
	LoginPage login;
	AdminPage admin;
	String username, password, usertosearch, newFolderPath;

	@Test
	public void TC002_Admin_SearchEmployee_NotExist_Script() {
		       // Step 1
				base.launchBrowser(GlobalVariables.QA_URL, newFolderPath);

				// Step 2
				login.LoginOrange(username, password, newFolderPath);

				// Step 3
				admin.validatelogged(newFolderPath);

				// Step 4
				admin.clickAdmin(newFolderPath);
				
				//Step 5 and 6
				admin.searchUser(usertosearch, newFolderPath);
				
				//Step 7 
				admin.validateRecordNoFound(newFolderPath);
				
				//Step 8
				login.logout(newFolderPath);
				
				// Step 9
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

				this.username = base.getJSONValue( "username");
				this.password = base.getJSONValue( "password");
				this.usertosearch = "XYZ";
				
				//Generate evidence folder
				this.newFolderPath = base.generaFolders(this.getClass().getSimpleName());
	}

	@AfterTest
	public void afterTest() {
	}

}
