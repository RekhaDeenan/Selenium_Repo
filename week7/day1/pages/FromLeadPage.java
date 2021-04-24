package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class FromLeadPage extends ProjectSpecificMethods {
	public FromLeadPage(ChromeDriver driver) {
		this.driver = driver;
		Set<String> allWindows = driver.getWindowHandles();
		this.allhandles2 = new ArrayList<String>(allWindows);
	}

	public FromLeadPage enterFirstLeadName(String leadOne) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(leadOne);
		return this;
	}

	public FromLeadPage clickFindLeadsMerge() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000); // TODO Auto-generated method stub
		return this;
	}

	public MergeleadsPage clickDisplayedLead() {
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
		return new MergeleadsPage(driver);
	}
}
