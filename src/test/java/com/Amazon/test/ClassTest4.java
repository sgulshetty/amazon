package com.Amazon.test;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassTest4 {
	@Test
	public void Amazon1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bibek\\Downloads\\chromedriver.exe");		
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
		
		String atitle=driver.getTitle();
		String etitle="Online Shopping: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	//	Assert.assertEquals(atitle, etitle);//AssertEquals will check exact content.
		System.out.println(atitle);
		System.out.println(etitle);
		
		
			Assert.assertTrue(etitle.equalsIgnoreCase("Online Shopping: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		System.out.println("passed");
		
	}
}
