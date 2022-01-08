package exercises;

public class CE_24_FlourPackProblem {

	public static void main(String[] args) {
		System.out.println(canPack(1, 0, 4)); // should return false
		System.out.println(canPack(1, 0, 5)); // should return true
		System.out.println(canPack(0, 5, 4)); // should return true
		System.out.println(canPack(2, 2, 11)); // should return true
		System.out.println(canPack(-3, 2, 12)); // should return false
		
	}
	
	 public static boolean canPack(int bigCount, int smallCount, int goal) {
				
		if(bigCount < 0  || smallCount < 0 || goal < 0) {
			return false;
		}
		
		int sum = (bigCount*5) + smallCount;
		//System.out.println("Goal = " + goal + " Sum = " + sum);
		
		if(sum < goal) {
			return false;
		} else if (goal % 5 <=smallCount) {
			return true;
		} 
				
		return false;
	}

}
