package com.app.TestGScripts;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGScript{
	public static WebDriver driver;
	
	@Test
	public void New_Arrivals() throws InterruptedException
	{
	    
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.bookswagon.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String expectedtitle = "Online Bookstore | Buy Books Online | Read Books Online";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(actualtitle, expectedtitle, "The title donot match");
				
		//driver.findElement(By.linkText("New Arrivals")).click();
		
		driver.findElement(By.xpath("//a[@class='nav-link']")).click();
				
		driver.findElement(By.linkText("English")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//a[@class='nav-link'])[7]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("(//a[@class='nav-link'])[9]")).click();
		Thread.sleep(100);
			
		driver.findElement(By.xpath("(//img[@class='card-img-top bklazy'])[1]")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Buy Now']")).click();
		 
		Thread.sleep(100);
		
		driver.close();
	}
	
		
	public void captureScreenshot(String methodname) {
		try {
			File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(file, new File("Desktop\\a.jpg"));
		}
		catch (Exception e){
			e.getMessage();
			
		}
	}
	
	

}
