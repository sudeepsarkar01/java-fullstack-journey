package practice_Questions;
import java.util.Scanner;

public class practice_Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any thing: ");
        String st = sc.nextLine();
        if (st.contains("  ") || st.contains("   ")) {
            System.out.println("Extra spaces are detected.");
        } else {
            System.out.println("Extra spaces are not detected.");
        }
    }
}
