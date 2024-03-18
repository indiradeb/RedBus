package com.amazon.testngFrameworl;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPage_AllTest {
	
	WebDriver driver;
	
	@BeforeMethod()
	public void setUp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Ngojj\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.amazon.com/");
	Thread.sleep(2000);
	
	}
	
	@Test(retryAnalyzer = Analyzer.RetryAnalyzer.class)
	public void clickAll() throws InterruptedException {
		//driver.get("https://www.amazon.com/");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		Thread.sleep(2000);
		
		/*WebElement ele = driver.findElement(By.xpath("//div[@id='hmenu-content']"));
		Actions action = new Actions(driver);
		 action.moveToElement(ele).perform();
		 Thread.sleep(2000);
		 
		/* WebElement Groceries = driver.findElement(By.xpath("//*[@id=\"nav-link-groceries\"]/span[2]"));
		 Actions action = new Actions(driver);
		 action.moveToElement(Groceries).perform();
		 Thread.sleep(2000);
		 
		Actions builder = new Actions(driver);
        Action mouseOverHome = builder
                .moveToElement(link_Home)
                .build();*/
		
	/*WebElement ele1 = driver.findElement(By.xpath("//*[text()='Medical Care & Pharmacy']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,5000)");
		js.executeScript("arguments[0].scrollIntoView",ele1);
		Thread.sleep(2000);*/ //youtube
		
		
		/*WebElement ele = driver.findElement(By.xpath("//div[@id='hmenu-content']"));
				Select select = new Select(ele);
				select.selectByVisibleText("Medical Care & Pharmacy");
				Thread.sleep(3000);
				EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
				eventFiringWebDriver.executeScript("document.querySelector('a.hmenu-item[data-menu-id='29']').scrollTop=2000");
		*/ //youtube
		WebElement ele = driver.findElement(By.xpath("//*[text()='Medical Care & Pharmacy']"));
		
		Actions action = new Actions(driver);
		 //action.moveToElement(ele).perform();
		 action.scrollToElement(ele).perform();
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//*[text()='Medical Care & Pharmacy']")).click();
		 Thread.sleep(2000);
		 
		 //driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible hmenu-translateX']/li[5]/a[text()='Amazon Pharmacy']"));
		 String targetString = driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible hmenu-translateX']/li[1]/a[@aria-label='Back to main menu']")).getText();
		  
		  Assert.assertEquals(targetString, "MAIN MENUu");
		  
		  WebElement element = driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible hmenu-translateX']/li[5]/*[text()='Amazon Pharmacy']"));
		  Actions actions = new Actions(driver); 
		  actions.moveToElement(element).click().perform();
		  
		  Thread.sleep(2000);
		
		   String pharmasyText = driver.findElement(By.xpath("//*[text()='Save time, save money, stay healthy.']")).getText();
		   System.out.println("Text Ediotr :"+pharmasyText);
		  Assert.assertEquals(pharmasyText, "Save time, save money, stay healthy.");
	}
	
	
	@Test(enabled=true)
	public void all_BEstSellersTest() throws InterruptedException
	{
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		Thread.sleep(2000);
		String targetText = driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible']/li[1]//div[text()='trending']")).getText();
		System.out.println(targetText);
		boolean flag1,flag2 = false;
        flag1 = driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible']/li[1]//div[text()='trending']")).isDisplayed();
		System.out.println(flag1);
        Assert.assertTrue(flag1, targetText);
        
        driver.findElement(By.xpath("//ul[@class='hmenu hmenu-visible']/li[2]/a[text()='Best Sellers']")).click();
        String BookSellerText = driver.findElement(By.xpath("//span[@id='zg_banner_text']")).getText();	
        System.out.println(BookSellerText);
        flag2=driver.findElement(By.xpath("//span[@id='zg_banner_text']")).isDisplayed();
        System.out.println(flag1);
        Assert.assertTrue(flag2, BookSellerText);
        
	}
	
	
	@Test
	public void searchTest() throws InterruptedException
	{
		
		
		//driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		WebElement ele = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(ele);
		select.selectByVisibleText("Electronics");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(3000);
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
		
	
	

}
