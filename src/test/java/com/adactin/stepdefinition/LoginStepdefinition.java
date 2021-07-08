package com.adactin.stepdefinition;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.Login_Page;
import com.adactin.property.FileReaderManager;
import com.adactin.property.Page_Object_Manager;
import com.adactin.runner.Runner;

import cucumber.api.java.en.*;

public class LoginStepdefinition extends BaseClass {
	
	public static WebDriver driver = Runner.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	@Given("^User launch the adactin application$")
	public void user_launch_the_adactin_application() throws Throwable {
		String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
		getUrl(url);
	
	   
	}

	@When("^User enter valid username and password$")
	public void user_enter_valid_username_and_password() throws Throwable {
		inputValueElement(pom.getInstanceLogin().getUsername(), "haran");
		inputValueElement(pom.getInstanceLogin().getPassword(), "456987");
	   
	}

	@Then("^User click login button to validate$")
	public void user_click_login_button_to_validate() throws Throwable {
	    clickOnElement(pom.getInstanceLogin().getLogin());
	}

}
