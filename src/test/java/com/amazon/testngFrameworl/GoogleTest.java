package com.amazon.testngFrameworl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GoogleTest {
WebDriver driver;
	
	@Test
	@Parameters({"url","emailId"})
	public void googleLogin(String url, String emailId)
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ngojj\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@name='identifier']")).clear();
		boolean b = driver.findElement(By.xpath("//input[@name='identifier']")).isDisplayed();
		System.out.println(b);
		Assert.assertTrue(b);
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys(emailId);
		
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		
	}
}
