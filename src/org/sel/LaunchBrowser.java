package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	public static void main (String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\samson\\Downloads\\chromedriver-win64\\chromedriver-win64");
		
		WebDriver driver=new ChromeDriver();
		
		
		System.out.println("hi");
		System.out.println("God");
	}

}
