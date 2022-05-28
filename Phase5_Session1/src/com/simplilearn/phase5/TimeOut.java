package com.simplilearn.phase5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TimeOut {
	public static void main(String[] args) {
		//step-1: Declare path Driver
				String path="C:\\Users\\jyoti\\Downloads\\chromedriver_win32\\chromedriver.exe";
				
				System.setProperty("webdriver.chrome.driver", path);
				//initiate the driver
				WebDriver driver= new ChromeDriver();
			
				//step:3 base url
				String base_url="http://www.facebook.com/";
				
				
				//step: 4 Launching Facebook
				driver.get(base_url);
				
				//step:1 implicit wait timeout for 20 seconds
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
				//step:2 page load out time
				driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
				
				//step:3  script timeout
				driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
				
				
				driver.close();
				
				
			}

}
