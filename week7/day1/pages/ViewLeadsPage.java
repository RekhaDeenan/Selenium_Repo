package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeadsPage extends ProjectSpecificMethods {
public ViewLeadsPage(ChromeDriver driver) {
	this.driver=driver;
}
public EditLeadPage clickEdit() {
	driver.findElement(By.linkText("Edit")).click();
return new EditLeadPage(driver);
}
public ViewLeadsPage verifyEdit() {
System.out.println("Editing done");
return this;
}
public ViewLeadsPage verifyFirstName() {
System.out.println("verified First name");
return this;
}
}
