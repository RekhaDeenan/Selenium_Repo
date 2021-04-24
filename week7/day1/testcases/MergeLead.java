package testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class MergeLead extends ProjectSpecificMethods {
	@BeforeSuite
	public void setFileName() {
		excelFileName = "MergeLead";
	}

	@Test(dataProvider = "fetchdata")
	public void runMergeLead(String userName, String password, String leadOne, String leadTwo)
			throws InterruptedException {
		new LoginPage(driver).enterUserName(userName).enterPassword(password).clickLoginButton().clickCRMSFAButton()
				.clickLeadsButton().clickMergeLeads().clickFromLeadLookup().enterFirstLeadName(leadOne)
				.clickDisplayedLead().clickToLeadLookup().enterToLeadName(leadTwo).clickDisplayedToLead()
				.clickMergeLeadsFinal().clickFindLead().enterLeadId().clickFindLead().verifyErrorMessageMerge();

	}
}
