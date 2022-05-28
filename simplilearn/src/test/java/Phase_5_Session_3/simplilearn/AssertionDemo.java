package Phase_5_Session_3.simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {

	WebDriver driver= null;
	SoftAssert soft= null;
	
	@Test
	public void tittleTest() {
		
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		soft.assertEquals(driver.getTitle(), "Facebook – log in or sign up");
		
		soft.assertAll();
		
		driver.close();
		
	}
	
	@Test
	public void login() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("jyoti@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Jyoti@1234");
		driver.findElement(By.name("login")).submit();
		
		soft.assertAll();
		driver.close();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		soft= new SoftAssert();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyoti\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	public void afterMethod() {
		soft= null;
		
		driver=null;
	}
   
  }

