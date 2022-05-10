package com.servicenow.pages;

import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	public LoginPage enterUsername(String data) {
		
		//locate element
		WebElement ele = locateElement("username");
		
		//interact with element
		type(ele, data);
		
		reportStep(data+" is entered successfully", "pass");
		
		return this;
	}
	
	public LoginPage enterPassword(String data) {
		
		type(locateElement(Locators.XPATH, "//input[@id='password']"), data);
		reportStep(data+" is entered successfully", "pass");
		return this;
	}
	
	public HomePage clickLogin() {
		click(locateElement("Login"));
		reportStep("Clicked login successfully", "pass");
		
		return new HomePage();
	}

}
