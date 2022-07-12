package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;


public class LaptopNoteBooksStepDefinition extends Base{
	LaptopNoteBooksPageObject laptopNoteBooksPageObject = new LaptopNoteBooksPageObject();
	
	@When("User click on Laptop & NoteBook tab")
	public void user_click_on_laptop_note_book_tab() throws InterruptedException {
		laptopNoteBooksPageObject.clickonLaptopNoteBooktab();
		logger.info("LaptopNoteBook Was Succesfully Clicked");
		Thread.sleep(2000);
	}

	@When("User click on Show all Laptop & NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() throws InterruptedException {
		laptopNoteBooksPageObject.clickShowAllLaptopNoteBook();
		logger.info("ShowAllLaptopNoteBook Was Succesfully Clicked"); 
		Thread.sleep(2000);
	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() throws InterruptedException {
		laptopNoteBooksPageObject.clickonMacBookitem();
		logger.info("LaptopNoteBook Was Succesfully Clicked");   
		Thread.sleep(2000);
	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() throws InterruptedException {
		laptopNoteBooksPageObject.clickonaddtoCartbutton();
		logger.info("addtoCartbutton was Succesfully Clicked");
		Thread.sleep(2000);
	}

	@Then("User should see a message3 {string}")
	public void user_should_see_a_message3(String expectedMacSuccessMsg) throws InterruptedException {
		Assert.assertEquals(laptopNoteBooksPageObject.GetMacSuccessMsg(),expectedMacSuccessMsg);
		logger.info(" User should see a message Success: You have added MacBook to your shopping cartC");
		Thread.sleep(2000);
	}

	
	@Then("User should see {string} showed to the cart")
	public void user_should_see_showed_to_the_cart(String string) throws InterruptedException {
	Assert.assertTrue(laptopNoteBooksPageObject.oneItemShowedToCartmacbook());
	logger.info("User should see 1 tem(s)-602.00 showed to the cart");

	Thread.sleep(2000);
	
	}
	@Then("User click on cart option")
	public void user_click_on_cart_option() throws InterruptedException {
		laptopNoteBooksPageObject.userclickoncartoption();
		logger.info("cart option was Succesfully Clicked"); 
		Thread.sleep(2000);
	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		laptopNoteBooksPageObject.userclickonredXbutton();
		logger.info("red X button was Succesfully Clicked"); 
		Utils.takeScreenShot();

	}
	@Then("item should be removed and cart should show {string}")
	public void item_should_be_removed_and_cart_should_show(String string) throws InterruptedException {

	        laptopNoteBooksPageObject.noItemsAddtothecart(); 
	        Thread.sleep(2000);
	}

	@When("User click on product comparison icon on MacBook")
	public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException {
		laptopNoteBooksPageObject.userclickoncomparisonicononMacBook();  
		logger.info("product comparison icon on ‘MacBook was Succesfully Clicked"); 
Thread.sleep(2000);
	}

	@When("User click on product comparison icon on MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() throws InterruptedException {
		 laptopNoteBooksPageObject.ClickOnMacAirIcon();

	        logger.info("User click on product comparison icon on MacBook Air");
	        Thread.sleep(2000);

	}

	@Then("User Should see a message4 {string}")
	public void user_should_see_a_message4(String expectedMacSuccessMsg) throws InterruptedException {
		Assert.assertEquals(laptopNoteBooksPageObject.getSuccessMacBookAir(),expectedMacSuccessMsg);
		logger.info("Success: You have added MacBook Air to your product comparison!");
		Thread.sleep(2000);
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() throws InterruptedException {
		laptopNoteBooksPageObject.usercliccomparisonlink();
		logger.info("User click on Product comparison link");
		Thread.sleep(2000);
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() throws InterruptedException {
		laptopNoteBooksPageObject.usercliccomparisonchart();
		logger.info("User click on Product comparison chart");
		Utils.takeScreenShot();
		Thread.sleep(2000);

	}

	@When("User click on heart icon to add 'Sony VaIO'laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() throws InterruptedException {
		laptopNoteBooksPageObject.UserClickOnheartIconSonyVaio();
		logger.info(" And User click on heart icon to add 'Sony VaIO'laptop to wish list ");
		Thread.sleep(2000);
	}

	@Then("User should get a message 'You must login or create an account to save Sony VAIO to your wish list!’")
	public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() throws InterruptedException {
		Assert.assertEquals(laptopNoteBooksPageObject.getMessageSonyVAIO(), 0, 0);
		logger.info("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!");
		Utils.takeScreenShot();
		Thread.sleep(2000);

		
	}

	@When("User click on {string} item")
	public void user_click_on_item(String string) throws InterruptedException {
		laptopNoteBooksPageObject.UserClickMacBookPro();
		logger.info(" And User click on heart icon to add 'Sony VaIO'laptop to wish list");
		Thread.sleep(2000);
	}

	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) throws InterruptedException {
		Assert.assertTrue(laptopNoteBooksPageObject.ShouldSeePriceTagePresent());
		logger.info(" Then User should see '$2,000.00' price tag is present on UI");
		Utils.takeScreenShot();
		Thread.sleep(2000);
	}

	
	
	}	