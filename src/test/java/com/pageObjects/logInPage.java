package com.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class logInPage extends BasePage {
  @Test
  
	
	public void LogInCredentials() throws InterruptedException
	{
	   		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
	}
}

