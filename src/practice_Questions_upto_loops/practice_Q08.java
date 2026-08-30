package practice_Questions_upto_loops;
import java.util.Scanner;

public class practice_Q08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
