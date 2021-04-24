package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods{
public EditLeadPage(ChromeDriver driver) {
	this.driver=driver;
}
public EditLeadPage enterCompany(String comp) {
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(comp);
return this;
}
public ViewLeadsPage submitEdit() {
	driver.findElement(By.name("submitButton")).click();
return new ViewLeadsPage(driver);
}
}
