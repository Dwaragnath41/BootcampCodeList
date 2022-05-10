package com.servicenow.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class CreateIndividualsPage extends ProjectSpecificMethods {


   public void appLauncher(String data) {
	   
	   
	   typeAndEnter(locateElement(Locators.XPATH, "//input[@placeholder='Search apps or items...']"), data);
	   
	   reportStep("Search field data got entered", "pass");
	   
	   click(locateElement(Locators.XPATH, "//mark[text()='Individuals']"));
	   
	   reportStep("Individual text got clicked", "pass");
	   
	   click(locateElement(Locators.XPATH, "(//a[contains(@title,'Individuals')]//following::a)[1]"));
	   
	   reportStep("Click on Individuals link", "pass");
	   
	   
	   
	   
   }


}
