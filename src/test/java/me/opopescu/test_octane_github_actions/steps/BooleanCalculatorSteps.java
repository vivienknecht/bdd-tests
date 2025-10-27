package me.opopescu.test_octane_github_actions.steps;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.*;
import me.opopescu.test_octane_github_actions.BooleanCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooleanCalculatorSteps {
    private BooleanCalculator booleanCalculator;
    private boolean result;

    @ParameterType("true|false")
    public boolean booleanValue(String value) {
        return Boolean.parseBoolean(value);
    }

    @Given("a boolean calculator")
    public void a_boolean_calculator() {
        booleanCalculator = new BooleanCalculator();
    }

    @When("I OR {booleanValue} and {booleanValue}")
    public void i_or_and(boolean a, boolean b) {
        booleanCalculator.or(a, b);
        result = booleanCalculator.getResult();
    }

    @When("I AND {booleanValue} and {booleanValue}")
    public void i_and_and(boolean a, boolean b) {
        booleanCalculator.and(a, b);
        result = booleanCalculator.getResult();
    }

    @Then("the result should be {booleanValue}")
    public void the_result_should_be(boolean expected) {
        assertEquals(expected, result);
    }
}
