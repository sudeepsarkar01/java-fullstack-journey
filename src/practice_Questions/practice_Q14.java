package practice_Questions;
import java.util.Scanner;

public class practice_Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible for vote.");
        } else {
            System.out.println("You re not eligible for vote.");
        }
    }
}
