package com.app.seleniumsession;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DownloadUploadFileClass{

	WebDriver driver;
	
	/*Why we need fire fox profile	 * 
	 * The most common example is a SSL certificate settings or browser plug-ins that handles self
	 * signed certs.
	 * 
	 * How to create : 
	 * window key +R
	 * firefox.exe -p and then click on ok button. provide your profile name and select ok button.
	 * 
	 */
	
	
	@Test
	public void downloadFile()
	{
		ProfilesIni prfile = new ProfilesIni();
		FirefoxProfile profile = prfile.getProfile("ImraanSheikh");
		
		/* In Webdriver 3 we can do in that way
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("-profile", "FF Profile Directory");
		driver = new FirefoxDriver(options);
		*/
		
		//FirefoxProfile profile = new FirefoxProfile(myprofile);
		profile.setPreference("browser.download.folderList", 2);
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		profile.setPreference("browser.download.dir", "E:\\Movies");
		profile.setPreference("browser.helperApps.neverAsk.openFile",
				"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
"text/csv,application/x-msexcel,application/excel,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml");
		profile.setPreference("browser.helperApps.alwaysAsk.force", false);
		profile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		profile.setPreference("browser.download.manager.focusWhenStarting", false);
		profile.setPreference("browser.download.manager.useWindow", false);
		profile.setPreference("browser.download.manager.showAlertOnComplete", false);
		profile.setPreference("browser.download.manager.closeWhenDone", false);

		String geckoDriverPath = "E:\\AutomationWorkSpace\\SeleniumJava\\JavaTestProject\\Drivers\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", geckoDriverPath);

	
		//driver= new FirefoxDriver(profile);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.seleniumeasy.com/test/");
		WebElement alertModel= driver.findElement(By.xpath("(//a[contains(text(),'Alerts & Modals')])[2]"));
		alertModel.click();
		
		WebElement fileDownloadlink= driver.findElement(By.xpath("(//a[contains(text(),'File Download')])[2]"));
		fileDownloadlink.click();
		
		WebElement textArea= driver.findElement(By.id("textbox"));
		textArea.sendKeys("Imran Sheikh");
		
		WebElement generateFile= driver.findElement(By.xpath("//button[contains(text(),'Generate File')]"));
		generateFile.click();
		
		WebElement downloadLink= driver.findElement(By.id("link-to-download"));
		downloadLink.click();
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		//driver.quit();
	}

	
	
	@Test
	public void UploadFile()
	{
		String filePath= System.getProperty("user.dir") + "/file/test.png";
		WebElement element= driver.findElement(By.xpath("id"));
		element.sendKeys(filePath);
			
		
	}
	
	
	
	@Test
	public void downloadFilesInChrome()
	{
		System.setProperty("webdriver.chrome.driver", "/path/chromedriver");
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.prompt_for_download", false);
		options.setExperimentalOption("prefs", prefs);
		RemoteWebDriver driver = new ChromeDriver(options);
	}
	
	
	@Test
	public void downloadFilesInFirefox()
	{
		FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
		WebDriver driver=new FirefoxDriver();
	}
	
}
