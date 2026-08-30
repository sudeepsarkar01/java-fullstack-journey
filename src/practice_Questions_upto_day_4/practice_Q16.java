package practice_Questions_upto_day_4;
import java.util.Scanner;

public class practice_Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter math marks: ");
        int math_mark = sc.nextInt();
        System.out.print("Enter physics marks: ");
        int physics_mark = sc.nextInt();
        System.out.print("Enter chemistry marks: ");
        int chemistry_mark = sc.nextInt();

        if (math_mark >= 33 && physics_mark >= 33 && chemistry_mark >= 33) {
            System.out.println("You pass all the subjects.");
        } else {
            System.out.println("You are not pass all the subjects.");
        }
    }
}
