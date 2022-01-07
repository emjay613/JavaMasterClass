package challenges;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" 12, 30 = " + getGreatestCommonDivisor(12, 30));
		
 	}
	
	public static int getGreatestCommonDivisor(int first, int second) {
		if(first < 10 || second < 10) {
			return -1;
		}
		
		int counter = 0;
		if(first > second) {
			counter = first; 
		} else {
			counter = second;
		}
		
		int i = 1;
		int divisor = 1; 
		while(i < counter) {
			if((first % i == 0) && (second % i == 0)) {
				divisor = i;
			}
			
			i++;
		}
		
		return divisor;
	}

}
