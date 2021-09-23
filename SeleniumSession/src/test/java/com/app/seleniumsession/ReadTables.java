package com.app.seleniumsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReadTables {

	WebDriver driver;

	@BeforeMethod
	public void setUpDriver() {
		String chromPath = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://www.webdriveruniversity.com/Data-Table/index.html");
	}

	//@Test
	public void TestTableWithNormalLoop() {
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='t01']/tbody/tr"));
		System.out.println("Rows : " + row.size());

		boolean result = false;
		for (int i = 2; i <= row.size(); i++) {
			List<WebElement> col = driver.findElements(By.xpath("//table[@id='t01']/tbody/tr[" + i + "]/td"));
			System.out.println("Col : " + col.size());
			for (int m = 1; m < col.size(); m++) {
				WebElement colText = driver.findElement(By.xpath("//table[@id='t01']/tbody/tr[" + i + "]/td[" + m + "]"));
				String lastName = colText.getText();
				System.out.println("Last name: " + lastName);
				if (lastName.equalsIgnoreCase("Jackson")) {
					System.out.println("Inside the if ");
					WebElement age = driver.findElement(By.xpath("//table[@id='t01']/tbody/tr[" + i + "]/td[" + (m + 1) + "]"));
					System.out.println("Last name is: " + lastName + "  Age is: " + age.getText());
					result = true;
					break;
				}
			}

			if (result) {
				break;
			}

		}

	}
	
	
	@Test
	public void TestWithAdvanceLoop()
	{
		WebElement table= driver.findElement(By.tagName("table"));
		//WebElement tbody= table.findElement(By.tagName("tbody"));
		List <WebElement> rows= table.findElements(By.tagName("tr"));
		System.out.println("Number of rows are : " + rows.size());
		
		for(int i=1; i<rows.size(); i++)
		{
			List <WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			System.out.println("Column size is: " + cols.size());
			
			for(int k=0; k<cols.size(); k++)
			{
				System.out.println("Column value is: " + cols.get(k).getText());
				
				if(cols.get(k).getText().equalsIgnoreCase("Michael"))
				{
					System.out.println("First name is: " + cols.get(k).getText()  + "  Last name is: " + cols.get(k+1).getText());
					break;
				}
			}
			
		}
		
	}
	
	

}
