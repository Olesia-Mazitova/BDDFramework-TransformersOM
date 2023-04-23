package tek.sdet.framework.steps;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailAccountSteps extends CommonUtility {
	
	POMFactory factory = new POMFactory();
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(factory.homePage().accountOption);
		logger.info("user clicked on Account option");

	}
	@When("User update Name {String} and Phone {String}")
	public void userUpdateNameAndPhone(String nameValue, String phoneValue) {
		clearTextUsingSendKeys(factory.accountPage().profileNameInputField);
		sendText(factory.accountPage().profileNameInputField, nameValue);
		clearTextUsingSendKeys(factory.accountPage().profilePhoneNumberField);
		sendText(factory.accountPage().profilePhoneNumberField, phoneValue);
		logger.info("user updated Name and Phone values");

	}
	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(factory.accountPage().profileUpdateButton);
		logger.info("user clicked on Update button");

	}
	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		Assert.assertTrue(isElementDisplayed(factory.accountPage().personalInfoUpdatedSuccessMessage));
		logger.info("user profile information updated");

	}

}
