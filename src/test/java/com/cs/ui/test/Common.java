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
			driver.findElement(By.name("codesubmit")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Code Unlock button not found");
		}	
		
	}// end of accesscode method
	
	public void selectQuantity()
	
	{
		try 
		{
			driver.findElement(By.xpath("//span[contains(@class,'quantity')]//span[contains(@class,'selectboxit-arrow-container')]")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Quantity button not found");
		}	
		
		try 
		{
			driver.findElement(By.xpath("//form[@id='ticket_request']//li[@id='"+2+"']/a")).click();		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Quantity not found");
		}	

	}//end of selectQuantity method
	
	public void findTickets()
	{
		try 
		{
			driver.findElement(By.xpath("//input[@id='find_tickets']")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Find Tickets button not found");
		}	

	}//end of findTickets method
	
	public void clickContinue() throws Exception
	{
		Thread.sleep(3000);
		try 
		{
			driver.findElement(By.xpath("//div[contains(@class,'action_button ajax_continue') and text()='Continue']")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Continue button not found");
		}	
		
	}
	
	public void clickUpsellContinue() throws Exception
	{
		Thread.sleep(3000);
		try 
		{
			driver.findElement(By.name("upsell_submit")).click();
		}
		
		catch (Exception NoSuchElementException)
		{
			System.out.println("Upsell Continue button not found");
		}	
		
	}
	
	public void beforeCart() throws Exception
	{
		clickBuyTicket();
		accessCodeHandle();
		selectQuantity();
		findTickets();
		clickContinue();
		clickUpsellContinue();
	}
	
	public void verifyElementPresent(By by, String eleName) throws Exception
	{
		Thread.sleep(3000);
		if(driver.findElements(by).size() != 0){
			System.out.println(eleName + "elemnet present");
			}
		else{
			System.out.println(eleName + "element not found");
			}
	}
	
		
	
}
	


