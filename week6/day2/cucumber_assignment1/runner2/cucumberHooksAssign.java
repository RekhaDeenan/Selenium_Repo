
package runner2;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features="src/test/java/features2",glue="steps2",
monochrome=true,
publish=true

)
public class cucumberHooksAssign extends AbstractTestNGCucumberTests
{

}