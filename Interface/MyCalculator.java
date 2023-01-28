package Interface;

public class MyCalculator implements AdvancedArithmetic {

	@Override
	public int divisor_sum(int n) {
		int sum = 0;
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				if (i * i == n) {
					sum += i;
				} else {
					sum += i;
					sum += (n / i);
				}
			}
		}
		return sum;
	}

}
