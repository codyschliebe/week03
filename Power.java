package week03;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(power(3,4));
	}
public static int power(int base, int exponent) {
	int result = 1;
	for (int index = 1; index <= exponent; index++) {
		result = result * base;
	}
	return result;
}
}
