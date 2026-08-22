package practice_Questions;
import java.util.Scanner;

public class practice_Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your gender: ");
        String gender = sc.next();

        if (age >= 18 && gender.equals("male")) {
            System.out.println("You can drive.");
        } else {
            System.out.println("You can't drive,");
        }
    }
}
