package com.app.seleniumsession;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatepickerTest {

	WebDriver driver;

	@Test
	public void selectDateFromDatePicker() throws InterruptedException {

		String chromPath = System.getProperty("user.dir") + "/Drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("http://www.webdriveruniversity.com/Datepicker/index.html");

		String month = "Jan";
		String day = "13";
		String year = "2022";
		datePicker(month, day, year);

	}

	public void datePicker(String month, String day, String year) throws InterruptedException {

		// click on date picker icon to open the calendar
		WebElement datePickerIcon = driver.findElement(By.xpath("//span[@class='input-group-addon']"));
		datePickerIcon.click();

		// get the year
		String finalYear;
		WebElement yearElement;
		yearElement = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]"));
		String yearText = yearElement.getText();
		String[] yearArray = yearText.split(" ");
		System.out.println("Years is: " + yearArray[0] + " : " + yearArray[1]);
		finalYear = yearArray[1];

		// select the year
		// 2024.equal(2021)
		while (!(finalYear.equalsIgnoreCase(year))) {
			WebElement nextIcon = driver.findElement(By.xpath("(//th[contains(@class,'next')])[1]"));
			nextIcon.click();
			Thread.sleep(1000);

			yearElement = driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]"));
			String yearText1 = yearElement.getText();
			String[] yearArray1 = yearText1.split(" ");
			System.out.println("Years is1: " + yearArray1[0] + " : " + yearArray1[1]);

			finalYear = yearArray1[1];
		}

		yearElement.click();
		Thread.sleep(1000);

		// select the month
		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='datepicker-months']/table/tbody/tr/td/span"));
		for (int i = 0; i < rows.size(); i++) {
			String monthText = rows.get(i).getText();
			System.out.println("Month name is: " + monthText);
			if (monthText.equals(month)) {
				rows.get(i).click();
				break;
			}
		}

		// select the day
		boolean result = false;
		List<WebElement> dayRows = driver.findElements(By.xpath("//div[@class='datepicker-days']/table/tbody/tr"));
		for (int i = 0; i < dayRows.size(); i++) {
			List<WebElement> columns = dayRows.get(i).findElements(By.xpath("//td[@class='day']"));
			System.out.println("column size is: " + columns.size());
			for (int j = 0; j < columns.size(); j++) {
				System.out.println("Date is: " + columns.get(j).getText());

				if (day.equalsIgnoreCase(columns.get(j).getText())) {
					columns.get(j).click();
					result = true;
					break;
				}

			}
			if (result) {
				break;
			}
		}

	}

}
