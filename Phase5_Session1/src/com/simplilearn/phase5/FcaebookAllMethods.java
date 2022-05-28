package com.simplilearn.phase5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FcaebookAllMethods {

	public static void main(String[] args) {
	        //step-1: Declare path Driver
			String path="C:\\Users\\jyoti\\Downloads\\chromedriver_win32\\chromedriver.exe";
			
			System.setProperty("webdriver.chrome.driver", path);
			//initiate the driver
			WebDriver driver= new ChromeDriver();
		
	        driver.get("http://www.facebook.com/");
	        
	      //step:1 find by id 
			WebElement email1=driver.findElement(By.id("email"));
			
			//step:2 find by name
			WebElement email2=driver.findElement(By.name("email"));
			
			//compare
			System.out.println("Id and Name Found: "+ email1.equals(email2));
			
			//step:3 linked text is already done

			WebElement linktext= driver.findElement(By.linkText("Forgotten password?"));
			

			//step:4 find email by using relative path (xpath)
			WebElement xpathEmail= driver.findElement(By.xpath("//*[@id=\"email\"]"));
			
			//compare
			System.out.println("Id and Xpath Found: "+ email1.equals(xpathEmail));
			
			//step:5 find email by using fullxpath
			WebElement fullXpathEmail= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
			//compare
			System.out.println("xpathEmail and FullXpathEmail Found: "+ xpathEmail.equals(fullXpathEmail));
			
			
			//step:6 find email by using selector
			WebElement cssSelector= driver.findElement(By.cssSelector("#email"));
			//compare
			System.out.println("id and cssSelector Found: "+ email1.equals(cssSelector));
			
			
			//step:7 list of webelements
			
			List<WebElement> list= driver.findElements(By.cssSelector("input.inputtext"));
			
			for(WebElement e:list) {
				System.out.println("List of Webelements are: "+e.getAttribute("placeholder"));
			}
			
			
			//step:8 Tag and Attribute
			
			WebElement pass= driver.findElement(By.cssSelector("input[name=pass]"));
			
			System.out.println("Password using Tag: "+pass.getAttribute("placeholder"));
			
			
			
			driver.close();
			
			
}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
}
