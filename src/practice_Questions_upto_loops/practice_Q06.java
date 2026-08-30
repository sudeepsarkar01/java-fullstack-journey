package practice_Questions_upto_loops;
import java.util.Scanner;

public class practice_Q06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
