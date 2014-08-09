package com.kiddicare;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RunTest extends BaseAcceptance {

	private static final String USERNAME = "smily";
	private static final String PASSWORD = "Abc12345";
	private static final String EMAIL = "smily2428@yahoo.co.in";

	@Test
	
	public void loginToMain() throws InterruptedException 
	{
		loginpage.enterLoginDetails(EMAIL,PASSWORD);
		Assert.assertTrue(loginpage.verifyTitle(USERNAME));
		homepage.goToHomePage();
		homepage.selectItem();
		Assert.assertTrue(driver.getCurrentUrl().contains("https://"));
		deliverypage.addDetails();
	}

	
}
