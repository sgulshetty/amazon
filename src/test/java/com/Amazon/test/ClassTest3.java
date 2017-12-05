package com.Amazon.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassTest3 {

	@Test
	public void Amazon()
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bibek\\Downloads\\chromedriver.exe");		
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30l,TimeUnit.SECONDS);
	driver.get("http://content.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");

	////printing only 1 column all value
	List<WebElement> list=driver.findElements(By.xpath(".//*[@id='pnl_Bse']/table/tbody/tr[2]/td[4]"));
        //printing  all value
		//List<WebElement> list=driver.findElements(By.xpath(".//*[@id='pnl_Bse']/table/tbody/tr/td"));
		//printing only 1 row all value..3rd row
		//List<WebElement> list=driver.findElements(By.xpath(".//*[@id='pnl_Bse']/table/tbody/tr[3]"));
		//printing only 1 particular  value for 2nd row 2nd value
		//List<WebElement> list=driver.findElements(By.xpath(".//*[@id='pnl_Bse']/table/tbody/tr[2]/td[2]"));
		
	for(int i=0; i<list.size();i++)
	{
	System.out.println(list.get(i).getText());	
	}
	

}
}