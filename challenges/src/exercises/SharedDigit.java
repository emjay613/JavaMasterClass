package exercises;

public class SharedDigit {

	public static void main(String[] args) {
		System.out.println("27 and 38 have a shared digit " + hasSharedDigit(27,38));
		System.out.println("27 and 37 have a shared digit " + hasSharedDigit(27,37));
	}
	
	public static boolean hasSharedDigit(int firstNum, int secondNum) {
		if(firstNum < 10 || firstNum > 99 || secondNum < 10 ||secondNum > 99) {
			return false; // number out of range
		}
		
		int fnDigit1 = firstNum /10;
		int fnDigit2 = firstNum % 10;
		int snDigit1 = secondNum / 10;
		int snDigit2 = secondNum % 10;
		
		if(fnDigit1 == snDigit1 || fnDigit1 == snDigit2 || fnDigit2 == snDigit1 || fnDigit2 == snDigit2) {
			return true;
		}
		
		return false;
	}
	
}
