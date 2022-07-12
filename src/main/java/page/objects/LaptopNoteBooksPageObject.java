package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base{
	public  LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(xpath = "//*[@href=\"http://tek-school.com/retail/index.php?route=product/category&path=18\"]")
		private WebElement LaptopNoteBook;
		public void  clickonLaptopNoteBooktab() {
			LaptopNoteBook.click();
}
		@FindBy(css = "#menu > div.collapse.navbar-collapse.navbar-ex1-collapse > ul > li:nth-child(2) > div > a")
		private WebElement LaptopNoteBookTab;
		public void clickShowAllLaptopNoteBook () {
			LaptopNoteBookTab.click();
		}
		@FindBy(xpath = "//a[text()='MacBook']")
		private WebElement MacBook;
		public void clickonMacBookitem () {
			MacBook.click();
		}
		@FindBy(id="button-cart")
		private WebElement addtoCartbutton;
		public void clickonaddtoCartbutton () {
			addtoCartbutton.click();
		}
		
		@FindBy(css="#product-product > div.alert.alert-success.alert-dismissible > a:nth-child(1)")
	    private WebElement MacSuccessMsg;
		public String GetMacSuccessMsg() {
	        String MacActualMsg ="Success: You have added "+MacSuccessMsg.getText()+" to your shopping cart!";
	        return MacActualMsg;
	    
	    
		}
		@FindBy(xpath="//*[@id=\"cart\"]/button")

	    private WebElement oneItemShowedToCart ;

	    public boolean oneItemShowedToCartmacbook() {

	        boolean oneItemShowedToCartmacbook = oneItemShowedToCart.isDisplayed();

	        return oneItemShowedToCartmacbook;

	        }
		
@FindBy(id="button-cart")
private WebElement itemsshowedtothecart;
public void itemsshowedtothecart () {
	itemsshowedtothecart.click();
}

@FindBy(id="cart-total")
private WebElement clickoncartoption;
public void userclickoncartoption () {
	clickoncartoption.click();
}

@FindBy(xpath="//button[@title='Remove']")
private WebElement redXbutton;
public void userclickonredXbutton () {
	redXbutton.click();
}	
@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
private WebElement noItemsAddtothecart;
public void noItemsAddtothecart() {
    noItemsAddtothecart.isDisplayed();

}
@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[3]")
private WebElement comparisonicononMacBook;
public void userclickoncomparisonicononMacBook() {
	comparisonicononMacBook.click();
}	
@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]")
private WebElement makBookAirCompareButton;
public void ClickOnMacAirIcon() {
    makBookAirCompareButton.click();

}	
@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
private WebElement SuccessMacBookAirtoyourproduct;
public String getSuccessMacBookAir() {
	String MacBookAirtActualMsg ="Success: You have added MacBook Air to your product comparison!";	
	return MacBookAirtActualMsg;
}
@FindBy(xpath = "//a[text()='product comparison']")
private WebElement comparisonlink;
public void usercliccomparisonlink() {
	comparisonlink.click();
}
@FindBy(xpath = "/html/body/div[2]")
private WebElement comparisonchart;
public void usercliccomparisonchart() {
	comparisonchart.click();
}
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]/i")
	private WebElement HeartIconSonyVaio;
	public void UserClickOnheartIconSonyVaio() {
		HeartIconSonyVaio.click();
	}
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement  MessageSonyVAIO ;
	public String getMessageSonyVAIO() {
		String SonyVAIOActualMsg =" You must login or create an account to save Sony VAIO to your wish list!";	
		return SonyVAIOActualMsg;
	}
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[4]/div/div[2]/div[1]/h4/a")
	private WebElement MacBookPro;
	public void UserClickMacBookPro() {
		MacBookPro.click();	
	}
	@FindBy(xpath="//span[@id='cart-total']")

    private WebElement PriceTagePresent ;

    public boolean ShouldSeePriceTagePresent() {

        boolean ShouldSeePriceTagePresent = PriceTagePresent.isDisplayed();

        return ShouldSeePriceTagePresent;

}
}