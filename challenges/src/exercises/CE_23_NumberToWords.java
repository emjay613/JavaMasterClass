package exercises;

public class CE_23_NumberToWords {

	public static void main(String[] args) {
//		System.out.println(getDigitCount(0)); // should return 1
//		System.out.println(getDigitCount(123)); // should return 3
//		System.out.println(getDigitCount(-12)); // should return -1
//		System.out.println(getDigitCount(5200)); // should return 4
//		
//		System.out.println(reverse(-121)); // should return -121
//		System.out.println(reverse(1212)); // should return 2121
//		System.out.println(reverse(1234)); // should return 4321
//		System.out.println(reverse(100)); // should return 1
		
		numberToWords(123); // should return ONE TWO THREE
		numberToWords(1010); // should return ONE ZERO ONE ZERO
		numberToWords(1000); // should return ONE ZERO ZERO ZERO
		numberToWords(-12); // should return Invalid Value
		numberToWords(0); // should return ZER0
	
	}
	
	public static void numberToWords(int number) {
		if (number < 0) {
			System.out.println("Invalid Value");
		} else {
			String numWord = ""; 
			String newValue = "";
	
			int count = getDigitCount(number);
			
			int lastDigit = 0;
			for(int i = 0; i < count; i++) {
				
				lastDigit = number % 10;
						
				switch(lastDigit) {
			 		case 0:
			 			numWord = "Zero ";
			 		 	break;
			         case 1:
			        	numWord = "One ";
			            break;
			         case 2:
			        	numWord = "Two ";
			            break;
			         case 3:
			        	numWord = "Three ";
			            break;
			         case 4:
			        	numWord = "Four ";
			            break;
			         case 5:
			        	numWord = "Five ";
			            break;
			         case 6:
			        	numWord = "Six ";
			            break;
			         case 7:
			        	numWord = "Seven ";
			            break;
			         case 8:
			        	numWord = "Eight ";
			            break;
			         case 9:
			        	numWord = "Nine ";
			            break;
			         default:
			        	numWord = "Invalid Value";
			            break;
				}
	 		  
				newValue =  numWord + newValue;
				number /= 10;
			}
			System.out.println(newValue);
		}  
	 	
	}

	public static int reverse(int number) {
		int newValue = 0;
		
		while(Math.abs(number) > 0) {
			int lastDigit = number % 10;
			newValue *= 10;
			newValue += lastDigit;
		//	System.out.println(newValue);
			
			number /= 10; //reduce number 
		}
		
		return newValue; 
	}
	
	public static int getDigitCount(int number) {
		if(number < 0 ) {
			return -1;
		} else {
			int i = 0;
			
			if(number == 0) {
				i = 1; 
			} else {
				while (number > 0) {
					
					i++;
					number /= 10; // reduce number
				}
			}
		
			return i;	
		}
		
	}
	
}
	
	
