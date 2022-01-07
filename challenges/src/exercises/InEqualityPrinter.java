package challenges;

public class InEqualityPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      printEqual(1, 1, 1);
	        printEqual(1, 1, 2);
	        printEqual(-1, -1, -1);
	        printEqual(1, 2, 3);
	}
	
	 public static void printEqual(int num1, int num2, int num3) {
	        String msg;
	        if(num1 < 0 || num2 < 0 || num3 < 0) {
	            msg = "Invalid Value";
	        } else {
	            if((num1 == num2) && (num1 == num3) &&(num2 == num3)) {
	                msg = "All numbers are equal";
	            } else {
	                if((num1 == num2) || (num1 == num3) || (num2 == num3)) {
	                    msg = "Neither all are equal or different";
	                } else {
	                    msg = "All numbers are different";
	                }
	            }
	        }
	        
	        System.out.println(msg);    
	    
	}

}
