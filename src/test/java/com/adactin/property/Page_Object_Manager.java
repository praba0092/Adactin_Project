package com.adactin.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.pom.Login_Page;

public class Page_Object_Manager {
	
	public static WebDriver driver;
	
	private Login_Page login;
	
	public Page_Object_Manager(WebDriver LDriver) {
		this.driver = LDriver;
		PageFactory.initElements(LDriver, this);
		
	}

	public Login_Page getInstanceLogin() {
		login = new Login_Page(driver);
		return login;

	}
}
