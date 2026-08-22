package practice_Questions;
import java.util.Scanner;

public class practice_Q07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter another number: ");
        int b = sc.nextInt();

        System.out.println("Before swap: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap: ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
