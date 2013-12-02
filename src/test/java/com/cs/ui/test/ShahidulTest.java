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
		billingInfoExistingCustomerWithSameAddress();
		clickRuturnBackButton();
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

	public void clickRuturnBackButton()
	{
		driver.findElement(By.xpath("//a[@class='action_button']")).click();
	}
	public void existingCustomer()
	{
		int ran;
		ran = 100 + (int)(Math.random() * ((10000 - 100) + 1));
		String email = "Signuptest" + ran + "@gmail.com";
		String pass = "Signing" + ran ;
		
		driver.findElement(By.name("login_email")).sendKeys(email);
		driver.findElement(By.name("login_password")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		
		
	}
	public void billingInfoExistingCustomerWithSameAddress()
	{
		driver.findElement(By.name("bill_firstname")).sendKeys("asad");
		driver.findElement(By.name("bill_lastname")).sendKeys("zaman");
		driver.findElement(By.name("bill_addressline1")).sendKeys("45 Main St");
		driver.findElement(By.name("bill_towncity")).sendKeys("Brooklyn");
		driver.findElement(By.name("bill_countystate")).sendKeys("ny");
		driver.findElement(By.name("bill_postzip")).sendKeys("11201");
		driver.findElement(By.name("bill_country")).click();
		driver.findElement(By.name("//span[@class='selectboxit-text']")).click();
		driver.findElement(By.name("ship_sameasbill")).click();
	}
	public void shippingAddressDifferentAsBillingAddress()
	{
		driver.findElement(By.name("ship_addressline1")).sendKeys("123 main street");
		driver.findElement(By.name("ship_towncity")).sendKeys("queens");
		driver.findElement(By.name("ship_countystate")).sendKeys("ny");
		driver.findElement(By.name("ship_postzip")).sendKeys("10567");
		driver.findElement(By.xpath("//span[@id='langSelectBoxItArrowContainer']")).click();
		driver.findElement(By.xpath("//ul[contains(@class,'selectboxit-list')]//li[id='222']")).click();
		
	}
	
	
	
	
	

}
