package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class EditLead extends ProjectSpecificMethods {
	@BeforeTest
	public void setFileName() {
		excelFileName = "Editlead";
	}
	@Test(dataProvider = "fetchdata")
public void runEditLead(String userName,String password,String phNum,String comp) throws InterruptedException {
 new LoginPage(driver).enterUserName(userName).enterPassword(password).clickLoginButton().clickCRMSFAButton()
 .clickLeadsButton().clickFindLead().clickPhoneTab().enterPhoneNumber(phNum).clickFindLead().clickLead()
 .clickEdit().enterCompany(comp).submitEdit().verifyEdit();
}
}
