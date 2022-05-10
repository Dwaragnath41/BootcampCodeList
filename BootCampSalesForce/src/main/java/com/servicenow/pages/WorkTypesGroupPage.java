package com.servicenow.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class WorkTypesGroupPage extends ProjectSpecificMethods {

	public CreateNewWorkTypeGroupPage clickNewWorkTypeGroup() {		
		click(locateElement(Locators.XPATH, "(//a[contains(@title,'Work Type Groups')]//following::a)[1]"));
		clickUsingJs(locateElement(Locators.XPATH, "//span[text()='New Work Type Group']"));
		reportStep("Click New Work Type Group", "Pass");
	    return new CreateNewWorkTypeGroupPage();
	}
	
	public WorkTypesGroupPage verifyWorkGroupCreation(String workTypeName) {		
		verifyExactText(locateElement(Locators.XPATH, "//div[text()='Work Type Group']//following-sibling::div"), workTypeName);
		reportStep("Verify Work type group creation", "Pass");
        return this;
	}
	
	public WorkTypesGroupPage deleteWorkType(String workTypeName) throws Exception {		
		typeAndEnter(locateElement(Locators.XPATH, "//input[@name='WorkTypeGroup-search-input']"), workTypeName);
		click(locateElement(Locators.XPATH, "//div[@class='slds-button-group']//button[@name='refreshButton']"));        
        Thread.sleep(5000);        
        click(locateElement(Locators.XPATH, "(//table[@data-aura-class='uiVirtualDataTable']//following::tr)[1]//td[5]//div//a"));
        Thread.sleep(2000);
        click(locateElement(Locators.XPATH, "//a[@title='Delete']"));
        click(locateElement(Locators.XPATH, "//span[text()='Delete']"));
        reportStep("Delete Work type group", "Pass");
        return this;
	}
	
	public WorkTypesGroupPage verifyWorkGroupDeletion(String workTypeName) throws InterruptedException {	
		Thread.sleep(5000);
        verifyPartialText(locateElement(Locators.XPATH, "//div[@data-aura-class='forceToastMessage']//div//span"), workTypeName);
        reportStep("Verify Work type group deletion", "Pass");
        return this;
	}
}
