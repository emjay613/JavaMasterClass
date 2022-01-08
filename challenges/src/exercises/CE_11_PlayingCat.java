package exercises;

public class CE_11_PlayingCat {

	public static void main(String[] args) {
	       System.out.println(isCatPlaying(true, 10));
	       System.out.println(isCatPlaying(false, 36));
	       System.out.println(isCatPlaying(false, 35));
	    }
	    
	    public static boolean isCatPlaying(boolean summer, int temperture) {
	        boolean playing = false;
	        
	        if(summer == true) {
	            if(temperture >= 25 && temperture <= 45) {
	                playing = true;
	            }    
	        } else {
	            if(temperture >= 25 && temperture <= 35) {
	                playing = true;
	            } 
	        }
	        
	        return playing;
	    }
	
}
