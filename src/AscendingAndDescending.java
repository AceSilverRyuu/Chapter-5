import java.util.Scanner;

public class AscendingAndDescending {

    public static void main (String [] args){

        int userEntry1;
        int userEntry2;
        int userEntry3;
        String result;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a whole number >>>");
        userEntry1 = input.nextInt();

        System.out.println("Please enter another whole number >>>");
        userEntry2 = input.nextInt();

        System.out.println("Please enter a third whole number >>>");
        userEntry3 = input.nextInt();

        if (userEntry1 > userEntry2 && userEntry1 > userEntry3) {
            if (userEntry2 > userEntry3) {
                result = userEntry1 + " " + userEntry2 + " " + userEntry3;

                System.out.println("The descending order is " + result);
                System.out.println("The ascending order is " + userEntry3 + " " + userEntry2 +
                        " " + userEntry1);
            } else {
                result = userEntry1 + " " + userEntry3 + " " + userEntry2;

                System.out.println("The descending order is " + result);
                System.out.println("The ascending order is " + userEntry2 + " " + userEntry3 +
                        " " + userEntry1);

            }
        }
            else if (userEntry2 > userEntry1 && userEntry2 > userEntry3)
            {
                if (userEntry1 > userEntry3) {
                    result = userEntry2 + " " + userEntry1 + " " + userEntry3;

                    System.out.println("The descending order is " + result);
                    System.out.println("The ascending order is " + userEntry3 + " " + userEntry1 +
                            " " + userEntry2);

                }
                else {
                    result = userEntry2 + " " + userEntry3 + " " + userEntry1;

                    System.out.println("The descending order is " + result);
                    System.out.println("The ascending order is " + userEntry1 + " " + userEntry3 +
                            " " + userEntry2);

                }
            }
        else if (userEntry3 > userEntry1 && userEntry3 > userEntry2)
        {
            if (userEntry1 > userEntry2) {
                result = userEntry3 + " " + userEntry1 + " " + userEntry2;
                System.out.println("The descending order is " + result);
                System.out.println("The ascending order is " + userEntry2 + " " + userEntry1 +
                        " " + userEntry3);
            }
            else {
                result = userEntry3 + " " + userEntry2 + " " + userEntry1;
                System.out.println("The descending order is " + result);
                System.out.println("The ascending order is " + userEntry1 + " " + userEntry2 +
                        " " + userEntry3);
            }
        }
        }
    }

