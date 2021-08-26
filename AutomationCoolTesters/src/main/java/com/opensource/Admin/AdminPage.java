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
	By cbSelectUser = By.xpath("//input[@name = 'chkSelectRow[]']");
	By btnDelete = By.xpath("//input[@name = 'btnDelete']");
	By lblPopWindowDeleteRecords = By.xpath("//div[@id = 'deleteConfModal']");
	By btnOkDelete = By.xpath("//input[@id='dialogDeleteBtn']");
	
	public void validatelogged(String newFolderPath) {
	reporter("Validate Logged Successfully");
	waitforElementPresent(imgHeaderOrange);
	takeScreenshot("Validate_Login", newFolderPath);
	}
	public void validatelogged() {
		reporter("Validate Logged Successfully");
		waitforElementPresent(imgHeaderOrange);
		
	}
	public void clickAdmin(String newFolderPath) {
		reporter("Click Admin Module");
		click(lnkAdmin);
		implicitlywait();
		takeScreenshot("Click_Admin", newFolderPath);
	}
	public void clickAdmin() {
		reporter("Click Admin Module");
		click(lnkAdmin);
		implicitlywait();
		
	}
	public void searchUser(String username, String newFolderPath) {
		reporter("Searching..."+username);
		type(txtSearchUserName, username);
		click(btnSearch);
		implicitlywait();
		takeScreenshot("Search_User", newFolderPath);
		
	}
	public void searchUser(String username) {
		reporter("Searching..."+username);
		type(txtSearchUserName, username);
		click(btnSearch);
		implicitlywait();
		
	}
	public void validateUsernameTable(String username, String newFolderPath) {
		reporter("Verify this value: "+username+" in admin user table");
		SoftAssert validTable = softassertEquals(getText(tblUsername),username);
		validTable.assertAll();
		//assertEquals(getText(tblUsername),username);
		takeScreenshot("Validate_User", newFolderPath);
	}
	public void validateRecordNoFound(String newFolderPath) {
		reporter("Validating the record was not found");
		assertionEqualsByLocator(txtNoRecordsFound, "No Records Found");
		takeScreenshot("Record not found",newFolderPath);
	}
	public void clickAdd(String newFolderPath){
		reporter("click Add button");
		click(btnAdd);
		takeScreenshot("Click Add",newFolderPath);
		
		
	}
	public void clickAdd(){
		reporter("click Add button");
		click(btnAdd);
		
		
		
	}
	public void typeEmplyeeName(String employeeName, String newFolderPath) {
		reporter("Input a valid employee name");
		type(txtEmployeeName, employeeName);
		takeScreenshot("Type_Employee", newFolderPath);
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
	public void typeValidUserName(String newUserName, String newFolderPath) {
		reporter ("entering the new User Name");
		type(txtUserName,newUserName);
		takeScreenshot("Type_UserName", newFolderPath);
		
	}
	public void typeValidUserName(String newUserName) {
		reporter ("entering the new User Name");
		type(txtUserName,newUserName);
		
		
	}
	public void selectAndConfirmPassword(String password, String newFolderPath) {
		reporter("Select, type and confirm password");
		type(txtAddPassword,password);
		type(txtConfirmPassword,password);
		takeScreenshot("Type_And_Confirm_Password", newFolderPath);
		
	}
	public void selectAndConfirmPassword(String password) {
		reporter("Select, type and confirm password");
		type(txtAddPassword,password);
		type(txtConfirmPassword,password);
		
	}
	public void clickSave(String newFolderPath) {
		reporter("Click on save button");
		click(btnSave);
		takeScreenshot("Click Save", newFolderPath);
		
	}
	public void clickSave() {
		reporter("Click on save button");
		click(btnSave);
		
	}
	public void getTableValue(){
		reporter("get a random table value");
		String tableValueGotten = tablevalue();
		System.out.println(tableValueGotten);
	}
	public String userNameCreator(){
		reporter("Create a valid User Name");
		String newUserName = creatingValidUserName();
		return newUserName;
		
	}
	public void selectUser(String newFolderPath) {
		reporter("Select User");
		click(cbSelectUser);
		takeScreenshot("Select_User", newFolderPath);
		
	}
	public void clickDelete(String newFolderPath) {
		reporter("Click Delete");
		click(btnDelete);
		takeScreenshot("click_Delete", newFolderPath);
	}
	public void validateDeleteRecordsPopWindow (String newFolderPath) {
		reporter("validate pop window delete records? ");
		isDisplayed(lblPopWindowDeleteRecords);
		takeScreenshot("pop_window_Delete_records?", newFolderPath);
		
	}
	public void clickOkDelete(String newFolderPath) {
		reporter("click ok Delete Records");
		click(btnOkDelete);
		takeScreenshot("click_ok_Delete_records", newFolderPath);
	}
				
		
	}
		
		



