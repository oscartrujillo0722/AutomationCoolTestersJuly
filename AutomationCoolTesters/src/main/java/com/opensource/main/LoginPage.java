package com.opensource.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.opensource.base.Base;

public class LoginPage extends Base {

	public LoginPage(WebDriver driver) {
		super(driver);}
		// TODO Auto-generated constructor stub
		
		//Objects
		By txtUsername = By.xpath("//input[@id='txtUsername']");
		By txtPassword = By.xpath("//input[@id='txtPassword']");
		By btnLogin = By.xpath("//input[@id='btnLogin']");
		By lnkWelcome = By.xpath("//a[@id='welcome']");
		By lnkLogout = By.xpath("//a[contains(text(),'Logout')]");
		
		/*Login OrangeHRM
		 * @author oscar.trujillo
		 * @date 08142021
		 */
		public void LoginOrange(String username, String password) {
			reporter("Enter Username and Password");
			type(txtUsername,username);
			type(txtPassword,password);
			click(btnLogin);
			implicitlywait(15);
			
		}
		/*
		 * Logout
		 */
		public void logout() {
			reporter("Logout Orange HLM portal...");
			click(lnkWelcome);
			waitforElementPresent(lnkLogout);
			click(lnkLogout);
			
		}
			
		
		}
	
	
	


