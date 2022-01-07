package challenges;

public class PreChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int highScorePosition = calculateHighScorePosition(1500);
		displayHighScorePosition("Brad", highScorePosition);
		
		highScorePosition = calculateHighScorePosition(900);
		displayHighScorePosition("Laura", highScorePosition);

		highScorePosition = calculateHighScorePosition(400);
		displayHighScorePosition("Janey", highScorePosition);

		highScorePosition = calculateHighScorePosition(50);
		displayHighScorePosition("Dave", highScorePosition);

	}
	
	public static void displayHighScorePosition(String playerName, int highScorePosition) {
		
		System.out.println(playerName + " managed to get into position " + 
		highScorePosition + " on the high score table");
	}
	
	public static int calculateHighScorePosition(int playerScore) {
		if(playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500 && playerScore < 1000) {
			return 2;
		} else if (playerScore >= 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}
	}

}
