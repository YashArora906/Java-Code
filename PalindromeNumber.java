import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] main){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int no = sc.nextInt();

        int temp = no;
        int rev = 0, rem;

        while (temp!=0){
            rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }

        if (no == rev){
            System.out.println("The given no is a  Palindrome Number");
        }
        else {
            System.out.println("The given no is not a  Palindrome Number");
        }
    }
}
