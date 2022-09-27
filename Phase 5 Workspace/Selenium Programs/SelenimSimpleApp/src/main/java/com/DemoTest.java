package com;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoTest {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\Mphasis Client Session\\July 2022 Batch\\Repository\\Phase 5 Workspace\\chromedriver_win32\\chromedriver.exe");
	//System.setProperty("webdriver.edge.driver", null)	
	WebDriver wd = new ChromeDriver();
	//WebDriver wd = new EdgeDriver();
	//WebDriver wd = new InternetExplorerDriver();
	wd.get("file:///D:/Desktop/Mphasis%20Client%20Session/July%202022%20Batch/Repository/Phase%205%20Workspace/index.html");	// load static or dynamic web page
	//wd.get("http://127.0.0.1:5500/index.html");
//	String titleTagContent=	wd.getTitle();
//	String url = wd.getCurrentUrl();
//	String pageContent = wd.getPageSource();
//	System.out.println(titleTagContent);
//	System.out.println(url);
//	System.out.println(pageContent);
	WebElement h2TagRef	 = wd.findElement(By.tagName("h2"));
	WebElement pTagRef	 = wd.findElement(By.tagName("p"));
	WebElement divTagRef	 = wd.findElement(By.tagName("div"));
	System.out.println(h2TagRef.getTagName()+" = "+h2TagRef.getText());
	System.out.println(pTagRef.getTagName()+" = "+pTagRef.getText());
	System.out.println(divTagRef.getTagName()+" = "+divTagRef.getText());
	List<WebElement> listOfPTag = wd.findElements(By.tagName("p"));
	Iterator<WebElement> ii = listOfPTag.iterator();
	while(ii.hasNext()) {
		WebElement ww = ii.next();
		System.out.println(ww.getTagName()+" "+ww.getText());
	}
	WebElement divTagUsingIdRef = wd.findElement(By.id("d1"));
	System.out.println(divTagUsingIdRef.getTagName()+" "+divTagUsingIdRef.getText());
	wd.close();
	}

}





