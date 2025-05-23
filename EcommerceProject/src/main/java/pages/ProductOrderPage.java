package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProductOrderPage {

	WebDriver driver;

	public ProductOrderPage(WebDriver driver) {
		this.driver = driver;
	}

	By email_txt = By.xpath("//form[@class='form form-login']/descendant::input[1]");
	By password_txt = By.xpath("//form[@class='form form-login']/descendant::input[2]");
	By login_btn = By.xpath("//*[@id=\"customer-email-fieldset\"]/fieldset/div[2]/div[1]/button");
	By item_link = By.cssSelector("span[role='tab']");
	By firstname_txt = By.xpath("//form[@id='co-shipping-form']/descendant::input[1]");
	By lastname_txt = By.xpath("//form[@id='co-shipping-form']/descendant::input[2]");
	By company_txt = By.xpath("//form[@id='co-shipping-form']/descendant::input[3]");
	By street_txt = By.xpath("//form[@id='co-shipping-form']/descendant::input[4]");
	By street2_txt = By.xpath("//form[@id='co-shipping-form']/descendant::input[5]");
	By street3_txt = By.xpath("//form[@id='co-shipping-form']/descendant::input[6]");
	By city_txt = By.xpath("//form[@id='co-shipping-form']/descendant::input[7]");
	By province_txt = By.xpath("//form[@id='co-shipping-form']/descendant::select[@name='region_id']");
	By zip_txt = By.xpath("//form[@id='co-shipping-form']/descendant::input[9]");
	By country_select = By.xpath("//form[@id='co-shipping-form']/descendant::select[@name='country_id']");
	By phone_txt = By.xpath("//form[@id='co-shipping-form']/descendant::input[10]");
	By shipMethod_btn = By.xpath("//form[@id='co-shipping-form']/descendant::input[11]");
	By next_btn = By
			.xpath("//form[@id='co-shipping-method-form']/descendant::button[@class='button action continue primary']");
	By btn_shiphere = By
			.xpath("//footer[@class='modal-footer']/descendant::button[@class='action primary action-save-address']");
	By btn_next = By.xpath("//*[@id=\"shipping-method-buttons-container\"]/div/button");
	By placeOrder_btn = By.xpath("//form[@id='co-payment-form']/descendant::button[@title='Place Order']");
	By receiptprint_link = By.xpath("//a[@class='action print']");
	By newAdress_link = By.xpath("//div[@class='page-wrapper']/descendant::button[@class='action action-show-popup']");
	By print_btn = By.className("action-button");
	By pdf_select = By.xpath("//*[@id=\"destinationSelect\"]//print-preview-settings-section/div/select");

	public void CheckCart(String company, String street, String street2, String street3, String city, String province)
			throws InterruptedException {
		driver.findElement(company_txt).sendKeys(company);
		driver.findElement(street_txt).sendKeys(street);
		driver.findElement(street2_txt).sendKeys(street2);
		driver.findElement(street3_txt).sendKeys(street3);
		driver.findElement(city_txt).sendKeys(city);
		Thread.sleep(3000);
		driver.findElement(province_txt).sendKeys(province);
	}

	public void Zip(String zip) {

		driver.findElement(zip_txt).sendKeys(zip);
	}

	public void CountrySelect() throws InterruptedException {
		Select select2 = new Select(driver.findElement(country_select));
		select2.selectByIndex(2);
		Thread.sleep(3000);
	}

	public void ContinueShipping(String phone) throws InterruptedException {
		driver.findElement(phone_txt).sendKeys(phone);
		Thread.sleep(3000);
		driver.findElement(next_btn).click();
	}

	public void placeOrderShipping() {
		driver.findElement(placeOrder_btn).click();
	}

}
