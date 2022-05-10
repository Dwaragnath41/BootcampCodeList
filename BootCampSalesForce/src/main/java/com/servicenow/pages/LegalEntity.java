package com.servicenow.pages;

import org.openqa.selenium.By;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LegalEntity  extends ProjectSpecificMethods 
{
public void createlegalentity(String ename)
{
	System.out.print("Welcome");
	click(Locators.XPATH, "//a[@title='New']//div[1]"); 
	clearAndType(locateElement(Locators.XPATH, "//span[text()='*']/following::input[1]"), ename); 
	click(Locators.XPATH, "//button[@title='Save']//span[1]"); 
	reportStep("Created  successfully", "pass");
	
	
}
}
