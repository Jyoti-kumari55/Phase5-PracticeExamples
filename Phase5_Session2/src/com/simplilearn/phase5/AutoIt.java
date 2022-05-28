package com.simplilearn.phase5;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIt {
	public static void main(String[] args) throws IOException,InterruptedException {
		 
		//assigning driver path
				String Path= "C:\\Users\\jyoti\\Downloads\\chromedriver_win32\\chromedriver.exe";
				
				System.setProperty("webdriver.chrome.driver", Path);
				
				//initiate the driver
				WebDriver driver= new ChromeDriver();
				
				//giving Base Url
				String base_url="https://www.shine.com/register/general/";
				
				//launching in chrome
				driver.get(base_url);
				
				
				
				WebElement name= driver.findElement(By.id("id_name"));
				name.sendKeys("Jyoti Kumari");
				
				WebElement email= driver.findElement(By.id("id_email"));
				email.sendKeys("Jyoti@gmail.com");
				
				
				///file upload
				
				WebElement element= driver.findElement(By.id("id_file"));
				JavascriptExecutor executor = (JavascriptExecutor)driver;
				
				executor.executeScript("arguments[0].click()", element);
				
				Thread.sleep(5000);
				Runtime.getRuntime().exec("C:\\Screenshot\\upload1.exe");
						
	}

}
