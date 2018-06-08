package com.AAA.Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.AAA.Utilities.TestUtil;

/*1. Open HRMS Application
2. Verify HRMS title
3. Enter Username
4. Enter Password
5. Click on Submit button
6. Insert any wait command
7. Verify Title
8. Verify Welcome text 
9. Click on Leave main menu link
10. Click on Leave Summary sub menu
11. Click on Employee Leave Summary sub menu link
12. Click on Logout link*/

public class Testcase2 extends TestUtil
{ 
	@Test
	public void Verify_Employee_LeaveSummary(){
	driver.get(config.getProperty("website"));
	Thread(5000);
	driver.findElement(By.name(OR.getProperty("username"))).sendKeys("admin");
	Implicitwaiting(15);
	driver.findElement(By.name(OR.getProperty("password"))).sendKeys("admin");
	driver.findElement(By.name(OR.getProperty("Submit"))).click();
	System.out.println(driver.getTitle());
	String title="OrangeHRM";
	Assert.assertEquals(title, driver.getTitle());
	
	element =driver.findElement(By.xpath(OR.getProperty("leave")));
	Thread(3500);
	Actions action=new Actions(driver);
	action.moveToElement(element).perform();
	element =driver.findElement(By.xpath(OR.getProperty("leavesummary")));
	Thread(3500);
	Actions action1=new Actions(driver);
	action1.moveToElement(element).perform();
	Thread(3200);
	driver.findElement(By.xpath(OR.getProperty("Empleavesum"))).click();
	Thread(3500);
	
	Explicitwait(20, OR.getProperty("logout"));
	driver.findElement(By.xpath(OR.getProperty("logout"))).click();
}}
