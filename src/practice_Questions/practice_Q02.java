package practice_Questions;
import java.util.Scanner;

public class practice_Q02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        float a = sc.nextFloat();
        System.out.print("Enter another number: ");
        float b = sc.nextFloat();

        float sum = a + b;
        float Difference = a - b;
        float Multiplication = a * b;
        float Division = a / b;
        float Remainder = a % b;


        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + Difference);
        System.out.println("Multiplication " + Multiplication);
        System.out.println("Division " + Division);
        System.out.println("Remainder " + Remainder);
    }
}
