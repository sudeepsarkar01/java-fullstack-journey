package practice_Questions;
import java.util.Scanner;

public class practice_Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("The first character od your name is " + name.charAt(0));
    }
}
