package com.AAA.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AAA.base.TestBase;

public class TestUtil extends TestBase{

	public static void Thread(int x)
{
try {
	System.out.println("delaying by "+x);
	Thread.sleep(x);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
}

public static void Implicitwaiting(int x)
{
	System.out.println("implicit wait initiated by "+ x);
driver.manage().timeouts().implicitlyWait(x, TimeUnit.SECONDS);
}


public  WebDriver Explicitwait(int x,String locator)
{
	
System.out.println("Explicit wait initiated by " +x+ " for locator "+locator);
WebDriverWait wait=new WebDriverWait(driver,x);
wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
return driver;

}


public static void Isdisplayed(WebDriver driver,String locator)
{
	
if(driver.findElement(By.id("locator")).isDisplayed())
{
System.out.println(locator +" is present");	
}

}



}
