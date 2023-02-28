package tek.bdd.project.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.bdd.project.base.BaseSetup;

public class RetailHomePage extends BaseSetup{
	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// syntax for finding UI elements and storing them in POM classes 
	/**
	 * @FindBy(locatorType = "value")
	 * public WebElement nameOfElement
	 */
	
	@FindBy(xpath="//a[text()='TEKSCHOOL']")
	public WebElement tekSchoolLogo;
	
	@FindBy(id ="search")
	public WebElement allDepartmentDropDown;
	
	@FindBy(css = "#searchInput")
	public WebElement searchBar;
	
	@FindBy(xpath = "//button[@id='searchBtn']")
	public WebElement searchButton; 
	
	@FindBy(xpath ="//img[contains(@alt, 'Pokemon')]")
	public WebElement pokemanProductImage;
	
	@FindBy(linkText = "Sign in")
	public WebElement signInButton;
	
	@FindBy(xpath = "//p[contains(text(),'Cart')]")
	public WebElement cartButton;
	
	@FindBy(id ="accountLink")
	public WebElement accountOption;
	
	@FindBy(id = "hamburgerBtn")
	public WebElement allIcon;
	
	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarElements;
	
	@FindBy(xpath = "//span[text()='Electronics']")
	public WebElement electronicsSideBar;
	
	@FindBy(xpath ="//span[text()='Computers']")
	public WebElement computersSideBar;
	
	@FindBy(xpath="//span[text()='Smart Home']")
	public WebElement smartHomeSideBar;
	
	@FindBy(xpath ="//span[text()='Sports']")
	public WebElement sportsSideBar;
	
	@FindBy(xpath ="//span[text()='Automative']")
	public WebElement automativeSideBar;
	

	@FindBy(xpath ="//div[@class='sidebar_content-item']/span")
	public List<WebElement> sideBarOptionElements;
	
	
	@FindBy(xpath ="//p[contains(text(),'Smart Home Lightning')]")
	public WebElement smartHomeCategory;

	
	@FindBy(xpath ="//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/img[1]")
	public WebElement kasaOutdoorLink;
	
	@FindBy(xpath ="//p[contains(text(),'Kasa Outdoor Smart Plug')]")
	public WebElement kasaOutdoorLPicture;
	
	@FindBy(xpath = "//option[contains(text(),'2')]")
	public WebElement qtyDropDown;
	
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	public WebElement addToCartButton;
	
	@FindBy(xpath = "//*[text()='Cart ']")
	public WebElement cartOption;
	
	@FindBy(xpath = "//*[text()='Proceed to Checkout']")
	public WebElement proceedToCheckoutButton;
	
	@FindBy(xpath = "//button[@id='addAddressBtn']")
	public WebElement addANewAddressButton;
	
	
	@FindBy(id = "countryDropdown")
	public WebElement contryDropDown;
	
	@FindBy(id = "fullNameInput")
	public WebElement fullNameInput;
	
	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInput;
	
	@FindBy(id = "streetInput")
	public WebElement streetAddressInput;
	
	@FindBy(id = "apartmentInput")
	public WebElement apartmentInput;
	
	@FindBy(id = "cityInput")
	public WebElement cityInput;
	
	@FindBy(xpath = "//body/div[@id='root']/div[3]/div[2]/div[1]/div[1]/form[1]/div[5]/div[2]/div[1]/div[1]/select[1]")
	public WebElement stateSelect;
	
	@FindBy(xpath = "//input[@id='zipCodeInput']")
	public WebElement zipCodeInput;
	
	@FindBy(id = "//button[@id='addressBtn']")
	public WebElement addYourAddressButton;
	
	
	@FindBy(xpath = "//button[@id='addPaymentBtn']")
	public WebElement AddCreditOrDebitCardForPaymentMethod;
	
	@FindBy(id = "cardNumberInput")
	public WebElement cardNumber;
	
	@FindBy(id = "nameOnCardInput")
	public WebElement nameOnCard;
	
	@FindBy(id = "expirationMonthInput")
	public WebElement expirationMonth;
	
	@FindBy(id = "expirationYearInput")
	public WebElement expitationYear;
	
	@FindBy(id = "securityCodeInput")
	public WebElement securityCode;
	
	@FindBy(id = "paymentSubmitBtn")
	public WebElement addYourCardButton;
	
	@FindBy(xpath = "//button[@id='placeOrderBtn']")
	public WebElement placeYourOrderBottun;
	
	@FindBy(xpath = "//div[contains(text(),'Order Placed Successfully')]")
	public WebElement orderPlacedSuccessfullyMessage;
	
	
	@FindBy(xpath = "//*[text()='TV & Video']")
	public WebElement electronicsCategory;
	
	@FindBy(xpath = "//*[text() = 'Apex Legends - 1,000 Apex Coins']")
	public WebElement apexLegendsItem;
	
	@FindBy(xpath = "//*[text() = '5']")
	public WebElement changedQtyAtcart;
	




	
}
