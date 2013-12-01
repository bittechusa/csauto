package com.cs.ui.test;

import org.testng.annotations.Test;

public class ShahidulTest extends BaseTest
{
	Common support = new Common();
	@Test
	public void demo1() throws Exception
	{
		support.beforeCart();
		support.clickUpsellContinue();
		
	}

}
