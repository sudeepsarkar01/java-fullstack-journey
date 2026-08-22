package day_4;

import java.util.Scanner;

public class ch4_elseif_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bio marks: ");
        int mark_1 = sc.nextInt();

        System.out.print("Enter math marks: ");
        int mark_2 = sc.nextInt();

        System.out.print("Enter english mark: ");
        int mark_3 = sc.nextInt();

        System.out.print("Enter physics mark: ");
        int mark_4 = sc.nextInt();

        System.out.print("Enter chem. mark: ");
        int mark_5 = sc.nextInt();

        int sum = mark_1 + mark_2 + mark_3 + mark_4 + mark_5;
        float percentage = (sum/500.0f) * 100;
        System.out.println("The total percentage is " + percentage + "%");

        if (percentage >= 85) {
            System.out.println("Very good percentage.");
        } else if (percentage >= 60) {
            System.out.println("It is decent percentage.");
        } else if (percentage >= 45) {
            System.out.println("you have to do hard work.");
        } else if (percentage >= 30) {
            System.out.println("very bad percentage");
        } else {
            System.out.println("Fail, you can't do anything");
        }
    }
}
