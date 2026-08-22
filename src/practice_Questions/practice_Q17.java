package practice_Questions;
import java.util.Scanner;

public class practice_Q17 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("Math: ");
        int math_mark = sc.nextInt();
        System.out.print("physics: ");
        int physics_mark = sc.nextInt();
        System.out.print("chemistry: ");
        int chemistry_mark = sc.nextInt();
        System.out.print("English: ");
        int English_mark = sc.nextInt();
        System.out.print("Java: ");
        int Java_mark = sc.nextInt();

        int total_mark = math_mark + physics_mark + chemistry_mark + English_mark + Java_mark;
        float percentage = (total_mark / 500.0f) * 100;
        System.out.println(percentage + "%");

        if (percentage >= 90) {
            System.out.println("A grade");
        } else if (percentage >= 80) {
            System.out.println("B grade");
        } else if (percentage >= 70) {
            System.out.println("C grade");
        } else if (percentage >= 60) {
            System.out.println("D grade");
        } else {
            System.out.println("E grade");
        }
    }
}
