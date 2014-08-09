package com.kiddicare.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.kiddicare.BaseClass;

public class Utils extends BaseClass{

public WebElement getElement(By by) {
		
		try {
			/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement locator=driver.findElement(by);*/
			WebDriverWait wait = new WebDriverWait(driver, 10/*timeout in seconds*/);
			WebElement locator = wait.until(ExpectedConditions.presenceOfElementLocated(by));
			return locator;
		} catch (ElementNotFoundException e) {
			return null;
		}
	}

/*ExpectedCondition<Boolean> jQueryActive_toBeZero = new ExpectedCondition<Boolean>()   {
    public Boolean apply(WebDriver driver) {
       try {
        return ((Long) jsExecutor
            .executeScript("return jQuery.active") == 0) ? true
                        : false;
     } catch (WebDriverException e) {
         log.debug("It looks like jQuery is not available on the page, skipping the jQuery wait, check stack trace for details");
         return true; //skip the wait
     }
       }
   };
ExpectedCondition<Boolean> document_readyState_toBeComplete = new ExpectedCondition<Boolean>() {
    public Boolean apply(WebDriver driver) {
      return jsExecutor.executeScript("return document.readyState")
         .toString().equals("complete") ? true : false;
     }
 };
wait.until(jQueryActive_toBeZero);
wait.until(document_readyState_toBeComplete);*/
	
   public void jfdlksjl(){
	   
   }
	
	

}
