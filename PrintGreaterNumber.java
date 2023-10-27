import java.util.Scanner;
public class PrintGreaterNumber {
    public static void main(String[] args){
//        int a = 20, b = 30, c = 40;
//
//        if(a>b && a>c){
//            System.out.println("a is greater");
//        } else if (b>c && b>a) {
//            System.out.println("b is greater");
//
//        }
//        else {
//            System.out.println("c is greater");
//        }


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        Scanner scnn = new Scanner(System.in);
        System.out.println("Enter the value of b");
        int b = scnn.nextInt();

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of c");
        int c = scn.nextInt();

        if (a>b && a>c){
            System.out.println("a is greater");
        } else if (b>c && b>a) {
            System.out.println("b is greater");

        }
        else if (a==b && b==c && c==a){
            System.out.println(" all are equal");
        }
        else {
            System.out.println(" c is greater");
        }


    }
}
