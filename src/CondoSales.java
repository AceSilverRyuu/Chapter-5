import java.util.Scanner;

public class CondoSales {

    public static void main (String [] args){

        int userChoice;
        int parkingChoice;

        Scanner input = new Scanner (System.in);

        System.out.println("1 for park view.");
        System.out.println("2 for golf course view.");
        System.out.println("3 for lake view.");
        System.out.print("Please enter the view you'd like >>>>");
        userChoice = input.nextInt();

        System.out.println("1 for garage.");
        System.out.println("2 for parking space.");
        System.out.print("Please enter the form of parking you'd like >>>>");
        parkingChoice = input.nextInt();




        if (userChoice == 1) {
            if (parkingChoice == 1)
            {
                System.out.println("You have chosen park view with a garage, the price is $155,000.");
            }
            else if (parkingChoice == 2)
            {
                System.out.println("You have chosen park view with a parking space, the price is $150,000.");
            }
            else
            {
                System.out.println("You have chosen park view with a parking space, the price is $150,000.");
            }
        }

        else if (userChoice == 2) {
            if (parkingChoice == 1)
            {
                System.out.println("You have chosen golf course view with a garage, the price is $175,000.");
            }
            else if (parkingChoice == 2)
            {
                System.out.println("You have chosen golf course view with a parking space," +
                        " the price is $170,000.");
            }
            else
            {
                System.out.println("You have chosen golf course view with a parking space," +
                        " the price is $170,000.");
            }
        }

        else {
            if (parkingChoice == 1)
            {
                System.out.println("You have chosen lake view with a garage, the price is $215,000.");
            }
            else if (parkingChoice ==2)
            {
                System.out.println("You have chosen lake view with a parking space, the price is $210,000.");
            }
            else
            {
                System.out.println("You have chosen lake view with a parking space, the price is $210,000.");

            }
        }
    }
}
