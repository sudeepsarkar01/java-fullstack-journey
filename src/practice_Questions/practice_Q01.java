package practice_Questions;
import java.util.Scanner;

public class practice_Q01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your gender: ");
        String gender = sc.next();

        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }
}