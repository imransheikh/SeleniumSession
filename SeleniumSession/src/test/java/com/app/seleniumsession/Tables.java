package com.app.seleniumsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.Units;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tables {

	@Test
	public void handleTable() {
		String chromPath = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromPath);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://elvery.net/demo/responsive-tables/");

		WebElement table = driver.findElement(By.xpath("//table[contains(@class,'table-bordered')]"));
		List<WebElement> rowsList = table.findElements(By.tagName("tr"));
		List<WebElement> columnsList = null;

		for (WebElement row : rowsList) {
			System.out.println();
			columnsList = row.findElements(By.tagName("td"));

			for (WebElement column : columnsList) {
				//System.out.print(column.getText() + ",");
				
				if(column.getText().equalsIgnoreCase("AUSENCO LIMITED"))
				{
					System.out.println("Yes I got the name");
					System.out.print(column.getText());
					break;
				}
			}

		}

	}

}
