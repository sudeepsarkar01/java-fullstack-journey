package practice_Questions_upto_loops;
import java.util.Scanner;

public class practice_Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int even_count = 0;
        int odd_count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
        }
        System.out.println("The no. of even number is " + even_count);
        System.out.println("The no. of odd number is " + odd_count);
    }
}
