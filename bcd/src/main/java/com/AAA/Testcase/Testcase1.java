package com.AAA.Testcase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.AAA.Utilities.TestUtil;


/*Test case Summary: TC_01_Verify User Login
Test case Steps
    1. Open HRMS Application
    2. Insert wait for Title cmd
    3. Verify HRMS title
    4. Enter Username
    5. Enter Password
    6. Click on Submit button
    7. Verify Title
    8. Verify Welcome text 
    9. Click on Logout link*/

public class Testcase1 extends TestUtil{

	@Test
	public void Verify_User_Login()
	{
		driver.get(config.getProperty("website"));
		Implicitwaiting(10);
		driver.findElement(By.name(OR.getProperty("username"))).sendKeys("admin");
		driver.findElement(By.name(OR.getProperty("password"))).sendKeys("admin");
		driver.findElement(By.name(OR.getProperty("Submit"))).click();
		
		System.out.println(driver.getTitle());
		String title="OrangeHRM";
		Assert.assertEquals(title, driver.getTitle());
		Thread(3000);
        Explicitwait(15, OR.getProperty("logout"));
		driver.findElement(By.xpath(OR.getProperty("logout"))).click();
		Implicitwaiting(3000);
		System.out.println("logout clicked");
		Thread(5000);
		
		
		
	}
}
