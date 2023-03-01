package tek.bdd.project.steps;

import java.util.List;


import org.junit.Assert;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.bdd.project.pages.POMFactory;
import tek.bdd.project.utilities.CommonUtility;
import tek.bdd.project.utilities.DataGeneratorUtility;


public class HomeSteps extends CommonUtility {
	
	private POMFactory factory = new POMFactory();
	
	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekSchoolLogo));
		logger.info("user is on retail website");
		logger.info("Actual Title " + actualTitle + " Equals " + " ExpectedTitle " + expectedTitle);
		
	}
	
	@When("User search for {string} product")
	public void userSearchForProduct(String productValue) {
		sendText(factory.homePage().searchInputField, productValue);
		click(factory.homePage().searchButton);
		logger.info("user searched for product "+ productValue );
		
		
		
	}
	
	@Then("The product should be displayed")
	public void theProductShouldBeDisplayed()  {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemanProductImage));
		logger.info("Pokeman picture is displayed on home page");
		
	
	}
	@Then("The sign in button should be present")
	public void theSignInButtonShouldBePresent()  {
		Assert.assertTrue(isElementDisplayed(factory.homePage().signInButton));
		logger.info("The SignIn button is present ");
		

	}
	@Then("The cart button should be present")
	public void theCartButtonShouldBePresent()  {
		Assert.assertTrue(isElementDisplayed(factory.homePage().cartButton));
		logger.info("The cart button is present");
	}
	@When("User click on All section")
		public void userClickOnAllSection() {
		click(factory.homePage().allIcon);
		logger.info("User click on All section");
	
	}
	@Then("below options are present in shop by department sidebar")
	public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
		List<List<String>> expectedSideBar = dataTable.asLists(String.class);

//		List<WebElement> actualSideBar = factory.homePage().sideBarElements;
//
//		for (int i = 0; i < expectedSideBar.get(0).size(); i++) {
//			Assert.assertEquals(actualSideBar.get(i).getText(), expectedSideBar.get(0).get(i));
//			logger.info(actualSideBar.get(i).getText() + " is equal to " + expectedSideBar.get(0).get(i));
	//	}
		Assert.assertEquals(expectedSideBar.get(0).get(0), factory.homePage().electronicsSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(1), factory.homePage().computersSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(2), factory.homePage().smartHomeSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(3), factory.homePage().sportsSideBar.getText());
		Assert.assertEquals(expectedSideBar.get(0).get(4), factory.homePage().automativeSideBar.getText());
		logger.info("actual is equal to expected");
		}
	@When("User on {string}")
	public void userOnElectronics(String department) {
		List<WebElement> sideBarOptions = factory.homePage().sideBarElements;
		for (WebElement option : sideBarOptions) {
			if (option.getText().equals(department)) {
				click(option);
				try {
					logger.info(option.getText() + " is present ");
				} catch (StaleElementReferenceException e) {

				}
				break;
			}
		}

	}

	@Then("below options are present in department")
	public void belowOptionsArePresentInDepartment(DataTable dataTable) {

		List<List<String>> expectedDepartmentOptions = dataTable.asLists(String.class);
		List<WebElement> actualDepartmentOptions = factory.homePage().sideBarOptionElements;

		for (int i = 0; i < expectedDepartmentOptions.get(0).size(); i++) {
			for (WebElement dept : actualDepartmentOptions) {
				if (dept.getText().equals(expectedDepartmentOptions.get(0).get(i))) {
					Assert.assertTrue(isElementDisplayed(dept));
					logger.info(dept.getText() + " is present ");
				}
			}
		}
	}
	

	@When("User change the category to {string}")
	public void userChangeTheCategoryTo(String value) {
		selectByVisibleText(factory.homePage().allDepartments, value);
		logger.info(value + " was selected from the drop down");

	}
@Given("User search for an item {string}")
public void userSearchForAnItem(String smartHomeProduct) {
		sendText(factory.homePage().searchInputField, smartHomeProduct);
		click(factory.homePage().searchButton);
		logger.info("user search for kasa outdoor plug " + smartHomeProduct);

}
@Given("User click on item")
public void userClickOnItem() {
	click(factory.homePage().kasaOutdoorLPicture);
	logger.info("User clicked on kasa outdoor plug");

}
@Given("User select quantity {string}")
public void userSelectQuantity(String qtyTwo) {
	selectByValue(factory.homePage().qtyDropDown, "2");
	click(factory.homePage().qtyDropDown);
	logger.info("User select quantity " + qtyTwo);
	
}
@Given("User click add to Cart button")
public void userClickAddToCartButton() {
	click(factory.homePage().addToCartButton);
	logger.info("User clicked on Add to Cart button");
 
}
@Then("the cart icon quantity should change to {string}")
public void theCartIconQuantityShouldChangeTo(String expectedQty) {
	Assert.assertTrue(isElementDisplayed(factory.homePage().cartButton));
	logger.info("The cart qty changed");
	

}
@Then("User click on Cart option")
public void userClickOnCartOption() {
	click(factory.homePage().cartOption);
	logger.info("User clicked on cart button");

}
@Then("User click on Proceed to Checkout button")
public void userClickOnProceedToCheckoutButton() {
	click(factory.homePage().proceedToCheckoutButton);
	logger.info("User clicked on chechout Button");

}
@Then("User click Add a new address link for shipping address")
public void userClickAddANewAddressLinkForShippingAddress() {
	click(factory.homePage().addANewAddressButton);
	logger.info("User clicked on shipping's add a new address");
	
}
	@When("User fill a new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<List<String>> cartAddANewAddress = dataTable.asLists(String.class);
		selectByVisibleText(factory.homePage().contryDropDown,DataGeneratorUtility.data(cartAddANewAddress.get(0).get(0)));
		sendText(factory.homePage().fullNameInput,DataGeneratorUtility.data(cartAddANewAddress.get(0).get(1)));
		sendText(factory.homePage().phoneNumberInput,DataGeneratorUtility.data(cartAddANewAddress.get(0).get(2)));
		sendText(factory.homePage().streetAddressInput,DataGeneratorUtility.data(cartAddANewAddress.get(0).get(3)));
		sendText(factory.homePage().apartmentInput,DataGeneratorUtility.data(cartAddANewAddress.get(0).get(4)));
		sendText(factory.homePage().cityInput,DataGeneratorUtility.data(cartAddANewAddress.get(0).get(5)));
		selectByVisibleText(factory.homePage().stateSelect,DataGeneratorUtility.data(cartAddANewAddress.get(0).get(6)));
		sendText(factory.homePage().zipCodeInput,DataGeneratorUtility.data(cartAddANewAddress.get(0).get(7)));
		logger.info("User filled new address form on cart section");
}
@Then("User click Add Your Address button")
public void userClickAddYourAddressButton() {
	click(factory.homePage().addYourAddressButton);
	logger.info("User clicked Add Your Address button");

}
@Then("User click Add a credit card or Debit Card for Payment method")
public void userClickAddACreditCardOrDebitCardForPaymentMethod() {
	click(factory.homePage().AddCreditOrDebitCardForPaymentMethod);
	logger.info("User clicked Add credit or debit");
	
}
@When("User fill a Debit or credit card information")
public void userFillDebitOrCreditCardInfo(DataTable dataTable) {
	List<List<String>> addDebitOrCreditCard = dataTable.asLists(String.class);
clearTextUsingSendKeys(factory.homePage().cardNumber);
clearTextUsingSendKeys(factory.homePage().nameOnCard);
clearTextUsingSendKeys(factory.homePage().expirationMonth);
clearTextUsingSendKeys(factory.homePage().expitationYear);
clearTextUsingSendKeys(factory.homePage().securityCode);
sendText(factory.homePage().cardNumber,DataGeneratorUtility.data(addDebitOrCreditCard.get(0).get(0)));
sendText(factory.homePage().nameOnCard,DataGeneratorUtility.data(addDebitOrCreditCard.get(0).get(1)));
sendText(factory.homePage().expirationMonth,DataGeneratorUtility.data(addDebitOrCreditCard.get(0).get(2)));
sendText(factory.homePage().expitationYear,DataGeneratorUtility.data(addDebitOrCreditCard.get(0).get(3)));
sendText(factory.homePage().securityCode,DataGeneratorUtility.data(addDebitOrCreditCard.get(0).get(4)));
logger.info("User Filled Debit or Credit card form");

}
@Then("User click on Add your card option")
public void userClickOnAddYourCardButton() {
	click(factory.homePage().addYourCardButton);
	logger.info("User clicked on Add Your card button");

}
@Then("User click on Place Your Order")
public void userClickOnPlaceYurOrder() {
	click(factory.homePage().placeYourOrderBottun);
	logger.info("User clicked on Place your order");
	
}
@Then("message displayed {string}")
public void massageShouldBeDisplayed(String expectedMessage) {
	waitTillPresence(factory.homePage().orderPlacedSuccessfullyMessage);
	Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedSuccessfullyMessage));
	logger.info("massage displayed " + expectedMessage);
	
}


@Given("User Change the category to {string}")
public void changeTheCategoryTo(String electronics) {
 click(factory.homePage().electronicsCategory);
 logger.info("User change category to " + electronics);
 
}
@Given("User Search for an item {string}")
public void searchForAnItem(String apexLegends) {
	sendText(factory.homePage().searchInputField, apexLegends);
	logger.info("User searched " + apexLegends);

}
@Given("User Click on Search icon")
public void clickOnSearchIcon() {
	click(factory.homePage().searchButton);
	logger.info("User clicked on search Icon");

}
@Given("User Click on item")
public void clickOnItem() {
	click(factory.homePage().apexLegendsItem);
	logger.info("User clicked on Item");
	
}
@Given("User Select quantity {string}")
public void selectQuantity(String productQyt) {
	selectByVisibleText(factory.homePage().qtyDropDown, "5");
	logger.info("User selected "+ productQyt);

}
@Given("User Click add to Cart button")
public void clickAddToCartButton() {
	click(factory.homePage().addToCartButton);
	logger.info("User clicked add to cart button");
	

}
@Then("The Cart icon quantity should change to {string}")
public void cartIconQuantityShouldChangeTo(String changedQty) {
	Assert.assertTrue(isElementDisplayed(factory.homePage().changedQtyAtcart));
	logger.info("The cart quantity changed to " + changedQty);

}
@Then("User Click on Cart option")
public void clickOnCartOption() {
	click(factory.homePage().cartOption);
	logger.info("User clicked at cart option");

}
@Then("User Click on Proceed to Checkout button")
public void clickOnProceedToCheckoutButton() {
	click(factory.homePage().proceedToCheckoutButton);
	logger.info("User clicked at proceed to checkout");

}
@Then("User Click on Place Your Order")
public void userClickOnPlaceYourOrder() {
	click(factory.homePage().placeYourOrderBottun);
	logger.info("User clicked at place Your order");

}
@Then("a Message should be displayed {string}")
public void aMessageShouldBeDisplayed(String orderPlacedMessage) {
	waitTillPresence(factory.homePage().orderPlacedSuccessfullyMessage);
	Assert.assertTrue(isElementDisplayed(factory.homePage().orderPlacedSuccessfullyMessage));
	logger.info("massage displayed " + orderPlacedMessage);


}
}