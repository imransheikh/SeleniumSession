package com.app.seleniumsession;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class companyTestScript {
	
	WebDriver driver;
	companyClass data1=null;
	List<String> rowData= null;
	List<companyClass> countryList = new ArrayList<companyClass>();
				String name;
	@Test()
	public void readTable()
	{
		//String chrome = "F:\\AutomationWorkspace\\SeleniumSession\\Drivers\\chromedriver.exe";
		String chromePath= System.getProperty("user.dir") + "/Drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", chromePath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		name = "Imran Sheikh Test";
		
		//Read company data from web table
		WebElement table= driver.findElement(By.id("customers"));
		WebElement tobody= table.findElement(By.tagName("tbody"));
		//table.findElements(by)
		List<WebElement> rows= tobody.findElements(By.tagName("tr"));
		for(WebElement row: rows)
		{
					rowData= new ArrayList<String>();
					List<WebElement> columns= row.findElements(By.tagName("td"));
					int i=0;
					if(columns.size()!=0)
					{
						for(WebElement col: columns)
						{
							String str= col.getText();
							rowData.add(str);
							//System.out.println("Row data: " + rowData);
							
							//System.out.println(rowData.get(i));
							i++;
						}
						//System.out.println("rowData" + rowData);
						//System.out.println(rowData.size());
						//System.out.println(rowData.get(0)+ rowData.get(1)+ rowData.get(2));
						data1= new companyClass(rowData.get(0), rowData.get(1),rowData.get(2));
						//System.out.println("Data: " + data1);
						countryList.add(data1);
						
					}
					
		}
		System.out.println("Company" + "    " + "Contact" + "    " + "Country");
		for(companyClass c: countryList)
		{
			System.out.println(c.compName +  "  " + c.contact +   c.county );
		}
		
		
	}
	
	@Test(dependsOnMethods={"readTable"})
	public void  getListOfCompany()
	{
		System.out.println("Name is : " + name);
		System.out.println("Company" + "    " + "Contact" + "    " + "Country");
		for(companyClass c: countryList)
		{
			System.out.println(c.compName +  "  " + c.contact +   c.county );
		}
		//return countryList;
	}

}
