package tek.bdd.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.bdd.project.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{
	
	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath="//img[@id='profileImage']")
	public WebElement profileImage;
	
	@FindBy(id = "nameInput")
	public WebElement profileNameInputField;
	
	@FindBy(id= "personalPhoneInput")
	public WebElement profilePhoneNumberInputField;
	
	
	@FindBy(xpath ="//button[text()='Update']")
	public WebElement profileUpdateButton;
	
	@FindBy(xpath = "//div[contains(text(),'Personal Information Updated Successfully')]")
	public WebElement personalInfoUpdateSuccessMessage;
	
	
//	@FindBy(xpath = "//img[@id='profileImage']")
//	public WebElement profilePicture;
	
	@FindBy(xpath = "//h1[contains(text(),'Ahad')]")
	public WebElement profileNameText;
	
	@FindBy(xpath = "//h1[contains(text(),'1aaiqbal@gmail.com')]")
	public WebElement profileEmailText;
	
	
	@FindBy(xpath = "//input[@id='previousPasswordInput']")
	public WebElement profilePreviousPassword;
	
	@FindBy(xpath = "//input[@id='newPasswordInput']")
	public WebElement profileNewPassword;
	
	@FindBy(xpath = "//input[@id='confirmPasswordInput']")
	public WebElement profileConfirmPassword;
	
	@FindBy(xpath = "//button[@id='credentialsSubmitBtn']")
	public WebElement profileChangePassword;
	
	@FindBy(xpath = "//div[contains(text(),'Password Updated Successfully')]")
	public WebElement newPasswordUpdateSuccessfrully;
	
	
	
	
	@FindBy(xpath = "//p[contains(text(),'Add a payment method')]")
	public WebElement addAPaymentMethodLink;
	
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
	
	@FindBy(xpath = "//div[contains(text(),'Payment Method added sucessfully')]")
	public WebElement pamentMethodAddedSucessfully;

	
	@FindBy(xpath = "//div[@class='account__payments']//div[2]//div[2]")
	public WebElement clickOnCard;
	
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement editOption;
	

	
	@FindBy(xpath = "//div[contains(text(),'Payment Method updated Successfully')]")
	public WebElement paymentMethodUpdatedSuccessfullyMassage;
	
	@FindBy(xpath = "//button[contains(text(),'remove')]")
	public WebElement removeOption;
	
	@FindBy(xpath = "//h1[contains(text(),'Wallet')]")
	public WebElement walletText;
	
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]")
	public WebElement addAddressOption;
	
	
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
	
	
	@FindBy(id = "addressBtn")
	public WebElement addYourAddressButton;
	
	@FindBy(xpath = "//div[contains(text(),'Address Added Successfully')]")
	public WebElement addressAddedSuccessfully;
	
	
	@FindBy(xpath = "//button[contains(text(),'Edit')]")
	public WebElement addAddressEditOption;
	
	@FindBy(xpath = "//div[contains(text(),'Address Updated Successfully')]")
	public WebElement addressUpdatedSuccessfully;
	
	@FindBy(xpath = "//button[contains(text(),'Remove')]")
	public WebElement addressRemoveOption;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/*[1]")
	public WebElement addingAddressSign;
	
	
	

	
}
