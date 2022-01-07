package challenges;

public class SpeedConverter {

	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour < 0) {
			return -1;
		} 
		return Math.round(kilometersPerHour / 1.609);
	}
	
	public static void printConversion(double kilometersPerHour) {
		//System.out.println("XX km/s = YY mi/h");
		if(kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		} else {
			long mph = toMilesPerHour(kilometersPerHour);
			System.out.println(kilometersPerHour + " km/h = "+ mph +" mi/h");
		}
	}	
	
}
