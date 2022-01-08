package exercises;

public class CE_13_NumberOfDaysInMonth {

	public static void main(String[] args) {
		// checking for leap years
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		
		//checking for days in the month 
		System.out.println(getDaysInMonth(1, 2020)); // result should be 31
		System.out.println(getDaysInMonth(2, 2020)); // result should be 29
		System.out.println(getDaysInMonth(2, 2018)); // result should be 28
		System.out.println(getDaysInMonth(-1, 2020)); // result should be -1
		System.out.println(getDaysInMonth(1, -2020)); // result should be -1
		
	}
	
    public static boolean isLeapYear(int year) {
       	if(year > 0 && year < 10000) {
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

    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
            
        boolean leapYear = isLeapYear(year);
        int numDays = 0;
            
        switch(month) {
            case 1: 
                numDays =  31;
                break;
            case 2:
                if(leapYear) { 
                    numDays =  29;
                } else {
                    numDays = 28;
                }
                break;
            case 3: 
                numDays =  31;
                break;
            case 4: 
                numDays =  30;
                break;
            case 5: 
                numDays =  31;
                break;
            case 6: 
                numDays =  30;
                break;
            case 7: 
                numDays =  31;
                break;
            case 8: 
                numDays =  31;
                break;
            case 9: 
                numDays =  30;
                break;
            case 10: 
                numDays =  31;
                break;
            case 11: 
                numDays =  30;
                break;
            case 12: 
                numDays =  31;
                break;    
        }
        
        return numDays;
    }

}
