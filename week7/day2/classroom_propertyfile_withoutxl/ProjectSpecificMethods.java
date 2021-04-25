package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	public ChromeDriver driver;
	public String excelFileName;
	protected static String leadID;
	protected List<String> allhandles = new ArrayList<String>();
	protected List<String> allhandles2 = new ArrayList<String>();
	public static Properties prop;

	@DataProvider(name = "fetchdata")
	public String[][] sendData() throws IOException {
		utils.ReadExcel re = new utils.ReadExcel();
		String[][] data = re.excelRead(excelFileName);
		return data;
	}

	@BeforeMethod
	public void precondition() throws IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/english.properties");
		prop = new Properties();
		prop.load(fis);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void postcondition() {
		driver.close();
	}
}