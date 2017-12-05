package com.Amazon.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frametesting {
	@Test
	public void FrameSelenium()
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bibek\\Downloads\\chromedriver.exe");		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30l,TimeUnit.SECONDS);
	driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	
	driver.switchTo().frame("classFrame");
	driver.findElement(By.linkText("deprecated")).click();
}
}