package com.amazon.testngFrameworl;


import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonKeywordTest {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ngojj\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		
	}
	
	/*()@Test(groups="title")
	public void getTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.","title is not matched");
	}*/
	/*@Test(groups="Logo", enabled= true)
	public void amazonLogoTest() {
		boolean flag = driver.findElement(By.xpath("//div[@id='nav-logo']")).isDisplayed();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='nav-logo']")));
		
		System.out.println(flag);
	}*/
	@Test (groups="link")
	public void updateLocationLink()
	{
		// boolean link = driver.findElement(By.linkText("Update location")).isDisplayed();
		//boolean link = driver.findElement(By.id("//a[@id='nav-global-location-popover-link']")).isDisplayed();
		boolean link = driver.findElement(By.id("nav-logo")).isDisplayed();
		System.out.println(link);
		Assert.assertTrue(link);
	}
	
	@AfterMethod()
	public void tearDown()
	{
		driver.quit();
	}

}
