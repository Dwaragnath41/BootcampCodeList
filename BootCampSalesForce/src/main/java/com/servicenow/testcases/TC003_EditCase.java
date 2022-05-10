package com.servicenow.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.servicenow.pages.LoginPage;



public class TC003_EditCase  extends ProjectSpecificMethods{
	
	
	@BeforeTest
	public void setValues() {
		testcaseName = "EditCase";
		testDescription ="Edit a Salesforce Case";
		authors="Annie";
		category ="Smoke";
		excelFileName="EditCase";
	}
	
	@Test(dataProvider="fetchData")
	public void editCase(String username, String password, String appName, String caseNum, String status, String priority, String caseOrigin, String sla) throws InterruptedException, IOException {
		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickViewAll()
		.enterAppName(appName)
		.clickApp()
		.selectCasesFromMore()
		.searchCase(caseNum)
		.clickEditButton()
		.updateStatus(status)
		.updatePriority(priority)
		.updateCaseOrigin(caseOrigin)
		.updateSLAViolation(sla)
		.clickSave()
		.verifyEditToastMsg();
		
	}
	
	
	
	
	

}
