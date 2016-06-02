import org.junit.Assert;
import org.junit.Test;

public class CalculatorUnitTest {
	Calculator calculator = new Calculator();

	@Test
	public void addPositiveNumbers() {
		int num1 = 2;
		int num2 = 2;
		int expectedResult = 4;
		Assert.assertTrue(expectedResult == calculator.add(num1, num2));
	}

}
