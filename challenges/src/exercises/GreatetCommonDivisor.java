package challenges;

public class GreatetCommonDivisor {

	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(25,15));
		System.out.println(getGreatestCommonDivisor(12,30));
		System.out.println(getGreatestCommonDivisor(9,18));
		System.out.println(getGreatestCommonDivisor(81,153));

	}
 
	public static int getGreatestCommonDivisor(int first, int second) {
		if(first < 10 || second < 10) {
			return -1;
		}
		
		int i = 1;
		int divisor = 1;
		
		while(i <= 100) {
			if((first % i  == 0) && (second % i == 0 )) {
				divisor = i;
			}
			
			i++;
		}
		return divisor;
	}
	
	
}
