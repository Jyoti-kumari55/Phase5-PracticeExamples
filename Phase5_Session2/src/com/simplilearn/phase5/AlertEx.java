package com.simplilearn.phase5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx {

	public static void main(String[] args) {
		//assigning driver path
		 String path="C:\\Users\\jyoti\\Downloads\\chromedriver_win32\\chromedriver.exe";
				
		 System.setProperty("webdriver.chrome.driver", path);
				
				//initiate the driver
				WebDriver driver= new ChromeDriver();
				
				//giving Base Url
				String base_url="https://nxtgenaiacademy.com/alertandpopup/";
				
				//launching in chrome
				driver.get(base_url);
				
				//getting Normal AlertBox
				driver.findElement(By.name("alertbox")).click();
				driver.switchTo().alert().accept();
				
				//getting confirm Alert Box
				driver.findElement(By.name("confirmalertbox")).click();
				driver.switchTo().alert().accept();
				System.out.println(driver.findElement(By.id("demo")).getText());
				
				//getting prompt alert box
				driver.findElement(By.name("promptalertbox1234")).click();
				driver.switchTo().alert().sendKeys("yes");
				driver.switchTo().alert().accept();
				
				System.out.println(driver.findElement(By.id("demoone")).getText());
				
				driver.close();
				
			
	}
}
