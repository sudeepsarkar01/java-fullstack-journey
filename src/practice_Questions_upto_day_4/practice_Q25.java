package practice_Questions_upto_day_4;
import java.util.Scanner;

public class practice_Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type some thing: ");
        String st = sc.nextLine();

        if (st.contains("java")) {
            System.out.println("java found.");
        } else {
            System.out.println("java not found.");
        }
    }
}
