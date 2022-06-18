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
        plugin = {
                "pretty",
                "json:target/cucumber.json",
                "html:target/cucumber.html",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = {"step_definitions"},
        dryRun = false,
        publish = true,
        tags = "@wip"
)
public class CukesRunner {
}
