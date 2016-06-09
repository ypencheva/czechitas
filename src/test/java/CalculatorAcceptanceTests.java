import org.junit.Assert;

import cucumber.api.java.en.*;

public class CalculatorAcceptanceTests {
	Calculator calculator;
	int additionResult;
	int subtractionResult;
	
	@Given("^I have calculator program$")
	public void i_have_calculator_program() throws Throwable {
		calculator = new Calculator();
	}

	@When("^I choose to add (-?\\d+) and (-?\\d+)$")
	public void i_choose_to_add_and(int arg1, int arg2) throws Throwable {
		additionResult = calculator.add(arg1, arg2);
	}

	@Then("^the result of addition is (-?\\d+)$")
	public void the_result_of_addition_is(int arg1) throws Throwable {
		Assert.assertTrue(additionResult == arg1);
	}
	
	@When("^I choose to subtract (-?\\d+) from (-?\\d+)$")
	public void i_choose_to_subtract_from(int arg1, int arg2) throws Throwable {
	    subtractionResult = calculator.subtract(arg1, arg2);
	}

	@Then("^the result of subtraction is (-?\\d+)$")
	public void the_result_of_subtraction_is(int arg1) throws Throwable {
		Assert.assertTrue(subtractionResult == arg1);
	}

}
