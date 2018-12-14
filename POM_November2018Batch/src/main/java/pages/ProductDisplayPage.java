package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class ProductDisplayPage extends BasePage{

	public ProductDisplayPage(WebDriver driver, ExtentTest extentTest) {
		super(driver,extentTest);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//form[@class='cart']/button")
	private WebElement addToBasketButton;
	
	@FindBy(xpath = "//div[@id='content']/div[1]/a")
	private WebElement viewToBasketButton;
	
	public BasketPage navigateToBasketPage()
	{
		addToBasketButton.click();
		viewToBasketButton.click();
		
		return new BasketPage(driver,extentTest);
	}

	
}
