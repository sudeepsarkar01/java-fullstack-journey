package day_5;
import java.util.Scanner;

public class for_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 2; i < 10; i++) {
            System.out.println(2*i + 1);
        }
    }
}
