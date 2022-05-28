package com.simplilearn.phase5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLinkTest {
	
	public static void main(String[] args) {
	//step-1: Declare path Driver
			String path="C:\\Users\\jyoti\\Downloads\\chromedriver_win32\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver", path);
			//initiate the driver
			WebDriver driver= new ChromeDriver();
		
	        driver.get("http://www.facebook.com/");
	
	        WebElement linktext= driver.findElement(By.linkText("Forgotten password?"));
	
	         linktext.click();
}
}
