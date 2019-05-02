import java.util.Scanner;

public class Triangle {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String choice;
        double sideA;
        double sideB;
        double sideC;

        dM("Please enter the side you are solving for A, B, or C >>>>");
        choice = input.next();

        if(choice.equals("A")){
            dM("What is side B?");
            sideB = input.nextInt();
            dM("What is side C?");
            sideC = input.nextInt();
           calculateA_B(sideC, sideB, choice);
        }
        else if(choice.equals("B")){
            dM("What is side A?");
            sideA = input.nextInt();
            dM("What is side C?");
            sideC = input.nextInt();
            calculateA_B(sideC, sideA, choice);
        }
        else if(choice.equals("C")){

            dM("What is side A?");
            sideA = input.nextInt();
            dM("What is side B?");
            sideB = input.nextInt();

            solveForC(sideA, sideB, choice);
        }

    }
    public static void calculateA_B(double side1, double side2, String choice){
        double missingSide;
        missingSide = Math.sqrt(side1 * side1 - side2*side2);
        System.out.println("The result of "+ choice + " = " + missingSide);
    }

    public static void solveForC(double side1, double side2, String choice) {

        double missingSide;

        missingSide = Math.sqrt(side1 * side1 + side2 * side2);
        System.out.println("The result of " + choice + " = " + missingSide);
    }

    public static void dM(String result){
        System.out.println(result);
    }

}
