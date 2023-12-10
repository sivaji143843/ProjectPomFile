package steps;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.IRetry;
import utilities.MyListener;
import pages.NewArrival;


@Listeners(MyListener.class)
public class NewArrivals extends SharedStep {
	
	NewArrival sr;
	SharedStep s;
	
	
	@Test(priority='1',retryAnalyzer=IRetry.class)
	public void NewArrivals()
	{
		sr.NewArrivals();
	}
	
	
	@Test(priority='2',retryAnalyzer=IRetry.class)
	public void selectpaper()
	{
		sr.paper();
	}
	
	@Test(priority='3',retryAnalyzer=IRetry.class)
	public void Select_lang() throws InterruptedException
	{
		sr.Select_lang();
		Thread.sleep(1000);
	}
	
	@Test(priority='4',retryAnalyzer=IRetry.class)
	public void Select_Book() throws InterruptedException
	{
		sr.Select_Book();
		Thread.sleep(1000);
	}
	
	@Test(priority='5',retryAnalyzer=IRetry.class)
	public void Buy() throws InterruptedException
	{
		sr.Buy();
		Thread.sleep(1000);
	}
	
	@BeforeClass()
	public void setup() throws InterruptedException,IOException
	{

		
		getBrowser();
	
	   sr = new NewArrival();
	    s = new SharedStep();
 
	}  
	
	@AfterClass()
	public void generateReports() throws IOException
	{
		driver.close();
		
   
	}
	
	
	

}
