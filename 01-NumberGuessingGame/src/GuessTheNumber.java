import java.util.Scanner;

public class GuessTheNumber {

    public int userGuessing(){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter your guess: ");
        int Number=scanner.nextInt();
        return Number;
    }
}
