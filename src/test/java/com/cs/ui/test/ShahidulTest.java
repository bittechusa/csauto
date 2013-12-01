package com.cs.ui.test;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ShahidulTest extends BaseTest
{
	Common support = new Common();
	@Test
	public void demo1()
	{
		support.clickBuyTicket();
		support.accessCodeHandle();
		support.selectQuantity();
		
	}

}
