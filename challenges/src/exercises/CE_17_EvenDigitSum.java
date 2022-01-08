package exercises;

public class CE_17_EvenDigitSum {

	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(123456789)); // should return 20
		System.out.println(getEvenDigitSum(252)); // should return 4
		System.out.println(getEvenDigitSum(-33)); // should return -1

	}
	
public static int getEvenDigitSum(int number) {
		
		if(number < 0) {
			return -1;
		}
		
		int sum = 0; 
		while (number > 0 ) {
			int lastDigit = number % 10;
			if(lastDigit % 2 == 0) {
				sum += lastDigit;
			}
			
			number /= 10;
		}
		
		return sum;

	} 

}
