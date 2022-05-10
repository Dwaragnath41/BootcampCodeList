package com.servicenow.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.servicenow.pages.LoginPage;

public class TC003_DeleteWorkType extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testcaseName = "Delete Work Type Group";
		testDescription ="Delete a new work type group";
		authors="Kumudhavalli";
		category ="Smoke";
		excelFileName="WorkTypeGroup";
	}
	
	@Test(dataProvider = "fetchData")
	public void deleteWorkTypeGroup(String username, String password, String workTypeGroupName) throws Exception {
		new LoginPage()
		.enterUsername(username)
		.enterPassword(password)
		.clickLogin()
		.verifyHomePage()
		.clickAppLauncher()
		.clickViewAllOnHome()
		.selectWorkTypeApp()
		.deleteWorkType(workTypeGroupName)
		.verifyWorkGroupDeletion(workTypeGroupName);		
	}	
}
