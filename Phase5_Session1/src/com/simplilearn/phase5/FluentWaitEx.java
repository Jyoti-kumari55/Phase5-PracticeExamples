package com.simplilearn.phase5;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitEx {
	public static void main(String[] args) {

	String path="C:\\Users\\jyoti\\Downloads\\chromedriver_win32\\chromedriver.exe";
	
	System.setProperty("webdriver.chrome.driver", path);
	//initiate the driver
	WebDriver driver= new ChromeDriver();

	//step:3 base url
			String base_url="http://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html";
			
			
			//step: 4 Launching website
			driver.get(base_url);
			
			driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
			
			
			FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver)
					.withTimeout(30, TimeUnit.SECONDS)
					.pollingEvery(5, TimeUnit.SECONDS)
					.ignoring(NoSuchElementException.class);
			
			
			WebElement element=wait.until(new Function<WebDriver, WebElement>() {

				@Override
				public WebElement apply(WebDriver driver) {
					// TODO Auto-generated method stub
					
					WebElement element= driver.findElement(By.xpath("//*[@id=\"demo\"]"));
					String getTextOnPage= element.getText();
					
					if(getTextOnPage.equals("Software Testing Material - DEMO PAGE"))
					{
						System.out.println(getTextOnPage);
						return element;
						
					}
					else {
						
						System.out.println("Fluent wait Failed!");
						return null;
					}
					
					 
				}
				
			});
			
		}
}
