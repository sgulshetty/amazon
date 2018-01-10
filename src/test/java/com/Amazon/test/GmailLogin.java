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

public class GmailLogin {
@Test
 public void GmailUser(){
  
 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");  
 
 WebDriver driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(50l,TimeUnit.SECONDS);
driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");

driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("bibek.mallik14@gmail.com");
driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
WebDriverWait wait=new WebDriverWait(driver,40l);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")));

driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Namrata@0914");

driver.findElement(By.xpath("//span[text()='Next']")).click();

List<WebElement> list=driver.findElements(By.cssSelector(".yX.xY"));
System.out.println("Total element is " + list.size());
for(int i=0; i<list.size();i++)
{

System.out.println(list.get(i).getText());

}

list.get(0).click();
System.out.println("Title of the page is:"+driver.getTitle());
}
}