package practice_Questions;
import java.util.Scanner;

public class practice_Q09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        float num = sc.nextFloat();
        if (num < 0) {
            System.out.println("The entered number is negative.");
        } else if (num > 0) {
            System.out.println("The entered number is positive.");
        } else {
            System.out.println("The entered number is zero.");
        }
    }
}
