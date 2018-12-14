package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import basetest.BaseTest;
import pages.BasketPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.ProductDisplayPage;
import pages.SearchResultsPage;
import repo.DataUtil;

public class PlaceOrderTest extends BaseTest {
	
	@Test
	public void placeOrderByCOD()
	{
		extentTest = extentReports.createTest("placeOrderByCOD");
		
		if(DataUtil.isTestExecutable(eat, "TestCases", "placeOrderByCOD"))
		{
			HomePage homePage = new HomePage(driver,extentTest);
			SearchResultsPage searchResultsPage = homePage.searchBook();
			ProductDisplayPage productDisplayPage = searchResultsPage.clickSearchedBook();
			BasketPage basketPage = productDisplayPage.navigateToBasketPage();
			CheckoutPage checkoutPage = basketPage.proceedToCheckout();
			checkoutPage.placeOrderByCODOption();
		}
		else
		{
			throw new SkipException("Skipping the test as the runmod is not Yes.");
		}
	}
	
	@Test
	public void placeOrderByNB()
	{
		extentTest = extentReports.createTest("placeOrderByNB");
		
		if(DataUtil.isTestExecutable(eat, "TestCases", "placeOrderByNB"))
		{
			HomePage homePage = new HomePage(driver,extentTest);
			SearchResultsPage searchResultsPage = homePage.searchBook();
			ProductDisplayPage productDisplayPage = searchResultsPage.clickSearchedBook();
			BasketPage basketPage = productDisplayPage.navigateToBasketPage();
			CheckoutPage checkoutPage = basketPage.proceedToCheckout();
			checkoutPage.placeOrderByNBOption();
		}
		else
		{
			throw new SkipException("Skipping the test as the runmod is not Yes.");
		}
	}
}
