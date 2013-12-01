package com.cs.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest 
{
	static FirefoxDriver driver = new FirefoxDriver();
	
	@BeforeTest
	public void start()
	{
		driver.get("http://www.crowdsurge.com/store/index.php?storeid=1217");
		
	}
	
	@AfterTest
	public void end() throws Throwable
	{
		Thread.sleep(3000);
		driver.close();
	}

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
	

}
