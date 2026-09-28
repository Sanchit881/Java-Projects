import java.util.Random;

public class Game {

    private final int  randomNumber;
    private final int maxAttempts;
    private int attempts;

    public Game(int maxAttempts) {
        this.maxAttempts = maxAttempts;
        this.attempts = 0;

        Random random = new Random();
        this.randomNumber = random.nextInt(100) + 1;
    }

    public void start() {

        GuessTheNumber guess = new GuessTheNumber();

        System.out.println("You have " + maxAttempts + " chances to guess the number.");

        while (attempts < maxAttempts) {

            int userGuess = guess.userGuessing();

            attempts++;

            if (userGuess > randomNumber) {

                System.out.println("Number is too high. Try again.");

            } else if (userGuess < randomNumber) {

                System.out.println("Number is too low. Try again.");

            } else {

                System.out.println("Correct guess!");
                System.out.println("You guessed it in " + attempts + " attempts.");
                return;
            }
        }

        System.out.println("Game Over!");
        System.out.println("The correct number was: " + randomNumber);
        System.out.println("Thank you");
    }
}




