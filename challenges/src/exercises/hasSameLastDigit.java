package challenges;

public class hasSameLastDigit {

	public static void main(String[] args) {
		System.out.println("41, 22, 71 have a shared digit " + hasSameLastDigit(41, 22, 71));
		System.out.println("55, 25, 71 have a shared digit " + hasSameLastDigit(55, 25, 71));
		System.out.println("47, 21, 71 have a shared digit " + hasSameLastDigit(47, 23, 73));
		System.out.println("41, 22, 75 have a shared digit " + hasSameLastDigit(41, 22, 75));
		System.out.println("9, 22, 75 have a shared digit " + hasSameLastDigit(9, 21, 71));
		System.out.println("41, 9, 75 have a shared digit " + hasSameLastDigit(41, 9, 71));
		System.out.println("41, 22, 9 have a shared digit " + hasSameLastDigit(41, 21, 9));
		System.out.println("1001, 22, 75 have a shared digit " + hasSameLastDigit(1001, 22, 75));
		System.out.println("41, 1002, 75 have a shared digit " + hasSameLastDigit(41, 1002, 75));
		System.out.println("41, 22, 1005 have a shared digit " + hasSameLastDigit(41, 22, 1005));
		
	}
	
	public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum) {
		
		if(isValid(firstNum) && isValid(secondNum) && isValid(thirdNum)) {
			 int fnDigit = firstNum % 10;
			 int snDigit = secondNum % 10;
			 int tnDigit = thirdNum % 10;
			
			if(fnDigit == snDigit || fnDigit == tnDigit || snDigit == tnDigit ) {
				return true;
			} 			
		} 		
			
		return false;
		
	}
	
	public static boolean isValid(int number) {

		if(number < 10 || number > 1000)  {
			return false; // numbers out of range
		}
		return true;
		
	}

}
