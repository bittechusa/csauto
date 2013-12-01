package com.cs.ui.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PurchaseTicketsTest extends BaseTest
{
	@Test
	public void buyTickets()
	{
		driver.findElement(By.xpath("//a[@href='?storeid=1217&menu=detail&eventid=32432']")).click();
		
	}
	

}
