package com.app.TestGScripts;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.app.TestGScripts.Listener.class)

public class TestCase extends TestNGScript {
	
	@BeforeTest
	public void setup() throws InterruptedException, IOException
	{
		New_Arrivals();
	}
	@Test
	
	public void testMethod1() {
		driver.findElement(null);
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
