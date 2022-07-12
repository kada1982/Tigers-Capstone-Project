package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	
		 public RetailPageObject() {

			 PageFactory.initElements(driver, this);

		  }

			 @FindBy(xpath = "//a[text() ='TEST ENVIRONMENT']")
			private WebElement testEnviromentText;

			 @FindBy(xpath = "//span[text()='My Account']")
			private WebElement MyAccountButton;

			 @FindBy(xpath = "//a[text() ='Login']")
			private WebElement longinlink;

			 @FindBy(id = "input-email")
			private WebElement userNameField;

			 @FindBy(id = "input-password")
			private WebElement passwordFiled;

			 @FindBy(xpath = "//input[@class='btn btn-primary']")
			private WebElement loginButton;

			 @FindBy(xpath = "//h2[text()='My Account']")
			private WebElement MyAccountdashboard;
//
			 @FindBy(css = "#content > ul:nth-child(6) > li > a")
			private WebElement RegisterForAnAffiliateAccount;

			 @FindBy(id="input-company")
			private WebElement CompanyName;

			 @FindBy(id="input-website")
			 		
			private WebElement WebSiteName;

			 @FindBy(id="input-tax")
			 		//input[@id='input-tax']")
			private WebElement TaxIdNumber;
			 @FindBy(xpath = "//input[@value='bank']")
				private WebElement bankButton;
			 @FindBy(id = "input-cheque")
			private WebElement ChequePayeeName;

			 @FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
			private WebElement CheckBox;

			 @FindBy(xpath = "//input[@type='submit']")
			private WebElement ContinueButton;

			 @FindBy(css = "#account-account > div.alert.alert-success.alert-dismissible")
			private WebElement AffiliatSuccessMessage;

			 @FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li[1]/a")
			private WebElement EditYourAffiliateInformation;
			

			 @FindBy(xpath = "//input[@value='bank']")
			private WebElement BankTransferRadioButton;

			 @FindBy(xpath = "//input[@name='bank_name']")
			private WebElement BankName1;

			 @FindBy(xpath = "//input[@name='bank_branch_number']")
			private WebElement AbaNumber1;

			 @FindBy(xpath = "//input[@name='bank_swift_code']")
			private WebElement SwiftCode1;

			 @FindBy(xpath = "//input[@name='bank_account_name']")
			private WebElement AccountName1;

			 @FindBy(xpath = "//input[@name='bank_account_number']")
			private WebElement AccountNumber1;

			 @FindBy(xpath = "//input[@value='Continue']")
			private WebElement ClickOnContinueButton;

			 @FindBy(xpath = "//input[@name='bank_account_number']")
			private WebElement EditSuccessMessageEditAff;

			 @FindBy(xpath = "//a[text()='Edit your account information']")
			private WebElement EditAccountInformation;

			 @FindBy(xpath = "//input[@id='input-firstname']")
			private WebElement EditfirstName;

			 @FindBy(xpath = "//input[@id='input-lastname']")
			private WebElement EditLastName;

			 @FindBy(xpath = "//input[@id='input-email']")
			private WebElement EditEmail;

			 @FindBy(xpath = "//input[@id='input-telephone']")
			private WebElement EditTelephone;

			 @FindBy(xpath = "//input[@value='Continue']")
			private WebElement ContinueButton1;

			 @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
			private WebElement EditSuccessMessage1;


			public String getTextEnvironmentText() {
			String UiText = testEnviromentText.getText();
			return UiText;
			}
			public void ClickmyAccountButton() {
			MyAccountButton.click();
			}
			public void ClickOnlonginlink() {
			longinlink.click();
			}
			public void enterEmailAdress(String email) {
			userNameField.sendKeys(email);
			}
			public void enterPassword(String password) {
			passwordFiled.sendKeys(password);
			}
			public void clickOnLoginButton() {
			loginButton.click();
			}
			public String loggedInToMyAccountDashBoardText() {
				String DashBoardText = MyAccountdashboard.getText();
				return DashBoardText;
			}
			public void RegisterForAnAffiliateAccount() {
				RegisterForAnAffiliateAccount.click();
			}
			public void enterCompanyName(String company) {
				CompanyName.clear();
				CompanyName.sendKeys(company);
		
			}
			public void enterWebSite(String website) {
				WebSiteName.clear();
			WebSiteName.sendKeys(website);
			}
			public void enterTaxId(String taxID) {
				TaxIdNumber.clear();

			TaxIdNumber.sendKeys(taxID);
			}
			public void enterchequeName(String paymentMethod) {
				ChequePayeeName.clear();
				ChequePayeeName.sendKeys(paymentMethod);
			}
			public void clickOnCheckBox() {
			CheckBox.click();
			}
			public void clickOnContinueButton() {
			ContinueButton.click();
			}
			public String getAffiliatSuccessMessage() {
			String actualMessage = AffiliatSuccessMessage.getText();
			return actualMessage;
			}
			public void clickOnEditYourAffiliateInformation() {
			EditYourAffiliateInformation.click();
			}
			public void clickOnBankTransferRadioButton() {
			BankTransferRadioButton.click();
			}
			public String enterBankName(String bankName) {
				BankName1.clear();

			BankName1.sendKeys(bankName);
			return bankName;
			}
			public String enterAbaNumber(String AbaNumber) {
				AbaNumber1.clear();

			AbaNumber1.sendKeys(AbaNumber);
			return AbaNumber;
			}
			public String enterSwiftCode(String SwiftCode) {
				SwiftCode1.clear();

			SwiftCode1.sendKeys(SwiftCode);
		
			return SwiftCode;
			}
			public String enterAccountName(String AccountName) {
				AccountName1.clear();

			AccountName1.sendKeys(AccountName);
			return AccountName;
			}
			public void enterAccountNumber(String AccountNumber) {
				//AccountNumber1.clear();
				AccountNumber1.sendKeys(AccountNumber);
			//return AccountNumber;
			}
			public void clickOnClickOnContinueButton() {
			ClickOnContinueButton.click();
			}
			public String getEditSuccessMessage() {
			String actualMessage = EditSuccessMessageEditAff.getText();
			return actualMessage;
			}
			public void clickOnEditAccountInformation() {
			EditAccountInformation.click();
			}
			public String enterEditfirstName(String firstName) {
				EditfirstName.clear();

			EditfirstName.sendKeys(firstName);
			return firstName;
			}
			public String enterEditLastName(String lastName) {
				EditLastName.clear();

			EditLastName.sendKeys(lastName);
			return lastName;
			}
			public String EditEmail(String email) {
				EditEmail.clear();

			EditEmail.sendKeys(email);
			return email;
			}
			public String EditTelephone(String telephone) {
				EditTelephone.clear();

			EditTelephone.sendKeys(telephone);
			return telephone;
			}
			public void ContinueButton1() {
			ContinueButton1.click();
			}
			public String getEditSuccessMessage1() {
			String actualMessage = EditSuccessMessage1.getText();
			return actualMessage;
			}
			}
