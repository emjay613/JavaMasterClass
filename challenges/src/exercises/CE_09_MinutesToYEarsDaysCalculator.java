package exercises;

public class CE_09_MinutesToYEarsDaysCalculator {

	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);
		

	}
	
	public static void printYearsAndDays(long minutes) {
    	String msg = "";
    	if(minutes < 0 ) {
            msg = "Invalid Value";
        } else {
        	String minutesStr = minutes  + " min = ";
            String yearStr = minutes / (60 * 24 * 365) + " y and ";
            String daysStr = (minutes % (60 * 24 * 365)) / (60 * 24) + " d ";
            msg = minutesStr + yearStr + daysStr;
        }

    	System.out.println(msg);
    }

}
