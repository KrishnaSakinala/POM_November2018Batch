package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

public class BasketPage extends BasePage{

	public BasketPage(WebDriver driver, ExtentTest extentTest) {
		super(driver,extentTest);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='coupon_code']")
	private WebElement couponCodeTextbox;
	
	@FindBy(xpath = "//input[@name='apply_coupon']")
	private WebElement applyCouponButton;
	
	@FindBy(xpath = "//div[@class='cart_totals']/div[1]/a")
	private WebElement proceedToCheckoutButton;
	
	/*@FindBy(xpath = "//div[@class = 'blockUI blockOverlay']")
	private WebElement loadingSpinner;*/
	
	private String loadingSpinner = "//div[@class = 'blockUI blockOverlay']";
	
	public CheckoutPage proceedToCheckout()
	{
		couponCodeTextbox.sendKeys("krishnasakinala");
		applyCouponButton.click();
		waitUntilElementInvisible(loadingSpinner);
		proceedToCheckoutButton.click();
		
		return new CheckoutPage(driver,extentTest);
	}
	
	
	
	
	
	

}
