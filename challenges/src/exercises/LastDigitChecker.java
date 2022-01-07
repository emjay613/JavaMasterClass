package challenges;

public class LastDigitChecker {

	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(41, 12, 71));
		System.out.println(hasSameLastDigit(23, 32, 42));
		System.out.println(hasSameLastDigit(9, 99, 999));
		System.out.println(hasSameLastDigit(-41, 12, 71));
		System.out.println(hasSameLastDigit(41, -12, 71));
		System.out.println(hasSameLastDigit(41, 12, -71));
		System.out.println(hasSameLastDigit(41, 31, 71));
		System.out.println(hasSameLastDigit(41, 31, 72));
	}

	public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum) {
		if(firstNum < 10 || firstNum > 1000 || secondNum < 10 || secondNum > 1000 || thirdNum < 10 || thirdNum > 1000) {
			return false;
		}
		
		int firstDigit = firstNum % 10;
		int secondDigit = secondNum % 10;
		int thirdDigit = thirdNum % 10;
		
		if(firstDigit == secondDigit || firstDigit == thirdDigit || secondDigit == thirdDigit) {
			return true;
		}
		
		return false;
	}
}
