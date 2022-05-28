package com.simplilearn.phase5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationFirm {
	
	public static void main(String[] args) {
		
		 String path="C:\\Users\\jyoti\\Downloads\\chromedriver_win32\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", path);
		//giving Base Url
		//initiate the driver
				WebDriver driver= new ChromeDriver();
				
				//giving Base Url
				String base_url="https://www.shine.com/registration/parser/";
				
				//launching in chrome
				driver.get(base_url);
				
				//getting name
				WebElement name= driver.findElement(By.id("id_name"));
				name.sendKeys("Jyoti Kumari");
				
				//getting email
				WebElement email= driver.findElement(By.id("id_email"));
				email.sendKeys("jyoti@gmail.com");
				
				//getting mobile number
				WebElement mobile= driver.findElement(By.id("id_cell_phone"));
				mobile.sendKeys("983456345");
				
				
				//getting a password
				WebElement password= driver.findElement(By.id("id_password"));
				password.sendKeys("Jyoti@123");
				
				//getting a checkbox
				WebElement check= driver.findElement(By.id("id_privacy"));
				
				if(check.isSelected()) {
					 System.out.println("CheckBox is Selected By Default");
					 System.out.println("Status of CheckBox :"+ check.isSelected());
				}
				else {
					System.out.println("Check box is Not Selected");
				}
				
				//getting button
				
				WebElement button= driver.findElement(By.id("registerButton"));
				button.click();
				
				
				//driver.close();
				
			}

}
