package day_7;
import java.util.Scanner;

public class o3_static_method {
    static int findlargest(int a, int b, int c){
        if(a > b && a > c){
            return a;
        } else if(b > a && b > c){
            return b;
        } else{
            return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int result = findlargest(a, b, c);
        System.out.print("The largest number is: " + result);
    }
}
