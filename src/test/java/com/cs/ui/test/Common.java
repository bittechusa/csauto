package com.cs.ui.test;

import org.openqa.selenium.By;

public class Common extends BaseTest
{
	public void clickBuyTicket()
	{
		try
		{
			driver.findElement(By.xpath("//a[@class='action_button']//div[contains(text(),'Buy')]")).click();
		}
		catch(Exception NoSuchElementException)
		{
			System.out.println("Buy Ticket Button not found");
			
		}
	}
	
	public void accessCodeHandle()
	{
		
		try 
		{
			driver.findElement(By.className("codeinput")).sendKeys("test");
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Access Code Text Box Not Found");
		}
		
		try 
		{
			driver.findElement(By.className("codesubmit")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Code Submit button not found");
		}
		
		
	}
		
	
}
	


