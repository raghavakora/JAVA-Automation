package com.kiddicare.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
//private WebDriver driver;
	
	@FindBy(linkText="Joie Nitro Stroller - Liquorice")
	private WebElement ITEMNAME;
	@FindBy(css="img[alt=\"Add to shopping cart\"]")
	private WebElement ADD_BASKET;
	@FindBy(linkText="View your basket")
	private WebElement VIEW_BASKET;
	@FindBy(xpath="//*[@id='basketCheckout']/img")
	private WebElement CHECKOUT;
	@FindBy(xpath="//*[@id='header']/div[2]/div/a/img")
	private WebElement HOMEPAGE;
	
	
	public void selectItem()
	{
		ITEMNAME.click();
		ADD_BASKET.click();
		VIEW_BASKET.click();
		CHECKOUT.click();
	}
	public void goToHomePage()
	{
		HOMEPAGE.click();
	}
}
