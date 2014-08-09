package com.kiddicare.Pages;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bsh.util.Util;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.kiddicare.utils.Utils;

public class DeliveryPage {
	
	@FindBy(id="right_checkout")
	private WebElement CHOOSE_PAYMENT_OPTION;
	@FindBy(id="btnchooseadd")
	private WebElement CHOOSE_ADDRESS;
	
	private static final By CHECKOUT=By.id("right_checkout");
	private static final By CHOOSE_ADD = By.id("btnchooseadd");
	
	
	public void addDetails() throws InterruptedException
	{
		CHOOSE_ADDRESS.click();
		CHOOSE_PAYMENT_OPTION.click();
	}
	
	
	
	
	

}
