package exercises;

public class CE_15_NumberPalindrome {

	public static void main(String[] args) {
		System.out.println("-1221 is a palindrome: " + isPalindrome(-1221));
		System.out.println("707 is a palindrome: " + isPalindrome(707));
		System.out.println("11212 is a palindrome: " + isPalindrome(11212));
	}
	
	public static boolean isPalindrome(int number) {
		int reverse = 0;
		int original = Math.abs(number); 
		number = Math.abs(number);
						
		while (number > 0) {
			int lastDigit = number % 10; 
			reverse *= 10; 
			reverse += lastDigit;
	
			number /= 10; // reduce the number act like a reverse counter
 		}
		
		
		return (original == reverse);
	}

}
