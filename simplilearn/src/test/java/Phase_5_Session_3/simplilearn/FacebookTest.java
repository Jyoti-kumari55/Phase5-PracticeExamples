package Phase_5_Session_3.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookTest {
	//initiated webdriver
		WebDriver driver=null;
		
		@Test
		public void welcome() {
			System.out.println("Welcome to facebook Automation Test");
		}
		
		@BeforeMethod
		public void beforeMethod() {
			
			System.out.println("Before Method");
			
			//step:1 Declare the Path of Chromedriver

			 String path="C:\\Users\\jyoti\\Downloads\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", path);
			
			//step:2 initiate chrome driver
			  driver= new ChromeDriver();
			
			//step:3 base url
			String base_url="http://www.facebook.com/";
			
			
			//step: 4 Launching Facebook
			driver.get(base_url);
			
			
			//finding webelements from webpage
			WebElement email= driver.findElement(By.id("email"));
			email.sendKeys("Jyoti@gmail.com");
			
			
		}
		@AfterMethod
		public void afterMethod() {
			
			System.out.println("After Method");
			driver.close();
			driver=null;
			
		}
}
