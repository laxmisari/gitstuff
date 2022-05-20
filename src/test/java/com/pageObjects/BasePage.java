package com.pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	public WebDriver driver;
	@BeforeTest
	public void LaunchBrowser() throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\mahes\\gitstuff\\src\\main\\resources\\propertiesFile");
	     prop.load(fis);
	     String browsername = prop.getProperty("browser");
	     
	     if(browsername.equals("chrome"))
	     {
	    	WebDriverManager.chromedriver().setup();
	    	 driver = new ChromeDriver();
          }
	     else if (browsername.equals("Firefox"))
	     {
	    	 //Firefox setup
	     }
	     else if (browsername.equals("IE")) 
	     {
	    	//IE setup 
	     }
	     else
	     {
	    	 System.out.println("Browser not found");
	     }
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@AfterTest
	public void teardDown()
	{
		driver.quit();
	}
}
