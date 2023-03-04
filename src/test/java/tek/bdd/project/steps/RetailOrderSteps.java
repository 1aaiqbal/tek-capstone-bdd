package tek.bdd.project.steps;

import org.junit.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import tek.bdd.project.pages.POMFactory;
import tek.bdd.project.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility{

	POMFactory factory = new POMFactory();

@Given("User click on Orders section")
public void userClickOnOrdersSection() {
click(factory.orderPage().orderButton);
logger.info("User clicked on order button");
}
@Given("User click on first order in list")
public void userClickOnFirstOrderInList() {
	click(factory.orderPage().firstOrderInLest);
	logger.info("User clicked on first order");
}
@Given("User click on Cancel The Order button")
public void userClickOnCancelTheOrderButton() {
	click(factory.orderPage().cancelTheOrderButton);
	logger.info("User clicked on cancel the order button");
}
@Given("User select the cancelation Reason {string}")
public void userSelectTheCancelationReason(String cancelReason) {
	selectByVisibleText(factory.orderPage().cancelationReason, cancelReason);
	logger.info("User slected the candelation reason");
}
@Given("User click on Cancel Order button")
public void userClickOnCancelOrderButton() {
	click(factory.orderPage().cancelOrderButton);
	logger.info("User clicked on cancel order button");
}
@Then("a cancelation message should be displayed {string}")
public void aCancelationmessageShouldBeDisplayed(String canelationMessage) {
	Assert.assertTrue(isElementDisplayed(factory.orderPage().orderCancelledMessage));
    logger.info("The cancetation message displayed");
}



@Given("User click on Return items button")
public void userClickOnReturnItemsButton() {
	click(factory.orderPage().returnItemsButton);
	logger.info("User clicked on Return items button");
	
}
@Given("User select the ReturnReason {string}")
public void userSelectTheReturnReason(String reason) {
	selectByVisibleText(factory.orderPage().returnReason, reason);
	logger.info("User selected the ReturnReason");

}
@Given("User select the drop off service {string}")
public void userSelectTheDropOffService(String placeDropOff) {
	selectByVisibleText(factory.orderPage().dropOfService, placeDropOff);
	logger.info("User selected the drop off service");

}
@Given("User click on Return Order button")
public void userClickOnReturnOrderButton() {
	click(factory.orderPage().returnOrderButton);
	logger.info("User clicked on Return Order button");

}
@Then("cancelation message should be displayed {string}")
public void cancelationMessageShouldBeDisplayed(String string) {
	Assert.assertTrue(isElementDisplayed(factory.orderPage().cancelationReturnMessage));
    logger.info("cancelation message should be displayed");

}



@Given("User click on Review button")
public void userClickOnReviewButton() {
	click(factory.orderPage().reviewaButton);
	logger.info("User clicked on Review button");

}
@Given("User write Review headline {string} and {string}")
public void userWriteReviewHeadlineAnd(String headlineValue, String reviewText) {
	sendText(factory.orderPage().addAHeadlineInput, headlineValue);
	sendText(factory.orderPage().addAWrittenInput, reviewText);
	logger.info("User wrote Review and headline");

}
@Given("User click Add your Review button")
public void userClickAddYourReviewButton() {
	click(factory.orderPage().addYourReviewButton);
	logger.info("User clicked Add your Review button");

}
@Then("a review message should be displayed {string}")
public void aReviewMessageShouldBeDisplayed(String reviewMessage) {
	Assert.assertTrue(isElementDisplayed(factory.orderPage().addedReviewMessage));
    logger.info("a review message should be displayed");

}
}
