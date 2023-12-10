package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewArrival extends BasePage {
	
	@FindBy(linkText=("New Arrivals"))
	static WebElement NewArrivals;

	@FindBy(xpath=("//a[@class='nav-link']"))
	static WebElement Paper;
	
	@FindBy(linkText="English")
	static WebElement English;

	@FindBy(xpath=("(//a[@class='nav-link'])[7]"))
	static WebElement Spanish;

	@FindBy(xpath=("(//a[@class='nav-link'])[9]"))
	static WebElement Italian;
		
	@FindBy(xpath=("(//img[@class='card-img-top bklazy'])[1]"))
	static WebElement Select_Book;
	
	@FindBy(xpath=("//input[@value='Buy Now']"))
	 static WebElement Buy;
	
	
	public NewArrival()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void NewArrivals()
	{
		NewArrivals.click();
		assertTrue(true);
	}
	
	public void paper()
	{
		Paper.click();
		assertTrue(true);
	}
	
	public void Select_lang()
	{
		English.click();
		Spanish.click();
		Italian.click();
	}
	
	public void Select_Book()
	{
		Select_Book.click();
	}
	
	public void Buy()
	{
		Buy.click();
	}

}
