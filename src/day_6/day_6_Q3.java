package day_6;
import java.util.Scanner;

public class day_6_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter no._" + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }
        System.out.print("The elements of the array are: ");
        int sum = 0;
        for (int element: num) {
            System.out.print(element + " ");
            sum = sum + element;
        }
        System.out.print("\n");
        System.out.println("The average mark of the students is: " + sum/num.length);
    }
}
