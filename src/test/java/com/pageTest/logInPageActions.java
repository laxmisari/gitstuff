package com.pageTest;

import org.testng.annotations.Test;

import com.pageObjects.BasePage;

public class logInPageActions extends BasePage {
	
	@Test	
public void logInPageCredentials() throws InterruptedException
{
	  
	  
	  driver.get("https://www.saucedemo.com/");
	  logInPageObject lip = new logInPageObject(driver);
	  
	  lip.uname("standard_user");
	  Thread.sleep(2000);
	  lip.pword("secret_sauce");
	  
	  lip.bttn().click();
}
}


//  @Test(priority = 1)
//  
//  public void selectItems() throws InterruptedException
//  {
//	  logInPage lip = new logInPage();
//	  lip.LogInCredentials();
//	 
//	 //driver.findElement(By.className("Sauce Labs Backpack")).click();
//	 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
//	 Thread.sleep(2000);
//	 driver.findElement(By.className("shopping_cart_link")).click();
//	 Thread.sleep(2000);
//	 
//		 
//  }
//  @Test(priority = 2)
//  public void GotoCart()
//  {
//	  
//		
//		 driver.findElement(By.id("continue-shopping")).click();  
//  }
//  
//  @Test(priority = 4)
//  public void BackToProductPage() throws InterruptedException
//  {
//	
//	  WebElement sort =  driver.findElement(By.xpath("//select [@data-test=\"product_sort_container\"]"));
//	  
//	  sort.click();
//	  Select selctTxt = new Select(sort);
//	  selctTxt.selectByIndex(3);
//	 
//	  Thread.sleep(3000);
//	  
//	  //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	  
//	  
//		  
//  }


