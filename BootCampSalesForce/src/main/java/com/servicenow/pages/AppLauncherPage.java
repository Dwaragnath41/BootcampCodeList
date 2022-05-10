
package com.servicenow.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class AppLauncherPage extends ProjectSpecificMethods{
	
	public AppLauncherPage searchButton(String data) {
		clearAndType(locateElement(Locators.XPATH, "//input[@placeholder='Search apps or items...']"), data);
		reportStep(data+" search was successful","pass");
		return this;
	}

	public MarketingPage clickIndividualsButton() {
		click(locateElement(Locators.XPATH, "//p[@class='slds-truncate']"));
		reportStep("Individuals button clicked successfully","pass");
		return new MarketingPage();
	}

	public AppLauncherPage enterAppName(String data) {
		clearAndType(locateElement(Locators.XPATH, "//input[@type='search' and @placeholder='Search apps or items...']"), data);
		reportStep(data+" entered successfully","pass");
		return this;
	}
		
		public SalesPage clickApp() {
		click(locateElement(Locators.XPATH, "//p[contains(text(),'Manage your sales process')]"));
		reportStep("App clicked successfully","pass");
		return new SalesPage();
	}

}
