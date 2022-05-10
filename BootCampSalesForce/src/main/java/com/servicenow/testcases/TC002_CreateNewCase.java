package com.servicenow.testcases;
                                                                 

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.servicenow.pages.LoginPage;

public class TC002_CreateNewCase extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "CreateNewCase";
		testDescription ="Generate a New Case Number";
		authors="Annie";
		category ="Smoke";
		excelFileName="CreateNewCase";
	}
	
	@Test(dataProvider="fetchData")
	public  void createNewCase(String username, String password, String appName, String case_origin, String status, String subject, String description) throws IOException, InterruptedException {		
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickViewAll()
		.enterAppName(appName)
		.clickApp()
		.selectCasesFromMore()
		.clickNewCase()
		.selectContactName()
		.selectCaseOrigin(case_origin)
		.selectStatus(status)
		.enterSubject(subject)
		.enterDescription(description)
		.clickSaveButton()
		.verifyToastMessage()
		.verifyNewCase();
	}	
		

}
