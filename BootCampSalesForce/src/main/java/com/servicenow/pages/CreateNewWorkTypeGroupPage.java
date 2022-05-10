package com.servicenow.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateNewWorkTypeGroupPage extends ProjectSpecificMethods {
	
	public CreateNewWorkTypeGroupPage enterWorkTypeName(String workTypeName) {		
		clearAndType(locateElement(Locators.XPATH, "(//input[@type='text'])[3]"), workTypeName);
		reportStep("Enter new work type group name - "+workTypeName, "Pass");
        return this;
	}
	
	public CreateNewWorkTypeGroupPage selectGroupType() {		
		click(locateElement(Locators.XPATH, "(//div[@class='uiMenu'])[3]//a"));
		click(locateElement(Locators.XPATH, "(//a[text()='Default'])[2]"));
		reportStep("Select work type group type", "Pass");
		return this;
	}
	
	public WorkTypesGroupPage clickSave() {
		click(locateElement(Locators.XPATH, "(//span[text()='Save'])[2]"));
		reportStep("Click Save button", "Pass");
        return new WorkTypesGroupPage();
	}

}
