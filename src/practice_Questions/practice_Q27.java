package practice_Questions;
import java.util.Scanner;

public class practice_Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your e-mail: ");
        String e_mail = sc.nextLine();
        if (e_mail.contains("@") && e_mail.contains(".com")) {
            System.out.println("Valid e-mail");
        } else {
            System.out.println("Invalid e-mail");
        }
    }
}
