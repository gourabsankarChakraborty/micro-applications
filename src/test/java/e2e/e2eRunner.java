package e2e;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        features = "src/test/resources/features",
        glue={"step_definition","e2e"},
        plugin = {"pretty", "json:target/cucumber-report.json"},
        tags = "@exc"
)
public class e2eRunner {
}
