package page.objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	public  HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@class='btn btn-link dropdown-toggle']")
	private WebElement Currency;
	public void  clickonCurrency() {
		Currency.click();
	}
	@FindBy(name="EUR")
	private WebElement ChoseEuro;
	public void UserChoseEuro () {
		ChoseEuro.click();
	}
	
	@FindBy(xpath="//a[@title='Shopping Cart']")
	private WebElement shoppingcart;
	public void ClickOnshoppingcart() {
		shoppingcart.click();
	}
	@FindBy(xpath = "//div[@id=\"content\"]/p")
	
	private WebElement shoppingcartempty;
	public boolean Yourshoppingcartisempty() {

        boolean productComparisonMessage = shoppingcartempty.isDisplayed();

        return productComparisonMessage;

        
		
	}

}