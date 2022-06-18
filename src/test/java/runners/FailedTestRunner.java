package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * @author mozudogru
 * @project LamsaWebProject
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-html-reports"},
        features = "@target/rerun.txt",
        glue = "step_definitions"
)
public class FailedTestRunner {
}
