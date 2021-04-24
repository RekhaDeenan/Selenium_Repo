package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ToLeadPage extends ProjectSpecificMethods {
	public ToLeadPage(ChromeDriver driver) {
		this.driver = driver;
		Set<String> allWindows = driver.getWindowHandles();
		allhandles2 = new ArrayList<String>(allWindows);
	}

	public ToLeadPage enterToLeadName(String leadTwo) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(leadTwo);
		return this;
	}

	public MergeleadsPage clickDisplayedToLead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
		return new MergeleadsPage(driver);

	}
}
