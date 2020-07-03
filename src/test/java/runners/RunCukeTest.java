package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:feature",
        glue = "stepdefinitions", dryRun = false,
        plugin = {"pretty", "html:target/cucumber","json:target/cucumber.json"}
)
public class RunCukeTest {
}
