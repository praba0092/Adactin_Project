package com.adactin.runner;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.property.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
					glue = "com\\adactin\\stepdefinition",
					monochrome = true )


public class Runner {
	
public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Throwable{
		String browser = FileReaderManager.getInstance().getInstanceCR().getBrowser();
		driver = BaseClass.getDriver(browser);
	}
		
	@AfterClass
	public static void tearDown() {
		driver.quit();

	}

}
