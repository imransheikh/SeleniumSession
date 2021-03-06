package com.app.seleniumsession;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;



public class InSeleniumScrollPages {
	
	WebDriver driver;
	
	@Test (priority=1)
	public void InvokeBrowser()
	{
		String geckoDriverPath = "E:\\AutomationWorkSpace\\SeleniumJava\\JavaTestProject\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.seleniumeasy.com/test/table-sort-search-demo.html");
	}
	
	
	@Test (priority=2)
	public void ScrollDown() throws InterruptedException
	{
		//JavascriptExecutor js=  ((JavascriptExecutor) driver);
		JavascriptExecutor js=  (JavascriptExecutor) (driver);
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(5000);
	
	}
		
	@Test (priority=3)
	public void ScrollUp() throws InterruptedException
	{
		JavascriptExecutor js=  ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(5000);
		
		//Scroll down the page until the element is found
		//JavascriptExecutor js1= (JavascriptExecutor) (driver);
		//js1.executeScript("argument[0].scrollIntoView();" , element);
		
		
		//How to scroll down to the bottom of the web page using selenium
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		//This will scroll the page Horizontally till the element is found
		//js.executeScript("arguments[0].scrollIntoView();", Element);
		
	
	}	
		
		
		
	
	

}
