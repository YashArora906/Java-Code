import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        int a = sc.nextInt();

//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter b");
//        int b = scn.nextInt();

        if(a%2 == 0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
