
import java.util.Scanner;

public class calculator {
    public static void main(String[] args){


        float number_1, number_2;
        System.out.println("Enter the first number");

        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();

        System.out.println("Enter the second number");

        // Scanner scan = new Scanner(System.in);
        number_2 = scan.nextFloat();

        System.out.println("You have entered");
        System.out.println(number_1);

        System.out.println("and");
        System.out.println(number_2);

        String prompt = "Enter 0 for addition, 1 for " +
                "subtraction, 2 for multiplication and 3 for division";

        System.out.println(prompt);
        int input = scan.nextInt();

        switch (input){
            case 0:
                System.out.println("Adding these number");
                System.out.println("The result is: ");
                System.out.println(number_1 + number_2);
                break;

            case 1:
                System.out.println("Subracting these number");
                System.out.println("The result is: ");
                System.out.println(number_1 - number_2);
                break;

            case 2:
                System.out.println("Multiplying these number");
                System.out.println("The result is: ");
                System.out.println(number_1 * number_2);
                break;

            case 3:
                System.out.println("Dividing these number");
                System.out.println("The result is: ");
                System.out.println(number_1 / number_2);
                break;


            default:
                System.out.println("Invalid input");

        }

    }
}
