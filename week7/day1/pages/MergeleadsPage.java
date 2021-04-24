package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MergeleadsPage extends ProjectSpecificMethods {
	public MergeleadsPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public FromLeadPage clickFromLeadLookup() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new FromLeadPage(driver);
	}

	public ToLeadPage clickToLeadLookup() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> allWindows2 = driver.getWindowHandles();
		allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		return new ToLeadPage(driver);

	}

	public MyLeadsPage clickMergeLeadsFinal() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
		return new MyLeadsPage(driver);
	}
}
