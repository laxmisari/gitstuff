package com.pageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.pageObjects.BasePage;

public class ProductPage extends BasePage {
	//blic WebDriver driver;
  @Test(priority = 1)
  
  public void selectItems() throws InterruptedException
  {
	  logInPage lip = new logInPage();
	  lip.LogInCredentials();
	 
	 //driver.findElement(By.className("Sauce Labs Backpack")).click();
	 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.className("shopping_cart_link")).click();
	 Thread.sleep(2000);
	 
		 
  }
  @Test(priority = 2)
  public void GotoCart()
  {
	  
		
		 driver.findElement(By.id("continue-shopping")).click();  
  }
  
  @Test(priority = 4)
  public void BackToProductPage() throws InterruptedException
  {
	
	  WebElement sort =  driver.findElement(By.xpath("//select [@data-test=\"product_sort_container\"]"));
	  
	  sort.click();
	  Select selctTxt = new Select(sort);
	  selctTxt.selectByIndex(3);
	 
	  Thread.sleep(3000);
	  
	  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  
		  
  }
}

