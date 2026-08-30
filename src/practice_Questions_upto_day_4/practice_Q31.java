package practice_Questions_upto_day_4;
import java.util.Scanner;

public class practice_Q31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("ch is lowercase.");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("ch is uppercase");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("ch is number");
        } else {
            System.out.println("Special character");
        }
    }
}
