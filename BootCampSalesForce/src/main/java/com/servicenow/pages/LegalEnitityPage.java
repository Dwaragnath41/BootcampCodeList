package com.servicenow.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;


public class LegalEnitityPage extends ProjectSpecificMethods{
	
	public LegalEnitityPage clickLegalEntityMenu()
	{
		click(Locators.XPATH, "//span[contains(text(),'Legal Entities Menu')]/parent::a");
		return new LegalEnitityPage();
	}
	
	public LegalEnitityPage clicknewLegalEntity()
	{
	//	click(Locators.XPATH, "//span[text()='New Legal Entity']");
		clickUsingJs(locateElement(Locators.XPATH, "//span[text()='New Legal Entity']"));
		reportStep("New Legal Entity clicked successfully", "pass");
		return this;
	}
	
	public LegalEnitityPage enternewname(String name)
	{
		clearAndType(locateElement(Locators.XPATH, "//span[text()='Name']/parent::label/following-sibling::input"), name);
		reportStep(name+" entered successfully","pass");
		return this;
	}
	
	public LegalEnitityPage clickSave()
	{
		click(Locators.XPATH, "(//span[text()='Save'])[2]");
		reportStep("Save button is clicked", "pass");
		return this;
	}
	
	public void verifyCreateLegal() {
		getElementText(locateElement(Locators.XPATH, "//span[@data-aura-class='forceActionsText']"));
		reportStep("Text Captured", "pass");
		verifyExactText(locateElement(Locators.XPATH, "//span[@data-aura-class='forceActionsText']"), "Salesforce Automation by Tester 1");
		reportStep("Compared Successfully", "pass");
	}
	
	public LegalEnitityPage searchLegalEntity(String name)
	{	
		clearAndType(locateElement(Locators.XPATH, "//input[@name='LegalEntity-search-input']"), name);
		reportStep("App is available", "pass");
		click(Locators.XPATH, "//button[@title='Refresh']");
		reportStep("Legal Entity searched details is available", "pass");
		
		return this;
	}
	
	public LegalEnitityPage clickDelete()
	{
		click(Locators.XPATH, "(//span[text()='Show Actions']/parent::span)[1]");
		click(Locators.XPATH, "//a[@title='Delete']");
		click(Locators.XPATH, "//span[text()='Delete']");
		reportStep("Delete button is clicked", "pass");
		return this;		
	}
	
	public void verifyDeleteLegal() {
		getElementText(locateElement(Locators.XPATH, "//span[@data-aura-class='forceActionsText']"));
		reportStep("Text Captured", "pass");
		verifyExactText(locateElement(Locators.XPATH, "//span[@data-aura-class='forceActionsText']"), "Salesforce Automation by Tester1 was deleted.");
		reportStep("Compared Successfully", "pass");
	}
}
