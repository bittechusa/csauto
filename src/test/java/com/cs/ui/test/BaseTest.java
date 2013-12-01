package com.cs.ui.test;

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
	

}
