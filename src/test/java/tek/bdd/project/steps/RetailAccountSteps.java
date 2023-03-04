package tek.bdd.project.steps;



import java.util.List;

import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.bdd.project.pages.POMFactory;
import tek.bdd.project.utilities.CommonUtility;
import tek.bdd.project.utilities.DataGeneratorUtility;

public class RetailAccountSteps extends CommonUtility{

	POMFactory factory = new POMFactory();


	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("User clicked on Account Option");

	}
	@When("User update Name {string} and PhoneNumber {string}")
	public void userUpdateNameAndPhoneNumber(String nameValue, String PhoneValue) throws InterruptedException {
		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberInputField);
		sendText(factory.accountPage().profileNameInputField, nameValue);
		sendText(factory.accountPage().profilePhoneNumberInputField, PhoneValue);
		logger.info("user updated name and phone");
		Thread.sleep(4000);
	

	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().profileUpdateButton);
		logger.info("user clicked on Update button");

	}
	@Then("User profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(factory.accountPage().personalInfoUpdateSuccessMessage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdateSuccessMessage));
		logger.info("user profile information updated");
	}
	
	@And("User enter below information")
	public void userEnterBelowInformation(DataTable dataTable) {
		List<List<String>> updatePasswordInfo = dataTable.asLists(String.class);
		clearTextUsingSendKeys(factory.accountPage().profilePreviousPassword);
		clearTextUsingSendKeys(factory.accountPage().profileNewPassword);
		clearTextUsingSendKeys(factory.accountPage().profileConfirmPassword);
		sendText(factory.accountPage().profilePreviousPassword, updatePasswordInfo.get(0).get(0));
		sendText(factory.accountPage().profileNewPassword, updatePasswordInfo.get(0).get(1));
		sendText(factory.accountPage().profileConfirmPassword, updatePasswordInfo.get(0).get(2));
		logger.info("User enter PrePassword NewPassword and confirmPassword ");
	}
	@And("User click on Change password button")
	public void userClickOnChangePassword() {
		click(factory.accountPage().profileChangePassword);
		logger.info("User clicked on Update button");
	}
	
	@Then("a massage should be displayed {string}")
	public void userPasswordShouldBeUpdated(String expectedMessage) {
		waitTillPresence(factory.accountPage().newPasswordUpdateSuccessfrully);
		Assert.assertEquals(expectedMessage, factory.accountPage().newPasswordUpdateSuccessfrully.getText());
		logger.info(expectedMessage + " is displayed");
	}
	
	
	
	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
   click(factory.accountPage().addAPaymentMethodLink);
   logger.info("User clicked on Add Payment Method");
	}
	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<List<String>> addPaymentMethod = dataTable.asLists(String.class);
		
		clearTextUsingSendKeys(factory.accountPage().cardNumber);
		clearTextUsingSendKeys(factory.accountPage().nameOnCard);
		clearTextUsingSendKeys(factory.accountPage().expirationMonth);
		clearTextUsingSendKeys(factory.accountPage().expitationYear);
		clearTextUsingSendKeys(factory.accountPage().securityCode);
		sendText(factory.accountPage().cardNumber, DataGeneratorUtility.data(addPaymentMethod.get(0).get(0)));
		sendText(factory.accountPage().nameOnCard, DataGeneratorUtility.data(addPaymentMethod.get(0).get(1)));
		sendText(factory.accountPage().expirationMonth, DataGeneratorUtility.data(addPaymentMethod.get(0).get(2)));
		sendText(factory.accountPage().expitationYear, DataGeneratorUtility.data(addPaymentMethod.get(0).get(3)));
		sendText(factory.accountPage().securityCode, DataGeneratorUtility.data(addPaymentMethod.get(0).get(4)));
		logger.info("User filled card information field");
	}
	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		   click(factory.accountPage().addYourCardButton);
		   logger.info("User clicked on Add your card button");
	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String string) {
		waitTillPresence(factory.accountPage().pamentMethodAddedSucessfully);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().pamentMethodAddedSucessfully));
		logger.info("a massage should be displayed ");

	}
	@And("User click on card option")
	public void userclickoncardoption() {
		click(factory.accountPage().clickOnCard);
	}
	
	@When("User click on Edit Option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(factory.accountPage().editOption);
		logger.info("User clicked on Edit Option");
	}
	@When("User edit information with below data")
	public void useEditInformationWithBelowData(DataTable dataTable) {
		List<List<String>> editPaymentMethod = dataTable.asLists(String.class);
		
		clearTextUsingSendKeys(factory.accountPage().cardNumber);
		clearTextUsingSendKeys(factory.accountPage().nameOnCard);
		clearTextUsingSendKeys(factory.accountPage().expirationMonth);
		clearTextUsingSendKeys(factory.accountPage().expitationYear);
		clearTextUsingSendKeys(factory.accountPage().securityCode);
		sendText(factory.accountPage().cardNumber,DataGeneratorUtility.data(editPaymentMethod.get(0).get(0)));
		sendText(factory.accountPage().nameOnCard,DataGeneratorUtility.data(editPaymentMethod.get(0).get(1)));
		sendText(factory.accountPage().expirationMonth,DataGeneratorUtility.data(editPaymentMethod.get(0).get(2)));
		sendText(factory.accountPage().expitationYear,DataGeneratorUtility.data(editPaymentMethod.get(0).get(3)));
		sendText(factory.accountPage().securityCode,DataGeneratorUtility.data(editPaymentMethod.get(0).get(4)));
		logger.info("User Edited all payment Method fields");
	}
	@When("User click on Update Your Card button")
	public void userClickOnUdateYourCardButton() {
		click(factory.accountPage().addYourCardButton);
		logger.info("User clicked on Update Your Card button");	
	}
	
	@Then("massage should be displayed {string}")
	public void massageShouldBeDisplayed(String string) {
		waitTillPresence(factory.accountPage().paymentMethodUpdatedSuccessfullyMassage);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().paymentMethodUpdatedSuccessfullyMassage));
		logger.info("a massage should be displayed ");
	}
	
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(factory.accountPage().removeOption);
        logger.info("user clicked on remove option");
	}
	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {
		waitTillPresence(factory.accountPage().walletText);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().walletText));
		logger.info("Payment details are removed");

	}
	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(factory.accountPage().addAddressOption);
		logger.info("User clicked on Add address");

	}
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<List<String>> addANewAddress = dataTable.asLists(String.class);
		selectByVisibleText(factory.accountPage().contryDropDown,DataGeneratorUtility.data(addANewAddress.get(0).get(0)));
		sendText(factory.accountPage().fullNameInput,DataGeneratorUtility.data(addANewAddress.get(0).get(1)));
		sendText(factory.accountPage().phoneNumberInput,DataGeneratorUtility.data(addANewAddress.get(0).get(2)));
		sendText(factory.accountPage().streetAddressInput,DataGeneratorUtility.data(addANewAddress.get(0).get(3)));
		sendText(factory.accountPage().apartmentInput,DataGeneratorUtility.data(addANewAddress.get(0).get(4)));
		sendText(factory.accountPage().cityInput,DataGeneratorUtility.data(addANewAddress.get(0).get(5)));
		selectByVisibleText(factory.accountPage().stateSelect,DataGeneratorUtility.data(addANewAddress.get(0).get(6)));
		sendText(factory.accountPage().zipCodeInput,DataGeneratorUtility.data(addANewAddress.get(0).get(7)));
		logger.info("User filled new address form");

	    
	}
	@When("User click add Your Address button")
	public void userClickAddYourAddressButton() {
	   click(factory.accountPage().addYourAddressButton);
	   logger.info("User clicked add Your Address");
	}
	
	   @Then("message should be displayed {string}")
	   public void messageShouldBeDisplayed(String strings) {
		waitTillPresence(factory.accountPage().addressAddedSuccessfully);
		Assert.assertTrue(isElementDisplayed(factory.accountPage().addressAddedSuccessfully));
//		Assert.assertEquals(strings, factory.accountPage().addressAddedSuccessfully.getText());
		logger.info("massage displayed ");

}

@When("User click on edit address option")
public void userClickOnEditAddressOption() {
	click(factory.accountPage().addAddressEditOption);
	logger.info("User clicked on address Edit Option");

}
@When("User fill new address form with below information")
public void userFillNewAddressWithBelowInformation(DataTable dataTable) {
	List<List<String>> editAddAddress = dataTable.asLists(String.class);
	
	clearTextUsingSendKeys(factory.accountPage().fullNameInput);
	clearTextUsingSendKeys(factory.accountPage().phoneNumberInput);
	clearTextUsingSendKeys(factory.accountPage().streetAddressInput);
	clearTextUsingSendKeys(factory.accountPage().apartmentInput);
	clearTextUsingSendKeys(factory.accountPage().cityInput);
	clearTextUsingSendKeys(factory.accountPage().zipCodeInput);
	selectByVisibleText(factory.accountPage().contryDropDown,DataGeneratorUtility.data(editAddAddress.get(0).get(0)));
	sendText(factory.accountPage().fullNameInput,DataGeneratorUtility.data(editAddAddress.get(0).get(1)));
	sendText(factory.accountPage().phoneNumberInput,DataGeneratorUtility.data(editAddAddress.get(0).get(2)));
	sendText(factory.accountPage().streetAddressInput,DataGeneratorUtility.data(editAddAddress.get(0).get(3)));
	sendText(factory.accountPage().apartmentInput,DataGeneratorUtility.data(editAddAddress.get(0).get(4)));
	sendText(factory.accountPage().cityInput,DataGeneratorUtility.data(editAddAddress.get(0).get(5)));
	selectByVisibleText(factory.accountPage().stateSelect,DataGeneratorUtility.data(editAddAddress.get(0).get(6)));
	sendText(factory.accountPage().zipCodeInput,DataGeneratorUtility.data(editAddAddress.get(0).get(7)));
	logger.info("User Edited new address form");

}
@When("User click update Your Address button")
public void userClickUpdateYourAddressButton() {
	   click(factory.accountPage().addYourAddressButton);
	   logger.info("User clicked add Your Address");

}
@Then("a message be displayed {string}")
public void aMessageBeDisplayed(String string) {
	//Assert.assertTrue(isElementDisplayed(factory.accountPage().addressUpdatedSuccessfully));
	logger.info("Updated massage displayed ");

}

@When("User click on remove option of Address section")
public void userClickOnRemoveOptionOfAddressSection() {
	click(factory.accountPage().addressRemoveOption);
	logger.info("User clicked to remove the address");
}
@Then("Address details should be removed")
public void addressDetailsShouldBeRemoved() {
	//Assert.assertTrue(isElementDisplayed(factory.accountPage().addingAddressSign));
	logger.info("Address details removed");

}

}