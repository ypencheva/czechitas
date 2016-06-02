import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/java/features/", plugin = {"pretty", "html:target/cucumber"})
public class RunCukesTest {
}
