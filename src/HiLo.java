import java.util.Scanner;

public class HiLo {
	private static int lo = 1;
	private static int hi = 10;
	private static String replayMessage = "Would you like to play again?(y/n)";
	private static String exitMessage = "Thanks for playing! :)";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String playAgain = "";
		do {
			int guess = 0;	//Initializing guess variable
			int noOfGuesses = 0;
			int answer = (int)(Math.random() * hi + lo);	//Creates a random number between 1 and 100.
			//While loop for guessing the answer.
			while(guess != answer) {
				noOfGuesses++;
				System.out.println("Guess a number between " + lo + " and " + hi + " :");
				guess = scan.nextInt();
				if(guess < answer)
					System.out.println(guess + " is too low. Try again.");
				else if(guess > answer)
					System.out.println(guess + " is too high. Try again.");
				else {
					if(noOfGuesses == 1)
						System.out.println(guess + " is correct. It only took you " + noOfGuesses + " guess. You win.");
					else
						System.out.println(guess + " is correct. It only took you " + noOfGuesses + " guesses. You win.");
				}
			}
			System.out.println(replayMessage);
			playAgain = scan.next();
		}while(playAgain.equalsIgnoreCase("y"));
		System.out.println(exitMessage);
		scan.close();
	}
}
