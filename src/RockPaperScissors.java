import java.util.Scanner;

public class RockPaperScissors {

    public static void main (String [] args)
    {

        Scanner input = new Scanner (System.in);

        int userChoice;

        System.out.println("Please choose a number between 1 and 3, 1 = rock, 2 = paper, 3 = scissors.");
        userChoice = input.nextInt();

        int random = (int) (Math.random() * 3 + 1);

        if (userChoice == 1) {
            if (random == 1) {
                System.out.println("Tie");
            } else if (random == 2) {
                System.out.println("Lose");
            } else {
                System.out.println("Win");
            }
        }
        if (userChoice == 2)
        {
            if (random == 1)
            {
                System.out.println("win");
            }
            else if (random == 2)
            {
                System.out.println("tie");
            }
            else
            {
                System.out.println("lose");
            }
        }
        if (userChoice == 3)
        {
            if (random == 1)
            {
                System.out.println("lose");
            }
            else if (random == 2)
            {
                System.out.println("win");
            }
            else
            {
                System.out.println("tie");
            }
        }
    }
}

