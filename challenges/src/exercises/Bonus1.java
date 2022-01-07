package challenges;

public class Bonus1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = calcFeetAndInchesToCentimeters(7,11);
		
		if(result == -1) {
			System.out.println("Invalid parameters");
		}
		
		System.out.println(result + " cm" );
		
		calcFeetAndInchesToCentimeters(156);
				
	
	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
		if((feet < 0) || ((inches < 0) || (inches > 12))) {
			return -1;
		} 
		
		double centimeters = (feet * 12) * 2.54;
		centimeters += inches * 2.54;
		System.out.println(feet + " feet " + inches + " inches = " + centimeters + " cm" );
	
		return centimeters;
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches) {
		if(inches <= 0) {
			return -1;
		}
		
		double feet = (int) inches / 12;
		double extraInches = (int) inches % 12;
		
		System.out.println(inches + " inches is equal to " + " feet and " + inches + " inches");
		
		return calcFeetAndInchesToCentimeters(feet, extraInches);
	}
	
}
