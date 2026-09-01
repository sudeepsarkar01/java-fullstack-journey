package practice_Questions_upto_loops;
import java.util.Scanner;

public class practice_Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long multiple = 1;
        for (long i = 1; i <= n; i++) {
            multiple = multiple * i;
        }
        System.out.println("The factorial of " + n + " is: " + multiple);
    }
}
