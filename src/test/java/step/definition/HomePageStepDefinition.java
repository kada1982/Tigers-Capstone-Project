package step.definition;

import core.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base{
	HomePageObject homePageObject = new HomePageObject();
		
		
		
	
	@Given("User is on Retail website .")
	public void user_is_on_retail_website() {
	    
	}

	@When("User click on Currency")
	public void user_click_on_currency() throws InterruptedException {
		homePageObject.clickonCurrency();
		logger.info("currency was clicked successfully");
		Thread.sleep(2000);
	
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() throws InterruptedException {
		homePageObject.UserChoseEuro();
		logger.info("Euro was clicked successfully");
		Thread.sleep(2000);

	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() throws InterruptedException {
		Utils.takeScreenShot();
		Thread.sleep(2000);

	    
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() throws InterruptedException {
		homePageObject.ClickOnshoppingcart();
		logger.info("currency was clicked successfully");
		Thread.sleep(2000);

	}

	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() throws InterruptedException {
		homePageObject.Yourshoppingcartisempty();
		logger.info("currency was clicked successfully");
		Utils.takeScreenShot();
		Thread.sleep(2000);

	}
	
	}