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
	String username, password, employeeName, newUserName, newFolderPath;
  @Test
  public void TC003_Admin_AddNewUser_POM_script() {
	// Step 1
		base.launchBrowser(GlobalVariables.QA_URL, newFolderPath);

		// Step 2
		login.LoginOrange(username, password, newFolderPath);

		// Step 3
		admin.validatelogged(newFolderPath);

		// Step 4
		admin.clickAdmin(newFolderPath);
		newUserName= admin.userNameCreator();
		
		//Step 5 
		admin.clickAdd(newFolderPath);
		
		//Step 6
		admin.typeEmplyeeName(employeeName, newFolderPath);
		
		//Step 7
		admin.typeValidUserName(newUserName, newFolderPath);
		
		//Step 8
		admin.selectAndConfirmPassword(password, newFolderPath);
		
		//Step 9
		admin.clickSave(newFolderPath);
		
		//Step 10 and 11
		admin.searchUser(newUserName, newFolderPath);
		
		//Step 12
		admin.validateUsernameTable(newUserName, newFolderPath);
		
		//Step 13
		login.logout(newFolderPath);
		
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
	  this.username = base.getJSONValue( "username");
	  this.password = base.getJSONValue( "password");
	  this.employeeName = "Alice Duval";
	  
	//Generate evidence folder
		this.newFolderPath = base.generaFolders(this.getClass().getSimpleName());
  }

  @AfterTest
  public void afterTest() {
  }

}
