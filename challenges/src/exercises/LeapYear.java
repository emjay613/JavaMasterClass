package challenges;

public class LeapYear {

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
