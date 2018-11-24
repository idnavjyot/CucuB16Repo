package com.allfilesinsamefolder;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;


public class MyFirstStepDef {

	
	@Given("open facebook page")
	public void openfacebookpage() {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium New Anil\\chromedriver_win32_B39\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");

	}
	
}
