package com.servicenow.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.servicenow.pages.LoginPage;

public class TC002_CreateWorkType extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testcaseName = "Create Work Type Group";
		testDescription ="Create a new work type group";
		authors="Kumudhavalli";
		category ="Smoke";
		excelFileName="WorkTypeGroup";
	}
	
	@Test(dataProvider = "fetchData")
	public void createWorkTypeGroup(String username, String password, String workTypeGroupName) throws Exception {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickAppLauncher()
		.clickViewAllOnHome()
		.selectWorkTypeApp()
		.clickNewWorkTypeGroup()
		.enterWorkTypeName(workTypeGroupName)
		.selectGroupType()
		.clickSave()
		.verifyWorkGroupCreation(workTypeGroupName);
	}
}
