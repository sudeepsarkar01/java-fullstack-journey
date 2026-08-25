package practice_Questions;
import java.util.Scanner;

public class practice_Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle a: ");
        int a = sc.nextInt();
        System.out.print("Enter angle b: ");
        int b = sc.nextInt();
        System.out.print("Enter angle c: ");
        int c = sc.nextInt();
        if (a + b > c || a + c > b || b + c > a) {
            System.out.println("Valid triangle");
        } else {
            System.out.println("Invalid triangle");
        }
    }
}
