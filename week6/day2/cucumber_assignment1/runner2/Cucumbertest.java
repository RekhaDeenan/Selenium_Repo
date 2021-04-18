
package runner2;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/features2",glue="steps2",
monochrome=true,
publish=true
,
tags="@smoke and @sanity"
)
public class Cucumbertest extends AbstractTestNGCucumberTests
{

}