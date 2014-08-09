package com.kiddicare.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class LoginPage {

	//private WebDriver driver;
	
	@FindBy(className="login")
	private WebElement LOGIN;
	
	@FindBy(id="email")
	private WebElement EMAIL;
	
	@FindBy(id="password")
	private WebElement PWD;
	
	@FindBy(id="loginbtn")
	private WebElement LOGINBTN;
	
	@FindBy(xpath="//*[@id='header']/div[1]/div[1]/div[4]")
	private WebElement TITLE;
	
	
	public void enterLoginDetails(String email,String pwd)
	{
		LOGIN.click();
		EMAIL.sendKeys(email);
		PWD.sendKeys(pwd);
		LOGINBTN.click();
		
	}
	public boolean verifyTitle(String userName)
		{
			return TITLE.getText().contains(userName);
		}
	
	/*public void signIn(String email,String pwd)
	{
		EMAIL.sendKeys(email);
		PWD.sendKeys(pwd);
		LOGINBTN.click();
		
	}*/
}
