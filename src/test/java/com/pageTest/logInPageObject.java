package com.pageTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.pageObjects.BasePage;

public class logInPageObject   {
	public WebDriver driver;
	
	By username = By.id("user-name");
	By password = By.xpath("//input[@placeholder=\"Password\"]");
	By button = By.id("login-button");
	
	
	public logInPageObject(WebDriver driver) {
		this.driver =driver;
	}

	public WebElement uname(String name)
	{
		return driver.findElement(username);
	}
	
	public WebElement pword(String pname)
	{
		return driver.findElement(password);
	}
	public WebElement bttn()
	{
		return driver.findElement(button);
	}
	
     
		
//	@Test
//	public void LogInCredentials() throws InterruptedException
//	{
//	  
//		
//		driver.get("https://www.saucedemo.com/");
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		Thread.sleep(3000);
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("secret_sauce");
//		driver.findElement(By.name("login-button")).click();
	}


