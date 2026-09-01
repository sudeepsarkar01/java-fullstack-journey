package practice_Questions_upto_loops;
import java.util.Scanner;

public class practice_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int count = 0;

        if (n == 0) {
            count = 1;
        } else {
            n = Math.abs(n);

            while (n > 0) {
                n = n / 10;
                count++;
            }
        }

        System.out.println("Number of digits = " + count);
    }
}
