package com.pageObjects;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ProductPage extends BasePage {
  @Test
  
  public void selectItems() throws InterruptedException
  {
	  logInPage lip = new logInPage();
	  lip.LogInCredentials();
	 
	 //driver.findElement(By.className("Sauce Labs Backpack")).click();
	 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	 Thread.sleep(2000);
	
  }
}

