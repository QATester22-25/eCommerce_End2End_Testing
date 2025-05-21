package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.ProductOrderPage;

public class ProductOrderTest extends TestBase {

	ProductOrderPage po;

	@Test()
	public void editShipping() throws InterruptedException {
		po = new ProductOrderPage(driver);
		Thread.sleep(5000);
		po.CheckCart("coding", "Republic", "21", "Street", "Texas", "Paris");
		po.Zip("43567");
		po.CountrySelect();
		po.ContinueShipping("12345678");
		Thread.sleep(3000);
		po.placeOrderShipping();
		assertEquals(driver.findElement(By.xpath("//span[@class='base']")).getText(), "Thank you for your purchase!");
	}




}