package exercises;

public class CE_05_DecimalComparator {

	public static void main(String[] args) {
		boolean equal = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
		System.out.println(equal);
		
		equal = areEqualByThreeDecimalPlaces(3.1756, 3.176);
		System.out.println(equal);
	
		equal = areEqualByThreeDecimalPlaces(3.0, 3.0);
		System.out.println(equal);

	}
	
	public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
			int num1 = (int)(numOne * 1000);
			int num2 = (int)(numTwo * 1000);
			return (num1 == num2);
	}
		
}
