package exercises;

public class CE_22_PerfectNumber {

	public static void main(String[] args) {
		System.out.println(isPerfectNumber(6));  // should return true
		System.out.println(isPerfectNumber(28)); // should return true
		System.out.println(isPerfectNumber(5)); // should return false
		System.out.println(isPerfectNumber(+1)); // should return false

		
		
	}
	
	public static boolean isPerfectNumber(int number) {
		if(number < 1) {
			return false;
		}
		
		int i = 1; 
		int sum = 0; 
		while( i < (number -1)) {
			if (number %i == 0 ) {
				sum = sum + i; 
			}
			i++;
		}
		
		if (sum == number) {
			return true;
		} else {
			return false;
		}
	}

}
