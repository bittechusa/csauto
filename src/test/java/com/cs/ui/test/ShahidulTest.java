package com.cs.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ShahidulTest extends BaseTest
{
	Common support = new Common();
	@Test
	public void removeAll() throws Exception
	{
		support.beforeCart();
		clickRemoveAllLink();
		support.verifyElementPresent(By.xpath("//div[contains(@class,'success_wrap checkout_top_successmsg')]"), "Element Empty message");
		
	}
	
	public void clickRemoveAllLink() throws InterruptedException
	{
		Thread.sleep(3000);
		try 
		{
			driver.findElement(By.xpath("//a[contains(@href,'checkout')]/span[text()='x']/..")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Remove All link not found");
		}	
	}
	
	
	
	
	
	

}
