package practice_Questions_upto_day_4;
import java.util.Scanner;

public class practice_Q36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("The year is an leap year.");
        } else {
            System.out.println("The year is not an leap year.");
        }
    }
}
