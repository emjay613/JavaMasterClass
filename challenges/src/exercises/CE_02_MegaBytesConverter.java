package exercises;

public class CE_02_MegaBytesConverter {

	public static void main(String[] args) {
		printMegaBytesAndKiloBytes(-1);
		printMegaBytesAndKiloBytes(32);
		printMegaBytesAndKiloBytes(10);
		printMegaBytesAndKiloBytes(4);

	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes < 0 ) {
			System.out.println("Invalid Value");
		} else {
			int megaBytes = kiloBytes / 1024;
			int remainingKB = kiloBytes % 1024;
						
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKB + " KB");
		}
		
		
	}
	

}
