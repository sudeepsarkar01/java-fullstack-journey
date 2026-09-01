package practice_Questions_upto_loops;
import java.util.Scanner;

public class practice_Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum is: " + sum);
    }
}
