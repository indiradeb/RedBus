package seleniumProjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class dynamicElements {

	static WebDriver driver;
	public static void main(String args[]) throws InterruptedException
	{
		String xpath_current_pop ="//div[@class='maincounter-number']/span[@class='rts-counter']";
		String xpath_todays_pop ="//div[text()='Today']//parent::div//span[@class='rts-counter']";
		String xpath_thisyear_pop ="//div[text()='This year']//parent::div//span[@class='rts-counter']";
		String xpath_today_thisyear_pop= "//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.worldometers.info/world-population/");
		
		int count=1;
		while(count<20) {
		System.out.println(count + "sec");
		if(count==21) {break;}
		
		System.out.println("--------------Current population count--------------------------");
		getTextFromDymanicElements(xpath_current_pop) ;
		//getTextFromDymanicElements(xpath_todays_pop) ;
		System.out.println("--------------Toaday and This year population -------------------------");
		getTextFromDymanicElements(xpath_today_thisyear_pop) ;
		
		Thread.sleep(1000);
		count++;
		//driver.close();
		}
	}
	public static void getTextFromDymanicElements(String locater) throws InterruptedException {
		
			/*List<WebElement> popList = driver.findElements(By.xpath(locater));
			
			for(WebElement e : popList)
			{
				System.out.println(e.getText());
			}*/
		
		driver.findElements(By.xpath(locater)).stream().forEach(e -> System.out.println(e.getText()));
			
		
	}	
		

}