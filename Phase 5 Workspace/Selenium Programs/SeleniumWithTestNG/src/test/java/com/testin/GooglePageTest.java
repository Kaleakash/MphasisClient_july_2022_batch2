package com.testin;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class GooglePageTest {
  @Test
  public void googlePageTest() {
	  wd.get("https://www.google.com");
	  wd.manage().window().maximize();
	  wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	  WebElement textFieldRef = wd.findElement(By.name("q"));
	  textFieldRef.sendKeys("What is testing");
	 	WebElement buttonRef = wd.findElement(By.name("btnK"));
	  	//buttonRef.click();
	  	buttonRef.sendKeys(Keys.ENTER);
	  	try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	  	wd.navigate().back();
  }
  
  	WebDriver wd;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\Mphasis Client Session\\July 2022 Batch\\Repository\\Phase 5 Workspace\\chromedriver_win32\\chromedriver.exe");
		wd = new ChromeDriver();
	}

  @AfterMethod
  public void afterMethod() {
  }

}
