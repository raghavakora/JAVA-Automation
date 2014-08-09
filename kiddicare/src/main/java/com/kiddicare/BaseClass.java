package com.kiddicare;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.kiddicare.Pages.DeliveryPage;
import com.kiddicare.Pages.HomePage;
import com.kiddicare.Pages.LoginPage;


public class BaseClass {
	public WebDriver driver;
	
	public LoginPage loginpage;
	public HomePage homepage;
	public DeliveryPage deliverypage;
	
	public void getDriver()
		{
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//initobjs();
			
		}
	
	public void initobjs() 
		{
			loginpage=new PageFactory().initElements(driver, LoginPage.class);
			homepage=new PageFactory().initElements(driver, HomePage.class);
			deliverypage=new PageFactory().initElements(driver,DeliveryPage.class);
		}

}
