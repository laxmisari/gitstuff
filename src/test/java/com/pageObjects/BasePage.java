package com.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public static WebDriver driver;
	
	@BeforeTest
	   public void setUpClass()
	  {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();  
		  }
	
	@AfterTest
	public void teardown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
}
