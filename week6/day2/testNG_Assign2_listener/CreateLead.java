package week5.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	
		
	@Test(dataProvider = "sendData")
	public void runCreateLead(String compname, String fname, String lname) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(compname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();

	}

	@BeforeSuite
	public void setFileName() {
		excelFileName = "createLead";

	}
	/*
	 * @DataProvider(name = "fetchData") public String[][] sendData() { String[][]
	 * data = new String[3][3]; data[0][0] = "Test Leaf"; data[0][1] = "Rekha";
	 * data[0][2] = "D";
	 * 
	 * data[1][0] = "Test Leaf"; data[1][1] = "Venba"; data[1][2] = "T";
	 * 
	 * data[2][0] = "TL"; data[2][1] = "Mani"; data[2][2] = "J"; return data; }
	 */}
