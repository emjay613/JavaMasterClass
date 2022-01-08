package exercises;

public class CE_03_BarkingDog {

	public static void main(String[] args) {
		boolean getUp =	shouldWakeUp(true, 1);
		System.out.println(getUp);
		
		getUp =	shouldWakeUp(false, 2);
		System.out.println(getUp);
		
		getUp =	shouldWakeUp(true, 8);
		System.out.println(getUp);
		
		getUp =	shouldWakeUp(true, -1);
		System.out.println(getUp);
		
		getUp =	shouldWakeUp(true, 23);
		System.out.println(getUp);
	}

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
		if(hourOfDay < 0 || hourOfDay > 23) {
			return false;
		} else {
			if((hourOfDay < 8 && barking == true) || (hourOfDay> 22 && barking == true)) {
				return true;
			} else {
				return false;
			}
		}
	}
	
}
