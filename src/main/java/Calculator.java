/**
 * Simple Calculator programm
 * @author yovkap
 *
 */
public class Calculator {
	
	public Calculator() {
		// default constructor
	}
	
	/**
	 * Calculator addition method
	 * @param num1
	 * @param num2
	 * @return sum of num1 and num2
	 */
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	/**
	 * Calculator subtraction method
	 * @param num1 the number we want to subtract from num2
	 * @param num2 the number we subtract from
	 * @return subtraction num2 - num1
	 */
	public int subtract(int num1, int num2) {
		return num2 - num1;
	}

}
