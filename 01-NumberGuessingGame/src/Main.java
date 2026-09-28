import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter
public  class  Main{
    public static void main(String[] args) {
        System.out.println("Welcome to number guessing game");

        //task
        System.out.println("Chose the number according your task");
        System.out.println("1) Chose this to start game");
        System.out.println("2) Chose this to read rules of the game");

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter you Choice:");
        int number=scanner.nextInt();

        //type
        if (number==1){
            Game game = new Game(5);
            game.start();
        }
        else if (number==2){
            System.out.println("this game is number guessing game is this game your given number of attempt to guess the right number");
            System.out.println("1) one number it single time ");
            System.out.println("2) on negative number");
            System.out.println("3)number should be in the particular range");
            System.out.println("4) it the end we are going to  show you right no");

        }else {
            System.out.println("oyu enter wrong choice");
        }
        scanner.close();

    }
}
