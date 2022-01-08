package exercises;

public class CE_07_TeenNumberChecker {

	public static void main(String[] args) {
		
		//checking the hasTeen method
		boolean equal = hasTeen(9, 99, 19);
		System.out.println(equal);
	
		equal = hasTeen(23, 15, 42);
		System.out.println(equal);
		
		equal = hasTeen(22, 23, 34);
		System.out.println(equal);
		
		equal = hasTeen(13, 24, 66);
		System.out.println(equal);
		
		//checking the isTeen method
		equal = isTeen(13);
		System.out.println(equal);
		
		equal = isTeen(9);
		System.out.println(equal);
		
		equal = isTeen(17);
		System.out.println(equal);
		
		equal = isTeen(34);
		System.out.println(equal);
	}

	public static boolean hasTeen(int age1, int age2, int age3) {
		if((age1 >= 13 && age1 <= 19) ||(age2 >= 13 && age2 <= 19) || (age3 >= 13 && age3 <= 19)) {
			return true;
		}
		return false;
	}
	
	public static boolean isTeen(int age) {
		if(age >= 13 && age <= 19) {
			return true;
		}
		return false;		
	}
	
}
