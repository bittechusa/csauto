package com.cs.ui.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShTest extends BaseTest
{
	Common support = new Common();
	
	@Test
	public void buyTicketExistingCustomers()
	{
		support.clickBuyTicket();
		support.accessCodeHandle();
		
		driver.findElementByClassName("login_title").isDisplayed();
		
		
		driver.findElementByClassName("required email").sendKeys("");
	}
		

	

}
