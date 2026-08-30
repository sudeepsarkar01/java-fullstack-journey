package practice_Questions_upto_day_4;
import java.util.Scanner;

public class practice_Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        if (password.length() >= 8 && password.contains("@") && password.contains("12345")) {
            System.out.println("Valid password.");
        } else {
            System.out.println("Invalid password.");
        }
    }
}
