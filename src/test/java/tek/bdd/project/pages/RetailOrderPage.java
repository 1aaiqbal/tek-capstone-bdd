package tek.bdd.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.bdd.project.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(xpath = "//*[text()='Orders']")
	public WebElement orderButton;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]")
	public WebElement firstOrderInLest;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")
	public WebElement cancelTheOrderButton;
	
	@FindBy(xpath = "//*[text()='Bought wrong item']")
	public WebElement cancelationReason;
	
	@FindBy(xpath = "//*[@id='orderSubmitBtn']")
	public WebElement cancelOrderButton;
	
	@FindBy(xpath = "//*[contains(text(),'Your Order Has Been Cancelled')]")
	public WebElement orderCancelledMessage;
	
	
	
	@FindBy(xpath = "//*[@id='returnBtn']")
	public WebElement returnItemsButton;
	
	@FindBy(xpath = "//*[text()='Bought wrong item']")
	public WebElement returnReason;
	
	@FindBy(xpath = "//*[text()='FedEx']")
	public WebElement dropOfService;
	
	@FindBy(xpath = "//*[@id='orderSubmitBtn']")
	public WebElement returnOrderButton;
	
	@FindBy(xpath = "//*[text()='Return was successfull']")
	public WebElement cancelationReturnMessage;
	
	
	
	@FindBy(xpath = "//*[@id='reviewBtn']")
	public WebElement reviewaButton;
	
	@FindBy(xpath = "//*[@id='headlineInput']")
	public WebElement addAHeadlineInput;
	
	@FindBy(xpath = "//*[@id='descriptionInput']")
	public WebElement addAWrittenInput;
	
	@FindBy(xpath = "//*[@id='reviewSubmitBtn']")
	public WebElement addYourReviewButton;
	
	@FindBy(xpath = "//*[text()='Your review was added successfully']")
	public WebElement addedReviewMessage;

}
