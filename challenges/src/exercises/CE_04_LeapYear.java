package exercises;

public class CE_04_LeapYear {

	public static void main(String[] args) {
		boolean ly = isLeapYear(1600);
		System.out.println(ly);
		ly = isLeapYear(2000);
		System.out.println(ly);
		ly = isLeapYear(2400);
		System.out.println(ly);
		ly = isLeapYear(1700);
		System.out.println(ly);
		ly = isLeapYear(1800);
		System.out.println(ly);
		ly = isLeapYear(1900);
		System.out.println(ly);
		ly = isLeapYear(2100);
		System.out.println(ly);
		ly = isLeapYear(2200);
		System.out.println(ly);
		ly = isLeapYear(2300);
		System.out.println(ly);
		ly = isLeapYear(2500);
		System.out.println(ly);
		ly = isLeapYear(2600);
		System.out.println(ly);
		ly = isLeapYear(1924);
		System.out.println(ly);
		ly = isLeapYear(1922);
		System.out.println(ly);
		ly = isLeapYear(-1200);
		System.out.println(ly);
	}

	public static boolean isLeapYear(int year) {
		if(year >= 1 && year <= 9999) {
			if (year % 4 == 0) { // checking if year divisble by 4
				if(year % 100 == 0) { //checking if year is also divisble by 100
					return(year % 400 == 0);// if year in not also divisble by 400 boolean value of false returned
				} else {
					return true; // Otherwise return true because divisble by 4
				}	
			} else {
				return false; // year not divisble by for
			}
		} else {
			return false; // year out of scope
		}
			
	} 
	
}
