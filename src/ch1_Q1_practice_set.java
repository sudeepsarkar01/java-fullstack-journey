import java.util.Scanner;

public class ch1_Q1_practice_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter the second number: ");
        float num2 = sc.nextFloat();
        System.out.print("Enter the third number: ");
        float num3 = sc.nextFloat();
        float sum = num1 + num2 + num3;
        System.out.print("The sum of the numbers is: " + sum);
    }
}
