package challenges;

public class DecimalComparator {

	public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
		int num1 = (int)(numOne * 1000);
		int num2 = (int)(numTwo * 1000);
		return (num1 == num2);
	}
	
}
