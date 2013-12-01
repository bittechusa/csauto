package com.cs.ui.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShTest extends BaseTest
{
	@Test
	public void accessCode()
	{
		
		try 
		{
			driver.findElement(By.className("codeinput")).sendKeys("test");
		}
		
		catch (Exception NoException)
		{
			System.out.println("Test Code is incorrect");
		}
		
		driver.findElement(By.className("codesubmit")).click();
	}

}
