package exercises;

public class CE_16_FirstAndLastDigitSum {

	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(252)); // should return 4;
		System.out.println(sumFirstAndLastDigit(257)); // should return 9;
		System.out.println(sumFirstAndLastDigit(0)); // should return 0;
		System.out.println(sumFirstAndLastDigit(5)); // should return 10;
		System.out.println(sumFirstAndLastDigit(-252)); // should return -1;

	}
	
	public static int sumFirstAndLastDigit(int number) {
		
		if(number < 0 ) {
			return -1;
		}
		
		int lastNum = number % 10;
		int firstNum = 0;	
	
		while (number > 0 ) {
			firstNum = number % 10;
			number /= 10;
		}
		return firstNum + lastNum;
    }


}
