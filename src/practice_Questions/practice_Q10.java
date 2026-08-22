package practice_Questions;
import java.util.Scanner;

public class practice_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        float num_1 = sc.nextFloat();
        System.out.print("Enter second number: ");
        float num_2 = sc.nextFloat();
        System.out.print("Enter third number: ");
        float num_3 = sc.nextFloat();

        if (num_1 > num_2 && num_1 > num_3) {
            System.out.println("Number 1 is greater.");
        } else if (num_2 > num_1 && num_2 > num_3) {
            System.out.println("Number 2 is greater.");
        } else {
            System.out.println("Number 3 is greater.");
        }
    }
}
