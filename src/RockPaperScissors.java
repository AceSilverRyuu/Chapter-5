import java.util.Scanner;

public class RockPaperScissors {

    public static void main (String [] args)
    {

        Scanner input = new Scanner (System.in);

        int userChoice = 1;
        int winTotal = 0;
        int loseTotal = 0;
        int tieTotal = 0;
        int totalGamesPlayed = -1;




        while(totalGamesPlayed <= 1000){

//            System.out.println("Please choose a number between 1 and 3, 1 = rock, 2 = paper, 3 = scissors.");
//            userChoice = input.nextInt();
            int random = (int) (Math.random() * 3 + 1);
        if (userChoice == 1) {
            if (random == 1) {
                System.out.println("Tie");
                tieTotal ++;
            } else if (random == 2) {
                System.out.println("Lose");
                loseTotal ++;
            } else {
                System.out.println("Win");
                winTotal ++;
            }
        }
        if (userChoice == 2)
        {
            if (random == 1)
            {
                System.out.println("Win");
                winTotal ++;
            }
            else if (random == 2)
            {
                System.out.println("Tie");
                tieTotal ++;
            }
            else
            {
                System.out.println("Lose");
                loseTotal ++;
            }
        }
        if (userChoice == 3) {
            if (random == 1) {
                System.out.println("Lose");
                loseTotal ++;
            } else if (random == 2) {
                System.out.println("Win");
                winTotal ++;
            } else {
                System.out.println("Tie");
                tieTotal ++;
            }

        }
            totalGamesPlayed ++;
        }
        System.out.println("Thanks for playing.");

        System.out.println("Win total = " + winTotal + "\nLoss total = " + loseTotal + "\nTie total = "
                + tieTotal + "\n You played " + totalGamesPlayed + " times");
    }
}

