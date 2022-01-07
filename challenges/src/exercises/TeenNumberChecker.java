package exercises;

public class TeenNumberChecker {

	public static void main(String[] args) {
		boolean equal = TeenNumberChecker.hasTeen(9, 99, 19);
		System.out.println(equal);
		equal = TeenNumberChecker.hasTeen(23, 15, 42);
		System.out.println(equal);
		equal = TeenNumberChecker.hasTeen(22, 23, 34);
		System.out.println(equal);
		equal = TeenNumberChecker.hasTeen(13, 24, 66);
		System.out.println(equal);
		
		equal = TeenNumberChecker.isTeen(13);
		System.out.println(equal);
		equal = TeenNumberChecker.isTeen(9);
		System.out.println(equal);
		equal = TeenNumberChecker.isTeen(17);
		System.out.println(equal);
		equal = TeenNumberChecker.isTeen(34);
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
