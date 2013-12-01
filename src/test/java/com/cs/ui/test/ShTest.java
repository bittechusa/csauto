package com.cs.ui.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class ShTest extends BaseTest
{
	Common support = new Common();
	
	@Test
	public void buyTicketExistingCustomersPositive() throws Exception
	{
		support.beforeCart();
		support.clickUpsellContinue();
		
		driver.findElementByClassName("login_title").isDisplayed();
		
		//Positive Test	
		driver.findElement(By.name("login_email")).sendKeys("personalchithi@gmail.com");
		driver.findElement(By.name("login_password")).sendKeys("Myfamily01");
		driver.findElement(By.xpath("//input[contains(@class,'action_button') and contains(@value,'Sign')]")).click();
		
	}
	
	@Test
	public void buyTicketExistingCustomersNegative() throws Exception
	{
		support.beforeCart();
		support.clickUpsellContinue();
		
		driver.findElement(By.name("login_email")).sendKeys("invalid@gmail.com"); //Type in incorrect email
		driver.findElement(By.name("login_password")).sendKeys("InvalisdPass"); //Type in correct password
		driver.findElement(By.xpath("//input[contains(@class,'action_button') and contains(@value,'Sign')]")).click();
		/*		
		//Negative Test 2
		driver.findElement(By.name("login_email")).sendKeys(""); //Type in correct email
		driver.findElement(By.name("login_password")).sendKeys(""); //Type in incorrect password
		driver.findElement(By.xpath("//input[contains(@class,'action_button') and contains(@value,'Sign')]")).click();
		
		//Negative Test 3
		driver.findElement(By.name("login_email")).sendKeys(""); //Type in incorrect email
		driver.findElement(By.name("login_password")).sendKeys(""); //Type in incorrect password
		driver.findElement(By.xpath("//input[contains(@class,'action_button') and contains(@value,'Sign')]")).click();
		*/
	}
		
	@Test
	public void forgetPassword()
	{
		driver.findElement(By.xpath("//input[contains(@class,'login_reset')]")).click();		
	}

	@Test
	public void passwordReminder()
	{
	driver.findElement(By.xpath("//input[contains(@class,'required email') and contains(@name,'email')]")).sendKeys("");//Type email address
	
	}

}
