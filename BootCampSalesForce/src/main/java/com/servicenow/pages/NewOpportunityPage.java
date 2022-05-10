package com.servicenow.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class NewOpportunityPage extends ProjectSpecificMethods {
	
	public NewOpportunityPage enterOppoturnityname(String oppName) {
		type(locateElement(Locators.XPATH,"//label[text()='Opportunity Name']//following::input"), oppName);
		reportStep(oppName+" entered successfully","pass");
		return this;
		}
	
	public NewOpportunityPage enterCurrentDate() {
		type(locateElement(Locators.XPATH, "//label[text()='Close Date']/following-sibling::div//input"), getCurrentDate());
		reportStep("Current Date entered successfully","pass");
		return this;

	}
	
	public NewOpportunityPage selectStageDropdown() {
		click(locateElement(Locators.XPATH,"//label[text()='Stage']/following-sibling::div"));
		click(locateElement(Locators.XPATH,"//span[@title='Needs Analysis']"));
		reportStep("Stage dropdown value entered successfully","pass");
		return this;
	}
	
	public viewOpportunityPage clickOnSave() {
		click(locateElement(Locators.XPATH,"//button[text()='Save']"));
		reportStep("Save button clicked successfully","pass");
		return new viewOpportunityPage();
	}
	
}

