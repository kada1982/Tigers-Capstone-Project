package page.objects;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;



public class DesktopPageObject extends Base {
	public  DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement Desktops;
	public void  clickOnDesktops() {
		Desktops.click();
	}
	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement ShowAllDesktops;
	public void clickShowAllDesktops () {
		ShowAllDesktops.click();
	}
	@FindBy(tagName = "img")

    private List<WebElement> items;



    public List<WebElement> itemsDeskTops() {

        List<WebElement> itemsOnDeskTop = items;

        return itemsOnDeskTop;



	}
	@FindBy(xpath = "//h4//a[text()='HP LP3065']")
	private WebElement selectTOCARTHPLP3065;
	public void AddTOCARTHPLP3065() {
		selectTOCARTHPLP3065.click();	
	}
	@FindBy(id = "input-quantity")

    private WebElement quantity;
    public void selectQuantity(String string) {
        quantity.clear();

        quantity.sendKeys(string);

   
	}
	@FindBy(id="button-cart")
	private WebElement AddToCartHP;
	public void ClickOnAddToCartHP() {
		AddToCartHP.click();
	}
	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
	
	private WebElement HPSuccessMessage;
	public boolean HPSuccessMessageforHp() {

        boolean productComparisonMessage = HPSuccessMessage.isDisplayed();

        return productComparisonMessage;

        
		
	}
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement CanonEOS;
	public void UserclickADDTOCanonEOS() {
		CanonEOS.click();
	}
	@FindBy(css = "#input-option226 > option:nth-child(2)")
	private WebElement SelectColor;
	public void UserSelectColor() {
		SelectColor.click();
	}
	@FindBy(xpath = "//*[@id='input-quantity']")
	private WebElement Selectquantity1;
	public void UserSelectquantity1(String string) {
		Selectquantity1.sendKeys();
	}
	@FindBy(xpath = "//*[@id='input-quantity']")
	private WebElement AddCanonToCartBattun;
	public void UserAddCanonToCartBattun() {
		AddCanonToCartBattun.click();
	}
	@FindBy(xpath = "//*[@id='product-product']/div[1]")
	private WebElement SuccessMessageForCanon1;
	public boolean SuccessMessageForCanon1() {

        boolean productComparisonMessage = SuccessMessageForCanon1.isDisplayed();

        return productComparisonMessage;



	}
	
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement ClickONCanonEOS;
	public void UserClickONCanonEOS() {
		ClickONCanonEOS.click();
	}
	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement clickOnWriteAReview ;
	public void UserclickOnWriteAReview() {
		clickOnWriteAReview.click();
	}
	@FindBy(xpath = "//*[@id=\"input-name\"]")
	private WebElement FillYourNameReview;
	public void UserFillYourNameReview(String name) {
		FillYourNameReview.clear();
		FillYourNameReview.sendKeys(name);
	}
	
	@FindBy(xpath = "//textarea[@name='text']")
	private WebElement FillYourreview;
	public void userFillYourReview(String review) {
		FillYourreview.clear();
		FillYourreview.sendKeys(review);
	}
	@FindBy(xpath = "//*[@id=\"input-review\"]")
	private List <WebElement> Rating;
	public void selectRating(String RatingValue) {
        List<WebElement> ratingElements = Rating;
        for (WebElement element : ratingElements) {

            if (element.getAttribute("value").equalsIgnoreCase(RatingValue.trim())) {

                element.click();

                break;

            }
        }
        }
	@FindBy(xpath = "//*[@id=\"input-name\"]")
	private WebElement UserclickonContinuebutton3;
	public void UserClickonContinuebutton3() {
		UserclickonContinuebutton3.click();
	}
	@FindBy(xpath = "//*[@id=\"form-review\"]/div[2]")
	private WebElement SuccessMessageForCanon;
	public boolean SSuccessMessageForCanon() {

        boolean productComparisonMessage = SuccessMessageForCanon1.isDisplayed();

        return productComparisonMessage;
      
	
	}
	
}
