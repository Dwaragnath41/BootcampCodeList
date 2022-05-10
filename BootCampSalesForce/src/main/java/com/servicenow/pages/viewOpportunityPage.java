package com.servicenow.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class viewOpportunityPage extends ProjectSpecificMethods {
	
	public viewOpportunityPage verifyNewOpportunityCreated(String oppName) {
		verifyPartialText(locateElement(Locators.XPATH,"//lightning-formatted-text[text()='"+oppName+"']"), oppName);
		reportStep("New Oppurturnity created and verified","Pass");
		return this;
	}
	
	

}
