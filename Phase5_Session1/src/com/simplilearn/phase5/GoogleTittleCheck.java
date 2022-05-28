package com.simplilearn.phase5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTittleCheck {

public static void main(String[] args) {
		
		//step-1: Declare path Driver
		String path="C:\\Users\\jyoti\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		//initiate the driver
				WebDriver driver= new ChromeDriver();
				
				String base_url="http://www.google.com/";
				
				
				//step: 4 Launching google chrome
						driver.get(base_url);
						
				/// step:5 to check the google title
				
				String expectedTitle="Google";
				
				String actualTitle="";
				
				//getting name of website from driver
				actualTitle= driver.getTitle();
				
				if(actualTitle.contentEquals(expectedTitle))
					System.out.println("Test Passed with title: "+driver.getTitle());
				else
					System.out.println("Test Failed");
				
				//close google chrome
				driver.close();
				
  }
}
