package com.opensource.admin.qa;

import org.testng.annotations.Test;

import com.opensource.Admin.AdminPage;
import com.opensource.base.Base;
import com.opensource.base.GlobalVariables;
import com.opensource.main.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;


public class  TC003_Admin_AddNewUser_POM {
	WebDriver driver;
	Base base;
	LoginPage login;
	AdminPage admin;
	String username, password, employeeName, newUserName;
  @Test
  public void TC003_Admin_AddNewUser_POM_script() {
	// Step 1
		base.launchBrowser(GlobalVariables.QA_URL);

		// Step 2
		login.LoginOrange(username, password);

		// Step 3
		admin.validatelogged();

		// Step 4
		admin.clickAdmin();
		newUserName= admin.userNameCreator();
		
		//Step 5 
		admin.clickAdd();
		
		//Step 6
		admin.typeEmplyeeName(employeeName);
		
		//Step 7
		admin.typeValidUserName(newUserName);
		
		//Step 8
		admin.selectAndConfirmPassword(password);
		
		//Step 9
		admin.clickSave();
		
		//Step 10 and 11
		admin.searchUser(newUserName);
		
		//Step 12
		admin.validateUsernameTable(newUserName);
		
		//Step 13
		login.logout();
		
		//Step 14
		login.closeBrowser();
		
		

  }
  @BeforeTest
  public void beforeTest() {
	  //setup data
	  base = new Base(driver);
	  driver = base.chromedriver();
	  login = new LoginPage(driver);
	  admin = new AdminPage(driver);
	  
	  //Test data
	  this.username= "Admin";
	  this.password = "admin123";
	  this.employeeName = "Alice Duval";
  }

  @AfterTest
  public void afterTest() {
  }

}
