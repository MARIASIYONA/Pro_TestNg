package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;//class variable declaration
	
	
	@BeforeClass
	public void setup() {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();//to create object
	}
	@AfterClass
	public void teardown() {
		//driver.quit();//to close the all browser
}
}