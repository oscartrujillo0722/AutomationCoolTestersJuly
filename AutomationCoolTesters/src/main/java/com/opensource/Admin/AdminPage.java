package com.opensource.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.opensource.base.Base;

public class AdminPage  extends Base{

	public AdminPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	//Objects
	By imgHeaderOrange = By.xpath("//img[@alt='OrangeHRM']");
	By lnkAdmin = By.xpath("//*[@id='menu_admin_viewAdminModule']");
	By txtSearchUserName = By.xpath("//input[@id='searchSystemUser_userName']");
	By btnSearch = By.xpath("//input[@id='searchBtn']");
	By tblUsername = By.xpath("//tbody/tr[1]/td[2]");
	By txtNoRecordsFound = By.xpath("//tbody/tr[1]/td[1]");
	By btnAdd = By.xpath("//input[@name='btnAdd']");
	By txtEmployeeName = By.xpath("//input[@id='systemUser_employeeName_empName']");
	By txtUserName = By.xpath("//input[@id='systemUser_userName']");
	By txtAddPassword = By.xpath("//input[@name='systemUser[password]']");
	By txtConfirmPassword = By.xpath("//input[@name='systemUser[confirmPassword]']");
	By btnSave = By.xpath("//input[@name='btnSave']");
	
	
	public void validatelogged() {
	reporter("Validate Logged Successfully");
	waitforElementPresent(imgHeaderOrange);
	}
	public void clickAdmin() {
		reporter("Click Admin Module");
		click(lnkAdmin);
		implicitlywait();
	}
	public void searchUser(String username) {
		reporter("Searching..."+username);
		type(txtSearchUserName, username);
		click(btnSearch);
		implicitlywait();
		
	}
	public void validateUsernameTable(String username) {
		reporter("Verify this value: "+username+" in admin user table");
		SoftAssert validTable = softassertEquals(getText(tblUsername),username);
		validTable.assertAll();
		//assertEquals(getText(tblUsername),username);
	}
	public void validateRecordNoFound() {
		reporter("Validating the record was not found");
		assertionEqualsByLocator(txtNoRecordsFound, "No Records Found");
	}
	public void clickAdd(){
		reporter("click Add button");
		click(btnAdd);
		
		
	}
	public void typeEmplyeeName(String employeeName) {
		reporter("Input a valid employee name");
		type(txtEmployeeName, employeeName);
	}
	
	public String selectValidUserName() {
		reporter("selecting a valid user name");
		String newUserName = creatingValidUserName();
		return newUserName;
				
	}
	public void typeValidUserName(String newUserName) {
		reporter ("entering the new User Name");
		type(txtUserName,newUserName);
	}
	public void selectAndConfirmPassword(String password) {
		reporter("Select, type and confirm password");
		type(txtAddPassword,password);
		type(txtConfirmPassword,password);
	}
	public void clickSave() {
		reporter("Click on save button");
		click(btnSave);
	}public void getTableValue(){
		reporter("get a random table value");
		String tableValueGotten = tablevalue();
		System.out.println(tableValueGotten);
	}
			
		
	}
		
		



