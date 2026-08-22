package practice_Questions;
import java.util.Scanner;

public class practice_Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        float percentage = sc.nextFloat();
        System.out.print("Enter your attendance: ");
        int attendance = sc.nextInt();

        if (percentage >= 40 && attendance >=75) {
            System.out.println("You are eligible for exam.");
        } else {
            System.out.println("You are not eligible for exam.");
        }
    }
}
