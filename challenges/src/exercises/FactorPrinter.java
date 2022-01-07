package challenges;

public class FactorPrinter {

	public static void main(String[] args) {
		printFactors(6);
		printFactors(32);
		printFactors(120);
		printFactors(-1);

	}

	public static void printFactors(int number) {
		if(number < 1) {
			System.out.println("Invalid Value");
		} else {
			//System.out.print("The factors of " + number + " are ");
			int i = 1;
			while(i < number+1) {
				if(number % i == 0) {
					System.out.print(i + " ");
				}
				
				i++;
			}
			
			System.out.println("");
		}
	}
	
}
