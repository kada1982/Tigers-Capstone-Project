package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base {
	RetailPageObject retailPageObject = new RetailPageObject();
	@Given("User is on Retail website")
	public void user_is_on_retail_website() throws InterruptedException {
	String expectedText = "TEST ENVIRONMENT";
	String actualText = retailPageObject.getTextEnvironmentText();
	Assert.assertEquals(expectedText, actualText);
	logger.info("text test Environment was verified");
	Thread.sleep(2000);
	
	}

	@Given("User click on MyAccount")
	public void User_click_on_MyAccount() throws InterruptedException {
	retailPageObject.ClickmyAccountButton();
	logger.info("My Accout Button Was Succesfully Clicked");
	Thread.sleep(2000);
	}

	@When("User click on Login")
	public void User_click_on_Login() throws InterruptedException {
	retailPageObject.ClickOnlonginlink();
	logger.info("link was successfully clicked");
	Thread.sleep(2000);
	}

	@When("User enter username 'username’ and password 'password'")
	public void user_enter_username_username_and_password_password() throws InterruptedException {
	retailPageObject.enterEmailAdress("dk20315@gmail.com");
	retailPageObject.enterPassword("123456");
	logger.info("email And Password Were Entered Successfully");
	Thread.sleep(2000);
	}

	 @And("User click on Login button")
	public void User_click_on_Login_button() throws InterruptedException {
	retailPageObject.clickOnLoginButton();
	logger.info("was able to click successfully on login button");
	Thread.sleep(2000);
	}
	 
	 @Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() throws InterruptedException {
	String expectedText = ("My Account");
	String actualText = retailPageObject.loggedInToMyAccountDashBoardText();
	Assert.assertEquals(expectedText, actualText);
	logger.info("user on My Account dashboard ");
	Thread.sleep(2000);
	}

	 @When("User click on 'Register for an Affiliate Account'link")
	 public void User_click_on_Register_for_an_Affiliate_Account_link() throws InterruptedException {
	 retailPageObject.RegisterForAnAffiliateAccount();
	 logger.info("successfully Register For Affiliate Account ");
	 Thread.sleep(2000);
	}

	 @And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) throws InterruptedException {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	retailPageObject.enterCompanyName(data.get(0).get("company"));
	retailPageObject.enterWebSite(data.get(0).get("website"));
	retailPageObject.enterTaxId(data.get(0).get("taxID"));
	retailPageObject.enterchequeName(data.get(0).get("paymentMethod"));
	logger.info("user was able to filled affiated account form");
	Thread.sleep(2000);
	}

	 @And("User check on About us check box")
	public void user_check_on_about_us_check_box() throws InterruptedException {
	retailPageObject.clickOnCheckBox();
	logger.info("User check on About us check box successfully ");
	Thread.sleep(2000);
	}

	 @When("User click on continue button")
	 public void user_click_on_continue_button() throws InterruptedException {
	retailPageObject.clickOnContinueButton();
	logger.info("User clicked on Continue button successfully ");
	Thread.sleep(2000);
	}

	 @Then("User should see a success message")
	public void user_should_see_a_success_message() throws InterruptedException {
	String expectedText = "Success: Your account has been successfully updated.";
	String actualText = retailPageObject.getAffiliatSuccessMessage();
	Assert.assertEquals(expectedText, actualText);
	logger.info("User was able to see the success message ");
	Utils.takeScreenShot();
	Thread.sleep(2000);
	}
//
	 @When("User click on 'Edit your affiliate information'link")
	 public void User_click_on_Edit_your_affiliate_information_link() throws InterruptedException {
	retailPageObject.clickOnEditYourAffiliateInformation();
	logger.info("User clicked on Edit affiliate information link successfully ");
	Thread.sleep(2000);
	}

	 @And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() throws InterruptedException {
	retailPageObject.clickOnBankTransferRadioButton();
	logger.info("user clicked on Bank Transfer radio button successefully");
	Thread.sleep(2000);
	}

	 @And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) throws InterruptedException {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);

	retailPageObject.enterBankName(data.get(0).get("bankName"));
	retailPageObject.enterAbaNumber(data.get(0).get("abaNumber"));
	retailPageObject.enterSwiftCode(data.get(0).get("swiftCode"));
	retailPageObject.enterAccountName(data.get(0).get("accountName"));
	retailPageObject.enterAccountNumber(data.get(0).get("accountNumber"));
	logger.info("user was able to edit affiated account form successfully");
	Thread.sleep(2000);
	}

	 @And("User click on Continue button")
	public void User_click_on_Continue_button() throws InterruptedException {
	retailPageObject.clickOnClickOnContinueButton();
	logger.info("continue button clicked");
	Thread.sleep(2000);
	}

	 @Then("User should see a success Message")
	public void user_should_see_a_success_message1() throws InterruptedException {
	String expectedText = "Success: Your account has been successfully updated.";
	String actualMessage = retailPageObject.getEditSuccessMessage();
	Assert.assertEquals(expectedText, actualMessage);
	logger.info("User was able to see the success message ");
	Utils.takeScreenShot();
	Thread.sleep(2000);
	}
//
	 @When("User click on ‘Edit your account information’ link")
	 public void User_click_on_Edit_your_account_information_link() throws InterruptedException {
	retailPageObject.clickOnEditAccountInformation();
	logger.info("user clicked on Edit your account information link successfully");
	Thread.sleep(2000);
	}

	 @And("User modify below information")
	public void user_modify_below_information(DataTable dataTable) throws InterruptedException {
	List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
	retailPageObject.enterEditfirstName(data.get(0).get("firstName"));
	retailPageObject.enterEditLastName(data.get(0).get("lastName"));
	retailPageObject.EditEmail(data.get(0).get("email"));
	retailPageObject.EditTelephone(data.get(0).get("telephone"));
	logger.info("user was able to modify account information successfully");
	Thread.sleep(2000);
	}

	 @And("User Click on continue button")
	public void User_Click_on_continue_button() throws InterruptedException {
	retailPageObject.clickOnContinueButton();
	logger.info("user clicked on edit acoount info continue button successfully");
	Thread.sleep(2000);
	}

	 @Then("User should see a message {string}")
	 public void user_should_see_a_message(String string) throws InterruptedException {
	String expectedMessage = "Success: Your account has been successfully updated.";
	String actualMessage =retailPageObject.getEditSuccessMessage1();
	Assert.assertEquals(expectedMessage,actualMessage);
	logger.info("the user successfully get: Success: Your account has been successfully updated");
	Utils.takeScreenShot();
	Thread.sleep(2000);

	}
	}

	

	
	

