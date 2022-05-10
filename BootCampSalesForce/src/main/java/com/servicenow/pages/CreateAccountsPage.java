package com.servicenow.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateAccountsPage extends ProjectSpecificMethods {

	public CreateAccountsPage clickOnAccountsTab() {
		click(locateElement(Locators.XPATH, "(//span[text()='Accounts']//parent::a//following::a)[1]"));
		reportStep("AccountsTab button clicked successfully", "pass");
		return this;
	}
	
	public CreateAccountsPage clickOnNewAccounts() {
		clickUsingJs(locateElement(Locators.XPATH, "//span[text()='New Account']"));
		reportStep("New Accounts button clicked successfully", "pass");
		return this;
	}
	
	
	public CreateAccountsPage enterAccountName(String data) {
		clearAndType(locateElement(Locators.XPATH, "//input[@name='Name']"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}

	
	public CreateAccountsPage clickOnOwnership() {
		clickUsingJs(locateElement(Locators.XPATH, "(//button[contains(@class,'slds-combobox__input slds-input_faux')])[3]"));
		click(locateElement(Locators.XPATH, "//span[text()='Public']"));
		reportStep("Ownership button clicked successfully", "pass");
		return this;
	}
	
	public CreateAccountsPage clickOnSave() {
		click(locateElement(Locators.XPATH, "//button[@name='SaveEdit']"));
		reportStep("Save button clicked successfully", "pass");
		return this;
	}

	
	public CreateAccountsPage VerifyAccountName() {
		WebElement Verification = locateElement(Locators.XPATH, "//span[@data-aura-class='forceActionsText']");
		System.out.println("Verify Account Name" + Verification.getText());
		reportStep("Verification Completed Successfully", "Pass");
		return this;
	}

	
}