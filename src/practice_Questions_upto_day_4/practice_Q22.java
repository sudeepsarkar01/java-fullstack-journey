package practice_Questions_upto_day_4;
import java.util.Scanner;

public class practice_Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        char last_char = name.charAt(name.length() - 1);
        System.out.println("last_char is " + last_char);
    }
}
