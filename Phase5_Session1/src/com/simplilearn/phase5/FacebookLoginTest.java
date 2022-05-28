package com.simplilearn.phase5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {
	public static void main(String[] args) {

		//step-1: Declare path Driver
		String path="C:\\Users\\jyoti\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		//initiate the driver
		WebDriver driver= new ChromeDriver();
	
	//step:3 base url
	String base_url="http://www.facebook.com/";
	
	
	//step: 4 Launching Facebook:
	driver.get(base_url);
	
	
	//finding web elements from web page
	WebElement email= driver.findElement(By.id("email"));
	System.out.println(email.getAttribute("placeholder"));

	
	WebElement password= driver.findElement(By.id("pass"));
	System.out.println(password.getAttribute("placeholder"));
	
	
	email.sendKeys("Chaudharyjyoti@gmail.com");
	password.sendKeys("Jyoti123");
	
	
	//in facebook there is no id for button but it has name so we will get button by name
	
	WebElement login= driver.findElement(By.name("login"));
	login.click();
	
	//driver.close();
}
}
