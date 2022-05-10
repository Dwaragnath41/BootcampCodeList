package com.servicenow.pages;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class SalesHomePage extends ProjectSpecificMethods{
	
	public SalesHomePage clickOnOpportunity() {
		
		clickUsingJs(locateElement(Locators.XPATH,"//a[@title='Opportunities']"));
		reportStep("Opportunity button is clicked", "pass");
		return this;
	}
	
	public NewOpportunityPage clickOnNew() {
		click(Locators.XPATH, "//div[@title='New']");
		reportStep("New Opportunity button is clicked", "pass");
		return new NewOpportunityPage();
	}
	
	public SalesHomePage searchOpportunityName(String oppName) {
		typeAndEnter(locateElement(Locators.XPATH,"//label[text()='Search this list...']/following::input[1]"), oppName);
		reportStep("Opportunity name entered and searched", "pass");
		return this;
	}
	
}
