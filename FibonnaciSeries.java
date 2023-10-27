public class FibonnaciSeries {
    public static void main(String[] args){
        int a = 0, b = 1;
        System.out.println(a+" "+b);
        int c;
        for (int i =1; i<=20; i++){
            c = a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
