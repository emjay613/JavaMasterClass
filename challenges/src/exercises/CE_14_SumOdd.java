package exercises;

public class CE_14_SumOdd {

	public static void main(String[] args) {
		System.out.println("Summing odd numbers between 1 and 10 = " + sumOdd(1, 10));
		System.out.println("Summing odd numbers between 2 and 20 = " + sumOdd(2, 20));
		System.out.println("Summing odd numbers between 3 and 30 = " + sumOdd(3, 30));
		System.out.println("Summing odd numbers between -1 and 10 = " + sumOdd(11, 10));
	}
	
	public static boolean isOdd(int number) {
		if(number < 0 ) {
			return false;
		} else if (number% 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
	
	
	public static int sumOdd(int start, int end) {
		int sum = 0;
		
		for(int i = start; i <= end; i++) {
			boolean check = isOdd(i);
			if(check) {
				sum = sum + i;
			}
		}
		
		return sum;
	}

}
