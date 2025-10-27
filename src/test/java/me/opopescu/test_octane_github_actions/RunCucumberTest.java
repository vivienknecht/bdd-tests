package me.opopescu.test_octane_github_actions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "me.opopescu.test_octane_github_actions.steps",
        features = "src/test/resources/calculator_features")
public class RunCucumberTest {
}
