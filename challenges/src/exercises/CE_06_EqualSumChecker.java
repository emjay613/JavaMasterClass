package exercises;

public class CE_06_EqualSumChecker {

	public static void main(String[] args) {
		boolean equal = hasEqualSum(1, 1, 1);
		System.out.println(equal);
	
		equal = hasEqualSum(1, 1, 2);
		System.out.println(equal);
		
		equal = hasEqualSum(1, -1, 0);
		System.out.println(equal);
		
		equal = hasEqualSum(2, 3, 5);
		System.out.println(equal); 
	}
	
	public static boolean hasEqualSum(int num1, int num2, int num3) {
			int checkNum = num1+ num2;
			return (checkNum == num3);
	}
	
}
