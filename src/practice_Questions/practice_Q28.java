package practice_Questions;
import java.util.Scanner;

public class practice_Q28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter anything: ");
        String st = sc.nextLine();

        if (st.length() >= 5 && !st.contains(" ")) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
