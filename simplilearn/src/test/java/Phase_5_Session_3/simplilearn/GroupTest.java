package Phase_5_Session_3.simplilearn;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


@Test
public class GroupTest {
   
WebDriver driver=null;
	
	public void launchChrome() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		try {
			
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void loginwithChrome() {
		driver.findElement(By.id("email")).sendKeys("nikunj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nikunj@1234");
		driver.findElement(By.name("login")).submit();
		driver.close();
		
	}
	
	public void launchFirefox() {
		
		System.setProperty("webdriver.gecko.driver", "firefox_driver_path");
		driver= new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		try {
			
			Thread.sleep(3000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test(groups="firefox",dependsOnMethods = {"launchFirefox"})
	public void loginwithFirefox() {
		driver.findElement(By.id("email")).sendKeys("nikunj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Nikunj@1234");
		driver.findElement(By.name("login")).submit();
		driver.close();
		
	}
}

	