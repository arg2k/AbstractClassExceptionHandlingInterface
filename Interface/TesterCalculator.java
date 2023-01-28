package Interface;

public class TesterCalculator {

	public static void main(String[] args) {
		MyCalculator myCalculator = new MyCalculator();
		System.out.println("Sum of divisors of 9 : " + myCalculator.divisor_sum(9));
	}

}
