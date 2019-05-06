import java.util.Scanner;

public class CellPhoneService {

    public static void main (String [] args)
    {

        int userMin;
        int userText;
        int userTextTotal;
        int userData;
        int userDataTotal;
        Scanner input = new Scanner(System.in);

        System.out.println("1 for 500 or less");
        System.out.println("2 for 500 or more");
        System.out.print("Please choose your minutes >>>>");
        userMin = input.nextInt();

        System.out.println("Would you like text?");
        System.out.println("1 for yes.");
        System.out.println("2 for no.");
        System.out.print(">>>>");
        userText = input.nextInt();

        System.out.println("Would you like data?");
        System.out.println("1 for yes.");
        System.out.println("2 for no.");
        System.out.print(">>>>");
        userData = input.nextInt();

        if (userData == 1) {
            System.out.println("How many Gigabytes or data would you like?");
            System.out.println("1 for 2 or less.");
            System.out.println("2 for 2 or more.");
            System.out.print(">>>>");
            userDataTotal = input.nextInt();

            if (userDataTotal == 1){
                System.out.println("Plan E recommended for $79 per month, up to 2 gigabytes.");
            }
            else{
                System.out.println("Plan F recommended for $87 per month, 2 gigabytes or more.");
            }
        }

        else if (userText == 1){
            System.out.println("How much text would you like?");
            System.out.println("1 for 100 or less.");
            System.out.println("2 for 100 or more.");
            System.out.print(">>>>");
            userTextTotal = input.nextInt();

            if (userTextTotal == 1) {
                System.out.println("Plan C recommended for $61 per month," +
                        " 500 or more minutes of talk and no data with up to 100 text messages.");
            }
            else{
                System.out.println("Plan D recommended for $70 per month," +
                        " 500 or more minutes of talk and no data with 100 text messages or more");
            }
        }

        else
        {
            if (userText == 2) {
                System.out.println("Plan A recommended for $49 per month," +
                        " fewer than 500 minutes of talk and no text or data.");
            }
            else {
                System.out.println("Plan B recommended for $55 per month," +
                        " fewer than 500 minutes of talk and any text.");
            }
        }


    }
}
