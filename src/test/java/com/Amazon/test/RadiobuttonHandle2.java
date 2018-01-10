package com.Amazon.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RadiobuttonHandle2 {


@Test
 public void Radiobutton(){
  
 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");  
 
 WebDriver driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(50l,TimeUnit.SECONDS);
driver.get("https://www.cleartrip.com/");
	
List<WebElement> list=driver.findElements(By.xpath("//input[@type='radio'][@name='trip_type']"));

for(int i=0; i<list.size();i++)
{
System.out.println("Total element is " + list.size());
String value=list.get(i).getAttribute("value");
System.out.println("Value of radio button are:  " +value);
}

list.get(2).click();
System.out.println("Title of the page is: "+driver.getTitle());

}
}