package com.amazon.testngFrameworl;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/* @BeforeSuiteSetup the property for chrome
 * @BeforeTest
 * @BeforeClass
 * 
 * @BeforeMethod
 * @Test
 * @AfterMEthod
 * 
 * @AFterClass
 * @AfterTest
 * Login to app
 * Launch the browser
 * enter url
 * Google title test
 * logout from app
 * close browser
 * delete cookies
 */

public class AmazonTest {

	@BeforeSuite  //1
	public void setUp()
	{
		System.out.println("setup System proeperty for chrome");
	}
	@BeforeTest  //2
	public void launchBrowser()
	{
		System.out.println("Launch chrome browser");
	}
	
	@BeforeClass //3
	public void login()
	{
		System.out.println("login to app");
	}
	@BeforeMethod //4
	public void enterURL()
	{
		System.out.println("Enter URL");
	}
	
	@Test (groups="Title") //5
	public void amazonTitleTest()
	{
		System.out.println("Google Title test");
	}
	
	@Test (groups="Search")
	public void searchTest()
	{
		System.out.println("search Test");
	}
	@Test (expectedExceptions=NumberFormatException.class)
	public void expectedException()
	{
		String s = "100A";
		Integer.parseInt(s);
	}
	
	@AfterMethod() //6
	public void logout()
	{
		System.out.println("logout from app");
	}
	
	@AfterClass //7
	public void closeBrowser()
	{

		System.out.println("Close Browser");
	}
	
	@AfterTest  //8
	public void deleteAllCookies()
	{

		System.out.println("deleteAllCookies");
	}
	@AfterSuite()///9
	public void generateTestReport()
	{

		System.out.println("Generate test report");
	}
}
