package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.objects.DesktopPageObject;
import utilities.Utils;


public class DesktopPageStepDefinition extends Base {
	DesktopPageObject desktopPageObject = new DesktopPageObject();
	
	
	/*@Given("user is on Retail home Page")
	public void userIsOnRuser_is_on_retail_home_pageetailHomePage() {
	Assert.assertTrue(desktopPageObject.isLogoDisplayed()); 
	logger.info("user is on Home Page");
	}
*/
	
	@When("User click on Desktops tab")
    public void User_click_on_Desktops_tab() throws InterruptedException {
		desktopPageObject.clickOnDesktops();
		logger.info("Desktops tab was clicked successfully");
		Thread.sleep(2000);
    }

    @When("User click on Show all desktops")

    public void user_click_on_show_all_desktops() throws InterruptedException {
    	desktopPageObject.clickShowAllDesktops();
		logger.info("Show all desktops was clicked successfully");
		Thread.sleep(2000);

    }

    @Then("User should see all items are present in Desktop pag")

    public void User_should_see_all_items_are_present_in_Desktop_pag() throws InterruptedException {
    	 List<WebElement> deskTopElements = desktopPageObject.itemsDeskTops();

         for (WebElement element : deskTopElements) {

             Assert.assertTrue(element.isDisplayed());

             logger.info(element.getAttribute("title") + " is presnt");

             Utils.takeScreenShot();
             Thread.sleep(2000);

         }
    }

		
    @When("User click  ADD TO CART option on HP LP3065item")

    public void user_click_add_to_cart_option_on_hp_lp3065item() throws InterruptedException {
    	desktopPageObject.AddTOCARTHPLP3065();
    	logger.info("HPLP3065 was add to cart successfully");
    	Thread.sleep(2000);
    }

    @When("User select quantity1 {string}")
    public void user_select_quantity(String string) throws InterruptedException {
        desktopPageObject.selectQuantity("1");
        Thread.sleep(2000);
    }
    
    @When("User click add to Cart button1")

    public void User_click_add_to_Cart_button1() throws InterruptedException {
    	desktopPageObject.ClickOnAddToCartHP();
    	logger.info("HPLP3065 was add to cart successfully");
    	Thread.sleep(2000);
    }
    @Then("User should see a message 'Success: you have added HP LP {int} to your Shopping cart!’")
    public void user_should_see_a_message_success_you_have_added_hp_lp_to_your_shopping_cart(Integer int1) throws InterruptedException {
	Assert.assertTrue(desktopPageObject.HPSuccessMessageforHp());
	logger.info("HP LP WAS ADDED TO SHOPPING CART");
	Utils.takeScreenShot();
	Thread.sleep(2000);
	}
    @When("User click ADD TO CART option on Canon EOS 5D item")

    public void User_click_ADD_TO_CART_option_on_CanonEOS_5D_item() throws InterruptedException {
    	desktopPageObject.UserclickADDTOCanonEOS();
		logger.info("CanonEOS was ADD IT successfully");
		Thread.sleep(2000);
    }

    @When("User select color from dropdown Red")

    public void user_select_color_from_dropdown_red() throws InterruptedException {
    	desktopPageObject.UserSelectColor();
		logger.info("color was selected successfully");
		Thread.sleep(2000);
    }
    @When("User select quantity {string}")

    	public void User_select_quantity(String string) throws InterruptedException {
            desktopPageObject.selectQuantity("1");
    		logger.info("Quantity was selected successfully");
    		Thread.sleep(2000);

    }
    @When("User click add to Cart button2")

    public void User_click_add_to_Cart_button2() throws InterruptedException {
    	desktopPageObject.UserclickADDTOCanonEOS();
    	logger.info("CanonEOS was add to cart successfully");
    	Thread.sleep(2000);
    	
    }
    @Then("User should see a Message 'Success: You have added Canon EOS 5D to your shopping cart!’")
    public void user_should_see_a_message_success_you_have_added_canon_eos_5d_to_your_shopping_cart() throws InterruptedException {
    	Assert.assertTrue(desktopPageObject.SuccessMessageForCanon1());
    	logger.info("You have added Canon EOS");
    	Utils.takeScreenShot();
    	Thread.sleep(2000);

	}
    @When("User click on Canon EOS 5D item")

    public void user_click_on_canon_eos_5d_item() throws InterruptedException {
    	desktopPageObject.UserclickADDTOCanonEOS();
    	logger.info("Canon EOS was click2 successfully");
    	Thread.sleep(2000);
    }

    @When("User click on write a review link")

    public void user_click_on_write_a_review_link() throws InterruptedException {
    	desktopPageObject.UserclickOnWriteAReview();
    	logger.info("review link was add to cart successfully");	
    	Thread.sleep(2000);

    }

    @When("user fill the review information with below information")

    public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
    	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
    	desktopPageObject.UserFillYourNameReview(data.get(0).get("yourname"));
    	desktopPageObject.userFillYourReview(data.get(0).get("yourReview"));
    	desktopPageObject.selectRating(data.get(0).get("Rating"));
    	Thread.sleep(2000);
    }

    	@When("User click on Continue button3")
    	public void user_click_on_continue_button3() {
    	desktopPageObject.UserClickonContinuebutton3();
        logger.info("Continue button3 add to cart successfully");	
    	}
    	@Then("User should see a message with {string}.”")
    	public void user_should_see_a_message_with(String string) throws InterruptedException {
        	Assert.assertTrue(desktopPageObject.SSuccessMessageForCanon());
        	Utils.takeScreenShot();

        	Thread.sleep(2000);
}
    	
}