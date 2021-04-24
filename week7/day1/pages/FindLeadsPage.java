package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods {
	public FindLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public FindLeadsPage clickPhoneTab() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}

	public FindLeadsPage enterPhoneNumber(String phNum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNum);
		return this;
	}

	public FindLeadsPage clickFindLead() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}

	public ViewLeadsPage clickLead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadsPage(driver);
	}

	public FindLeadsPage enterLeadId() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		return this;
	}

	public FindLeadsPage verifyErrorMessageMerge() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}

		return this;
	}
}
