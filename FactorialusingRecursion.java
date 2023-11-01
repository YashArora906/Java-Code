import java.util.Scanner;

public class FactorialusingRecursion {

//    Write a program to calculate (recursion must be used) factorial of a number in Java?

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }


    public static void main(String[] args){


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number you want factorial of : ");
            int n = sc.nextInt();

            System.out.println("The value of given number of factorial is : " + factorial(n));

    }


}
