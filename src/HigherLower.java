import java.util.Scanner;

public class HigherLower {

    public static void main (String[] args){

        int userGuess = 0;
        int count = 0;

        Scanner input = new Scanner (System.in);

        System.out.println("Welcome to my game.\n");
        System.out.println("Pick a number between 1 and 10.\n");
        System.out.println("Guess correctly, win a prize.\n");

        int random = (int) (Math.random() * 10 + 1);
        while (userGuess != random) {

            System.out.print("Pick a number >>>>>>");
            userGuess = input.nextInt();
            if (userGuess == random) {

                System.out.println("You guessed correctly. Congratulations, you earned nothing!");

            } else if (userGuess > random) {
                System.out.println("Lower.");

            } else if (userGuess < random) {
                System.out.println("Higher.");

            } else {
                System.out.println("That number is not between 1 and 10.");

            }
            count ++;
        }
        System.out.println("You guessed in " + count + " tries.");

    }
}
