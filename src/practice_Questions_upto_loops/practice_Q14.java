package practice_Questions_upto_loops;
import java.util.Scanner;

public class practice_Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * base;
        }
        System.out.println(result);
    }
}
