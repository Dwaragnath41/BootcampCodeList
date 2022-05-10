package com.servicenow.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectSpecificMethods;
import com.servicenow.pages.LoginPage;

public class TC002_LegalEntity  extends ProjectSpecificMethods{
	
		@BeforeTest
		public void setValues() {
			testcaseName = "createLegal";
			testDescription ="create Legal For Legal Entity";
			authors="suba";
			category ="Smoke";
			excelFileName="datasforall";
		}
		
		@Test(dataProvider = "fetchData")
		public void runLogin(String username, String password,String name) throws InterruptedException {
			new LoginPage()
			.enterUsername(username)
			.enterPassword(password)
			.clickLogin()
			.verifyHomePage()
			.clickOnViewAll()
			.selectlegal()
			.createlegalentity(name);
	}
}
