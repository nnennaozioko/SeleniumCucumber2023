package TestRunnerPackage;


import io.cucumber.testng.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@CucumberOptions(
        features = {"src/test/resources/features"},
   glue = {"Hooks","stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        tags="@Smoke",
        dryRun=false
)


public class TestRunner extends AbstractTestNGCucumberTests {

@Override
@DataProvider(parallel = true)
public Object[][] scenarios() {
    return super.scenarios();
}
}
