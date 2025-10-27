package me.opopescu.test_octane_github_actions.steps;

import io.cucumber.java.en.*;
import me.opopescu.test_octane_github_actions.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorSteps {
    private Calculator calculator;
    private int result;

    @Given("a calculator")
    public void a_calculator() {
        calculator = new Calculator();
    }

    @When("I add {int} and {int}")
    public void i_add_and(int a, int b) {
        calculator.add(a, b);
        result = calculator.getResult();
    }

    @When("I subtract {int} from {int}")
    public void i_subtract_from(int b, int a) {
        calculator.sub(a, b);
        result = calculator.getResult();
    }

    @When("I divide {int} by {int}")
    public void i_divide_by(int a, int b) {
        calculator.divide(a, b);
        result = calculator.getResult();
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expected) {
        assertEquals(expected, result);
    }
}
