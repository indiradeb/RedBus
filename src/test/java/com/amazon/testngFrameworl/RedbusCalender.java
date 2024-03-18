package com.amazon.testngFrameworl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedbusCalender {

	static WebDriver driver;
	public static void main(String args[])
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in");
		List<String> weekenddates =getWeekendDates("Apr 2024");
		System.out.println(weekenddates);
		driver.close();
		
	}
	
		public static ArrayList<String> getWeekendDates(String str) {
		driver.findElement(By.xpath("//div[@class='labelCalendarContainer']")).click();
		WebElement ele= driver.findElement(By.xpath("//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD' and contains(text(),'Mar')]"));
		
		  System.out.println(ele.getText()); 
		  String str1= ele.getText().substring(0,8);
		  String holidayDate= null;
		  ArrayList<String> dt= new ArrayList<String>();
		  if(str.equals(str1)) 
		    { 
			  //System.out.println(ele.getText()); 
			  List<WebElement> dates1=  driver.findElements(By.xpath("//div/span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']"));
		        
		          for (WebElement webElement : dates1) 
		          {
			           String name = webElement.getText();
			           dt.add(name);
			       }
		      return dt;
			  } 
		  else {
		  
		      do { 
			      driver.findElement(By.xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div[3]")).click(); 
			      WebElement holidayDateEle = driver.findElement(By. xpath("//div[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div[2]"));
			      //System.out.println(holidayDateEle.getText()); 
			      holidayDate =holidayDateEle.getText().substring(0,8);
			      
			      if(str.equals(holidayDate)) 
			      {
			    	  System.out.println(holidayDateEle.getText()); 
			    	  List<WebElement> dates1=  driver.findElements(By.xpath("//div/span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']"));
				       for (WebElement webElement : dates1) 
					         {
					           String name = webElement.getText();
					           dt.add(name);
					           }
					      break; 
			      }
			  
		      }while(!str.equals(holidayDate));
		      return dt;
		    }
		  //return dt;
		}
}

