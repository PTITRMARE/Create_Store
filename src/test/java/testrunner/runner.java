package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//public class TestRunner {
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/Store.feature",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
        },
        dryRun = false,
        monochrome = true
)
public class runner{

}
