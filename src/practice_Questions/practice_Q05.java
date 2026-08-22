package practice_Questions;
import java.util.Scanner;

public class practice_Q05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal: ");
        float Principal = sc.nextFloat();
        System.out.print("Enter Rate: ");
        float Rate = sc.nextFloat();
        System.out.print("Enter Time: ");
        float Time = sc.nextFloat();

        float SI = (Principal * Rate * Time) / 100;
        System.out.println("Simple interest is: " + SI);
    }
}
