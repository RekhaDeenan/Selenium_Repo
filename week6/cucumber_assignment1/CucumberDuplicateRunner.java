package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/DuplicateLead.feature",glue="steps",monochrome=true,publish=true)
public class CucumberDuplicateRunner  extends AbstractTestNGCucumberTests{

	
	
}
