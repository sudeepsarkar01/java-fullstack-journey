package practice_Questions_upto_loops;
import java.util.Scanner;

public class practice_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long integer = sc.nextInt();
        for (long i = integer; i >= 0; i++) {
            System.out.println();
        }
    }
}
