package com.opensource.admin.qa;

import org.testng.annotations.Test;

import com.opensource.Admin.AdminPage;
import com.opensource.base.Base;
import com.opensource.base.GlobalVariables;
import com.opensource.main.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class TC004_Admin_DeleteUser {
	WebDriver driver;
	Base base;
	LoginPage login;
	AdminPage admin;
	String username, password, employeeName, newUserName, newFolderPath;

	@Test
	public void TC004_Admin_DeleteUser_Script() {
		// Precondition

		base.launchBrowser(GlobalVariables.QA_URL, newFolderPath);
		login.LoginOrange(username, password);
		admin.validatelogged();
		admin.clickAdmin();
		newUserName = admin.userNameCreator();
		admin.clickAdd();
		admin.typeEmplyeeName(employeeName);
		admin.typeValidUserName(newUserName);
		admin.selectAndConfirmPassword(password);
		admin.clickSave();
		admin.searchUser(newUserName);
		login.logout();
		

		
		

		// Step 2
		login.LoginOrange(username, password, newFolderPath);

		// Step 3
		admin.validatelogged(newFolderPath);

		// Step 4
		admin.clickAdmin(newFolderPath);

		// Step 5 and 6
		admin.searchUser(newUserName, newFolderPath);

		// Step 7
		admin.validateUsernameTable(newUserName, newFolderPath);
		
		// Step 8
		admin.selectUser(newFolderPath);
		
		// Step 9
		admin.clickDelete(newFolderPath);
		
		//Step 10
		admin.validateDeleteRecordsPopWindow(newFolderPath);
		
		//Step 11
		admin.clickOkDelete(newFolderPath);
		
		//Step 12
		admin.searchUser(newUserName, newFolderPath);		
		admin.validateRecordNoFound(newFolderPath);
		
		//Step 13
		login.logout(newFolderPath);
				
		//Step 14
		login.closeBrowser();
		
		

	}

	@BeforeTest
	public void beforeTest() {
		// setup data
		base = new Base(driver);
		driver = base.chromedriver();
		login = new LoginPage(driver);
		admin = new AdminPage(driver);

		// Test data
		this.username = base.getJSONValue("username");
		this.password = base.getJSONValue("password");
		this.employeeName = "Cecil Bonaparte";

		// Generate evidence folder
		this.newFolderPath = base.generaFolders(this.getClass().getSimpleName());
	}

	@AfterTest
	public void afterTest() {
	}

}
