package practice_Questions;
import java.util.Scanner;

public class practice_Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String your_name = sc.nextLine().trim();

        System.out.print("Enter your friends name: ");
        String friend_name = sc.nextLine();
        if (your_name.equalsIgnoreCase(friend_name)) {
            System.out.println("Same name");
        } else {
            System.out.println("different name");
        }
    }
}
