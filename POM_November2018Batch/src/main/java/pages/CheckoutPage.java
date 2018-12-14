package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

import repo.Locators;

public class CheckoutPage extends BasePage{

	public CheckoutPage(WebDriver driver, ExtentTest extentTest) {
		super(driver,extentTest);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = Locators.FIRST_NAME_TEXTBOX)
	private WebElement firstNameTextbox;
	
	@FindBy(xpath = Locators.LAST_NAME_TEXTBOX)
	private WebElement lastNameTextbox;
	
	@FindBy(how = How.XPATH, using = Locators.EMAIL_TEXTBOX)
    private WebElement eMailTextbox;

    @FindBy(how = How.XPATH, using = Locators.PHONE_TEXTBOX)
    private WebElement phoneTextbox;

    @FindBy(how = How.XPATH, using = Locators.COUNTRY_DROPDOWN)
    private WebElement countryDropdown;

    @FindBy(how = How.XPATH, using = Locators.ADDRESS_TEXTBOX)
    private WebElement addressTextbox;

    @FindBy(how = How.XPATH, using = Locators.CITY_TEXTBOX)
    private WebElement cityTextbox;

    @FindBy(how = How.XPATH, using = Locators.STATE_DROPDOWN)
    private WebElement stateDropdown;

    @FindBy(how = How.XPATH, using = Locators.STATE_SEARCH_TEXTBOX)
    private WebElement stateSearchTextbox;

    @FindBy(how = How.XPATH, using = Locators.ZIP_CODE_TEXTBOX)
    private WebElement zipcodeTextbox;

    @FindBy(how = How.XPATH, using = Locators.CASH_ON_DELIVERY_RADIOBUTTON)
    private WebElement cashOnDeliveryRadioButton;
    
    @FindBy(how = How.XPATH, using = "")
    private WebElement netBankingRadioButton;

    @FindBy(how = How.XPATH, using = Locators.PLACE_ORDER_BUTTON)
    private WebElement placeOrderButton;
    
    @FindBy(xpath = "//form[@name='checkout']/ul/li[1]")
    private WebElement message;
    
    public void placeOrderByCODOption()
    {
    	fillUserDetails();
    	cashOnDeliveryRadioButton.click();
    	placeOrderButton.click();
    	
    	Assert.assertEquals(message.getText(), "Billing Address");
    }
    
    public void placeOrderByNBOption()
    {
    	fillUserDetails();
    	netBankingRadioButton.click();
    	// UserName
    	// PassWord
    	placeOrderButton.click();
    }
    
    private void fillUserDetails()
    {
    	firstNameTextbox.sendKeys("Krishna");
    	lastNameTextbox.sendKeys("Sakinala");
    	eMailTextbox.sendKeys("email@gmail.com");
    	addressTextbox.sendKeys("Address");
    	cityTextbox.sendKeys("City");
    	zipcodeTextbox.sendKeys("12345");
    }
}
