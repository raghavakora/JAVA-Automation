package com.kiddicare;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseAcceptance extends BaseClass {

	@BeforeClass
	public void before() {
		getDriver();

	}

	@BeforeMethod
	public void beforeMethod() {
		driver.get("http://www.kiddicare.com/");
		driver.manage().window().maximize();
		// Thread.sleep(2000);
		 initobjs();
	}

	@AfterMethod
	public void aftermethod() {
		driver.manage().deleteAllCookies();
	}

	@AfterClass
	public void after() {
		 driver.quit();
	}

}
