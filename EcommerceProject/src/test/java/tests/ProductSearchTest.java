package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import pages.ProductSearchPage;

public class ProductSearchTest extends TestBase {

	ProductSearchPage ps;
	String productName = "Jacket";
	String qty = "2";

	@Test(priority = 1)
	@Severity(SeverityLevel.MINOR)
	void SearchProduct() {
		ps = new ProductSearchPage(driver);
		ps.SearchForProduct(productName);
	}

	@Test(priority = 2)
	@Severity(SeverityLevel.MINOR)
	void SortProduct() {
		ps = new ProductSearchPage(driver);
		ps.SortProduct();
	}

	@Test(priority = 3)
	@Severity(SeverityLevel.MINOR)
	void ChooseProduct() {
		ps = new ProductSearchPage(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 1100)");
		ps.ChooseProduct(qty);
		assertTrue(driver.findElement(By.className("swatch-attribute-selected-option")).isDisplayed());
	}
}
