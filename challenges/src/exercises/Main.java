package exercises;

public class Main {
	public static void main(String[] args) {
		/* === Speed Converter ===
		SpeedConverter.printConversion(0);
		SpeedConverter.printConversion(-5.6);
		SpeedConverter.printConversion(25.42);
		SpeedConverter.printConversion(95.75);
		*/
		
		/* === MegaBytes Converter ===
		MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
		MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
		MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
		*/
		
		/* === Barking Dog ===
		boolean getUp =	BarkingDog.shouldWakeUp(true, 1);
		System.out.println(getUp);
		
		getUp =	BarkingDog.shouldWakeUp(false, 2);
		System.out.println(getUp);
		
		getUp =	BarkingDog.shouldWakeUp(true, 8);
		System.out.println(getUp);
		
		getUp =	BarkingDog.shouldWakeUp(true, -1);
		System.out.println(getUp);
		
		getUp =	BarkingDog.shouldWakeUp(true, 23);
		System.out.println(getUp);
		*/
		
		/* === Barking Dog === 
		boolean ly = LeapYear.isLeapYear(1600);
		System.out.println(ly);
		ly = LeapYear.isLeapYear(2000);
		System.out.println(ly);
		ly = LeapYear.isLeapYear(2400);
		System.out.println(ly);
		ly = LeapYear.isLeapYear(1700);
		System.out.println(ly);
		ly = LeapYear.isLeapYear(1800);
		System.out.println(ly);
		ly = LeapYear.isLeapYear(1900);
		System.out.println(ly);
		ly = LeapYear.isLeapYear(2100);
		System.out.println(ly);
		ly = LeapYear.isLeapYear(2200);
		System.out.println(ly);
		ly = LeapYear.isLeapYear(2300);
		System.out.println(ly);
		ly = LeapYear.isLeapYear(2500);
		System.out.println(ly);
		ly = LeapYear.isLeapYear(2600);
		System.out.println(ly);
		ly = LeapYear.isLeapYear(1924);
		System.out.println(ly);
		ly = LeapYear.isLeapYear(1922);
		System.out.println(ly);
		ly = LeapYear.isLeapYear(-1200);
		System.out.println(ly); */
		
		/* === Decimal Comparator === 
		boolean equal = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
		System.out.println(equal);
		equal = DecimalComparator.areEqualByThreeDecimalPlaces(3.1756, 3.176);
		System.out.println(equal);
		equal = DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0);
		System.out.println(equal);*/
		
		/* === Equal Sum Checker === 
		boolean equal = EqualSumChecker.hasEqualSum(1, 1, 1);
		System.out.println(equal);
		equal = EqualSumChecker.hasEqualSum(1, 1, 2);
		System.out.println(equal);
		equal = EqualSumChecker.hasEqualSum(1, -1, 0);
		System.out.println(equal);
		equal = EqualSumChecker.hasEqualSum(2, 3, 5);
		System.out.println(equal); */
	
		
		/* === Teen Number Checker === */
		boolean equal = CE_07_TeenNumberChecker.hasTeen(9, 99, 19);
		System.out.println(equal);
		equal = CE_07_TeenNumberChecker.hasTeen(23, 15, 42);
		System.out.println(equal);
		equal = CE_07_TeenNumberChecker.hasTeen(22, 23, 34);
		System.out.println(equal);
		equal = CE_07_TeenNumberChecker.hasTeen(13, 24, 66);
		System.out.println(equal);
		
		equal = CE_07_TeenNumberChecker.isTeen(13);
		System.out.println(equal);
		equal = CE_07_TeenNumberChecker.isTeen(9);
		System.out.println(equal);
		equal = CE_07_TeenNumberChecker.isTeen(17);
		System.out.println(equal);
		equal = CE_07_TeenNumberChecker.isTeen(34);
		System.out.println(equal);
		
	}

}
