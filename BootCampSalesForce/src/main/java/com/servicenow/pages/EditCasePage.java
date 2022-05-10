package com.servicenow.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class EditCasePage extends ProjectSpecificMethods {

	public EditCasePage updateStatus(String data) {
		click(locateElement(Locators.XPATH, "(//label[text()='Status']//following::button)[1]"));
		clickUsingJs(locateElement(Locators.XPATH, "//div//lightning-base-combobox-item[@data-value='" + data + "']"));
		reportStep(data + " as status is updated successfully", "pass");
		return this;
	}

	public EditCasePage updatePriority(String data) {
		click(locateElement(Locators.XPATH, "(//span[text()='Priority']//following::a[@class='select'])[1]"));
		click(locateElement(Locators.XPATH, "//a[@title='" + data + "']"));
		reportStep(data + " as Priority is updated successfully", "pass");
		return this;
	}

	public EditCasePage updateCaseOrigin(String data) {
		click(locateElement(Locators.XPATH, "(//div//span[text()='Case Origin']//following::a[@class='select'])[1]"));
		click(locateElement(Locators.XPATH, "//a[@role='menuitemradio' and @title='" + data + "']"));
		reportStep(data + " as case origin is updated successfully", "pass");
		return this;
	}

	public EditCasePage updateSLAViolation(String data) {
		click(locateElement(Locators.XPATH, "(//span[text()='SLA Violation']//following::a[@class='select'])[1]"));
		click(locateElement(Locators.XPATH, "//a[@title='" + data + "']"));
		reportStep(data + " as sla violation is updated successfully", "pass");
		return this;
	}

	public CasesPage clickSave() {
		click(locateElement(Locators.XPATH, "(//button//span[text()='Save'])[2]"));
		reportStep("Save button is clicked successfully", "pass");
		return new CasesPage();
	}

}
