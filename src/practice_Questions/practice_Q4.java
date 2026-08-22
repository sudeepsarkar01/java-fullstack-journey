package practice_Questions;
import java.util.Scanner;

public class practice_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int birth_year = sc.nextInt();
        System.out.print("Enter current year: ");
        int current_year = sc.nextInt();

        int current_age = current_year - birth_year;
        System.out.println("your current age is: " + current_age);
    }
}
