package com.AAA.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.AAA.Utilities.ExtentManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class TestBase
{
	public static WebDriver driver;
	public static Properties config=new Properties();
	public static Properties OR=new Properties();
	public static FileInputStream fis;
	public File file;
	public static Actions action;
	public static WebElement element;

	public static ExtentReports report=ExtentManager.getInstance();
	 public static ExtentTest test;
	@BeforeSuite
	public void Setup()
{
	if(driver==null)
	{
		
		try {
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\properties\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\properties\\OR.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			OR.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	if(config.getProperty("browser").equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\executables\\geckodriver.exe");
		driver=new FirefoxDriver();
		
	}
	
	if(config.getProperty("browser").equals("chrome"))
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"\\src\\main\\resources\\executables\\chromedriver.exe");
		driver=new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		
	}
	
	driver.manage().window().maximize();
	driver.get(config.getProperty("website"));
	
}
  
  

	
	@AfterSuite
	public void TearDown() throws InterruptedException
	{
	driver.close();
	driver.quit();
		
		
	}

	
}
