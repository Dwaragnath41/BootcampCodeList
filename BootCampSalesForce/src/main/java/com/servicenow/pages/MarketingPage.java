package com.servicenow.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class MarketingPage extends ProjectSpecificMethods{
	
	public MarketingPage clickNewButton() {
		click(locateElement(Locators.XPATH, "//div[text()='New']"));
		reportStep("Newbutton clicked successfully","pass");
		return this;
	}

	public MarketingPage salutationButton() {
		click(locateElement(Locators.XPATH, "(//a[contains(text(),'None')])[1]"));
		click(locateElement(Locators.XPATH, "//a[text()='Mr.']"));
		reportStep("Salution clicked successfully","pass");
		return this;
	}

	public MarketingPage enterTheFirstName(String data) {
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='First Name']"), data);
		reportStep(data +"FirstName entered successfully","pass");
		return this;
	}

	public MarketingPage enterLastName(String data) {
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Last Name']"), data);
		reportStep(data+"LastName has been entered Successfully","pass");
		return this;
	}

	public MarketingPage clickSaveButton() {
		click(locateElement(Locators.XPATH, "(//span[text()='Save'])[2]"));
		reportStep("Clicked Savebutton successfully","pass");
		return this;
	}
	
	public MarketingPage verifyName() {
		verifyDisplayed(locateElement(Locators.XPATH, "//span[contains(@class,'toastMessage slds-text-heading--small')]"));
		reportStep("Name is verified", "pass");
		return this;
	}


}
