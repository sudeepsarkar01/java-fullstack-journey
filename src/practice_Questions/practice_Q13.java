package practice_Questions;
import java.util.Scanner;

public class practice_Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("The number is divisible by 3 and 5 both.");
        } else {
            System.out.println("The number is not divisible by 3 and 5 both.");
        }
    }
}
