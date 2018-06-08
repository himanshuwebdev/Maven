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
6. Insert any Wait command
7. Verify Title
8. Verify Welcome text 
9. Click on PIM Main menu link
10. Click on Add employee sub menu link
11. Select the frame
12. Enter employee first name
13. Enter employee last name
14. Click on save button
15. Exit from the frame
16. Click on Logout link*/
public class Testcase3 extends TestUtil {
	@Test
	public void Add_New_Employee() {
		
		driver.get(config.getProperty("website"));
		Thread(5000);
		driver.findElement(By.name(OR.getProperty("username"))).sendKeys("admin");
		Implicitwaiting(10);
		driver.findElement(By.name(OR.getProperty("password"))).sendKeys("admin");
		driver.findElement(By.name(OR.getProperty("Submit"))).click();
		System.out.println(driver.getTitle());
		String title="OrangeHRM";
		Assert.assertEquals(title, driver.getTitle());
		
		
		element =driver.findElement(By.xpath(OR.getProperty("PIM")));
		Thread(3500);
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();
		
		Thread(3200);
		driver.findElement(By.xpath(OR.getProperty("ADDEMP"))).click();
		Thread(3500);
		
		Explicitwait(15, OR.getProperty("logout"));
		driver.findElement(By.xpath(OR.getProperty("logout"))).click();
		Implicitwaiting(3000);
		System.out.println("logout clicked");
		Thread(5000);
		
		
		
		/*ExcelReader ER=new ExcelReader();
		try {
			ER.Excelread();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
